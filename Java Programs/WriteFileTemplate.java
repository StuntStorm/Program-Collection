package methods;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteFileTemplate {
    //When we are reading date on csv, we have to format
    //   DateTimeFormatter date = DateTimeFormatter.ofPattern("d/MM/yyyy");
    //   LocalDate.parse(date,formatter));

    //Method to write a cvs with an array of any type of objects
    //---Make sure you have implemented the toString with format "x;x;...", otherwise modify this same method with the relevant data--
    public static <T> void writeCsvWithArray(String fileName, List<T> dataList) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            //TODO: change with you need
            for (T data : dataList) {
                bw.write(data.toString());
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Method to write a cvs with any object
    public static <T> void escribirCsvWithObject(String fileName, T anyObject) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            //TODO: change with you need
            bw.write(anyObject.toString());
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Method to write a json with an array of any type of objects
    //---Make sure you have the dependencies correct--
    //<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core -->
    //<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310 --> (to parse dates)
    //<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations -->
    public static <T> void writeJsonWithArray(String fileName, List<T> dataList) {
        ObjectMapper mapper = new ObjectMapper();

        mapper.registerModule(new JavaTimeModule()); //Format dates

        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);

        try {
            mapper.writeValue(new File(fileName), dataList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Method to create directories
    //Ex: if you put a path "./ej1/exercises" it creates two folders
    //Ex: if you have previously created "./ej1" and put "./ej1/example" it creates a folder called example inside ej1
    public static void createDirectories(String dirName) {
        Path directoryPath = Paths.get(dirName);

        try {
            if (!Files.exists(directoryPath)) {
                Files.createDirectories(directoryPath);
                System.out.println("Directory has been created");
            }

        } catch (AccessDeniedException ade) {
            System.out.println("You don't have permission");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Method to copy files, passing the path of the source file and the path of how the final destination would be
    //Ex: copyFile("./exercise/file.csv", "./copies/CopyFile.csv") --> the file would be copied into copies and change its name to .java CopyFile.csv
    //Ex: copyFile("./exercise/file.csv", "./copies/file.csv") --> the file would be copied inside copies and with the same name
    //Ex: If the path of the destination folder does not exist, it will create that folder, that is, pathDestination = "./copies/x.csv", if copies does not exist, the folder will be created
    public static void copyFiles(String originPath, String destinyPath) {
        Path origin = Paths.get(originPath);
        Path destiny = Paths.get(destinyPath);

        Path directories = destiny.subpath(0, destiny.getNameCount() - 1);

        try {
            if (!Files.exists(destiny)) {
                createDirectories(directories.toString());
                Files.copy(origin, destiny);
                System.out.println("Files have been copied");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

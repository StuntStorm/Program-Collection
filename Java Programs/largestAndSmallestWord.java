package JavaString;

public class largestAndSmallestWord {
    static String minWord = "", maxWord = "";

    static void minMaxLengthWords(String input) {

        int len = input.length();
        int si = 0, ei = 0;
        int min_length = len, min_start_index = 0, max_length = 0, max_start_index = 0;

        while (ei <= len) {
            if (ei < len && input.charAt(ei) != ' ') {
                ei++;
            } else {
                int curr_length = ei - si;

                if (curr_length < min_length) {
                    min_length = curr_length;
                    min_start_index = si;
                }

                if (curr_length > max_length) {
                    max_length = curr_length;
                    max_start_index = si;
                }
                ei++;
                si = ei;
            }
        }

        minWord = input.substring(min_start_index, min_start_index + min_length);
        maxWord = input.substring(max_start_index, max_length);
    }

    public static void main(String[] args) {
        String a = "GeeksforGeeks A Computer Science portal for Geeks";

        minMaxLengthWords(a);

        System.out.print("Minimum length word: " + minWord + "\nMaximum length word: " + maxWord);
    }
}

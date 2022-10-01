class Student:
    roll_number = 0

    @classmethod
    def setRollNumber(cls,r):
        cls.roll_number = r;
 

class Exam(Student):
    mathsMarks = 0.0
    physicsMarks = 0.0

    @classmethod
    def setMarks(cls,marksmaths,marksPhysics):
        cls.mathsMarks = marksmaths
        cls.physicsMarks = marksPhysics
    
    
class Result(Exam):
    def displayResult(self):
        print(f"The Roll Number of the Student is {self.roll_number}.\nThe marks obtained in maths are {self.mathsMarks}.\nThe marks obtained in physics are {self.physicsMarks}.\nYour Result is {(self.mathsMarks+self.physicsMarks)/2}%.")



yogesh = Result()
yogesh.setRollNumber(420)
yogesh.setMarks(94.0,90.0)
yogesh.displayResult();

        

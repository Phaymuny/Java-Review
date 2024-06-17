package StudentManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private int studentId;
    private String studentName;
    private String gender;
    private String classRoom;
    private List<Float> scores;


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public List<Float> getScores() {
        return scores;
    }

    public void setScores(List<Float> scores) {
        this.scores = scores;
    }

    Student(){
    }
    Student(int studentId, String studentName, String gender, String classRoom, List<Float> scores){
        this.studentId = studentId;
        this.studentName = studentName;
        this.gender = gender;
        this.classRoom = classRoom;
        this.scores = scores;

    }
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", gender='" + gender + '\'' +
                ", classRoom='" + classRoom + '\'' +
                ", scores=" + scores +
                '}';
    }

    void inputStudent(Scanner input){
        scores = new ArrayList<>();
        studentId = CustomExcp.readInt("Enter Student ID (4 digits) : ",input);
        input.nextLine();
        studentName = CustomExcp.readString("Enter StudentName: ",input);
        gender = CustomExcp.readString("Enter Student Gender: ",input);
        classRoom = CustomExcp.readString("Enter classRoom: ",input);
        System.out.println("Enter the scores follow Subject below: ");
        scores.add(CustomExcp.readfloat("Math: ",input));
        scores.add(CustomExcp.readfloat("Science: ",input));
        scores.add(CustomExcp.readfloat("English: ",input));
        scores.add(CustomExcp.readfloat("PE: ",input));
        scores.add(CustomExcp.readfloat("History: ",input));
    }
    void updateallStudent(Scanner input){
       // scores = new ArrayList<>();
        studentId = CustomExcp.readInt("Enter Student ID (4 digits) : ",input);
        input.nextLine();
        studentName = CustomExcp.readString("Enter StudentName: ",input);
        gender = CustomExcp.readString("Enter Student Gender: ",input);
        classRoom = CustomExcp.readString("Enter classRoom: ",input);
        System.out.println("Enter the scores follow Subject below: ");
        scores.add(CustomExcp.readfloat("Math: ",input));
        scores.add(CustomExcp.readfloat("Science: ",input));
        scores.add(CustomExcp.readfloat("English: ",input));
        scores.add(CustomExcp.readfloat("PE: ",input));
        scores.add(CustomExcp.readfloat("History: ",input));
    }
    void outPutStudent(){
        System.out.println("--------------------------------------");
        System.out.println("Student ID : "+studentId);
        System.out.println("Student Name: "+studentName);
        System.out.println("Student Gender: "+gender);
        System.out.println("Student ClassRoom: "+classRoom);
        System.out.println("----Student Score of each subject---- ");
        System.out.println("Math : "+scores.get(0));
        System.out.println("Science : "+scores.get(1));
        System.out.println("English : "+scores.get(2));
        System.out.println("PE : "+scores.get(3));
        System.out.println("History : "+scores.get(4));
        System.out.println("--------------------------------------");
    }

}

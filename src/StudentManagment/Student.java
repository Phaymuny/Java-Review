package StudentManagment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String gender;
    private String classRoom;
    private List<Float> scores;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
    public float findAverage(){
        float sumScore = 0;
        for(float score:scores){
            sumScore += score;
        }
        return sumScore /scores.size();
    }
    Student(){};
    Student(int id, String name, String gender, String classRoom, List<Float> scores){
        this.id = id;
        this.name = name;
        this.classRoom = classRoom;
        this.gender = gender;
        this.scores = scores;
    }

    public void inputStudent(Scanner input){
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Input>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter the student id: ");
        id = input.nextInt();
        input.nextLine();
        //System.out.println("Enter the student name: ");
        name = CheckExp.readString("Enter the student name: ",input);
        //name = input.nextLine();
        System.out.println("Enter the student gender: ");
        gender = input.nextLine();
        System.out.println("Enter the student class room: ");
        classRoom = input.nextLine();
        System.out.println("<<<< Enter the student scores of 5 subject below >>>>");
        System.out.println("Math: ");
        scores = new ArrayList<>();
        scores.add(input.nextFloat());
        System.out.println("Khmer: ");
        scores.add(input.nextFloat());
        System.out.println("English: ");
        scores.add(input.nextFloat());
        System.out.println("PE: ");
        scores.add(input.nextFloat());
        System.out.println("History: ");
        scores.add(input.nextFloat());
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<End>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

    public void updateAllStudent(Scanner input){
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Input>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        //System.out.println("Enter the student name: ");
        name = CheckExp.readString("Enter the student name: ",input);
        //name = input.nextLine();
        System.out.println("Enter the student gender: ");
        gender = input.nextLine();
        System.out.println("Enter the student class room: ");
        classRoom = input.nextLine();
        System.out.println("<<<< Enter the student scores of 5 subject below >>>>");
        System.out.println("Math: ");
        scores = new ArrayList<>();
        scores.add(input.nextFloat());
        System.out.println("Khmer: ");
        scores.add(input.nextFloat());
        System.out.println("English: ");
        scores.add(input.nextFloat());
        System.out.println("PE: ");
        scores.add(input.nextFloat());
        System.out.println("History: ");
        scores.add(input.nextFloat());
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<End>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

    public void outputInfo(){
        System.out.println("Student Id : "+id);
        System.out.println("Student Name : "+name);
        System.out.println("Student Gender : "+gender);
        System.out.println("Student ClassRoom : "+classRoom);
        System.out.println("Student Score Average score : "+findAverage());
        System.out.println();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", classRoom='" + classRoom + '\'' +
                ", scores=" + scores +
                '}';
    }

}

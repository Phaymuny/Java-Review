package StudentManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student student = new Student();

        List<Student> allStudent = new ArrayList<>();
        System.out.println("-------Student management system-------");
        int opt;
        do {
            System.out.println("1.Add New Student");
            System.out.println("2.Edit Student");
            System.out.println("3.Delete Student ");
            System.out.println("4.Show all Student");
            System.out.println("5.Exits");
            opt = CustomExcp.readInt(">>>>Choose option----------------------",input);
            switch (opt){
                case 1:
                    Student addStudent = new Student();
                    addStudent.inputStudent(input);
                    allStudent.add(addStudent);
                    break;
                case 2:
                    int sid = CustomExcp.readInt("Enter Id of Student to Update: ",input);
                    for (int i = 0; i<allStudent.size();i++){
                        if(sid == allStudent.get(i).getStudentId()){
                            Student updateStudent = allStudent.get(i);
                            updateStudent.updateallStudent(input);
                            allStudent.set(i,updateStudent);
                            System.out.println("Update Successfully");
                            break;
                        }
                    }

                  /*  allStudent.stream()
                            .filter(std -> sid == std.getStudentId())
                            .forEach(std -> {
                                Student updateStudent = std;
                                updateStudent.updateallStudent(input);
                                allStudent.set(allStudent.indexOf(std), updateStudent);
                                System.out.println("Update Successfully");
                            });

                   */

                    System.out.println("Id "+sid+" did not exist.!!!!.");
                    break;
                case 3:
                    System.out.println("Enter Id of Student to delete: ");
                    sid = CustomExcp.readInt("Enter Id of Student to delete: ",input);
                    for (int i = 0; i<allStudent.size();i++){
                        if (sid==allStudent.get(i).getStudentId()) {
                            allStudent.remove(i);
                            System.out.println("Delete Successfully");
                            break;
                        }
                    }
                    System.out.println("Id: "+sid+" deosn't exist");
                    break;
                case 4:
                    for (Student val: allStudent) {
                        val.outPutStudent();
                        System.out.println();
                    }
                    break;
                default:
                    break;
            }
        }while (opt!=5);
    }
}

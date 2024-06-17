package StudentManagment;

import java.util.*;

public class StudentManagment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      //  Student student = new Student();
        List<Student> allStudent = new ArrayList<Student>(){{
            add(new Student(1001,"Sasa","M","Room6", Arrays.asList(80f,70f,50f,60f,100f)));
            add(new Student(1010,"Sysa","F","Room6", Arrays.asList(80f,70f,50f,60f,100f)));
            add(new Student(1002,"Tasa","M","Room1", Arrays.asList(70f,70f,50f,60f,100f)));
            add(new Student(1005,"Hasa","F","Room2", Arrays.asList(80f,90f,40f,50f,100f)));
            add(new Student(1004,"Gasa","F","Room3", Arrays.asList(50f,70f,60f,70f,90f)));
            add(new Student(1003,"Masa","M","Room5", Arrays.asList(100f,70f,40f,60f,80f)));
        }};

       // student.inputStudent(input);
        // System.out.println(student.findAverage());

        int opt;
        do {
            System.out.println("1.Add new student");
            System.out.println("2.Edit student");
            System.out.println("3.Show student Information");
            System.out.println("4.Search student Information");
            System.out.println("5.Exit the program");
            System.out.println(">>>>Chose your option>>>>");
            opt = input.nextInt();
            switch (opt) {
                case 1:
                    Student addStudent = new Student();
                    addStudent.inputStudent(input);
                    allStudent.add(addStudent);
                    break;
                case 2:
                    System.out.println("Enter student Id to edit: ");
                    int idstudent = input.nextInt();
                    for(int i = 0; i<allStudent.size(); i++){
                        if(idstudent == allStudent.get(i).getId()){
                            Student updateStudet = allStudent.get(i);
                            updateStudet.updateAllStudent(input);
                            allStudent.set(i,updateStudet);
                            System.out.println("Update Successfully");
                            break;
                        }
                    }
                    allStudent.stream()
                    .filter(studentList->idstudent == studentList.getId())
                    .findFirst()
                    .ifPresent(studentList -> {
                        input.nextLine(); 
                        studentList.updateAllStudent(input); 
                        System.out.println("Update Successfully");
                    });
                   /* allStudent.stream()
                            .filter(studenList -> idstudent == studenList.getId())
                            .findFirst()
                            .ifPresent(studentList -> {
                                input.nextLine();
                                studentList.updateAllStudent(input);
                                System.out.println("Update Successfully");

                            });
                  */
                    System.out.println("There are no that id "+idstudent);

                    break;
                case 3:
                    int chs;
                    do {
                        System.out.println("Please choose filter of choice below: ");
                        System.out.println("1.Show original order");
                        System.out.println("2.Show descending order by average");
                        System.out.println("3.Show ascending order by ID");
                        System.out.println("4.Exit");
                        chs = input.nextInt();
                        switch (chs){
                            case 1:
                                System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Student>>>>>>>>>>>>>>>>>>>>>>>>>>");
                                allStudent.forEach(e->e.outputInfo());
                                System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<End>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                                break;
                            case 2:
                                System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Student>>>>>>>>>>>>>>>>>>>>>>>>>>");
                                allStudent.stream().sorted(Comparator.comparingDouble(Student::findAverage).reversed())
                                                .forEach(e->e.outputInfo());
                                System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<End>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                                break;
                            case 3:
                                System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Student>>>>>>>>>>>>>>>>>>>>>>>>>>");
                                allStudent.stream().sorted(Comparator.comparingInt(e->e.getId()))
                                                .forEach(e-> e.outputInfo());
                                System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<End>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                                break;
                            default:
                                break;
                        }
                    }while (chs!=4);
                    break;
                case 4:
                    int chos;
                    do{
                        System.out.println("Please choose to search below");
                        System.out.println("1.Search by gender (M/F)");
                        System.out.println("2.Search by student name");
                        System.out.println("3.Search by class room");
                        System.out.println("4.Exit");
                        chos = input.nextInt();
                        input.nextLine();
                        switch (chos){
                            case 1:
                                System.out.println("Enter the Gender of student you want to search: ");
                                boolean isTrue = false;
                                String gen = input.nextLine();
                                for (Student StuList : allStudent){
                                    if(gen.equals(StuList.getGender())){
                                        StuList.outputInfo();
                                        isTrue = true;
                                    }
                                }
                                if(!isTrue){
                                    System.out.println("There student with gender "+gen+" is not exist.");
                                }
                                break;
                            case 2:
                                System.out.println("Enter student name: ");
                                String name = input.nextLine();
                                boolean matchfond = false;
                                for (Student std : allStudent){
                                    if (std.getName().startsWith(name)){
                                        std.outputInfo();
                                        matchfond = true;
                                    }
                                }
                                if(!matchfond){
                                    System.out.println("There are student with name "+name);
                                }
                                break;
                            case 3:
                                System.out.println("Enter student class Room: ");
                                String classRoom = input.nextLine();
                                boolean matchfound = false;
                                for (Student std : allStudent){
                                    if (std.getClassRoom().equals(classRoom)){
                                        std.outputInfo();
                                        matchfound = true;
                                    }
                                }
                                if (!matchfound){
                                    System.out.println("There no room "+classRoom);
                                }
                                break;
                            default:
                                break;
                        }
                    }while (chos!=4);
                    break;
            }
        }while (opt!=5);
    }
}

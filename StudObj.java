package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudObj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student1> students = new ArrayList<>();
        students.add(new Student1(11, 20, "prashu", "gnpt"));
        students.add(new Student1(12, 21, "meghana", "gnpt"));
        students.add(new Student1(13, 23, "suppu", "svs"));
        students.add(new Student1(14, 20, "lucky", "Svs"));
        students.add(new Student1(15, 25, "srija", "jntuh"));
        students.add(new Student1(16, 22, "akhila", "jntuh"));
        List<Student1> commonCollege = new ArrayList<>();
        System.out.println("enter the college name");
        String college = sc.next();
        for(Student1 student:students){
            if(student.getCollegeName().equalsIgnoreCase(college)){
                commonCollege.add(student);
            }
        }
        for (Student1 stu :commonCollege){
            System.out.println(stu);
        }

    }
}


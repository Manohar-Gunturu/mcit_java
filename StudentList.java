package javaapplication3;

import java.util.ArrayList;

public class StudentList {
     public static void main(String[] args) {
         ArrayList<Student> student_list = new ArrayList();
         for(int i = 0; i < 299; i++ ){
                student_list.add(new Student(i, 21));
         }
         System.out.println(student_list.get(298).id);
     }
}

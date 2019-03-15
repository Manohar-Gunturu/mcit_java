
package javaapplication3;

public class ArrayStudent {
     public static void main(String[] args) {
         Student[] students = new Student[10];
         int[] as = new int[10];
         for(int i = 0; i < students.length; i++ ){
                students[i] = new Student(i, 19);
         } 
     }
}

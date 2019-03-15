package javaapplication3;
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    static int c = 3;
    public static void main(String[] args) {
       int a = 2;
       int b = 3;
       Student s1 = new Student(2,22);
       a = s1.id;
       Student s2 = new Student(5,11);
       a = s2.id;
       System.out.println(Student.college);
    }
    
}

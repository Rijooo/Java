package DAY3;

class student
 {
    String name,dept;
    int age;
    static String college="skcet";  // static variable
    student(String name,int age,String dept)
     {  
        this.name=name;
        this.age=age;
        this.dept=dept;
      
     }

     public void display()
     {
        System.out.println("Name"+name);
        System.out.println("Age"+age);
        System.out.println("Department"+dept);
        System.out.println("College"+student.college);
        
     }

 }

public class static3 {
    public static void main(String[] args) {
        student s1=new student("rijo",24,"MCT");
        student s2=new student("ronaldo",38,"PE");
        s1.display();
        s2.display();

    }
}
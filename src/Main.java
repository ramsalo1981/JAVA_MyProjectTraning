import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        /*Rectangle r1 = new Rectangle(10D,20D);
        Rectangle r2 = new Rectangle(20D,30D);
         r1.Add(r2);
        System.out.println(r1.Add(r2).getWidth());
        System.out.println(r1.Add(r2).getLength());
        System.out.println(r1.Add(r2).Area());*/

        //Comparing
        /*Rectangle r1 = new Rectangle(10D, 20D);
        Rectangle r2 = new Rectangle(10D, 20D);

        if (r1.isEqual(r2)) {
            System.out.println("They are the same");
        }
        else{
            System.out.println("they are defferent");
        }*/

        //Copy Object by copy constructor
        /*Rectangle r1 = new Rectangle(10D, 20D);
        Rectangle source = new Rectangle(r1);

        System.out.println(source.getWidth());
        System.out.println(source.getLength());
        */
        System.out.print("Enter your name: ");
        String name1 = input.nextLine();

        System.out.print("Enter your age: ");
        int age1 = input.nextInt();

        input.nextLine(); // consume newline left-over

        System.out.print("Enter your address: ");
        String address1 = input.nextLine();

        System.out.print("Enter your Nationality: ");
        String nat1 = input.nextLine();

        System.out.print("Enter your level: ");
        int lvl1 = input.nextInt();

        input.nextLine(); // consume newline left-over

        System.out.print("Enter your space: ");
        String sp1 = input.nextLine();

        System.out.print("Enter your GPA: ");
        Double GPA1 = input.nextDouble();

        Student s1 = new Student(name1,age1,address1,nat1,lvl1,sp1,GPA1);


        /*System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getAddress());
        System.out.println(s1.getNationality());
        System.out.println(s1.getStudy_Level());
        System.out.println(s1.getSpecialization());
        System.out.println(s1.getGPA());*/

        String info = s1.getStudentInfo();
        System.out.println(info);
    }



}
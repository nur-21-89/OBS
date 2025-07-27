package UcuncuHafta;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    String name;
    String secondName;
    int studentNo;
    int count = 0;
    Scanner input = new Scanner(System.in);

    static ArrayList<Student> student = new ArrayList<>();

    public Student (){
        System.out.print("Öğrenci Adı:");
        this.name = input.nextLine();

        System.out.print("Öğrenci Soyadı:");
        this.secondName = input.nextLine();

        System.out.print("Öğrenci Numarası:");
        this.studentNo = input.nextInt();
    }

    public void addStudent ( Student newStudent){
        for(int i = 0; i < student.size(); i++){
            if(student.get(i).studentNo == newStudent.studentNo){
                System.out.println("Bu Öğrenci Okulumuzda Bulunmaktadır!");
                return;
            }
        }
        student.add(newStudent);
        System.out.println("Başarıyla Öğrenci Eklendi!");
    }

    void printInfo(){
        System.out.println("Ad: "+this.name);
        System.out.println("Soyad: "+this.secondName);
        System.out.println("Öğrenci Numarası: "+this.studentNo);

    }
}
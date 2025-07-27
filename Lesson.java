package UcuncuHafta;
import java.util.ArrayList;
import java.util.Scanner;

public class Lesson {
    String lessonName;
    double vize, finall;
    double ortalama = 0;

    Scanner input = new Scanner(System.in);

    ArrayList notlar = new ArrayList<>();

    public Lesson (){
        System.out.print("Dersin Adı: ");
        this.lessonName = input.nextLine();

        System.out.print("Vize Notu: ");
        this.vize = input.nextInt();
        input.nextLine();

        System.out.print("Final Notu: ");
        this.finall = input.nextInt();
        input.nextLine();
        this.ortalama = 0;
        ortalamaHesapla();
    }

    public void addLesson(Lesson newLesson){
        System.out.print("Dersin Adı: ");
        this.lessonName = input.nextLine();

        System.out.print("Vize Notu: ");
        this.vize = input.nextInt();
        input.nextLine();

        System.out.print("Final Notu: ");
        this.finall = input.nextInt();
        input.nextLine();
        ortalamaHesapla();
    }

    public void ortalamaHesapla() {
        this.ortalama = (vize * 0.4) + (finall * 0.6);

    }

    public void printInfo() {
        System.out.println("Ders: " + lessonName);
        System.out.println("Vize: " + vize);
        System.out.println("Final: " + finall);
        System.out.println("Ortalama: " + ortalama);
    }
}
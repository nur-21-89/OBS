package UcuncuHafta;
import java.util.ArrayList;
import java.util.Scanner;

public class OBS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Lesson> dersListesi = new ArrayList<>();

        while (true) {
            System.out.println("1-Öğrenci Ekleme\n" +
                    "2-Ders Ekleme\n" +
                    "3-Ders Listeleme\n" +
                    "4-Çıkış2");
            System.out.print("Seçiminiz:");
            int secim = input.nextInt();

            switch (secim) {
                case 1:
                    Student newStudent = new Student();
                    newStudent.addStudent(newStudent);
                    break;
                case 2:
                    Lesson newLesson = new Lesson();
                    dersListesi.add(newLesson);
                    break;
                case 3:
                    if (dersListesi.isEmpty()) {
                        System.out.println("Henüz ders eklenmedi.");
                    } else {
                        System.out.println("\n--- Ders Listesi ---");
                        for (Lesson ders : dersListesi) {
                            ders.printInfo();
                            System.out.println("------------------");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Çıkış Yapılıyor!");
                    return;
                default:
                    System.out.println("==Seçim Yapılmadı==");
            }
        }
    }
}
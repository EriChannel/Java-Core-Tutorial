import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int i = 1;
//        while (i <= 5){
//            System.out.println("Xin chào");
//            i++;
//        }
//        Random rd = new Random();
//        boolean isContinue = true;
//        int count = 0;
//        while (isContinue){
//            int number = rd.nextInt(100);
//            System.out.println(number);
//
//            count++;
//            if(number == 99){
//                isContinue = false;
//            }
//        }
//        System.out.println("Số lần lặp: " + count);
//        int i = 6;
//        do{
//            System.out.println("Xin chào");
//            i++;
//        }while (i <= 5);

        int age = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nhập tuổi của bạn: ");
            age = sc.nextInt();
        }while (age <= 0 || age > 100);

        System.out.println("Tuổi của bạn là: " + age);
    }
}
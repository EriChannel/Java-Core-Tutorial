import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        BMI bmi = new BMI();
//        float bmiRs = bmi.bmiCalculator();
//        System.out.println("BMI = " + bmiRs);
//
//        float height = 1.5f;
//        float weight = 60f;
//        float bmiResult = bmi.bmiCalculator(weight, height);
//        System.out.println("BMI = " + bmiResult);
//
//        bmi.bmiResult(bmiResult);
        //System.out.println(Math.sqrt(4));
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều cao của bạn: ");
        double height = sc.nextDouble();
        System.out.println("Kết quả tính theo cm: " + height);
        double mHeight = Unit.cmToM(height);
        System.out.println("kết quả tính theo m: " + mHeight);
        double inchHeight = Unit.cmToInch(height);
        System.out.println("Kết quả tính theo inch: " + inchHeight);

    }
}
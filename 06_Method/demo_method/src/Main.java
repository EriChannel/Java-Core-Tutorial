public class Main {
    public static void main(String[] args) {
        BMI bmi = new BMI();
        float bmiRs = bmi.bmiCalculator();
        System.out.println("BMI = " + bmiRs);

        float height = 1.5f;
        float weight = 60f;
        float bmiResult = bmi.bmiCalculator(weight, height);
        System.out.println("BMI = " + bmiResult);

        bmi.bmiResult(bmiResult);

    }
}
public class BMI {

    public float bmiCalculator(){
        float weight = 45f;
        float height = 1.5f;

        float bmi = weight/(height*height);
        return bmi;
    }

    public float bmiCalculator(float weight, float height){
        float bmi = weight/(height*height);
        return bmi;
    }

    public void bmiResult(float bmi){
        if(bmi < 18.5){
            System.out.println("Bạn gầy");
        }else if(bmi >= 18.5 && bmi <= 24.9){
            System.out.println("Bạn bình thường");
        }else {
            System.out.println("Bạn thừa cân");
        }
    }
}

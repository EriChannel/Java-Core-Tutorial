public class Unit {

    int a = 9;
    public void method(){
        System.out.println("Method");
    }
    public static double cmToM(double cm){
        //System.out.println(a);
        //method();
        return cm/100;
    }

    public static double cmToInch(double cm){
        return cm*0.3937;
    }
}

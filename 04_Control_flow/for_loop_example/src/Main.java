public class Main {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++){
            System.out.print(i +"\t");
        }
        System.out.println();

        for(int i = 0; i <= 10; i+=2){
            System.out.print(i +"\t");
        }
        System.out.println();
        for(int i = 0; i <= 10; i++){
            if(i % 2 == 0){
                System.out.print(i +"\t");
            }
        }

        int sum = 0;
        for(int i = 0; i <= 10; i++){
            if(i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.println("\n Tổng các số chẵn "+ sum);

        for(int i = 10; i >= 0; i--){
            System.out.print(i +"\t");
        }
        System.out.println();

        for(int i = 0; i <= 5; i++){
            for(int j = 0; j <= 5; j++){
                System.out.print(i + j +"\t");
            }
            System.out.println();
        }
    }
}
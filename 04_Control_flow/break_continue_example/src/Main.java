public class Main {
    public static void main(String[] args) {
//        for(int i = 0; i <= 10; i++){
//            System.out.print(i +"\t");
//            if(i == 5){
//                break;
//            }
//        }
//        System.out.println();
//
//        for(int i = 0; i < 3; i++){
//            System.out.println("i : " + i);
//            for(int j = 0; j < 5; j++){
//                System.out.println("j : " + j);
//                if(j == 3){
//                    break;
//                }
//            }
//        }

        for(int i = 0; i <= 10; i++){
            if(i % 2 == 0){
                continue;
            }

            System.out.print(i + "\t");
        }
    }
}
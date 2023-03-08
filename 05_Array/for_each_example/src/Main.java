public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        String[] names = {"Tùng", "Hoa", "Trang", "Dũng"};

        int[][] matrix = {
                {4, 6, 9},
                {2, 1, 7},
                {3, 9, 5}
        };

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("-----------------------");
        for(int num: numbers){
            num = num * 10;
            System.out.println(num);
        }

        System.out.println("-----------------------");
        for(int num: numbers){
            System.out.println(num);
        }

        System.out.println("-----------------------");
        for(String str: names){
            System.out.println(str);
        }

        int sum = 0;
        for(int num: numbers){
            sum = sum +  num;
        }

        System.out.println("Tổng: " +  sum);

        System.out.println("-----------------------");
        for(int[] row: matrix){
            for(int col: row){
                System.out.print(col + "\t");
            }
            System.out.println();
        }





    }
}
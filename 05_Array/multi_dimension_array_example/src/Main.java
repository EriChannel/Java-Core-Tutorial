public class Main {
    public static void main(String[] args) {
        //Khai báo mảng 2 chiều
        int[][] intArray;

        //Cấp phát bộ nhớ
        int row = 3;
        int col = 2;

        intArray = new int[row][col];

        String [][]strArray = new String[3][3];

        intArray[0][0] = 8;   intArray[0][1] = 5;
        intArray[1][0] = 3;   intArray[1][1] = 8;
        intArray[2][0] = 4;   intArray[2][1] = 1;

        double[] array = {1,2,3};

        double[][] doubleArray = {
                {4.5, 3.1, 9.6},
                {6.9, 8.4, 8,1},
                {3.5, 7.3, 6.4}
        };

        System.out.println("Phần tử đầu tiên: " + doubleArray[0][0]);

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print(intArray[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < doubleArray.length; i++){
            for (int j = 0; j < doubleArray[i].length; j++ ){
                System.out.print(doubleArray[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
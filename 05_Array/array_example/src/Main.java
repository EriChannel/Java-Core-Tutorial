public class Main {
    public static void main(String[] args) {
        //Khai báo mảng
        int []arrayNumber;

        //Cấp phát bộ nhớ cho mảng
        arrayNumber = new int[5];

        int []numbers = new int[3];

        //Gán giá trị cho mảng
        arrayNumber[0] = 5;
        arrayNumber[1] = 6;
        //arrayNumber[2] = 4;
        arrayNumber[3] = 9;
        arrayNumber[4] = 1;

        //Lấy ra phần tử có index = 2
        System.out.println("arrayNumber[2]: " +arrayNumber[2]);

        System.out.println("Kích thước mảng: " + arrayNumber.length);

        for(int i = 0; i < arrayNumber.length; i++){
            System.out.print(arrayNumber[i] + "\t");
        }
        System.out.println();

        int i = 0;
        while (i < arrayNumber.length){
            System.out.print(arrayNumber[i] +"\t");
            i++;
        }

        System.out.println("\n Duyệt ngược");
        for(int j = arrayNumber.length - 1; j >= 0; j--){
            System.out.print(arrayNumber[j] +"\t");
        }

        int max = 0;
        for (int j = 0; j < arrayNumber.length; j++){
            if(max < arrayNumber[j]){
                max = arrayNumber[j];
            }
        }
        System.out.println("\n Phần tử lớn nhất trong mảng là: " + max);


    }
}
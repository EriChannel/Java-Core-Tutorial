public class Cat {
    public String name;
    public String color;
    public double weight;

    public Cat() {
    }

    public Cat(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    //    public Cat(){
//        System.out.println("Gọi tới constructor không có tham số");
//    }
//
//    public Cat(String ten, String mauLong, double canNang){
//        name = ten;
//        color = mauLong;
//        weight = canNang;
//    }
//
//    public Cat(String ten, double canNang){
//        name = ten;
//        weight = canNang;
//    }

}

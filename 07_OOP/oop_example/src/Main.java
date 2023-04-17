public class Main {
    public static void main(String[] args) {
        //Tạo đối tượng
        Cat kem = new Cat();
        //Gán giá trị cho các thuộc tính
        kem.name = "Kem";
        kem.color = "Trắng, đen";
        kem.weight = 3.4;

        //System.out.println(kem.name + " - " + kem.color + " - " + kem.weight);

        Cat cao = new Cat();
        cao.name = "Cáo";
        cao.color = "Vàng, trắng";
        cao.weight = 4.1;

        Cat doKhi = new Cat();
        doKhi.name = "Đỗ";
        doKhi.color = "Vàng";
        doKhi.weight = 3.2;

        Cat c1 = new Cat();
        System.out.println(c1.name + " - " + c1.color + " - " + c1.weight);

        Cat van = new Cat("Vằn", "Vàng cam", 0.5);
        System.out.println(van.name + " - " + van.color + " - " + van.weight);

        Cat den = new Cat("Đen", 0.4);
        System.out.println(den.name + " - " + den.color + " - " + den.weight);


        Cat[] cats = new Cat[3];
        cats[0] = kem;
        cats[1] = cao;
        cats[2] = doKhi;

        for(Cat cat: cats){
            System.out.println(cat.name + " - " + cat.color + " - " + cat.weight);
        }
    }
}
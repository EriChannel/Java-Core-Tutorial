public class Main {
    public static void main(String[] args) {
        //Tạo đối tượng với constructor không có tham số
        Person ngoc = new Person();
        ngoc.name = "Ngọc";
        ngoc.age = 25;

//        System.out.println(person.name + " - " + person.age);
//
//        person.eat();
//        person.study("Java");
        //Tạo đối tượng với constructor có tham số
        Person linh = new Person("Linh", 25);
    }
}
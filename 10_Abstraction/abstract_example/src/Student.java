public class Student extends Person {
    public Student(String name, int age, String address) {
        super(name, age, address);
    }

    @Override
    public void print() {
        System.out.println("Phương thức được override");
    }
}

## Tạo chương trình Java trên IntelliJ IDE  
Xem hướng dẫn tạo chương trình tại [Đây](https://youtu.be/xag2tMaqrA0)  

## Cấu trúc của chương trình Java

Ngôn ngữ Java được thiết kế xoay quanh đặc trưng hướng đối tượng. Đó là xoay quan việc thiết kế các lớp (class) và tạo các đối tượng (object).
Phát triển ứng dụng java được khởi đầu bằng việc định nghĩa các lớp. Sau khi định nghĩa các lớp xong, định dạng của tệp lưu trữ các lớp sẽ được lưu có phần đuôi mở rộng là .java
```java
package <package_name>;
import <other_package>;

public class <class_name>{
    <variables>;
    <methods>;
}
```
+ package: Một package(gói) mô tả không gian có chứa các lớp của java, chúng ta có thể xem package như một thư mục, còn class chính là các file thuộc thư mục đó
+ import: Từ khóa được sử dụng trong java nhằm để xác định các class hoặc package được sử dụng trong lớp này
+ class: Từ khóa nhằm để định nghĩa lớp của java. Nó đứng trước khai báo tên lớp của java. Ngoài ra còn có từ khóa public, từ khóa này xác định phạm vi truy cập của java (Sẽ được nhắc tới trong các bài sau)
+ variables: Biến (còn được gọi là trường, thuộc tính). Nó chứa thông tin cụ thể liên quan tới các đối tượng.
+ methods:  Phương thức (còn được gọi là hàm) chứa các hành động thực thi của đối tượng.


## Phương thức `main` trong Java  
Trong Java cũng vậy, phương thức main chính là điểm vào (entry point) khi thực hiện xử lý trong Java, nói cách khác phương thức main chính là điểm thực thi của một chương trình. Đồng thời, khi phương thức main kết thúc cũng là lúc chương trình kết thúc. Các phương thức khác nếu muốn được thực thi thì chúng phải được gọi trong phương thức main  

### Cú pháp  
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
```  

### Ý nghĩa các từ khoá trong phương thức `main`  
- `public`: Đây là phạm vi truy cập, ta bắt buộc phải để quyền truy cập ở dạng `public` để JVM ở bên ngoài có thể truy cập được phương thức và tiến hành thực thi. Nếu sử dụng một phạm vi truy cập khác thì JVM không thể chạy chương trình.  

![main_01](https://media.techmaster.vn/api/static/bq0a8rs51co78aldi4p0/0QKB2xa6)  

  
- `static`: Khi chương trình bắt đầu, chưa có đối tượng nào được khởi tạo, vì vậy ta cần để phương thức ở dạng `static` để JVM có thể load class vào bộ nhớ và có thể gọi phương thức. Trong trường hợp không có `static` thì sẽ báo lỗi như sau:    

![main_02](https://media.techmaster.vn/api/static/bq0a8rs51co78aldi4p0/A0fmkBB1)

- `void`: Đơn giản là vì phương thức `main` không trả về giá trị nào nên để là `void` thôi. Nếu đổi sang kiểu dữ liệu khác cũng sẽ lỗi.       

![main_03](https://media.techmaster.vn/api/static/bq0a8rs51co78aldi4p0/wpfNECwA) 

- `String[] args`: Tham số truyền vào mà một mảng String. `args` viết tắt của từ arguments. Ta có thể đổi tên cho tham số mà không nhất thiết dùng `args`. Ngoài ra thay vì dùng mảng String thì ta cũng có thể sử dụng `String...args`. Ví dụ:  
```java
public static void main(String... eri)
```

*Lưu ý*: 
- Nếu tên phương thức mà ta đổi sang một tên khác `main`thì JVM cũng sẽ không tìm được phương thức `main` để chạy chương trình. 
- Trong trường hợp xuất hiện phương thức khác trùng tên với phương thức `main`, thì phương thức nào có tham số thoả mãn điều kiện thì sẽ được chọn làm phương thức `main` của chương trình 
- Bạn có thể sử dụng `throws` để khai báo ngoại lệ 
```java
public static void main(String[] args) throws Exception
```
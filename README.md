# Java-Core-Tutorial

## Java là gì?
Java là một trong những ngôn ngữ lập trình hướng đối tượng. Nó được sử dụng trong phát triển phầm mềm, website, ứng dụng di dộng,...  

Được phát triển bởi Sun Microsystems, do James Gosling khởi xướng vào năm 1991 và ra mắt vào năm 1995. Ban đầu Java được tạo nhằm mục đích viết phần mềm cho các sản phẩm gia dụng và có tên là Oak. 

Java được tạo ra với tiêu chí ***"Write Once, Run Anywhere - Viết một lần, thực thi khắp nơi"***. Chương trình phần mềm viết bằng Java có thể chạy trên mọi nền tảng (platform) khác nhau thông qua một môi trường thực thi với điều kiện có môi trường thực thi thích hợp hỗ trợ nền tảng đó.  

## Đặc điểm của Java  
Trong quá trình tạo ra một ngôn ngữ mới phục vụ cho mục đích chạy được trên nhiều nền tảng, các kỹ sư của Sun MicroSystems muốn tạo ra một ngôn ngữ dễ học và dễ quen thuộc với đa số người lập trình. Vì vậy, họ đã sử dụng lại các cú pháp của C và C++  

Tuy nhiên, trong Java thao tác với con trỏ bị lược bỏ nhằm đảm bảo tính an toàn và dễ sử dụng hơn. Các thao tác Overload, goto hay cấu trúc như Struct và Union cũng được loại bỏ khỏi Java  

Java là ngôn ngữ lập trình hướng đối tượng nên nó cũng có 4 đặc điểm chung của ngôn ngữ lập trình hướng đối tượng:  
- **Tính trừu tượng (Abstraction)**
- **Tính đa hình (Polymorphism)**
- **Tính kế thừa (Inheritance)**
- **Tính đóng gói (Encapsulation)**   

Bên cạnh đó Java còn có một số đặc tính khác: 
- **Độc lập nền tảng**: Khi Java được biên dịch, thay vì được biên dịch sang một mã máy cụ thể, nó được biên dịch thành bytecode chạy trên máy ảo Java (JVM). Điều này đồng nghĩa với việc bất cứ thiết bị nào có cài đặt JVM thì sẽ thực thi được các chương trình Java  

- **Đơn giản**: Nếu bạn đã được làm quen với các ngôn ngữ lập trình hướng đối tượng thì việc học Java sẽ dễ dàng hơn. Java trở nên đơn giản hơn so với C/C++ do đã loại bỏ tính đa kế thừa và con trỏ. (Cơ mà không dễ hơn là bao đâu :v)  

- **Bảo mật**: Java hỗ trợ bảo mật tốt bởi các thuật toán mã hóa một chiều hoặc mã hóa công cộng  

- **Đa luồng**: Với tính năng đa luồng Java có thể viết chương trình có thể thực thi nhiều task cùng một lúc. Tính năng này thường được áp dụng rất nhiều trong lập trình game.  

- **Hiệu suất cao**: nhờ vào trình thu gom rác (Garbage Collection) giải phóng bộ nhớ đối với các đối tượng không được dùng đến  

## JDK, JVM và JRE  
- JVM (Java Virtual Machine):Máy ảo Java là thành phần nền tảng Java thực thi các chương trình Java của bạn. Nó có 2 chức năng chính: Cho phép các chương trình Java chạy trên mọi thiết bị hoặc hệ điều hành và quản lý, tối ưu hóa bộ nhớ chương trình  
- JRE (Java Runtime Environment): Khởi tạo Jvm và đảm bảo các phụ thuộc có sản cho chương trình của bạn. JRE chứa các thư viện Java, trình tải lớp Java và JVM. Nó chịu trách nhiệm tải chính xác các lớp và các kết nối chúng với thư viện Java cốt lõi  
- JDK (Java Development Kit): Là một thành phần nền tảng chính để xây dựng các ứng dụng Java. Trái tim của nó là trình biên dịch Java. JRE có thể được sử dụng như một thành phần độc lập để chạy các chương trình Java, nhưng nó cũng là một thành phần của JDK. JDK yêu cầu JRE vì chạy các chương trình Java là một phần việc phát triển chúng  

## Cài đặt môi trường lập trình Java  

Xem hướng dẫn cài đặt tại [Đây](https://youtu.be/YvgLunafFKE)
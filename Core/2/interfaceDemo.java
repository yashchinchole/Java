// interface base {
//     int age = 20;

//     void show();
// }

// interface derived {
//     void display();
// }

// class child implements base, derived {
//     public void show() {
//         System.out.println("SHOW");
//     }

//     public void display() {
//         System.out.println("DISPLbaseY");
//     }
// }

// public class interfaceDemo {
//     public static void main(String[] args) {
//         System.out.println(base.age);

//         base o = new child();
//         o.show();

//         child obj = new child();
//         obj.show();
//         obj.display();
//     }
// }
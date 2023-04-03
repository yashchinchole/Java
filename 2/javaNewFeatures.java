// interface base {
//     void show();

//     default void config() {
//         System.out.println("in config");
//     }

//     // static void abc() {
//     // System.out.println("in abc");
//     // }
// }

// class derived implements base {
//     public void show() {
//         System.out.println("in show");
//     }
// }

// public class javaNewFeatures {
//     public static void main(String[] args) {
//         // base.abc();
//         // base.config();
//         base obj = new derived();
//         obj.config();
//     }
// }
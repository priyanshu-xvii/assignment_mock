// // import java.util.Scanner;

// // public class Main {
// //     public static void main(String[] args) {

// //         final double PI = 3.14159;
// //         double radius, area;

// //         Scanner sc = new Scanner(System.in);

// //         System.out.print("Enter radius of the circle: ");
// //         radius = sc.nextDouble();

// //         area = PI * radius * radius;

// //         System.out.println("Area of the circle = " + area);

// //         sc.close();
// //     }
// // }

// // import java.util.Scanner;

// // public class Main {
// //     public static void main(String[] args) {

// //         Scanner sc = new Scanner(System.in);

// //         System.out.print("Enter first number: ");
// //         int a = sc.nextInt();

// //         System.out.print("Enter second number: ");
// //         int b = sc.nextInt();

// //         System.out.print("Enter third number: ");
// //         int c = sc.nextInt();

        
// //         int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

// //         System.out.println("Largest number is: " + largest);

// //         sc.close();
// //     }
// // }


// // import java.util.Scanner;

// // public class Main {
// //     public static void main(String[] args) {

// //         double length, breadth, perimeter;

// //         Scanner sc = new Scanner(System.in);

// //         System.out.print("Enter length of rectangle: ");
// //         length = sc.nextDouble();

// //         System.out.print("Enter breadth of rectangle: ");
// //         breadth = sc.nextDouble();

// //         perimeter = 2 * (length + breadth);

// //         System.out.println("Perimeter of rectangle = " + perimeter);
// //     }
// // }

// // import java.util.Scanner;
// // public class Main {
// //     public static void main(String[] args) {

// //         Scanner sc = new Scanner(System.in);

// //         System.out.print("Enter first number: ");
// //         int a = sc.nextInt();

// //         System.out.print("Enter second number: ");
// //         int b = sc.nextInt();

// //         System.out.println("\n--- Arithmetic Operations ---");
// //         System.out.println("Addition = " + (a + b));
// //         System.out.println("Subtraction = " + (a - b));
// //         System.out.println("Multiplication = " + (a * b));
// //         System.out.println("Division = " + (a / b));
// //         System.out.println("Modulus = " + (a % b));

// //         System.out.println("\n--- Relational Operations ---");
// //         System.out.println("a > b  : " + (a > b));
// //         System.out.println("a < b  : " + (a < b));
// //         System.out.println("a == b : " + (a == b));
// //         System.out.println("a != b : " + (a != b));
// //         System.out.println("a >= b : " + (a >= b));
// //         System.out.println("a <= b : " + (a <= b));


// //         sc.close();
// //     }
// // }



// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();

//         System.out.print("Enter third number: ");
//         int c = sc.nextInt();

        
//              if (a > b) {
//             if (a > c) {
//                 System.out.println("Largest number is: " + a);
//             } else {
//                 System.out.println("Largest number is: " + c);
//             }
//         } else {
//             if (b > c) {
//                 System.out.println("Largest number is: " + b);
//             } else {
//                 System.out.println("Largest number is: " + c);
//             }
//         }

//         sc.close();
//     }
// }


// // public class Main {
// //     public static void main(String[] args) {

// //         System.out.println("Even numbers between 1 to 50:");

// //         for (int i = 1; i <= 50; i++) {
// //             if (i % 2 == 0) {
// //                 System.out.print(i + " ");
// //             }
// //         }
// //     }
// // }

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter n: ");
//         int n = sc.nextInt();

//         int sum = 0, i = 1;

//         do {
//             sum = sum + i;
//             i++;
//         } while (i <= n);

//         System.out.println("Sum of first " + n + " natural numbers = " + sum);

//         sc.close();
//     }
// }

// import java.util.Scanner;

// class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();
// int c = sc.nextInt();
// if (a>=b){
//     if(a>c){
//     System.out.println("a is greatest");}
// }
// else if (b>=a){
//     if(b>c){
//     System.out.println("b is greatest");}
// }
// else if (c>b) {
//     System.out.println("c is greatest ");}
// }
// }

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Priyanshu");
        System.out.println(id + " " + name);
    }
}

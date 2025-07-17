// public class Recursion {
//     public static void printFib(int a,int b,int n){
//         if(n == 0){
//             return;
//         }
//         int c = a+b;
//         System.out.println(c);
//         printFib(b,c,n-1);
//     }
//     public static void main(String[] args){
//         int a = 0,b = 1;
//         System.out.println(a);
//         System.out.println(b);
//         int n = 7;
//         printFib(a,b,n-2);

//     }
// }
// import java.util.*;
// public class Recursion{
// public static void PrintFactorial(int n){
//     if(n<0){
//         System.out.println("Invalid number");
//         return;
//     }
//     int factorial = 1;
//     for(int i=n;i>=1;i--){
//         factorial = factorial*i;
//     }
//     System.out.println(factorial);
//     return;
// }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("enter a number");
//     int n = sc.nextInt();
//     System.out.println("factorial is :");
//     PrintFactorial(n);
//   }
// }

 
// public class Recursion{
//     public static void printNumb(int n){
//         if(n==6){
//         return;
//         }
//         System.out.print(n);
//             printNumb(n+1);

//     }
//     public static void main(String[] args) {
//         int n = 1;
//         printNumb(n);
//     }
// }

// public class Recursion {

//     public static void printSum(int i,int n,int sum){
//         if(i==n){
//             sum = sum+i;
//             System.out.println(sum);
//             return;
            
//         }
//         sum = sum+i;
//         printSum(i+1, n, sum);
//     }
//     public static void main(String[] args) {
//         printSum(1,5, 0);
//     }
// }

// public class Recursion{
//     public static int calcfactorial(int n){
//         if(n==1 || n==0){
//             return 1;
//         }
//        int fact = calcfactorial(n-1);
//        int fact_n = n*fact;
//        return fact_n;
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         int ans = calcfactorial(n);
//         System.out.println(ans);
//     }
// }
// calculate power x to the power n;
// public class Recursion {
//     public static int calcPower(int x,int n){
//          if(n==0){
//             return 1;
//          }
//          if(x==0){
//             return 0;
//          }
//          int xPownm1 = calcPower(x,n-1);
//          int xPown = x*xPownm1;
//          return xPown;
//          }
//      public static void main(String[] args) {
//         int x= 2, n=5;
//         int ans = calcPower(x, n) ;
//         System.out.println(ans);
//      }
// }

// Q7. Print x^n (with stack height = logn)
// public class Recursion {
//    public static int calcPower(int n,int x){
//       if(n==0){
//          return 1;
//       }
     
//       if (n%2==0){
//          return calcPower(x, n/2)*calcPower(x, n/2);
//       }
//       else{
//          return calcPower(x, n/2)*calcPower(x, n/2) * x;
//       }
//    }
//       public static void main(String[] args){
//          int x = 3, n = 5;
//          int ans = calcPower(x, n);
//          System.out.println(ans);
//       }
//    }

// public class Recursion {
// public static void printRev(String str,int idx){
//    if(idx==0){
//     System.out.println(str.charAt(idx));
// }
// System.out.print(str.charAt(idx));
// printRev(str,idx-1);
// }
// public static void main(String[] args) {
// String str = "abcd";
// printRev(str ,str.length()-1);
// }
// }

// public class Recursion {
//    public static int first =-1;
//    public static int last = -1;
//    public static void findOccurance(String str,int idx,char element){
//     if (idx == str.length()) {
//         return;
//      }

//      char currChar = str.charAt(idx);
     
//       if (currChar==element){
//          if(first == -1){
//              first = idx;
//          }else{
//             last = idx;
//          }
//       }
//       findOccurance(str, idx+1, element);
//    }
//    public static void main(String[] args) {
//       String str = "abbbaac";
//       findOccurance(str,0,'a' );
//       System.out.println("First occurrence: " + first);
//       System.out.println("Last occurrence: " + last);
//    }public s
// }
 
// public class Recursion {

//    public static void printFib(int a,int b,int n){
//       if(n==0){
//          return;
//       }
//       int c = a+b;
// System.out.println(c);
//       printFib(b,c,n-1);
//    }
//    public static void main(String[] args) {
//       int n= 7;
//       int a = 0;
//       int b = 1;
//       System.out.println(a);
//       System.out.println(b);
//       printFib(a, b,n-2);
//    }
// }
// public class Recursion {
//    public static void printNum(int n){
//      if(n==11){
//       return;
//      }
//      for(int i=0;i<=n;i++){
// System.out.println(i);
//      }
//       }
//       public static void main(String[] args) {
//          int n= 10;
//          printNum(n);
//       }
//    }

// public class Recursion {

//     public static boolean [] map= new boolean[26];
//     public static void removeDuplicates(String str,int idx,String newString){
//         if(idx == str.length()){
//             System.out.println(newString);
//         }
//         char currChar = str.charAt(idx);
//         if(map[currChar - 'a']){
//             removeDuplicates(str, idx+1, newString);
//         }else{
//             newString+=currChar;
//             map[currChar - 'a'] = true;
//             removeDuplicates(str, idx+1, newString);
//         }
//     }
//     public static void main(String[] args) {
//         String str = "jeevan";
//         removeDuplicates(str, 0, "");
//     }
// }
//    public class Recursion {

//         // Function to reverse the string using recursion
//         public static String reverseString(String s) {
//             // Base case: if the string is empty or has one character, return the string
//             if (s.isEmpty()) {
//                 return s;
//             } else {
//                 // it will extract all string and add one by one at index 1
//                 // Recursive case: reverse the substring excluding the first character, then append the first character
//                 return reverseString(s.substring(1)) + s.charAt(0);
//             }
//         }
    
    //     public static void main(String[] args) {
    //         String inputString = "hello";
    //         String reversedString = reverseString(inputString);
    //         System.out.println(reversedString);
    //     }
    // }
   //  public class Recursion {
   //    public static int calcfactorial(int n){
   //       if(n==0 || n==1){
   //          return 1;
   //       }
   //       return n*calcfactorial(n-1);
   //    }
   //    public static void main(String[] args) {
   //       int n= 5;
   //       int result = calcfactorial(n);
   //       System.out.println(result);
   //    }

    
      
   //  }
//    class Student {
//     int id;
//     String name;

//     // Constructor using 'this' to distinguish variables
//     Student(int id, String name) {
//         this.id = id;       // 'this.id' refers to instance variable
//         this.name = name;   // 'name' is the local variable (parameter)
//     }

//     void display() {
//         System.out.println("ID: " + this.id);
//         System.out.println("Name: " + this.name);
//     }
// }

// public class Recursion {
//     public static void main(String[] args) {
//         Student s1 = new Student(101, "Alice");
//         s1.display();
//     }
// }


// import java.util.Scanner;
// public class Strings {
//     public static void main(String[] args){
//         String name1 = "jeevan";
//         String name2 = "jjevan";
//         if(name1.compareTo(name2) == 0){
//             System.out.println("Strings are equall ");
//         }else{
//             System.out.println("Strings are not equall ");
//         }
//     }
// }
// StringBuilder sb = new StringBuilder("tony");
// System.out.println(sb);
// // System.out.println(sb.charAt(0));
// // sb.setCharAt(0, 'p');
// // sb.delete(2,4);
// sb.insert(2,'n');
// System.out.println(sb);
//     } 
// }
// public class Strings {

// public static int first =-1;
//    public static int last = -1;
//    public static void findOccurance(String str,int idx,char element){
//      if(idx == str.length()){
//         return;
//      }
//       char currChar = str.charAt(idx);
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
//       String str = "abaacdaefaah";
//       char element = 'a';
//       findOccurance(str,0,'a' );
//       System.out.println("First occurence : " + first);
//       System.out.println("Last occurence : " + last);
//    }
// }

public class Strings {

    public static boolean isSorted(int arr[],int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            return isSorted(arr, idx+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        int arr[] = {1,2,3};
        System.out.println(isSorted(arr, 0));
    }
    }
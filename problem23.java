// public class problem23{
//     public static int linearSearch(int[] arr, int key) {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == key) {
//                 return i; // Return index if found
//             }
//         }
//         return -1; // Element not found
//     }

//     public static void main(String[] args) {
//         int[] numbers = {10, 20, 30, 40, 50};
//         int key = 30;

//         int result = linearSearch(numbers, key);
//         if (result == -1) {
//             System.out.println("Element not found.");
//         } else {
//             System.out.println("Element found at index: " + result);
//         }
//     }
// }
// public class problem23 {
//     public static int binarySearch(int arr[],int key){
//         int low=0;
//         int high = arr.length-1;
        
//         while(low<=high){
//            int mid = (low+high)/2;
//            if(arr[mid]==key){
//         return mid;
//            }else if(arr[mid]< key){
//             low = mid+1;
//            }else{
//             high = mid-1;
//            }
//         }
//         return -1;
//     }
    
// public static void main(String[] args) {
//         int[] arr = {10, 20, 30, 40, 50};
//         int key = 30;

//         int result = binarySearch(arr, key);
        
//      if (result == -1) {
//             System.out.println("Element not found.");
//         } else {
//             System.out.println("Element found at index: " + result);
//         }
//     }
// }
// public class problem23{
//     public static void main(String[] args) {
//         int[] arr = {10, 20, 30, 40, 50};
//         int value = 30;
//         int n = arr.length;
//         for(int i=0;i<=n;i++){
//             if(arr[i] == value){
//                 for (int j = i; j <n-1; j++) {
//                    arr[j] = arr[j+1];
//                 }
//                 n--;
//                 break;
//             }
       
//         }
//         System.out.print("Array after deletion: ");
//             for (int i = 0; i < n ; i++) {
//                 System.out.print(arr[i] + " ");
// }
// }
// }
// bubble sort
// public static void printArray(int arr[]){
//    for(int i=0;i<arr.length;i++){
//     System.out.print(arr[i]);
//    }
//    System.out.println();
// }
// public static void main(String[] args) {
//     int arr[] ={2,1,9,4,6,3,8};
//     for (int i = 0; i < arr.length-1; i++) {
//         for (int j = 0; j < arr.length-i-1; j++) {
//             if(arr[j]>arr[j+1]){
//                 int temp = arr[j];
//                 arr[j] = arr[j+1];
//                 arr[j+1] = temp;
//             }
//         }
//     }
//     printArray(arr);
// }
// selection sort
// public static void printArray(int arr[]){
//     for (int i = 0; i < arr.length; i++) {
//         System.out.print(arr[i]);
//     }
//     System.out.println();
// }
// public static void main(String[] args) {
//     int arr[] ={3,1,8,6,0};
//     for(int i=0;i<arr.length-1;i++){
//         int smallest = i;
//         for (int j = i; j < arr.length; j++) {
//             if (arr[smallest] > arr[j]) {
//                 smallest = j;
//             }
//         }
//         int temp = arr[smallest];
//         arr[smallest] = arr[i];
//         arr[i] = temp;
//     }
//     printArray(arr);
// }
// }
public class problem23{
    public static int calcpower(int n,int x){
        if(n==0){
      return 1;
        }
        if (x==0) {
            return 0;
        }
        if(n%2==0){
           return calcpower( n/2,x)*calcpower( n/2,x);
        }else{
             return calcpower( n/2,x)*calcpower( n/2,x)*x;
        }
    }
    public static void main(String[] args) {
        int x=2,n=3;
        int ans = calcpower(n, x);
        System.out.println(ans);
    }

}
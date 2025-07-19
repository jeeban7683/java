
public class Strings {

public static int first =-1;
   public static int last = -1;
   public static void findOccurance(String str,int idx,char element){
     if(idx == str.length()){
        return;
     }
      char currChar = str.charAt(idx);
      if (currChar==element){
         if(first == -1){
             first = idx;
         }else{
            last = idx;
         }
      }
      findOccurance(str, idx+1, element);
   }
   public static void main(String[] args) {
      String str = "abaacdaefaah";
      char element = 'a';
      findOccurance(str,0,'a' );
      System.out.println("First occurence : " + first);
      System.out.println("Last occurence : " + last);
   }
}

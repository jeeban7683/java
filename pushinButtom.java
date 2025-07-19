import java.util.*;
public class pushinButtom {
  public static void pushinButtom(int data,Stack<Integer> s){
    if (s.isEmpty()) {
      s.push(data);
      return;
    }
    int top = s.pop();
    pushinButtom(data, s);
    s.push(top);
  }
  
  public static void main(String[] args) {
    Stack<Integer> s = new Stack();
    s.push(1);
    s.push(3);
    s.push(6);
    pushinButtom(4,s);
    while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
    }
    
  }  
}

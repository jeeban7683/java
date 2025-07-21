import java.util.ArrayList;
import java.util.Collections;
 class ArrayLists {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(4);
        list.add(9);
        list.add(6);
        System.out.println(list);
// get an element in list
        int element = list.get(0);
        System.out.println(element);
        // add an element 
        list.add(1,4);
        System.out.println(list);
        // set an element in list
        list.set(1,3);
        System.out.println(list);
        // remove or delete an element in list
        list.remove(4);
        System.out.println(list);
        // size of the list
        int size = list.size();
        System.out.println(size);
    
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
            
            Collections.sort(list);
            System.out.println(list);
        }

    }
    


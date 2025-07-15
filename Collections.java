import java.util.*;
public class Collections {
    public static void main(String[] args) {
        
        //
        List<Integer>li=new ArrayList<>();// decalartion of list
        
        li.add(200);//adds each and evry elemnt and we have to use add() method
        li.add(700);
        li.add(500);
        li.add(400);
        li.add(100);
        li.add(0);
        li.add(100);
        li.add(3,600);//adds element at particular index
        System.out.println(li);
        System.out.println(li.get(5));// to get a element at particular index

        List<Integer>l2=new ArrayList<>();

        l2.add(300);
        l2.add(800);

        li.addAll(3,l2);//adds all collections of elements at particular index
        System.out.println(li);

        System.out.println(li.indexOf(100));// to  get index value of an element 
        System.out.println(li.lastIndexOf(100));//last index of an element

        li.remove(5);
        System.out.println(li);
        System.out.println(li.size());

    }
}

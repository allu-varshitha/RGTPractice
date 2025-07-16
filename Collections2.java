import java.util.*;
public class Collections2 {
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();

        //4 methods
        // push()-->inserting 

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);//10-20-30-40-50
        System.out.println(s);

        //pop()-->deleting

       System.out.println(s.pop());
       System.out.println(s);//removes last element

       System.out.println(s.peek());// returns topmost value

       System.out.println(s.search(10));//4th offset

       while(!s.empty())
       System.out.print(s.pop()+" ");

    }
}
        

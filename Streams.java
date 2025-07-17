import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<Integer>();
        l.add(3000);
        l.add(5000);
        l.add(2000);
        l.add(1000);
        l.add(6000);
        long result=l.stream().filter((Integer sal)->sal>3000).count();
        System.out.println(result);

         //    filters the elements
    //   Stream<String>ns=Stream.of("hello","how","are","you");
    //   Stream<String>fs=ns.filter((String name)->name.length()<=3);
    //   List<String>fs1=fs.collect(Collectors.toList());
    //   System.out.println(fs1);
      
   //   map
    //   Stream<String>ns=Stream.of("hello","how","are","you");
    //   Stream<String>fs=ns.map((String name)->name.toUpperCase());
    //   List<String>result=fs.collect(Collectors.toList());
    //   System.out.println(result);

//Flatmap
List<List<String>>sl=Arrays.asList(
    Arrays.asList("I","Love","Paris"),
    Arrays.asList("hello","welcome")
);
// Stream<String>s1=sl.stream().flatMap((List<String>s)->s.stream());
//  List<String> result = s1.collect(Collectors.toList());

System.out.println(result);

//distinct
Integer[] arr={1,2,3,4,1,3,5};
// Stream<Integer>s=Arrays.stream(arr).distinct();
//sorted
// // Stream<Integer>s=Arrays.stream(arr).sorted();
// List<Integer> result = s.collect(Collectors.toList());
//  System.out.println(result);
    
//limit
List<Integer>numbers=Arrays.asList(2,1,3,4,6);
Stream<Integer>ns=numbers.stream().limit(3);
List<Integer>nl=ns.collect(Collectors.toList());
System.out.println(nl);

//Skip
// List<Integer>numbers=Arrays.asList(2,1,3,4,6);
// Stream<Integer>ns=numbers.stream().skip(3);
// List<Integer>nl=ns.collect(Collectors.toList());
// System.out.println(nl);

//for each
// List<Integer>numbers=Arrays.asList(2,1,4,7,10);
// numbers.stream().filter((Integer val)->val>=3).forEach((Integer val)->System.out.println(val));
// //reduce
// List<Integer>n=Arrays.toList(2,1,4,7,10);
// Optional<Integer>rv=n.stream().reduce((Integer val1,Integer val2)->v1+v2);
// System.out.println(rs.get());
// //min and max streams
// Optional<Integer>rv=n.stream().reduce((Integer val1,Integer val2)->v2-v1);
// System.out.println(rv.get());




        

    }
}

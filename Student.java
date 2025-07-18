import java.util.*;
public class Student implements Comparable<Student>{
        int id;
        String name;
    public Student(int id,String name){
            this.id=id;
            this.name=name;
        }
        @Override
        public String toString(){
            return "id: "+this.id+"name: "+this.name;
        }
        public int compareTo(Student o){
            if(this.id>o.id){
                return 1;
            }
            else{
                return -1;
            }
        }


    }

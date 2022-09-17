import java.util.*;
import java.util.stream.*;

public class Main{
    
    public static void main(String...args){
        
        ArrayList<Integer> mylist = new ArrayList<>();
        mylist.add(12);
        mylist.add(24);
        mylist.add(36);
        mylist.add(48);
        mylist.add(20);
        mylist.add(22);
        mylist.add(31);
        mylist.add(18);
        mylist.add(11);
        mylist.add(14);
        mylist.add(25);
        mylist.add(48);
        System.out.println(mylist);
        
        Stream<Integer> myStream = mylist.stream();
        
        Optional<Integer> minVal = myStream.min(Integer::compare);
        if(minVal.isPresent()){
            System.out.println("Minimum value: " + minVal.get());
        }
        
        myStream = mylist.stream();
        
        Optional<Integer> maxVal = myStream.max(Integer::compare);
        if(maxVal.isPresent()){
            System.out.println("Maximum value: " + maxVal.get());
        }
        
        Stream<Integer> mySorted = mylist.stream().sorted();
        
        System.out.println("Sorted Stream: ");
        mySorted.forEach( (n) -> System.out.print(n + " "));
        
        Stream<Integer> myOdds = mylist.stream().filter((n) -> ( n % 2) != 0);
        System.out.println();
        
        System.out.println("Odds number Stream: ");
        myOdds.forEach( (n) -> System.out.print(n + " "));
        
        
        
        
        
    }
}

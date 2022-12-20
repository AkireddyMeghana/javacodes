package collections;

import java.util.*;

public class Arraylist1 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(8);
        numbers.add(3);
        numbers.add(7);
        numbers.add(1);
        int sum=0;
        for(int num:numbers) {
            if ((num % 2) != 0) {
                sum = sum + num;
            }
        }
        System.out.println("total sum of odd numbers in the list is: "+sum);

        List <String> names=new ArrayList<>();
        names.add("megha");
        names.add("siri");
        names.add("Radha");
        names.add("suppu");
        names.add("raghu");
        names.add(3,"sai");
        for(String name:names){
            if(name.startsWith("s")){
                System.out.println(name);
            }
        }

    }
}



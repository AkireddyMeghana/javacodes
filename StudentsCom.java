package collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentsCom {
    public static void main(String[] args){
        List<StudentDetails> list=new ArrayList<>();
        list.add(new StudentDetails(11,"meghana",'A'));
        Map<Character,List<StudentDetails>> mapset = new HashMap<>();
        for(Map.Entry<Character,List<StudentDetails>>  entry: mapset.entrySet()){

        }
    }
}


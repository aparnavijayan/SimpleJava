import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapStreamExample {

    public void exampleMethod() {

     HashMap<String,Integer> studentMap= new HashMap<>();
     studentMap.put("Aparna",50);
     studentMap.put("Arnav",55);
     studentMap.put("Vishnu",50);

        System.out.println("All student grades:");
        studentMap.forEach((key, value) -> System.out.println(key + "Value" + value));

        // Filtering entries with grades greater than 85

        Map<String,Integer> grades=
                studentMap.keySet().stream()
                        .filter(key->studentMap.get(key)>51)
                        .collect(Collectors.toMap(key->key,studentMap::get));


        Map<String,Integer> data=studentMap.keySet().stream().filter(key->studentMap.get(key)>52).collect(Collectors.toMap(key->key,studentMap::get));


        double averageGrade = studentMap.values().stream().mapToInt(Integer::intValue).average().orElse(0);
         ArrayList<String> list= new ArrayList<>(List.of("India", "USA", "Russia", "India", "China", "Australia", "India","China", "Australia"));
        int count;
        int size =list.size();
        ArrayList<String> maxCount= new ArrayList<>();
        for(int i=0;i<=size;i++)
        {
            String temp= list.get(i);
            list.forEach(x->{
                if(x.equalsIgnoreCase(temp));
                maxCount.add(x);
            });
        }
        System.out.println(maxCount.stream().max(String::compareTo));
    }


    }


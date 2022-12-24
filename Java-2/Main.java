import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
        ArrayList<String> list=new ArrayList<String>();
        HashSet<String> set=new HashSet();
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        for(int i=0;i<5;i++) {
            String inp = sc.nextLine();
            list.add(inp);
            set.add(inp);
            if(map.containsKey(inp))
                map.put(inp, map.get(inp)+1);
            else
                map.put(inp, 1);
        }
        System.out.println("List Contains: ");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("Set Contains: ");
        for(String i:set){
            System.out.println(i);
        }
        System.out.println("Frequency of the words: ");
        for (Map.Entry entry : map.entrySet()) {
            System.out.println("Word = "+entry.getKey() + ", Frequency = " + entry.getValue());
        }
	}
}

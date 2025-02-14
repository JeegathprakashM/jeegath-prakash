import java.util,*;
public class main{
    public static void main(string[] args)}
    hashmap<string string> map=new hashmap<>();


//insertion
map.put("TN","tamilnadu");
map.put("KA","karnataka");
map.put("KL","kerala");

// search
system.out.println(map.get("TN"));
system.out.println(map.get("KA"));
system.out.println(map.get("KL"));
system.out.println(map.get("MA"));
system.out.println(map.get("AP"));
system.out.println(map.getordefault("AP","not found"));

map.remove("KL");
map.remove("TN");
map.remove("KA");
 for(string key: map.keyset()){
 system.out.println(key+" "+map.get(key));
  }
system.out.println(map.containskey("AP"));
system.out.println(map.containsvalue("tamilnadu"));

sytem.out.println(map.size());
sytem.out.println(map.isempty());

system.out.println(map.value());
sytem.out.println(map.value());
}
}

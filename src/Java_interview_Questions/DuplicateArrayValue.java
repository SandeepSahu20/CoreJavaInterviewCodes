package Java_interview_Questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateArrayValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String names[]={"java","python","C++","rubby","java","C++"};
		for(int i=0;i<names.length;i++){
			
			//System.out.println("Lenth of array is ::"+names.length);
		
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].equals(names[j])){
					System.out.println("Dulicale element is  ::"+names[i]);
				}
			
			}
			}
		
		System.out.println("**********************");
		
		Set<String> store=new HashSet<String>();
		for(String name :names){
			if(store.add(name)==false){
				System.out.println("Dulicale element is  ::"+name);
			}
			
		}

		System.out.println("**********************");
		
		Map<String, Integer> StoreMap=new HashMap<String,Integer>();
		
		for(String name:names){
			Integer count=StoreMap.get(name);
			if(count==null){
				StoreMap.put(name, 1);
			}
			else{
				StoreMap.put(name, count++);
			}
			
		
		}
		
		Set<Entry<String,Integer>> entrySet=StoreMap.entrySet();
		for(Entry<String,Integer> entry : entrySet){
			if(entry.getValue()>1){
				
				System.out.println("Dulicale element is  ::"+entry.getKey());
				
			}
			
		}
		
		}

}

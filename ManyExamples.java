package GraphTheory;

import java.util.HashSet;

public class ManyExamples {

	public static void main(String args[]){
		String S1="India is a beutiful country";
		String S2 = "I am living in India";
		S1=S1.replace(" ","").toLowerCase();
		S2=S2.toLowerCase().trim();
		HashSet <Character> unique= new HashSet<Character>();
		HashSet <Character> common= new HashSet<Character>();

		for(Character c : S1.toCharArray())
		{	unique.add(c);
		common.add(c);
		}
		
		for(Character c : S2.toCharArray()){
			if(unique.contains(c))
				unique.remove(c);
			if(!common.contains(c))
				common.add(c);			
		}
	
		System.out.println(unique.toString());
		System.out.println(common.toString());

	}
	
}

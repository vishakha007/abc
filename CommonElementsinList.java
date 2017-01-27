package flexton;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;
import static java.util.Arrays.asList;

public class CommonElementsinList {

	
	List <Integer> Common(List <Integer>l1,List<Integer>l2){
		List <Integer> common=new ArrayList<Integer>();
		for(Integer i:l1 ){
			if(l1.contains(l2)){
				System.out.println("Common elements "+i);
				common.add(i);
			}
		}
		return common;}
	
	public static void main(String args[]){
		CommonElementsinList cl =new CommonElementsinList();
		List <Integer> l1=new <Integer> ArrayList();//asList(8,1,2,3,4,5,6,7);
		l1.add(1);
		l1.add(2);
		l1.add(3);
		List <Integer> l2 =new <Integer> ArrayList();//asList(7,8,3,6,5);
		l2.add(1);
		l2.add(2);
		l2.add(5);
		l2.add(4);
		List <Integer> R= cl.Common(l1, l2);//l1.retainAll(l2);
		for(Integer r:R)
			System.out.println(r);
	}
}

package jan3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FBFriends {
	String name;
	String email;
	List <FBFriends> friends;
	public FBFriends(String name, String email){
		this.name=name;
		this.email=email;
		friends= new ArrayList<FBFriends>(10);
		for(int i=0;i<10;i++)
			friends.add(null);
		
		
	}
	
	public FBFriends(FBFriends friends2) {
		// TODO Auto-generated constructor stub
		this.name=friends2.name;
		this.email=friends2.email;
		this.friends=friends2.friends;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the friends
	 */
	public List<FBFriends> getFriends() {
		return friends;
	}

	/**
	 * @param friends the friends to set
	 */
	public void addFriends(FBFriends friends) {
		this.friends.add(new FBFriends (friends));
	}

	public void printFBFriends(FBFriends m){
		for(int i=0;i<m.friends.size()&&friends.get(i)!=null;i++)
			System.out.println(m.friends.get(i).getName());
	}
	public static void main(String args[]){
		FBFriends m1=new FBFriends("m1","m@a");
		m1.addFriends(new FBFriends("m2","m@b"));
		m1.addFriends(new FBFriends("m3","m@b"));
		m1.addFriends(new FBFriends("m4","m@b"));
		m1.printFBFriends(m1);
		
	}

}

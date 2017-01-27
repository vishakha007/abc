package jan3;


class HashEntry{
	private int key;
	private int value;
	public HashEntry(int key, int value){
		this.key=key;
		this.value=value;
	}
	public int getkey(){
		return this.key;
		
	}
	public int getvalue(){
		return this.value;
	}
}

public class HashTable {
	private static final int TABLE_SIZE=128;
	HashEntry [] table;
	
	public HashTable(){
		this.table=new HashEntry[TABLE_SIZE];
		for(int i=0;i<TABLE_SIZE;i++)
			table[i]=null;
	}
	//get function
	public int get(int key){
		int hash=key%TABLE_SIZE;
		while(table[hash]!=null && table[hash].getkey() != key){
			hash=(hash+1)%TABLE_SIZE;
		}
		if (table[hash]==null)
			return -1;
		else
			return table[hash].getvalue();
		}
	
	
	
	//put function
	public void put(int key, int value){
		int hash = key%TABLE_SIZE;
		while(table[hash]!=null && table[hash].getkey() != key){
			hash=(hash+1)%TABLE_SIZE;
		}
		System.out.println("Hash for key "+key +" is "+hash);
		table[hash]=new HashEntry(key,value);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTable h=new HashTable();
		for(int i=128;i<140;i++){
			h.put(i, i*10);
			h.put(i, i*100);
		}
		for(int i=130;i<140;i++){
			System.out.println("Value at key  "+i+"  is "+h.get(i));
		}

	}

}

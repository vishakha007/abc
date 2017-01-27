package jan3;

import java.util.HashMap;

class TrieNode{
	char val;
	HashMap<Character, TrieNode> children=new HashMap<Character,TrieNode>();
	boolean isLeaf;
	TrieNode(){
		
	}
	TrieNode(char c){
		this.val=c;
	}
	
}

public class Trie {
	Trie root;
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}

}

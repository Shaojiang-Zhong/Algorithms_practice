
public class UnorderedSequentialSearchST{
	private Node first;
	private class Node{
		String key = "";
		int value = 0;
		Node next = null;
	
	
	

	public Node(String key, int value, Node next) {
		// TODO Auto-generated method stub
		this.key = key;
		this.value = value;
		this.next = next;
		}
	}
	public String getMax(){
		int maxVal = 0;
		String maxStr = "";
		for (Node x = first; x != null; x = x.next) {
			if (x.value > maxVal) { maxStr = x.key; maxVal = x.value;}
		}
		return maxVal + maxStr;
	}
	public int get(String key){
		for (Node x = first; x != null; x = x.next){
			if (key.equals(x.key)) return x.value;
		}
		return -1;
	}
//	public void put(String key, int value){
//		for (Node x = first; x != null; x = x.next){
//			if (key.equals(x.key)){
//				x.value = value;
//				return;
//			}
//		}
//		first = new Node (key, value, first);
//	}
	public void put(String key, int value){
		for (Node x = first; x != null; x = x.next){
			if (key.equals(x.key)){
				x.value = x.value + 1;
				return;
			}
		}
		first = new Node (key, 1, first);
	}
	

}

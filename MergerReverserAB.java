import java.util.Stack;




public class MergerReverserAB {
	class Node{
		int value;
		Node next;
		public Node(int value, Node next) {
			// TODO Auto-generated constructor stub
			this.value = value;
			this.next = next;
		}
	}
	
	static Stack<Node> nodeStack = new Stack<Node>();
	
	public static void mergerReverserAB (Node a, Node b){
		Node first = recursionAB (a,b);
	}
	private static Node recursionAB(Node x, Node y){
		if (x.value <= y.value){
			if (nodeStack.isEmpty()){
				nodeStack.push(x);
				return recursionAB(x.next, y);
			}
			else {
				Node tmp = x.next;
				x.next = nodeStack.pop();
				nodeStack.push(x);
				if (tmp == null){
					while (y.next != null){
						Node tmp2 = y.next;
						y.next = nodeStack.pop();
						nodeStack.push(y);
						y = tmp2;
					}
					return y;
				}
				else return recursionAB(tmp, y);
			}
		}
		else {
			if (nodeStack.isEmpty()){
				nodeStack.push(y);
				return recursionAB(x, y.next);
			}
			else {
				Node tmp = y.next;
				y.next = nodeStack.pop();
				nodeStack.push(y);
				if (tmp == null){
					while (x.next != null){
						Node tmp2 = x.next;
						x.next = nodeStack.pop();
						nodeStack.push(x);
						x = tmp2;
					}
					return y;
				}
				else return recursionAB(tmp, y);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//调用mergerReverserAB方法传入两个链表头指针就行了

	}

}


class Node{
	Item value;        //定义值为Item型。实际运用可以具体定义。
	Node next;
	public Node(Item value, Node next) {
		// TODO Auto-generated constructor stub
		this.value = value;
		this.next = next;
	}
}
public class ReverseLinearList {
	//此方法逆序顺序表
	private static void reverse(Item[] targetArray){
		assert targetArray != null;
		int length = targetArray.length;
		for (int i = 0; i < (length/2); i++) {
			Item tmp = targetArray[i];
			targetArray[i] = targetArray[length - 1 - i];
			targetArray[length - 1 - i] = tmp;
		}
	}
	//此方法逆序链表
	private static void reverse(Node x){
		assert x != null;
		if (x.next == null) return;
		else reverse(x,x.next);
	}
	private static void reverse(Node head, Node tail){
		Node tmp = tail.next;
		tail.next = head;
		if (tmp == null) return;
		reverse(tail, tmp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//主函数进行单元测试调用以上两个静态方法

	}

}

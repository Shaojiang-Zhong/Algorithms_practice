
public class SearchTest {
	private Node first;
	private class Node{
		String score;
		double gpa;
		Node next;
		
		public Node(String score, double gpa, Node next){
			this.score = score;
			this.gpa = gpa;
			this.next = next;
		}
	}
	public void initialize(){
		Node F = new Node("F", 0.00, null);
		Node D = new Node("D", 1.00, F);
		Node C3 = new Node("C-", 1.67, D);
		Node C2 = new Node("C", 2.00, C3);
		Node C1 = new Node("C+", 2.33, C2);
		Node B3 = new Node("B-", 2.67, C1);
		Node B2 = new Node("B", 3.00, B3);
		Node B1 = new Node("B+", 3.33, B2);
		Node A3 = new Node("A-", 3.67, B1);
		Node A2 = new Node("A", 4.00, A3);
		Node A1 = new Node("A+", 4.33, A2);
		first = A1;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchTest st = new SearchTest();
		st.initialize();
		double sum = 0.0;
		for (int i = 0; i < args.length; i++) {
			for (Node x = st.first; x != null; x = x.next){
				if (x.score.equals(args[i])) { sum += x.gpa;break;}
			}
		}
		double average = sum/args.length;
		System.out.println(average);
		 
	
	}

}

import java.util.Stack;

class Function{
	public static boolean isOrderRight(char[] targetString){
		Stack<Character> left = new Stack<Character>();
		
		for (int i = 0; i < targetString.length; i++) {
			if ( targetString[i] == '(' || targetString[i] == '[' || targetString[i] == '{') {
				left.push(targetString[i]);
			}
			else if(targetString[i] == ')'){
				if (left.pop() != '(') { return false;}
			}
			else if(targetString[i] == '}'){
				if (left.pop() != '{') { return false;}
			}
			else if(targetString[i] == ']'){
				if (left.pop() != '[') { return false;}
			}
			else{
				return false;
			}
		}
		return true;
	}
}




public class HelloAlgorithms13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		FixedCapacityStackOfString FCSOS = new FixedCapacityStackOfString(100);
//		for (int i = 0; i < args.length; i++) {
//			if (!args[i].equals("-")) {
//				FCSOS.push(args[i]);
//			}
//			else if (!FCSOS.isEmpty()){
//				System.out.println(FCSOS.pop() + " ");
//			}
//		}
		
		char[] targetString = args[0].toCharArray();
		System.out.println(Function.isOrderRight(targetString));
		

	}

}

//class FixedCapacityStackOfString {
//	private String[] a;
//	private int N;
//	public FixedCapacityStackOfString(int cap){
//		a = new String[cap];
//	}
//	public boolean isEmpty() { return N==0; }
//	public void push(String s){ a[N++] = s; }
//	public String pop(){ return a[--N]; }
//	public boolean isFull(){ return a.length - 1 <= N;}
//	
//	
//}

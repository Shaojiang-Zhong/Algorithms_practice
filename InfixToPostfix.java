import java.rmi.UnexpectedException;
import java.util.Stack;


public class InfixToPostfix {

	public static void main(String[] args) {
//		String s = "1 + 2 ( 4 * 5 )";
//		String[] ss = s.split(" ");
//		for (int i = 0; i < ss.length; i++) {
//			System.out.print(ss[i]);
//		}
		
//		String[] targetStringArray = args[0].split(" ");
//		for (int i = 0; i < targetStringArray.length; i++) {
//			System.out.print(targetStringArray[i]);
//		}
		String[] targetStringArray = args;
		Stack<String> operationStack = new Stack<String>();
		StringBuilder targetStringBuilder = new StringBuilder("");
		
		for (int i = 0; i < targetStringArray.length; i++) {
			if (targetStringArray[i].matches("[0-9]+")) {
				targetStringBuilder.append(targetStringArray[i]);
			}
			else if (targetStringArray[i].equals("+") || targetStringArray[i].equals("-")){
				while (!operationStack.isEmpty()) {
					String tmp = operationStack.pop();
					if (tmp.equals("(")) {
						break;
					}
					else {
						targetStringBuilder.append(tmp);
					}
					
				}
				operationStack.push(targetStringArray[i]);
			}
			else if (targetStringArray[i].equals("*") || targetStringArray[i].equals("/")){
				while (!operationStack.isEmpty()) {
					String tmp = operationStack.pop();
					if (tmp.equals("(")) {
						break;
					}
					else {
						if (tmp.equals("+") || tmp.equals("-")){break;}
						else{targetStringBuilder.append(tmp);}
					}
					
				}
				operationStack.push(targetStringArray[i]);
			}
			else if (targetStringArray[i].equals("(")){
				operationStack.push("(");
			}
			else if (targetStringArray[i].equals(")")){
				if (operationStack.isEmpty()) {
					System.out.println("unexpected input");
					break;
				}
				else {
					while (!operationStack.isEmpty()) {
						String tmp = operationStack.pop();
						if (tmp.equals("(")) {break;}
						else {targetStringBuilder.append(tmp);}
					}
				}
			}
			else {
				System.out.println("unexpected input");
				break;
			}
		}
		while (!operationStack.isEmpty()) {
			targetStringBuilder.append(operationStack.pop());
		}
		
		System.out.println(targetStringBuilder);

	}

}

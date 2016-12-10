import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FrequencyCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			final int minlen = Integer.parseInt(args[0]);
			UnorderedSequentialSearchST st = new UnorderedSequentialSearchST();
			File file = new File("/Users/xiaoshao/Documents/tale.txt");
			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				String tmpLine = null;
				int times = 0 ;
				while((tmpLine = br.readLine()) != null){
					times++;
					String[] tmpArrayWords = tmpLine.split(" ");
					for (int i = 0; i < tmpArrayWords.length; i++) {
						if (tmpArrayWords[i].length() < minlen) continue;
						else st.put(tmpArrayWords[i], 1);
					} 
				}
				br.close();
				System.out.println(times);
				System.out.println(st.getMax());
				System.out.println(st.get("business"));
				
//				while(true){
//					ArrayList<Character> arraylist = new ArrayList<Character>();
//					char tmp = (char) br.read();
//					if (tmp == ' ' || tmp == ',') {
//						String tmpWord = arraylist.toString();
//					}
//					else{
//						arraylist.add(tmp);
//					}
//					
//				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}

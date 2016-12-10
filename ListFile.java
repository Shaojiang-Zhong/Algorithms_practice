import java.io.File;
import java.util.LinkedList;
import java.util.Queue;


public class ListFile {
	
	
	public static void getAllFiles(File targetFile, Queue<File> fileQueue){
		File[] tempList = targetFile.listFiles();
		System.out.println("\n" + targetFile + ":");
		for (int i = 0; i < tempList.length; i++) {
			if (tempList[i].isFile()) {
				fileQueue.offer(tempList[i]);
				System.out.println(tempList[i]);
				}
			else if(tempList[i].isDirectory()){
				getAllFiles(tempList[i], fileQueue);
			}
			
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String InitialPath = args[0];
		File file = new File(InitialPath);
		Queue<File> fileQueue = new LinkedList<File>();
		getAllFiles(file, fileQueue);
		

	}

}

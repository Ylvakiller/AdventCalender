import java.io.IOException;


public class Runner111 {

	
	public static void start(){
		System.out.println("Starting 1.1");
		int[] data = null;
		try {
			data = GeneralStuff.IO.readIntText("./Files/1.1.txt");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		int start = 0;
		for(int i=0;i<data.length;i++){
			start+=data[i];
		}
		System.out.println(start);
	}

}

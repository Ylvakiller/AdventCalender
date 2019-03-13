import java.io.IOException;
import java.util.ArrayList;


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
		System.out.println("Puzzle 1 output = " + start);
		System.out.println("Working on puzzle 2");
		ArrayList<Integer> foundList = new ArrayList<Integer>();
		boolean foundDuplicate = false;
		start = 0;
		int count = 0;
		while(!foundDuplicate){
			System.out.println("At the start of loop " + count + " the value is " + start + " and there are " + foundList.size() + " frequencies found.");
			for(int i=0;i<data.length;i++){
				start+=data[i];
				//Check if the value has already been found
				boolean inList = false;
				for(int j = 0; j<foundList.size();j++){
					if(foundList.get(j)==start){
						inList = true;
						foundDuplicate = true;
						System.out.println("Found a duplicate: " + start);
						break;
					}
				}
				if(!inList){
					foundList.add(start);
				}else{
					break;
				}
			}
			count++;
		}
		
	}

}

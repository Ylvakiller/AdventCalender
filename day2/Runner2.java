import java.io.IOException;

import GeneralStuff.IO;


public class Runner2 {

	public static void start(){
		String[] data = null;
		try {
			data = IO.readStringText("./Files/2.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int countDouble=0,countTriple=0;
		for(int i=0;i<data.length;i++){
			boolean foundDouble = false,foundTriple=false;
			for(int j=0;j<26;j++){

				String line = data[i];
				Character character = (char)(97+j);
				int count = line.length() - line.replaceAll(String.valueOf(character), "").length();
				if(count==2){
					foundDouble=true;
				}else if(count==3){
					foundTriple=true;
				}
				if(foundDouble&&foundTriple){
					break;
				}
				
			}
			if(foundDouble){
				countDouble++;
			}
			if(foundTriple){
				countTriple++;
			}
		}
		System.out.println("Found " + countDouble + " double lettered words and " + countTriple + " triple lettered words");
		System.out.println("Checksum is then " + countDouble * countTriple);
	}
}

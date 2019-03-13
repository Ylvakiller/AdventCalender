import java.io.IOException;

import GeneralStuff.IO;


public class Runner2 {

	public static void start(){
		long time = System.currentTimeMillis();
		String[] data = null;
		try {
			data = IO.readStringText("./Files/2Lev.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean doPart1 = true;
		if(doPart1){
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
		System.out.println(System.currentTimeMillis()-time);
		System.out.println("Doing part 2");
		boolean foundIt = false;
		int charPosition = 0;
		String word = null;
		do {
			for(int i=0;i<data.length-1&&!foundIt;i++){
				word = data[i];
				StringBuilder sb = new StringBuilder(word);
				sb.deleteCharAt(charPosition);
				word = sb.toString();
				for(int j=i+1;j<data.length&&!foundIt;j++){
					String word2 = data[j];
					StringBuilder sb2 = new StringBuilder(word2);
					sb2.deleteCharAt(charPosition);
					word2 = sb2.toString();
					if(word.equals(word2)){
						System.out.println("Found the words");
						foundIt = true;
					}
				}
			}
			
			
			charPosition++;
		}while(!foundIt);
		System.out.println(word);

		System.out.println(System.currentTimeMillis()-time);
	}
}


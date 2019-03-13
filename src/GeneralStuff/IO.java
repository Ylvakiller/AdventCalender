package GeneralStuff;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class IO {

	public IO() {
		// TODO Auto-generated constructor stub
	}
	
	public static int[] readIntText(String Stringpath) throws IOException{
		File file = new File(Stringpath);
		if(!file.exists()){
			throw new IOException("File not found");
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null){
            list.add(Integer.valueOf(line));
        }
        br.close();
        fr.close();
        int[] array = new int[list.size()];
        for(int i=0; i<list.size();i++){
        	array[i] = list.get(i);
        }
		return array;
	}

}

import java.io.*;
import java.util.*;
public class readFile{
	int koin;
	private Scanner x;
	public void openFile(){
		try{
			x = new Scanner(new File("SaveData.txt"));
		}
		catch(Exception e){
			System.out.println("could not find file");
		}
	}
	public void readingFile(){
			koin = x.nextInt();
	}
	public void closeFile(){
		x.close();
	}
}
import java.util.*;

public class createFile{
	

	private Formatter x;
	public void openFile()
	{
		try{
			x = new Formatter("SaveData.txt");
		}
		catch(Exception e) {
			System.out.println("Error : " + e);
		}
	}
	public void addRecords(int koin)
	{
		x.format("%d", koin);
	}
	public void closeFile(){
		x.close();
	}
}
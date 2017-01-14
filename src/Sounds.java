import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sounds{
	
	public static synchronized void nearby(){
		try{
			Clip clip = AudioSystem.getClip();
			AudioInputStream inputStream = AudioSystem.getAudioInputStream(
				test.class.getResourceAsStream("sounds/door.wav"));
			clip.open(inputStream);
			clip.start();
		}catch (Exception e){
			System.err.println(e.getMessage());
		}
	}
}
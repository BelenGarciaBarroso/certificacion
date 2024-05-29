import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Operations {
	public String getData() throws DatoNoEncontradoException{
			try {
				BufferedReader bf=new BufferedReader(new FileReader("dato.txt"));
				return bf.readLine();
			}
			catch(IOException ex) {
				throw new DatoNoEncontradoException();
			}
		
	}
}

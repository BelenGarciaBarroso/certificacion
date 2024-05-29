import java.sql.SQLException;

public class TestException1 {
	public void m() {
		try {
			int a=5;
		}
		catch(RuntimeException ex) {
			ex.printStackTrace();
		}
	}
}

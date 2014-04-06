
import java.util.Observer;

public class Application {
	
	public static void main (String[] args) {
			
		MyController controller = new MyController(new MyModel(), new MyView());
		
		if (controller.initModel(args)) {
			controller.run();
		}
						
	}
}
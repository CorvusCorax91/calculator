
import java.util.Observer;
import java.util.Observable;

public class MyView implements Observer, View {

	public void update(Observable o,Object arg){
		System.out.println("result = " + ((MyModel) o).result);
	}
	
	public void incorrectData(){
		System.out.println("Enter correct parameters");
	}
	
}
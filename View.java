
import java.util.Observable;

interface View {
	void update(Observable o,Object arg);
	void incorrectData();
}
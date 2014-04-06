
public class MyController implements Controller {

	final MyModel currentModel;
	final MyView currentView;	
	
	MyController (MyModel paramModel, MyView paramView) {
	
		this.currentModel 	= paramModel;
		this.currentView	= paramView;
		
		this.currentModel.addMyObserver(this.currentView);		
		
	}	
	
	public boolean initModel(String[] args) {
		
		boolean result = currentModel.correctInput(args);
		
		if (result) {
			currentModel.init(Float.valueOf(args[0]), Float.valueOf(args[2]), args[1]);	
		} else {
			currentView.incorrectData();
		}
		
		return result;
		
	}	
	
	public void run(){
		currentModel.calculation();
	}

	
		
}
	



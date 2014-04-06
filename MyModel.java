
import java.util.Observable;
import java.util.Observer;

import java.util.Arrays;
import java.util.List;

public class MyModel extends Observable implements Model {
	
	float 					paramA, paramB, result;
	String 					operation;
	
	public boolean correctInput (String[] args){
	
		return ((args[2] != "0")&& (args[1] == "/"))&&(args.length == 3)&&(Arrays.asList("+", "-", "*", "/").contains(args[1]));
		
	}
		
	public void init(float paramA, float paramB, String operation){
		this.paramA 		= paramA;
		this.paramB 		= paramB;
		this.operation 		= operation;
	} 
	
	public void addMyObserver (MyView addMyView) {
		addObserver((Observer)addMyView);
	}
	
	public void calculation(){
		
        if (operation.equals("+")) {
			add();
        }
        else if (operation.equals("-")) {
            sub();
        }
        else if (operation.equals("*")) {
            mul();
        }
        else if (operation.equals("/")) {
            div();
		}

		changed();
		notifyObservers();
		
	}
	
	public void add() {
        result = paramA + paramB;
    }

    public void sub() {
        result = paramA - paramB;
    }

    public void mul() {
        result = paramA * paramB;
    }
	
	public void div() {
		result = paramA / paramB;
    }	
	
	public void changed(){
        super.setChanged();
    }
}

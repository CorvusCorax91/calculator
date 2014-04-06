
 interface Model {
 
	boolean correctInput (String[] args);
	void  addMyObserver(MyView addMyView);
	void  init(float paramA, float paramB, String operation);
	
	void  calculation();
	void  add();	
	void  sub();
	void  mul();
	void  div();	
	void  changed();
	
 } 
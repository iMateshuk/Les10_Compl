package by.htp.les10complex.start;

import by.htp.les10complex.entity.Complex;
import by.htp.les10complex.logic.ComplexLogic;
import by.htp.les10complex.present.ComplexPresent;

public class Main {

	public static void main(String[] args) {

		Complex x = new Complex (2, 3);
		Complex y = new Complex (1, 2);
		
		Complex res;
		
		ComplexLogic logic = new ComplexLogic();
		
		ComplexPresent view = new ComplexPresent();
		
		res = logic.add(x, y);
		
		view.printSum(x, y, res);
		
		res = logic.sub(x, y);
		
		view.printSub(x, y, res);

	}

}

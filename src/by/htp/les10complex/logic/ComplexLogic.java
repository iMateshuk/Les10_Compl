package by.htp.les10complex.logic;

import by.htp.les10complex.entity.Complex;

public class ComplexLogic {
	
	public Complex add(Complex a, Complex b) {
        return new Complex(a.getA() + b.getA(),  a.getB() + b.getB());
    }
	
	public Complex sub(Complex a, Complex b) {
        return new Complex(a.getA() - b.getA(),  a.getB() - b.getB());
    }

}

package by.htp.les10complex.present;

import by.htp.les10complex.entity.Complex;

public class ComplexPresent {
	
	public void printSum(Complex a, Complex b, Complex res) {
		System.out.println("("+ a.getA() + " + " + a.getB() + "i) + (" + b.getA() + " + "
				+ b.getB() + "i) = " + res.getA() + " + " + res.getB() + "i");
	}

	public void printSub(Complex a, Complex b, Complex res) {
		System.out.println("("+a.getA() + " + " + a.getB() + "i) - (" + b.getA() + " + "
				+ b.getB() + "i) = " + res.getA() + " + " + res.getB() + "i");
	}

}

package lab4;

public class MultiplicationTable extends ArithmeticTable{
	
	public MultiplicationTable(int xAxis, int yAxis) {
		super(xAxis,yAxis);
	}

	@Override
	int evaluate(int x, int y) {
		return x*y;	
	}

	@Override
	String symbol() {
		return "*";
	}	
}
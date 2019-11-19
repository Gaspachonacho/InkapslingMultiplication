package lab4;

public class AdditionTable extends ArithmeticTable{
	
	public AdditionTable(int xAxis, int yAxis) {
		super(xAxis,yAxis);
	}

	@Override
	int evaluate(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;	
	}

	@Override
	String symbol() {
		return "+";
	}	
}
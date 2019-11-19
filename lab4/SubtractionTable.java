package lab4;

public class SubtractionTable extends ArithmeticTable{
	
	public SubtractionTable(int xAxis, int yAxis) {
		super(xAxis,yAxis);
	}

	@Override
	int evaluate(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;	
	}

	@Override
	String symbol() {
		return "-";
	}	
}
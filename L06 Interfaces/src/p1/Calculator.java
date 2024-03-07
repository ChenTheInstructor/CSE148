package p1;

public class Calculator implements Computable {

	@Override
	public double add(double n1, double n2) {
		return n1 + n2;
	}

	@Override
	public double subtract(double n1, double n2) {
		return n1 - n2;
	}

	@Override // @ annotation
	public void printBye() {
		System.out.println("Good-bye!");
	}
	
//	public double doThis(Computable c) {
//		
//	}
}


public class MathSingleton {
	private static MathSingleton mathinstance;
	private int veriable1;
	private int veriable2;
	
	private MathSingleton(){};
	
	public static MathSingleton getInstance() {
		if(mathinstance == null) {
			mathinstance = new MathSingleton();
		}
		return mathinstance;
	}
	
	public int add() {
		return this.veriable1 + this.veriable2 ;
	}

	public int subtract() {
		return this.veriable1 - this.veriable2;
	}

	public int multiply() {
		return this.veriable1 * this.veriable1;
	}

	public int divide() {
		return this.veriable1 / this.veriable2;
	}

	public int getVeriable1() {
		return this.veriable1;
	}

	public void setVeriable1(int veriable1) {
		this.veriable1 = veriable1;
	}

	public int getVeriable2() {
		return this.veriable2;
	}

	public void setVeriable2(int veriable2) {
		this.veriable2 = veriable2;
	} 
}

public class MathTestDriver {

	public static void main(String[] args) {
			MathSingleton m1 = MathSingleton.getInstance();
			m1 = MathSingleton.getInstance();
			MathSingleton m2 = MathSingleton.getInstance();
			System.out.println(m1.equals(m2));
			
			m2.setVeriable1(60);
			m1.setVeriable1(10);
			
			System.out.println(m2.add());
			
			m1.setVeriable1(10);
			
			System.out.println(m1.add());
			System.out.println(m1.divide());
			System.out.println(m2.divide());
			
	}

} 
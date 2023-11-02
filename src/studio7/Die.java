package studio7;

public class Die {

	private int n;

	public Die(int initSize) {
		this.n = initSize;
	}

	public int Throw() {
		int min = 1;
		int max = this.n;
		int range = max - min;
		int result = (int) (Math.random() * range) + min;
		return result;
	}

	public static void main(String[] args) {
		Die d1 = new Die(10);
		System.out.println(d1.Throw());

	}

}

import java.util.Random;

public class readymadeCake extends Cake{

	public readymadeCake(String n, double r) {
		super(n, r);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcPrice() {
		// TODO Auto-generated method stub
		double quantity = new Random().nextInt(10);
		double price = rate*quantity;
		return price;
	}

}

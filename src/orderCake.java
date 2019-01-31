import java.util.Random;

public class orderCake extends Cake{

	public orderCake(String n, double r) {
		super(n, r);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcPrice() {
		// TODO Auto-generated method stub
		double weight = new Random().nextInt(10);
		double price = rate*weight;
		return price;
	}

}

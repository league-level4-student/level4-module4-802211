import java.util.Random;

public class CakeRunner{

	
//	instructions:
//		√ i) declare an array of 20 cake objects; 
//      √ ii) input data for cake objects and store them into the array; 
//      √ iii) display the total price for all types of cakes; 
//       iv) display the total price and the quantity sold for ready made cakes; 
//       v) display the information for the cake that has been sold for the highest price.
 
	
	public static void main(String[] args) {
		Cake[] arrayofCake = new Cake[20];
	
			for(int i = 0; i<arrayofCake.length; i++) {
				int x = new Random().nextInt(10);
				if(x%2 == 0) {
				arrayofCake[i] = new orderCake("" + i, x);
				}
				else {
				arrayofCake[i] = new readymadeCake("" + i, x);
				}
			}
			
		double price = 0;
		for(int j = 0; j<arrayofCake.length; j++) {
			price = price + arrayofCake[j].calcPrice();
		}
		System.out.println("total price = " + price);
		
		double readymadeCakePrice = 0;
		double totalQuantity = 0;
		for(int k = 0; k<arrayofCake.length; k++) {
			if(arrayofCake[k] instanceof readymadeCake) {
				readymadeCakePrice = readymadeCakePrice + arrayofCake[k].calcPrice();
				totalQuantity = totalQuantity + arrayofCake[k].calcPrice()/arrayofCake[k].rate;
			}
		}
		System.out.println("readymadeCake: \n total price = " 
		+ readymadeCakePrice + "\n quantity = " + totalQuantity);
		
		int highestPrice = 0;
		for(int l = 0; l < arrayofCake.length; l++) {
			double y = arrayofCake[l].calcPrice();
			if(arrayofCake[highestPrice].calcPrice() <= y) {
				highestPrice = l;
			}
			
			
		}
		System.out.println("Cake sold for highest price: \n price = " 
		+ arrayofCake[highestPrice].calcPrice());
		
	}
	
}

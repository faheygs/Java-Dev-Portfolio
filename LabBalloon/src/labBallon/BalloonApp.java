package labBallon;

public class BalloonApp {

	public static void main(String[] args) {
		Balloon balloon1 = new Balloon("helium", Balloon.Size.M);
		System.out.println("balloon1: " + balloon1);

		Balloon balloon2 = new Balloon("helium", Balloon.Size.M);
		System.out.println("balloon2: " + balloon2);
		
		System.out.println("balloon1 == balloon2: " + (balloon1 == balloon2));
		System.out.println("balloon1.equals(balloon2): " + balloon1.equals(balloon2));

	}

}

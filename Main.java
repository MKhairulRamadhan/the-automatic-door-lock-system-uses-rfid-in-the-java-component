public class Main{

	public static void main(String[] args){

		Detector detector = new Detector("123");
		CaseLock caselock = new CaseLock();
		Card card = new Card("123");

		detector.connectTo(caselock);
		card.connectTo(detector);
		card.cartSignal();

		card.connectTo(null);
		card.cartSignal();

		System.out.println("============================");

		Card card2 = new Card("111");
		card2.connectTo(detector);

		card2.cartSignal();		// card2.cartSignal();



	}

}
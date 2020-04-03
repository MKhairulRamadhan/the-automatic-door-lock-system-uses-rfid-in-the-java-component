public class Card{
	private Receiver transmitSignal;
	private String id;

	public Card(String id){
		transmitSignal = null;
		this.id = id;
	}

	public void connectTo(Receiver conDev) { 
        transmitSignal = conDev; 
    }

    public void cartSignal(){
    	if(transmitSignal != null){
	    	transmitSignal.scanning(id);
    	}else{
    		System.out.println("Kartu Tidak Terhubung...!");
    	}
    }
	
}
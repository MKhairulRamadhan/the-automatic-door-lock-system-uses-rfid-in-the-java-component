public class CaseLock implements LineLock{

	public CaseLock(){

	}

	public void transmitLock(Boolean status){
		if (status) {
			System.out.println("kunci terbuka");
		}else{
			System.out.println("kunci tertutup");
		}
		
	}


	
}
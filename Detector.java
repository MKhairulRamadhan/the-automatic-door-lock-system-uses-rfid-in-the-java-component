public class Detector implements Receiver{
	private LineLock statusLock;
	private String idDetector;

	public Detector(String idDetector){
		statusLock = null;
		this.idDetector = idDetector;
	}
	
	public void connectTo(LineLock lockCase){
		statusLock = lockCase;
	}

	public void scanning(String id){
		System.out.println("scanning...!");
		if (statusLock != null && idDetector.equals(id)) {
			System.out.println("Receive id");
			statusLock.transmitLock(true);
		}else{
			System.out.println("Rejected...!");
		}

	}

}
package OnTap;

public class Vote {
	String idvote;
	String chosenCadidate;
	String timeStamp;

	public Vote(String idvote, String chosenCadidate, String timeStamp) {
		super();
		this.idvote = idvote;
		this.chosenCadidate = chosenCadidate;
		this.timeStamp = timeStamp;
	}
	
	public String getIdvote() {
		return idvote;
	}

	public String getChosenCadidate() {
		return chosenCadidate;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public String toString() {
		
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

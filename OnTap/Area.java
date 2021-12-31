package OnTap;

import java.util.ArrayList;
import java.util.HashMap;

public class Area {
	String id;
	String name;
	ArrayList<Vote> voteList = new ArrayList<Vote>();
	

	public Area(String id, String name, ArrayList<Vote> voteList) {
		super();
		this.id = id;
		this.name = name;
		this.voteList = voteList;
	}


	public String getId() {
		return id;
	}

	public String toString() {
		
		return null;
	}
	
	public HashMap<String, String> cadidate_vote_statistic(){
		
		return null;
	}
	
	public String getWinnerArea() {
		
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

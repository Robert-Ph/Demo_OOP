package OnTap;

import java.util.ArrayList;
import java.util.HashMap;

public class Poll {
	String id;
	String term;
	String position;
	ArrayList<Area> areaList = new ArrayList<Area>();
	

	public Poll(String id, String term, String position, ArrayList<Area> areaList) {
		super();
		this.id = id;
		this.term = term;
		this.position = position;
		this.areaList = areaList;
	}


	public String getId() {
		return id;
	}


	public String getTerm() {
		return term;
	}

	public String position() {
		
		return null;
	}
	
	public String toString() {
		
		return null;
	}
	
	public HashMap<String, String> cadidate_vote_statistic(){
		
		return null;
	}
	
	public String getWinnerPoll() {
		
		return null;
	}
	
	public HashMap<String, String> cadidate_percentVote_statistic(){
		
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

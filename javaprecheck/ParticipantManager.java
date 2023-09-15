package javaprecheck;

import java.util.ArrayList;

public class ParticipantManager {
	private ArrayList<Participant> participants = new ArrayList<>();
	private ParticipantOperator participantOperator = new ParticipantOperatorImpl1();
	
	public ParticipantManager() {
		participants.add(new Participant("Tylor","Swift",25, "badminton", 19));
		participants.add(new Participant("Tom","Hancks",28, "tennis",22));
		participants.add(new Participant("John","Smith",32, "badminton",28));
		participants.add(new Participant("Micheal","Jackson",31, "swimming",14));
		participants.add(new Participant("Hellen","Keller",50, "swimming",5));
		participants.add(new Participant("David","Chen",25, "tennis", 18));
	}
	
	public void printSportType() {
		participantOperator.sportType(participants);
	}
	
	public void printAwardsNumber() {
		participantOperator.awardsNumber(participants);
	}

}

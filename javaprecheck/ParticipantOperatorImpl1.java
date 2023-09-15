package javaprecheck;

import java.util.ArrayList;


public class ParticipantOperatorImpl1 implements ParticipantOperator{

	@Override
	public void sportType(ArrayList<Participant> participants) {

		 ArrayList<Participant> badmintonParticipants = new ArrayList<>();  
	     ArrayList<Participant> tennisParticipants = new ArrayList<>();  
	     ArrayList<Participant> swimmingParticipants = new ArrayList<>();
	  
	     for (Participant participant : participants) {  
	         if (participant.getTypeofsport().equals("badminton")) {  
	             badmintonParticipants.add(participant);
	         } else if (participant.getTypeofsport().equals("tennis")) {  
		         tennisParticipants.add(participant);    
	         } else if (participant.getTypeofsport().equals("swimming")) {  
	             swimmingParticipants.add(participant);  
	         }  
	     }  
	  
	     System.out.println("----Badminton Participants----");  
	     for (Participant participant : badmintonParticipants) {  
	         System.out.println(participant.getName() + " " + participant.getSurname());  
	     }  
	  
	     System.out.println("----Tennis Participants----");  
	     for (Participant participant : tennisParticipants) {  
	         System.out.println(participant.getName() + " " + participant.getSurname());  
	     }  
		 
	     System.out.println("----Swimming Participants----");  
	     for (Participant participant : swimmingParticipants) {  
	         System.out.println(participant.getName() + " " + participant.getSurname()); 
	     }
	 }


	@Override
	public void awardsNumber(ArrayList<Participant> participants) {
		System.out.println("-----Sorted Number of National and International Awards----");

		 ArrayList<Integer> list = new ArrayList<>();    
		    for (Participant participant : participants) {    
		        int award = participant.getAwards();    
		        list.add(award);  
		    }  
		  
		    for (int i = 0; i < list.size(); i++) {    
		        for (int j = 0; j < list.size() - i - 1; j++) {    
		            if (list.get(j) > list.get(j+1)) {       
		                int temp = list.get(j);    
		                list.set(j, list.get(j+1));    
		                list.set(j+1, temp);      
		            }    
		        }  
		    }  
		     
		    for (int i = 0; i < list.size(); i++) {    
		        System.out.println(participants.get(i).getName() + " " + participants.get(i).getSurname() + ": " + list.get(i));               
		    }  
        
	}

}

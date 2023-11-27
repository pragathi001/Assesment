package project;

import java.util.LinkedList;
import java.util.Queue;

public class InterviewQueue {

	public static void main(String[] args) {
Queue<Candidate> interviewQueue = new LinkedList<>();
interviewQueue.add(new Candidate("Candidate no: 1",0));
interviewQueue.add(new Candidate("Candidate no: 2",0));
interviewQueue.add(new Candidate("Candidate no: 3",0));
interviewQueue.add(new Candidate("Candidate no: 4",0));
interviewQueue.add(new Candidate("Candidate no: 5",0));
interviewQueue.add(new Candidate("Candidate no: 7",0));
interviewQueue.add(new Candidate("Candidate no: 8",0));
System.out.println("Interview process started");
	int currentTime =0;
	while(!interviewQueue.isEmpty()) {
		Candidate currentCandidate =interviewQueue.poll();
		currentCandidate.waitingTime =currentTime-currentCandidate.arrivalTime;
		System.out.println("Waiting Time :"+" "+currentCandidate.waitingTime+ "min"+"\n"+"Interview");
		currentTime +=15;
	
	}
	System.out.println("Interview process done");
	}
	static class Candidate{
		String name;
		int arrivalTime;
		int waitingTime;
		public Candidate(String name ,int arrivalTime) {
			this.name =name;
			this.arrivalTime =arrivalTime;
		}
	}

}

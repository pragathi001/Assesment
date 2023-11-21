package project;
import java.util.Stack;
import java.util.Scanner;
public class Chatbot{
	public Stack <String> conversation = new Stack<>();

	private String[] keywords = {"hello","how are you","goodbye"};
	private String[] responses = {"hi there","I'am doing well,thank you. How about you?","Goodbye"};

	public void start() {
		try(Scanner  input = new Scanner(System.in)){
			System.out.println("chatbot: Hi there !How can I help you today?");
			conversation.push("chatbot:hi there! How can I help you today?");
			
			while(true) {
				String userInput = input.nextLine();
				conversation.push(userInput);
				if(userInput.toLowerCase().equals("goodbye")) {
					break;
				}
				String response = "I'm sorry ,I didn't understand what you said.";
				for (int i =0;i<keywords.length;i++) {
					if(userInput.toLowerCase().contains(keywords[i])) {
						response = responses[i];
						break;
						
					}
				}
				System.out.println("chatbot:"+ response);
				conversation.push("chatbot:"+response);
				}
			}
		System.out.println("chatbot: Thank you  for chatting! have a great day ! ");
		
		}
	public void printconversation() {
		System.out.println("conversation");
		while(!conversation.empty()) {
			System.out.println(conversation.pop());
		}
	}
	public static void main(String[] args) {
		Chatbot  chatbot = new Chatbot();
		chatbot.start();
	}
	}
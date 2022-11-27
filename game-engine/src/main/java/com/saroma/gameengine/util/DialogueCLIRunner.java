package com.saroma.gameengine.util;

import java.util.Scanner;

import com.saroma.gameengine.objects.dialogue.Dialogue;
import com.saroma.gameengine.objects.dialogue.Option;

public class DialogueCLIRunner {
	
	private Dialogue dialogue;
	
	public DialogueCLIRunner(Dialogue dialogue) {
		this.dialogue = dialogue;
	}
	
	public void run() {
		String text = dialogue.toString();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(text);
        System.out.print("What do you want to do?");
        String res = scanner.next();
        int optionChoice = 0;
        
        try {
        	optionChoice = Integer.parseInt(res);
        	if (optionChoice > this.dialogue.getOptions().size() - 1 || optionChoice < 0) {
        		throw new Exception();
        	}        	
        } catch (Exception e) {
        	System.out.println("Invalid Input. Exiting ...");
        	System.exit(1);
        }
        
        Option chosenOption = this.dialogue.getOptions().get(optionChoice);
        this.dialogue = chosenOption.getOutcome();
        
        if (this.dialogue != null) {
        	this.run();
        }
        
	}

}

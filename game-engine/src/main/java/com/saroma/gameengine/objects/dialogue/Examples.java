package com.saroma.gameengine.objects.dialogue;

import java.util.LinkedList;
import java.util.List;

public class Examples {
	
	public Dialogue getExample1() {
		Dialogue dialogue = new Dialogue("Where do you want to go?");
		
		Option opt1 = new Option("Left", dialogue);
		Option opt2 = new Option("Right", dialogue);
		
		List<Option> options = new LinkedList<Option>();
		options.add(opt1);
		options.add(opt2);
		
		dialogue.setOptions(options);
		
		return dialogue;
	}
	
}

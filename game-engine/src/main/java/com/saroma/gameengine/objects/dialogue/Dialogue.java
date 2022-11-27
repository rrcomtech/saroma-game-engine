package com.saroma.gameengine.objects.dialogue;

import java.util.List;

public class Dialogue {
	
	private String text;
	private List<Option> options;
	
	public Dialogue(String text, List<Option> options) {
		this.text = text;
		this.options = options;
	}
	
	public Dialogue(String text) {
		this.text = text;
	}
	
	public String toString() {
		String res = this.text + "\n";
		for (int i = 0; i < this.options.size(); i++) {
			res += "(" + i + ") " + this.options.get(i).getText() + "\n";
		}		
		return res;
	}
	
	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	
}

package com.saroma.gameengine.objects.dialogue;

public class Option {
	
	private String text;
	private Dialogue outcome;
	
	public Option(String text, Dialogue outcome) {
		this.text = text;
		this.outcome = outcome;
	}
	
	public Option(String text) {
		this.text = text;
		this.outcome = null;
	}
	
	public String getText() {
		return this.text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public Dialogue getOutcome() {
		return this.outcome;
	}
	
	public void setOutcome(Dialogue dialogue) {
		this.outcome = outcome;
	}

}

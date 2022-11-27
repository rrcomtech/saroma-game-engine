package com.saroma.gameengine;

import com.saroma.gameengine.objects.dialogue.*;
import com.saroma.gameengine.util.DialogueCLIRunner;

public class App 
{
    public static void main( String[] args )
    {
    	Examples dialogueExamples = new Examples();
    	
    	DialogueCLIRunner runner = new DialogueCLIRunner(dialogueExamples.getExample1());
    	runner.run();
    }
    
}

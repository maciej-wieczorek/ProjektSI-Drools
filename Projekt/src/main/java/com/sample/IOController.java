package com.sample;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IOController {
	
	public static void print(String s) {
    	System.out.println(s);
    }
    
    public static String askQuestion(String question, String[] choices) {
    	print(question+"?");
    	listChoices(choices);
    	String answer = choices[getAnswer(choices)];
    	print("You chose: " + answer + "\n");
    	return answer;
    }
    
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    private static void listChoices(String[] choices) {
    	for (int i = 0; i < choices.length; i++) {
    		print(i + ": " + choices[i]);
    	}
    }
    
    private static int getAnswer(String[] choices) {
    	int convertedInput = -1;
    	while (convertedInput < 0 || convertedInput >= choices.length)
    	{
	    	print("Choose index: ");
	    	try {
	    		String userInput = reader.readLine();
	    		convertedInput = Integer.parseInt(userInput);
	    	}
	    	catch (Exception e)
	    	{
	    		print("Input read failed!");
	    	}
    	}
    	return convertedInput;
    }
}

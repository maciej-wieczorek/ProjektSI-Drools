package com.sample;

/***
 * Node in the Q&A graph
 */
public class Node {
	
	/***
	 * Question
	 */
    public String q;
    /***
     * Answer
     */
    public String a;
   
    public Node(String q, String a) {
        this.q = q;
        this.a = a;
    }
}

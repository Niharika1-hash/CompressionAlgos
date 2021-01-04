/*
 Name:-    Niharika Poddar
 Date:-    1st Jan, 2021
 Project:- LZW Encoding Algorithm
	
 PROGRAM TO DEMONSTRATE LZW ENCODING
 INPUT: .txt file (containing Input String to be encoded)
 OUTPUT: .txt file that contains the encoded version of Input, also the time taken for the entire input file to be encoded in nanoseconds.
 */


import java.io.*;

import java.util.*;


public class Main 
{
	static Vector<Integer> encoding (String input)
	{
		HashMap <String,Integer> dict = new HashMap<String,Integer>();
		
		for (int i = 0; i <= 255; i++) 
		{ 
			String c = Character.toString((char) (0+i));
			
			dict.put(c, i);
	    }
		
		
	    String p = "";
	    String c = "";
	    p+=input.charAt(0);
	    int code = 256;
	    Vector <Integer> output = new Vector <Integer> ();
	   
	    
	    for(int k = 0;k<input.length();k++)
	    {
	    	if(k!=input.length()-1)
	    	{
	    		c+=input.charAt(k+1);
	    		
	    	}
	    	if(dict.containsKey(p+c))
	    	{
	    		p = p+c;
	    	}
	    	else
	    	{
	    		System.out.println(p+"\t"+dict.get(p)+"\t\t"+(p+c)+"\t"+code);
	    		output.add(dict.get(p));
	    		dict.put(p+c, code);
	    		code++;
	    		p = c;
	    	}
	    	c="";
	    }
	    output.add(dict.get(p));
	    return output;
		
		
	}
	public static void main(String[] args) throws IOException 
	{
		File input = new File("C:\\Users\\Niharika Poddar\\Desktop\\xargs.txt");
		Scanner sc = new Scanner(input);
		sc.useDelimiter("\\Z"); 
		String test;
		test=sc.nextLine();
		long start = System.nanoTime();
		Vector <Integer> output = encoding(test);	
		long stop = System.nanoTime();
		System.out.println("Input String length : "+test.length());
		
		System.out.println("Encoded Output:");
		for(int i=0;i<output.size();i++)
		{	   
			  System.out.print(output.get(i)+" "); 
		}
		System.out.println();
		System.out.println("Time Taken : "+ (stop-start)+" nanoseconds or " + (stop-start)*Math.pow(10, -9)+ " seconds");
		sc.close();
	
					
	}
				
}

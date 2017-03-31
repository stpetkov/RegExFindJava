package regexTry;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Names {

	public static void main(String[] args) {
		String text="#Toni.Naikovv sdaswdsa #d.g dsadwsad #Petko.Zmeiov .Just a try #Dwnio.Penchev now";
		
		
		   // Create a Pattern object
	      Pattern r = Pattern.compile("[#][a-zA-Z]+.[a-zA-Z]+");

	      // Now create matcher object.
	      List<String> allMatches = new ArrayList<String>();
	      Matcher m = r.matcher(text);
//	      System.out.println(m.);
	      while (m.find( )) {	          
	          allMatches.add(m.group());
	          	
	}
	      allMatches.toArray(new String[0]);
	      for (String string : allMatches) {
	    	  System.out.println(string);
		}
	      
	      
}}

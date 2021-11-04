import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap; // import the HashMap class
import java.util.Scanner;

public class Application {
	public static void main(String[]args) {
	
	HashMap<String, String> hashbrown = new HashMap<String, String>();
	File text= new File("DictionaryPairs");
	
	String temp="";
	String front="";
	String back="";

	System.out.println("-------------------------\n Printing the dictionary \n-------------------------");
	
	try{
		Scanner scan=new Scanner(text);
		
		while (scan.hasNextLine()) {
			temp=scan.nextLine();
			front=temp.substring(0, temp.indexOf("!")-1);
			back=temp.substring(temp.indexOf("!")+1, temp.length());
			hashbrown.put(front, back);
		}
		
	}
	catch (FileNotFoundException e) {
		System.out.println(e);
	}
	
	for (String i : hashbrown.keySet()) {
		  System.out.println( i + ":" + hashbrown.get(i));
		}
	
	System.out.println("-------------------------\n Printing the 5 words \n-------------------------");
	
	System.out.println("Appentency is: " + hashbrown.get("appetency") + ";  The Hash Code is: " + "appetency".hashCode());
	System.out.println("Timbrel is: " + hashbrown.get("timbrel") + ";  The Hash Code is: " +  "timbrel".hashCode());
	System.out.println("Tocsin is: " + hashbrown.get("tocsin") + ";  The Hash Code is: " +  "tocsin".hashCode());
	System.out.println("Gammer is: " + hashbrown.get("gammer") + ";  The Hash Code is:  " + "gammer".hashCode());
	System.out.println("Scantling is: " + hashbrown.get("scantling") + ";  The Hash Code is: " +  "scantling".hashCode());
	
 }
}
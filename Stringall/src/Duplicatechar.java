
public class Duplicatechar {


	import java.util.Set;

	/**
	* Java Program to find duplicate characters in String.
	*
	*
	* @author http://java67.blogspot.com
	*/
	public class FindDuplicateCharacters{

	    public static void main(String args[]) {
	        printDuplicateCharacters("Programming");
	        printDuplicateCharacters("Combination");
	        printDuplicateCharacters("Java");
	    }

	    /*
	     * Find all duplicate characters in a String and print each of them.
	     */
	    public static void printDuplicateCharacters(String word) {
	        char[] characters = word.toCharArray();

	        // build HashMap with character and number of times they appear in String
	        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
	        for (Character ch : characters) {
	            if (charMap.containsKey(ch)) {
	                charMap.put(ch, charMap.get(ch) + 1);
	            } else {
	                charMap.put(ch, 1);
	            }
	        }

	        // Iterate through HashMap to print all duplicate characters of String
	        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
	        System.out.printf("List of duplicate characters in String '%s' %n", word);
	        for (Map.Entry<Character, Integer> entry : entrySet) {
	            if (entry.getValue() > 1) {
	                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
	            }
	        }
	    }

	}
	////////////////////////////////////////////////////////////////////////////
	
	//Duplicate charcter in file
	
	import java.io.*;
	public class Str
	{
	public static void main(String arg[])throws Exception
	{
	String res="";
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String a=br.readLine();
	while(a.length()>0)
	{
	int c=0;
	for(int j=0;j<a.length();j++)
	{
	if(a.charAt(0)==a.charAt(j))
	c=c+1;
	}
	res=res+a.charAt(0)+"="+c+"\n";
	String k[]=a.split(a.charAt(0)+"");
	a=new String("");
	for(int i=0;i<k.length;i++)
	a=a+k[i];
	}
	System.out.println(res);
	}
	}
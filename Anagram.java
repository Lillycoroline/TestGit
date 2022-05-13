package ppppppppppp.program;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String x="He is arAdhya";
		String y="he Is Hyadaya";
		
		x.replace(" ","" );
		y.replace(" ","" );
		
		x.toLowerCase();
		y.toLowerCase();
		
		char a[]=x.toCharArray();
		char b[]=y.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean Result=Arrays.equals(a, b);
		
		if(Result==true)
		{
			System.out.println("strings are Anagram");	
		}	
		else
		{
			System.out.println("strings are not Anagram");	
		}
	}		

}



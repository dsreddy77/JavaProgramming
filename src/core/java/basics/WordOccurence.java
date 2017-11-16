package core.java.basics;
import java.util.Scanner;


public class WordOccurence {

	public static void main(String[] args) {
		String sentence1,word1;
		System.out.println("enter sentense");
		Scanner sc = new Scanner(System.in);
		sentence1 = sc.nextLine();
		System.out.println("enter word to be searched");
		word1=sc.nextLine();
		/*System.out.println(sentence1);
		System.out.println(sentence1.length());
		System.out.println(word1);
		System.out.println(word1.length());*/

		int occurences=0;

		for(int i=0;i<sentence1.length();i++)
		{
			for(int j=0;j<word1.length();)
			{
				if (word1.charAt(j)== sentence1.charAt(i))
				{
					j++;
					i++;
				}
				else
				{
					j=0;
					for(int x=i;x<sentence1.length();x++)
					{
						if (sentence1.charAt(x)==' ')
						{
							i=x+1;
							break;
						}
						if (x==sentence1.length()-1)
							j=word1.length()+10;
					}	
				}
				if(j==word1.length())
					occurences++;
			}


		}
		System.out.println("number of occurences= "+occurences);


	}

}

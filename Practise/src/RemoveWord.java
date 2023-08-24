import java.util.Scanner;

public class RemoveWord {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String Sentence=sc.nextLine();
		System.out.println("enter word to be removed form the sentence: "  );
		String word=sc.nextLine();
		removeWords(Sentence,word);

	}
	public static void removeWords(String text, String word )
	{
		String Words[]=text.split(" ");
		String new_String="";
		for (String name : Words)
		{
			if(!name.equals(word))
				new_String+=name+" ";
		}
		System.out.println(new_String);
		
	}

}

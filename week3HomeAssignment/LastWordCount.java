package week3HomeAssignment;

public class LastWordCount {
	
	public void lastWord(String str)
	{
		String[] words = str.split("\\s");
		int Lastword = words[words.length-1].length();
		System.out.println(Lastword);
	}

	public static void main(String[] args) {
		LastWordCount lw = new LastWordCount();
		lw.lastWord("This is Java Applications");

	}

}

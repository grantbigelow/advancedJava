
public class PallendromeApp {
	public boolean Palledrome(String word) {
		String halfWordTwo = "";
		String halfWordOne = word.substring(0, (word.length()/2));
		
		if (word.length()%2==0)
			halfWordTwo = word.substring(word.length()/2,word.length());
		else
			halfWordTwo = word.substring(word.length()/2+1,word.length());
		
		char[] array= halfWordTwo.toCharArray();
		int beginWord = 0;
		int endWord = array.length-1;
		char letter; 
		
		while(endWord>beginWord) {
			letter = array[beginWord];
			array[beginWord]=array[endWord];
			array[endWord]=letter;
			endWord--;
			beginWord++;
		}
		halfWordTwo = new String(array);
		if(halfWordOne.equals(halfWordTwo))
			return true;
		else
			return false;
			
	}
}

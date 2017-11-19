
public class CountWords {

	public static void main(String[] args) {
		
		String[] wordListOne = {"24/7", "multi-Tier" ,"30,00 foot", "B-to_B", "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};
		String[] wordListTwo = {"empowered","stick", "value-added", "oriented", "centric", "distributed", "clustered","branded", "outsided-the-box", "positioned","networked","focused",
				"leveraged", "aligened","targeted","shared", "cooperative","accelerated"};
		String[] wordListThree = {"process","tipping-point","solution","architecture","core competency", "strategy","mindshare","portal","space","vision","paradigm","mission"};
		
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threelenght = wordListThree.length;
		 
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threelenght);
		
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		
		System.out.println("what we need is a " + phrase);
		System.out.println("the number is " + Math.random() * 50);

	}
}

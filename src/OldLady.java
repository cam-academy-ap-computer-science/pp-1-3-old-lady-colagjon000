/***
 * Grading comments:
 *  Hard to find something that isn't perfect here.
 *  Excellent work.
 *  Compiles/Runs: 15/15
 *  Desired output: 6/6
 *  Efficiency: 2/2  Used nesting and got rid of
 *   duplication within the sentence itself.
 *  Consistency: 2/2
 *   25/25
 */
public class OldLady {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		whoSwa_();
		System.out.println("fly,");
		ending();
		spider1();
		spider2();
		bird1();
		bird2();
		cat1();
		cat2();
		dog1();
		dog2();
		whoSwa_();
		System.out.println("horse,");
		System.out.println("She died of course.");
	}
	public static void whoSwa_() {
		System.out.print("There was an old lady who swallowed a ");
	}
	public static void ending() {
		System.out.println("I don't know why she swallowed that fly,");
		System.out.println("Perhaps she'll die.");
		System.out.println();
	}
	public static void spider1() { //first part of spider
		whoSwa_();
		System.out.println("spider,");
		System.out.println("that wriggled and iggled and jiggled inside her.");
	}
	public static void spider2() { //second part of spider -- compounds in other verses
		sheSwaThe();
		System.out.print("spider");
		toCatch();
		System.out.println("fly.");
		ending();
	}
	public static void bird1() {
		whoSwa_();
		System.out.println("bird,");
		System.out.println("how absurd to swallow a bird.");
	}
	public static void bird2() {
		sheSwaThe();
		System.out.print("bird");
		toCatch();
		System.out.println("spider.");
		spider2();
	}
	public static void cat1() {
		whoSwa_();
		System.out.println("cat,");
		System.out.println("Imagine that to swallow a cat.");
	}
	public static void cat2() {
		sheSwaThe();
		System.out.print("cat");
		toCatch();
		System.out.println("bird.");
		bird2();
	}
	public static void dog1() {
		whoSwa_();
		System.out.println("dog,");
		System.out.println("What a hog to swallow a dog.");
	}
	public static void dog2() {
		sheSwaThe();
		System.out.print("dog");
		toCatch();
		System.out.println("cat.");
		cat2();
	}
	public static void sheSwaThe() {
		System.out.print("She swallowed the ");
	}
	public static void toCatch() {
		System.out.print(" to catch the ");
	}

}

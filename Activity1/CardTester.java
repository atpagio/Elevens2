/**
 * This is a class that tests the Card class.
 */
class CardTester {
  /**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
  public static void main(String[] args) {
    Card a=new Card("Queen","Diamonds",10);
    System.out.println(a);
    Card b=new Card("Three","Cloves",3);
    System.out.println(b);
    Card c=new Card("Queen","Diamonds",10);
    System.out.println(c);

    System.out.println("Does a match b? "+a.matches(b));
    System.out.println("Does a match c? "+a.matches(c));


    
  }
}
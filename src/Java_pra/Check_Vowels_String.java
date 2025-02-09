package Java_pra;
public class Check_Vowels_String {
	public static void main(String[] args) {
		String str = "We use selenium to Automate";
			
		String vowels = "aeiouAEIOU";
			
		int countA =0;

		for (int i =0; i< str.length(); i++) {
			
			if (vowels.indexOf(str.charAt(i)) != -1) {
			 countA ++;
			}
		}
		System.out.println("Vowels: "+countA);
	}
}
/*  Array list 
 * linked list
 */
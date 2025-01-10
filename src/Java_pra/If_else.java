package Java_pra;

public class If_else {

	public static void main(String[] args) {
		
		//If else 
		
		int i =10;
		
		if (i==10) {
			System.out.println("From If condtion");
			
		}
		
		else {
			System.out.println("From else condtion");
		}
		// Switch
		
		int  num = 2;
		switch (num) {
		case 1:
			System.out.println("From case 1 switch");
		break;
		
		case 2:
			System.out.println("From case 2 switch");
			
			break;
		case 3:
			System.out.println("From case 3 switch");
			break;
			
			default : 
		}
		
		//entry 
		while (i==10) {
			System.out.println("Print while");
		}
		
		// Exit
		do{
			System.out.println("Print 12");
			
		} while(i==10);
		
		
		// Break 
		
		while (i<20) {
			System.out.println("Print while");
			i++;
			if (i==12) {
				break;
			}
		}
		
		
		// Continue
		
		while (i<20) {
		
			if (i==12) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
		
		for (int g = 1; i <= 5; g++) {
		    if (g == 3) break;  
		    System.out.println(g);
		}

		for (int g = 1; g <= 5; g++) {
		    if (g == 3) continue;  
		    System.out.println(g);
		} 
		
	
	
	
	
	
}
	}



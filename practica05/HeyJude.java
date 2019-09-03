/**
	@autor Sanchez Espinoza Leonardo
	@version 03/09/2019

*/

public class HeyJude {

	public static void main(String[] args) {
	
	// Declaracion de cadenas
	String HEY = "Hey Jude " ;
	
		String DONT = "dont " ;
	
			String MAKE = "make it bad " ;
				String TAKE = "Take a sad song and make it better " ;
				
			String BE = "be afraid " ;
				String YOU_WERE = "You were made to go out and get her " ;
				
			String LET = "let me down " ;
				String YOU_HAVE = "You have found her, now go and get her " ;
				
				
				
		String REMEMBER = "Remember to " ;
				String LHEART = "let her into your heart " ;
				String LSKIN = "let her under your skin " ;
			
				
		String THEN = "Then you " ;
				String CAN_START = "can start " ;
				String BEGIN = "begin " ;
				String MAKE_BETTER = "to make it better " ;
					
					
		String BETTER = "better " ;
		String  OH = ", oh " ;
		String NA = "na " ;
		
		// Declaracion de variables
		int n = 0;
		int  p = 0;
		int b = 0;
		int n1 = 0;
		int n2 = 0;
		
		
		// Impresores
		while (p < 7)  {
			if (p == 0 || p == 1 || p == 3 || p == 5)  {
				System.out.print(HEY + DONT);
			}
			
			if (p == 1) {
			System.out.print(BE);
		}
		
		if (p == 3) {
			System.out.print(LET);
		}
		
		if (p == 1) {
			System.out.print("\n" + YOU_WERE);
		}
		
		if (p == 3) {
			System.out.print("\n" + YOU_HAVE);
		}
			
		if (p == 0 || p == 5) {
			System.out.print(MAKE + "\n" + TAKE);
		}
			
		
		
		if (p == 0 || p == 1 || p == 3 || p == 5)  {
				System.out.print("\n" + REMEMBER);
			}
			
		
		if (p == 0 || p == 3)  {
			System.out.print(LHEART);
		}
		
		if (p == 1 || p == 5)  {
			System.out.print(LSKIN);
		}
		
		
		
		if (p == 0 || p == 1 || p == 3 || p == 5)  {
				System.out.print("\n" + THEN);
			}
			
		if (p == 0 || p == 3)  {
			System.out.print(CAN_START);
		}
		
		if (p == 1 || p == 5)  {
			System.out.print(BEGIN);
		}
		
		if (p == 0 || p == 1 || p == 3 || p == 5)  {
				System.out.print(MAKE_BETTER);
			}
		
		if (p == 0 || p == 1 || p == 3)  {
				System.out.print("\n");
			}
		
		if (p == 2) {
			while(n < 10) {
		
			System.out.print(NA);
			n++;
			}
			System.out.print("\n");
		}
		
		if (p == 4) {
			while(n1 < 10) {
			System.out.print(NA);
			n1++;
			}
			System.out.print("\n");
		}
		
		
		
		if (p == 5)  {
			System.out.print("\n");
			while(b < 5) {
			System.out.print(BETTER);
			b++;
			}
			System.out.print(OH);
		}
		
		if (p == 6) {
			System.out.print("\n");
			while(n2 < 10) {
		
			System.out.print(NA);
			n2++;
			}
			System.out.print(HEY);
		}
			
			
		
		System.out.println( );
		p++;
		
			}
		}
	}
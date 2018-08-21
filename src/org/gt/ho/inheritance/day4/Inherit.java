package org.gt.ho.inheritance.day4;

public class Inherit extends Firstclass {
	
	public void system() {
		System.out.println("Display the Firstclass deta:");

	}
	
	public static void main(String[] args) {
		Inherit i = new Inherit ();
		i.secondMsg();
		i.firstMsg();
		i.system();
	
		/*String S="A";
		String b= S.concat("B");
		System.out.println(S+b);
		System.out.println(b);
		*/
		
		for (int f = 1; f <= 2; f++) {
			for (int j = 0; j <=f+1; j++) {
				System.out.println("j"+j);				
			}
			//System.out.println(f);
			
		}
		
	}

}

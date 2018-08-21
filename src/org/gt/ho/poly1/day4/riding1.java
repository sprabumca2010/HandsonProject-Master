package org.gt.ho.poly1.day4;

public class riding1 extends riding{
	
	public static void main(String[] args) {
		riding1 ri = new riding1();
		ri.cts("28000","2005");
		ri.tcs("26000","2005");
		
				
	}
@Override
public void cts(String Count, String Year) {
	System.out.println(Count);
	System.out.println(Year);
}
}

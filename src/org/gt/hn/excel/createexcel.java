package org.gt.hn.excel;

public class createexcel {
	public static void main(String[] args) {
		file excelloc = new file ("");
		workbook w = new xssfworkbook();
		sheet S = w.createsheet("Test");
		Row r = s.CreateRow(0);
		cell c =r.createcall(0);
	}

}

package com.hervey.app;

public class StarsSlashes {

	public static void main(String[] args) {

		StarsSlashes.drawStarsSlashes();

	}

	private static void drawStarsSlashes() {
		//Seven lines, 24 characters wide
		int numberLines=7;
		int totalCharWidth=24;
		
		//Outer loop handles each line; i indicates current line
		for(int i=1; i <=numberLines; i++) {
			int numStars = numberLines - i;
			int numSpaces = i - numberLines -1;
			int numForwardSlashes = numStars * 2;
			int numBackSlashes = numSpaces * 2;
			StarsSlashes.drawStarsQty(numStars);
			StarsSlashes.drawSpacesQty(numSpaces);
			StarsSlashes.drawForwardSlashesQty(numForwardSlashes);
			StarsSlashes.drawBackSlashesQty(numBackSlashes);
			StarsSlashes.drawSpacesQty(numSpaces);
			StarsSlashes.drawStarsQty(numStars);
			
			System.out.print("\n");
		}
		
		
	}

	private static void drawBackSlashesQty(int numBackSlashes) {
		// TODO Auto-generated method stub
		
	}

	private static void drawForwardSlashesQty(int numForwardSlashes) {
		// TODO Auto-generated method stub
		
	}

	private static void drawSpacesQty(int numSpaces) {
		// TODO Auto-generated method stub
		
	}

	private static void drawStarsQty(int numStars) {
		// TODO Auto-generated method stub
		
	}

}

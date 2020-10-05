package com.hervey.app;

public class StarsSlashes {

	public static void main(String[] args) {
		StarsSlashes.drawStarsSlashes();
	}

	private static void drawStarsSlashes() {
		// Seven lines, 24 characters wide
		int numberLines = 7;

		// Outer loop handles each line; i indicates current line
		for (int i = 1; i <= numberLines; i++) {
			int numStars = numberLines - i;
			int numSpaces = i - 1;
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
		for (int j = 0; j < numBackSlashes; j++) {
			System.out.print("\\");
		}

	}

	private static void drawForwardSlashesQty(int numForwardSlashes) {
		for (int j = 0; j < numForwardSlashes; j++) {
			System.out.print("/");
		}
	}

	private static void drawSpacesQty(int numSpaces) {
		for (int j = 0; j < numSpaces; j++) {
			System.out.print(" ");
		}
	}

	private static void drawStarsQty(int numStars) {
		for (int j = 0; j < numStars; j++) {
			System.out.print("*");
		}

	}

}

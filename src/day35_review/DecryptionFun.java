package day35_review;

public class DecryptionFun {

	public static void main(String[] args) {
	System.out.println(decryptedWord("6JWaMWAxe8o<VO?LL<Axe17:so.YcEAxevS6RfAbYso.favAxe4NMoI1qSRAxe8o<VO?LL<Axe17:so.YcEAxevS6VO?Axe4NMoI1sql"));
	}

	public static String decryptedWord(String word) {
		String decryptedW = "";
		char[] chars = { ' ', ',', '.', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', '<', '=', '>', '?',
				'@', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
				'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
				'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', };
		String[] encrypted = { "Axe", "qSR", "sql", "oZn", "t89", "Did", "O0e", ">Xd", "cg7", "M0;", "lC=", "PTH",
				"PQ=", "i3E", "g0<", "Jce", "W04", "M?H", "Q0t", "Cej", "MRD", "2Tf", "IjT", "Kml", "L6j", "Hp7", "FLp",
				"@0e", "6JW", "9pm", "Z=:", "OEj", "SZx", "2X ", "=Fc", "2;p", "oVK", "Als", ":tj", "=FE", "YGq", "uim",
				"56G", "3Mk", "WmK", "@:N", "so.", "Qa3", "17:", "vS6", "AbY", "aMW", "srW", "<Ct", "4NM", "A4C", "4 J",
				"YC1", "fav", "YcE", "VO?", "qKW", "HRu", " Rf", "NT:", "oI1", "LL<", "W>p", "pfz", "89o", "8o<",
				"cuU" };

		// 6JWaMWAxe8o<VO?LL<Axe17:so.YcEAxevS6RfAbYso.favAxe4NMoI1qSRAxe8o<VO?LL<Axe17:so.YcEAxevS6VO?Axe4NMoI1sql

//		int count = 0;
//		for (int i = 0; i < word.length(); i += 3) {
//			if (word.substring(i, i + 3).equals(encrypted[count])) {
//				count++;
//				for (int j = 0; j < word.length() / 3; j++) {
//					String[] array = new String[word.length() / 3];
//					array[j] = word.substring(i, i + 3);
//				}
//			}
//
//		}
		
		String count = "";
		for (int j = 0; j < encrypted.length; j++) {
			for (int j2 = 0; j2 < encrypted.length; j2++) {
				if(word.substring(j, j+3).equals(encrypted[j2])) {
					count += j2+" "; 
				}
				
			}
		}
		
		
		return count;
	}
}

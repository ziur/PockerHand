package com.jalasoft.jaggaer;

import java.io.StringReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PokerHandTest {

	public static void main(String[] args) {
		String s = "ioeheyfzmahpirhlncnwjrchpswsbrhcxgqeilegebxklggxjnqdqylvjnnvzjcqzxygrxjboiihqnwjwqsdgginadfmqcuopberysfvnxdkplqjxsfkvdeyepraondbmxrclwwcyfxycwumbhnrmpcfubqcszyfcrjyjufvpkdezbrwvhvagxnpbnmzasmkcesgxvwqbywenfivkkoqsuefbzfsfhjjmuwxaeyobeqyldudjzxegbyazvqnyvdndqfkwnaqsvouawnhccsuuivfpjjgmblfolcsnmfhirybwdidbfzofsvikepndzzrdvkapxvqawqnehcvsiommyodkqkxrkuridpwmduiwunvmuuxivqezivesyudymkxmnvdajyushbyvahwlkfjishwgzhubmyssqpozkrlmyidorhardycqzolzqfhkelnegntadspdemaklxzeiukjfjqhxzxdjrjpghoikpxyyddzmkywbowuxllomcxlmeojzoefoblisjovevymygibbjklhqpubolzjwgvlgrcdpoghverhhedwygmuvxnudrdzobimgdwweairnhwgmukqdvzhcqhjjpqcjlalcprnmworfbhvbvvmyhcldohafmdqwzavxyswxwvnkzcrygzyjhhipdnrongcvdvecchbdbqkjhkrdkpkkkdapljliurzrzfidcvdzxmaniksewwowgxvslrqungpidjmwylpjrvofgwfkmqqiwppjrxxyyazslpxedeanlspfkhswiyudruabskgzkygkqiapmqggxwkmdirqmbugavcrkyvobukxnklllnnawvuynwodpprrvjjoofkoknvmookpvnffazizccvfvwnzjpiyvoulrazmbggeejmpsvwbzbgwsclynvlieywbevdbichlivnqdnsulcywkgzjawmafzehwsbobcqzedkwezlqspffxabvnvoawuadpkpjdkcpov";

		int lowercase = 97;
		Set<Character> x = new HashSet<>();
		LinkedHashSet<Character> x1 = new LinkedHashSet<>();

		Integer[] alphabet = new Integer[26];
		int index = 1;
		for (char c : s.toCharArray()) {
			Character s1 = Character.valueOf(c);
			if (!(x.add(s1) && x1.add(s1))) {
				x1.remove(s1);
			}
		}

		System.out.println(Arrays.asList(alphabet));
		System.out.println(x1.isEmpty() ? "_" : x1.iterator().next());


		int[][] a = {{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}};
		int[][] b = rotateImage(a);

		int size = a.length;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println("");
		}

	}

	static int[][] rotateImage(int[][] a) {
		int size = a.length;

		int b[][] = new int[size][size];

		int pos = a.length - 1;
		for (int j = 0; j < size; j++) {
			for (int i = 0; i < size; i++) {
				b[i][pos] = a[j][i];
			}
			pos = pos - 1;
		}
		return b;
	}


	public static void royalFlushIsWinner() {
		PokerGame pokerGame = new PokerGame();
		PokerHandBuilder builder = new StringInputBuilder();
		Player juan = Player.create("Juan", builder.getHand(new StringReader("AH KH QH JH 10H")));
		Player pedro = Player.create("Pedro", builder.getHand(new StringReader("KS QS JS 10S 9S")));
		pokerGame.addHand(juan);
		pokerGame.addHand(pedro);
		PokerResult result = pokerGame.getResults();
		assertTrue("royalFlushIsWinner", juan.equals(result.getWinner()));


	}

	private static void assertTrue(String test, boolean equals) {
		System.out.println(test + (equals ? "[Pass]" : "[Fail]"));
	}
}

package lesson3.lesson3_2.colections_seinou.hero;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Hero>heros = new ArrayList<Hero>();
		heros.add(new Hero(50));
		heros.add(new Hero(70));
		heros.add(new Hero(80));
		heros.add(new Hero(40));
		heros.add(new Hero(0));

		boolean nockedOut = heros.stream().anyMatch(h->h.hp==0);

		if(nockedOut ==true) {
			System.out.println("戦闘不能の勇者がいます");
		}else {
			System.out.println("全員戦闘可能です。");
		}

	}

}


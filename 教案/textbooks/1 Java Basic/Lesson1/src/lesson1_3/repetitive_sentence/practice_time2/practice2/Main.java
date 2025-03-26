package lesson1_3.repetitive_sentence.practice_time2.practice2;

public class Main {

	public static void main(String[] args) {
		int i = 0;
		while(i<5) {	
			if(i==2) {
				continue;
			}
			i++;
			System.out.println(i);
		}

	}

}

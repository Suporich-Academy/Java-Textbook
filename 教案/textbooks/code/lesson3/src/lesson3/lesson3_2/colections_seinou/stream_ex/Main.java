package lesson3.lesson3_2.colections_seinou.stream_ex;

import java.util.List;
import java.util.stream.Collectors;


public class Main {

	public static void main(String[] args) {
		Student student1 = new Student("satou", 61);
		Student student2 = new Student("suzuki", 19);
		Student student3 = new Student("tanaka", 45);
		Student student4 = new Student("kojima", 68);
		Student student5 = new Student("sasaki", 10);
		Student student6 = new Student("nakajiam", 59);
		List<Student> list = List.of(student1, student2, student3, student4, student5, student6);
		list.forEach(student -> System.out.println(student.getName() + " - " + student.getScore()));
		//スコアが60点より小さい人
		//スコア順で小⇒大
		//
		//		System.out.println(
		//				list.stream()
		//				.filter(e->e.getScore()<60)
		//				.sorted((s1,s2)->s2.getScore()-s1.getScore())
		//				.collect(Collectors.toList())
		//				);

				 list.stream()
		         .filter(e -> e.getScore() < 60)
		         .sorted((s1, s2) -> s1.getScore() - s2.getScore())
		         .forEach(s -> System.out.println("学生 [名前=" + s.getName() + ", 点数=" + s.getScore() + "]"));
		//最大値を求める
		System.out.println(
				list.stream()
				.max((a1,a2)->a1.getScore()-a2.getScore())
				.get()
				);
		//名前の長さが5より大きい人を抽出して
		//生徒の名前の長さ順（大⇒小）
		System.out.println(
				list.stream()
				.filter(n->n.getName().length()>5)
				.sorted((h1,h2)->h2.getName().length()-h1.getName().length())
				.collect(Collectors.toList())
				);

		//生徒の点数が30点より低い人を抽出して
		//一番得点が低い人
		System.out.println(
				list.stream()
				.filter(s->s.getScore()<30)
				.min((m1,m2)->m1.getScore()-m2.getScore())
				.get()
				);

	}

}

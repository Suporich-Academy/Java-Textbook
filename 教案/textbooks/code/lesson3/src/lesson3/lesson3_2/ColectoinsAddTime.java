package lesson3.lesson3_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ColectoinsAddTime {

	public static void main(String[] args) {
		int num = 50000;
		List<String>alist = new ArrayList<String>();
		List<String>list = new LinkedList<String>();

		long addStartArray = System.currentTimeMillis();
		for(int i =0; i<num; i++) {
			alist.add("山田太郎"+ i);
		}
		long addEndArray = System.currentTimeMillis();
		long addTimeArray = addEndArray-addStartArray;
		/*----------------------------------------------------*/
		long addStartList = System.currentTimeMillis();
		for(int i =0; i<num; i++) {
			list.add("山田太郎"+ i);
		}
		long addEndList = System.currentTimeMillis();
		long addTimeList = addEndList-addStartList;

		System.out.println("[追加]");
		System.out.println("[ArrayList]"+""+addTimeArray);
		System.out.println("[LinkedList]"+""+addTimeList);
		/*----------------------------------------------------*/
		long searchStartArray = System.currentTimeMillis();
		for(int i =0; i<num; i++) {
			alist.get(i);
		}
		long searchEndArray = System.currentTimeMillis();
		long searchTimeArray = searchEndArray-searchStartArray;
		/*----------------------------------------------------*/
		long searchStartList = System.currentTimeMillis();
		for(int i =0; i<num; i++) {
			list.get(i);
		}
		long searchEndList = System.currentTimeMillis();
		long searchTimeList = searchEndList-searchStartList;

		System.out.println("[検索]");
		System.out.println("[ArrayList]"+""+searchTimeArray);
		System.out.println("[LinkedList]"+""+searchTimeList);
	}

}

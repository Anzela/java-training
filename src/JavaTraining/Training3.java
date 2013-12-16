package JavaTraining;

import java.util.HashSet;
import java.util.Set;

//программа выводит уникальные элементы массива и пишет, сколько таких элементов в массиве

public class Training3 {
	
	public static void main(String[] args) {
		String[] str = {"a", "b", "c", "a", "b", "b", "b", "d", "e"};
		Set<String> set = new HashSet<>();
		for (int i = 0 ; i < str.length; i++) {
			set.add(str[i]);	
		}
		for (String s: set){
			int count = 0;
			for (int i = 0 ; i < str.length; i++) {
				if (s == str[i]){
					count++;
				}
			}
			System.out.println(s + " = " + count);
		}
	}
}
	

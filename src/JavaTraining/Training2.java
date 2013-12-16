package JavaTraining;

import java.util.HashSet;
import java.util.Set;

//программа выводит только дубликаты из массива

public class Training2 {
	public static void main(String[] args) {
		String[] str = {"a", "b", "c", "a", "b", "b", "b", "d", "e"};
		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		for (int i = 0 ; i < str.length; i++) {
			if (set1.contains(str[i])) {
				set2.add(str[i]);	
			}
			else {
				set1.add(str[i]);
			}
		}
		for (String s: set2){
			System.out.println(s);
		}
	}
}




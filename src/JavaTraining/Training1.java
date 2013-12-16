package JavaTraining;
import java.util.HashSet;
import java.util.Set;


public class Training1 {
	
//	программа выводит элементы массива без дубликатов
	
	public static void main(String[] args) {
		String[] str = {"a", "b", "c", "a", "b", "b", "b", "d", "e"};
		Set<String> set = new HashSet<>();
		for (int i = 0 ; i < str.length; i++) {
			set.add(str[i]);	
		}
		for (String s: set){
			System.out.println(s);
			}
	}
}

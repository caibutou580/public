package jihe;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		
		Object see = Children();
		
	}

	private static Object Children() {
		// Set 集合练习
		Set set = new LinkedHashSet();
		
		set.add("ata1");
		set.add("bta2");
		set.add("cta3");
		set.add("dta4");
		set.add("bta2");
		set.add("cta3");
		set.add("dta4");
		
		System.out.println(set.size());
		
		look(set);
		return null;
	}

	private static void look(Set set) {
		for (Iterator it = set.iterator(); it.hasNext();) {
			Object obj = (Object) it.next();
			System.out.println(obj);
		}
		
	}

}

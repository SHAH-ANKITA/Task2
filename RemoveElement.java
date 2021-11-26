package Programs;
import java.util.ArrayList;
import java.util.List;
public class RemoveElement {

	public static void main(String[] args) {
		List<Integer> a1=new ArrayList<>();
		a1.add(10);
		a1.add(11);
		a1.add(12);
		a1.add(13);
		a1.add(14);
		a1.add(15);
		System.out.println(a1);
		a1.remove(3);
		System.out.println(a1);
	}
}


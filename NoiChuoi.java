import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.StringTokenizer;
public class NoiChuoi {
public static void main(String[] args) {
	
    Set<Integer> set=new HashSet<Integer>();
	ArrayList<String> arrayList = new ArrayList<String>();
    // add object in arraylist
    arrayList.add("Java");
    arrayList.add("C++");
    arrayList.add("PHP");
    arrayList.add("Python");

    // create linkedlist
    LinkedList<String> linkedList = new LinkedList<String>();
    // aadd object in linkedlist
    linkedList.add("Hiberante");
    linkedList.add("Struts2");
    linkedList.add("Spring");
    linkedList.add("Mybatis");

    System.out.println("arraylist: " + arrayList);
    System.out.println("linkedlist: " + linkedList);

		
}
}

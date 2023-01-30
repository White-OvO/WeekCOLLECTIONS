package arrayListVsLinkedLIst;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class classVideo {
/*
 * 
 * 
 * 
 * 
 */
	public static void main(String[] args) {
ArrayList<Integer> myIntList = new ArrayList<>();
myIntList.add(5);
myIntList.add(7);
myIntList.add(8);
myIntList.add(9);
for(int i = 0; i < myIntList.size(); i++) {
	System.out.println("index" + i + "---" + myIntList.get(i));
}


System.out.println("------------");
//add a value to a specific number
myIntList.add(1, 6);
for(int i = 0; i < myIntList.size(); i++) {
	System.out.println("index" + i +"----" +myIntList);
}
//System.out.println(myIntList);





//LinkdedList example

LinkedList<String> countryList  = new LinkedList<>();
countryList.add("Cost Rica");
countryList.add("USA");
countryList.add("Egypt");
countryList.add("Japan");

System.out.println("My faviorte country is " );
System.out.println(countryList.get(1));


Iterator iterator = countryList.iterator();
while (iterator.hasNext()) {
	System.out.println(iterator.next() + " - ");
}


	}

}

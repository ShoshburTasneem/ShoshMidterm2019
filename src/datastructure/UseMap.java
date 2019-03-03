package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		List<String> cityOfNewYorkState = new ArrayList<>();
		cityOfNewYorkState.add("New York City");
		cityOfNewYorkState.add("Albany");
		cityOfNewYorkState.add("Buffalo");
		cityOfNewYorkState.add("Newburgh");
		cityOfNewYorkState.add("Westchester");

		List<String> cityOfFrance = new ArrayList<>();
		cityOfFrance.add("Paris");
		cityOfFrance.add("Lyon");
		cityOfFrance.add("Lille");
		cityOfFrance.add("Nantes");
		cityOfFrance.add("Marseille");


		List<String> cityOfUk = new ArrayList<>();
		cityOfUk.add("London");
		cityOfUk.add("Edinburgh");
		cityOfUk.add("Liverpool");
		cityOfUk.add("York");
		cityOfUk.add("Belfast");


		Map<String, List<String>> list = new HashMap<String, List<String>>();
		list.put("New York",cityOfNewYorkState);
		list.put("France",cityOfFrance);
		list.put("UK", cityOfUk);

		System.out.println(list);

		System.out.println(" ");
		System.out.println("Printout the values using for each loop.....");
		for (Map.Entry<String, List<String>> st : list.entrySet()){
			System.out.println(st.getKey()+ " --------> " +st.getValue());
		}



		System.out.println(" ");
		System.out.println("Printout the values using iterator.....");
		Set set = list.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}




	}

}




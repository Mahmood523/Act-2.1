package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner= new Scanner( System.in);
		
		Map<String,String> numberMapping = new HashMap<>();
		numberMapping.put("One", "1");
		numberMapping.put("Four", "4");
		numberMapping.put("Two", "2");
		numberMapping.put("Three", "3");
		
		System.out.println(numberMapping);
		
		HashMap<String,String> map2 = new HashMap<>();
		map2.put("Steve", "London");
		map2.put("John", "NewYork");
		map2.put("Rajeev", "Bengaluru");
		
		System.out.println(map2);
		System.out.println("Le tableau est vide ?");
		boolean a =map2.isEmpty();
		System.out.println(a);
		
		System.out.println("la taille du tableau est : "+map2.size());
		
		System.out.println("Saisir une cle :");
		String c = scanner.next();
		boolean b = map2.containsKey(c);
		
		if (b)
			System.out.println("existe");
		else 
			System.out.println("n'existe pas");
		
		System.out.println("Saisir une valeur :");
		String z = scanner.next();
		boolean y = map2.containsValue(z);
		
		if (y)
			System.out.println("existe");
		else 
			System.out.println("n'existe pas");
		
		
		System.out.println("Saisir une cle :");
		String d = scanner.next();
		System.out.println("La valeur de "+d+" est "+map2.get(d));
		
		System.out.println("Saisir une cle :");
		String e = scanner.next();
		System.out.println("Saisir une nouvelle valeur :");
		String f = scanner.next();
		map2.put(e,f);
		System.out.println(map2);
		
		
		System.out.println("Saisir une cle :");
		String g = scanner.next();
		map2.remove(g);
		System.out.println(map2);
		
		System.out.println("Saisir une cle :");
		String i = scanner.next();
		System.out.println("Saisir la valeur associe :");
		String h = scanner.next();
		boolean p=map2.remove(i,h);
		
		if (p)
			{map2.remove(i);
			System.out.println(map2);
			}
			else	
		    System.out.println(map2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

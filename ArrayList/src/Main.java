import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	
	public static ArrayList<String>  remove(String anim, ArrayList<String> lis) {
   	 int i=0;
   	 for ( i=0 ; i < lis.size() ; i++) {
   		 if (anim .equals(lis.get(i)));
   		 lis.remove(i);
   		  
   	 }
   	 return lis;
    }
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner( System.in);

	
		ArrayList<String> list = new ArrayList<String>();
		list.add("Lion");
		list.add("Tiger");
		list.add("Cat");
		list.add("Dog");
		
		System.out.println(list);
		
		list.add(2, "Elephant");
		
		System.out.println(list);
		
		ArrayList<String> list2 = new ArrayList<String>(list);
		ArrayList<String> list3 = (ArrayList<String>) Stream.concat(list.stream(), list2.stream()).collect(Collectors.toList());
		
		System.out.println(list3);
		System.out.println("Taille du tableau : "+list3.size());
		
		System.out.println("Suppression de l'élément en position :");
		int ind = scanner.nextInt(); 
		System.out.println("Suppression de l'élément "+list3.get(ind-1));
		list3.remove(ind-1);
		System.out.println(list3);
		System.out.println("Taille du tableau : "+list3.size());
		
		System.out.println("Suppression de l'animal (nom):");
		String animal = scanner.next();
		remove(animal,list3);
		
		
		
		System.out.println(list3);
		System.out.println("Taille du tableau : "+list3.size());
		
		System.out.println("Saisir l'index de l'animal recherche :");
		int idr = scanner.nextInt();
		System.out.println("L'animal d'index "+idr+" est "+list3.get(idr-1));
		
		System.out.println("Saisir le nom de l'animal recherche :");
		String name= scanner.next();
		boolean rech= list3.contains(name);
		if (rech)
		System.out.println("L'animal "+name+" existe");
		else 
		System.out.println("L'animal "+name+" n'existe pas");
		
		System.out.println("Le tableau trie :");
		Collections.sort(list3);
		System.out.println(list3);
		
		//System.out.println("Le tableau trie :");
		//ArrayList.sort(list3);
		//System.out.println(list3);
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

	

}

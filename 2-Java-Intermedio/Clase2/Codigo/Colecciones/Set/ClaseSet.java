import java.util.*;

public class ClaseSet{
	
	public static void main(String[] args) {
		
		//Hash set almacena solo elementos unicos
		HashSet<Integer> conjunto = new HashSet<Integer>();

		conjunto.add(1);
		conjunto.add(2);
		conjunto.add(3);
		conjunto.add(-1); //los ordena a su conveniencia

		System.out.println(conjunto);

		//Para elementos ordenados respetando orden insercion
		LinkedHashSet<Integer> conjunto1 = new LinkedHashSet<Integer>();

		conjunto1.add(1);
		conjunto1.add(2);
		conjunto1.add(3);
		conjunto1.add(-1);
		
		System.out.println(conjunto1);

		//De menor a mayor
		TreeSet<Integer> conjunto2 = new TreeSet<Integer>();

	}

}
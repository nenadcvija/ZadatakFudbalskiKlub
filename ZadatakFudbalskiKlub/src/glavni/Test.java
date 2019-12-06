package glavni;

import java.util.ArrayList;
import java.util.List;

import model.Fudbaler;
import model.FudbalskiKlub;
import model.Trener;

public class Test {

	public static void main(String[] args) {
		
		Trener trener = new Trener("Vladislav", "Zivojinovic", "1234567890123", "JNA 5", 100000, "Nike", 25, 17);
		
		
		Fudbaler f1 = new Fudbaler("Marko", "Marin", "1234567890123", "JNA 7", 50000, 2, "Nike", false, 10, "Napad");
		Fudbaler f2 = new Fudbaler("Pera", "Peric", "1234567890123", "JNA 7", 20000, 2, "Nike", true, 2, "Napad");
		Fudbaler f3 = new Fudbaler("Nikola", "Zigic", "1234567890123", "JNA 7", 70000, 2, "Nike", false, 15, "Napad");
		Fudbaler f4 = new Fudbaler("x", "x", "1234567890123", "JNA 7", 10000, 2, "Nike", true, 5, "bek");
		Fudbaler f5 = new Fudbaler("y", "y", "1234567890123", "JNA 7", 15000, 2, "Nike", false, 10, "krilo");
		
		
		List<Fudbaler> fudbaleri = new ArrayList<Fudbaler>();
			fudbaleri.add(f1);
			fudbaleri.add(f2);
			fudbaleri.add(f3);
			fudbaleri.add(f4);
			fudbaleri.add(f5);
		
		
		FudbalskiKlub fk = new FudbalskiKlub("Real", trener, fudbaleri, 12);
			
			System.out.println(fk.brojFudbaleraNaPoziciji("Napad"));
			System.out.println(fk.getGodisnjiIzdaci());
			System.out.println("Najskuplji: " + fk.najskupljiFudbaler());
			System.out.println("Najnenefikasniji: " + fk.najNeEfikasnijiFudbaler());
			fk.najJeftinijiFudbalerRezerva();
			
			
			
			

	}

}

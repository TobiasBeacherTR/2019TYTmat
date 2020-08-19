package soru22;

public class soru_22 {

	public static void main(String[] args) {
		int As=600; // As --> A nın satış sayısı
		int Bi=168; // Bi --> B nin iade sayısı
		
		int Bs=Bi*100/14; // Bs --> B nin satış sayısı
		int Cs=(As+Bs)*120/240; // CS --> C nin satış sayısı
		
		int Ai=As*7/100; // Ai --> A nın iade sayısı
		int Ci=Cs*12/100; // Ci --> C nin iade sayısı 
		
		int sonuc=Ai+Ci; // sonuc --> A nın iade sayısı ve C nin iade sayısı toplamı 
		
		System.out.println("A ve C marka yatakların toplam iadesi : " + sonuc);

	}

}

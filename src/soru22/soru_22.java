package soru22;

public class soru_22 {

	public static void main(String[] args) {
		int As=600; // As --> A n�n sat�� say�s�
		int Bi=168; // Bi --> B nin iade say�s�
		
		int Bs=Bi*100/14; // Bs --> B nin sat�� say�s�
		int Cs=(As+Bs)*120/240; // CS --> C nin sat�� say�s�
		
		int Ai=As*7/100; // Ai --> A n�n iade say�s�
		int Ci=Cs*12/100; // Ci --> C nin iade say�s� 
		
		int sonuc=Ai+Ci; // sonuc --> A n�n iade say�s� ve C nin iade say�s� toplam� 
		
		System.out.println("A ve C marka yataklar�n toplam iadesi : " + sonuc);

	}

}

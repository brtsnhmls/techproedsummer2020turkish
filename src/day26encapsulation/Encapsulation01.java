package day26encapsulation;

public class Encapsulation01 {

	private String kimlikNo="342212367512";
	private int krediKartNo=832147896;
	private boolean soguk=true;
	
	public static void main(String[] args) {
		// Encapsulation data saklama (data-hiding) yontemidir. 
		// Encapsulation iki stepte yapilir:
		// 1) Data’yi(variable, method) private yapmalisiniz.
		// 2) public olan getter() ve setter() methodlar uretmeliyim.
		// getter() data’yi sadece okumamiza yarar, getter() methodu data’da degisiklik yapamaz.
		// setter() data’yi degistirmemize yarar
	
	
	
	}

	//getter() uretmek icin; 1) Access Modifier public olmali
	//						 2) Return type variabla'in return type'i ile ayni olmali
	//						 3) Method ismi "get + variable ismi" seklinde olmali
	public String getKimlikNo() {
		return kimlikNo;
	}
	
	public int getKrediKartNo() {
		return krediKartNo;
	}
	public boolean isSoguk() {
		return soguk;
	}
	
	
	
	
	// Setter() uretmek icin 1) Acces Modifier public olmali
	//                       2)Return type void olmali
	//						 3)Method ismi "set+ variable ismi" seklinde olmali
	//						 4)Parametre kullanilmali(%99)
	//						 5 setter() method larin ismi boolean'lar icinde set olmalidir
	public void setKimlikNo(String kimlikNo) {
		this.kimlikNo=kimlikNo;
	}
	
	public void setKrediKartNo(int krediKartNo) {
		this.krediKartNo=krediKartNo;
	}
	public void setSoguk(boolean soguk) {
		this.soguk=soguk;
	}
	
	
}

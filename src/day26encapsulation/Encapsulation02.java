package day26encapsulation;

public class Encapsulation02 {

	private char ilkHarf='S';
	private double para=23.75;
	private boolean emekli=false;
	
	
	
	
	public static void main(String[] args) {
	
		
		 Encapsulation01 obj = new Encapsulation01();
         System.out.println(obj.getKimlikNo());
         obj.setKimlikNo("10000000000");
         System.out.println(obj.getKimlikNo());
		
		
		// TODO Auto-generated method stub

	}




	public char getIlkHarf() {
		return ilkHarf;
	}




	public void setIlkHarf(char ilkHarf) {
		this.ilkHarf = ilkHarf;
	}




	public double getPara() {
		return para;
	}




	public void setPara(double para) {
		this.para = para;
	}




	public boolean isEmekli() {
		return emekli;
	}




	public void setEmekli(boolean emekli) {
		this.emekli = emekli;
	}

}

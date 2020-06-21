package day38interviewhazirlik;

public class InterviewHazirlik01 {

	public static void main(String[] args) {
		//1) Java "Platform Independent" programlama dilidir.
		//   Yani; herhangi bir platformda yazilan Java kodu diger platformlarda da calisir.
		//   Mesela kodu Mac'de yazdiniz, Windowsda da calisir.
		
		//2) IDE ==> Integrated Development Environment demektir. Eclipse ve IntelliJ piyasada 
		//           kullanilan meshur iki IDE dir.
		
		//3) Constructor ==> Yeni bir object uretilirken Constructor aktive olur ve object'i uretir
		//                   Return type'i yoltur
		//                   Ismi class ismi ile ayni olmalidir
		//                   Object uretmek icin Constructor uretmek zorunda degiliz. Cunku Java 
		//                   her class icin default bir constructor uretmistir.
		//                   Default constructor'lar parametresizdir.
		//                   Biz herhangi constructor urettigimizde default constructor'lar yok olur.
		//                   Constructor'lar overload edilebilir.
		//                   Constructor'lar child class'lardan cagrilabilirler, ama override 
		//                   edilemezler.
		
		
		//4) OOP Concept nedir?
		//                  OOP concept a)Inheritance b)Encapsulation c) Polymorhism
		//                              d)Abstraction e)Interface icerir.
		
		//5) Inheritance nedir?
		//                  Inheritance parent(super class)-child(sub class) iliskisidir.
		//                  A class'i B class'ina extends ederse A child olur, B parent olur
		//                  A class'i B interface'ine implements ederse A child olur, B parent olur
		//                  A interface'i B interface'ina extends ederse A child olur, B parent olur
		//                  Child parent'taki kodlarin public ve protected olanlarini kullanabilir.
		//                  Reusability(Tekrar kullanabilme), short coding(Kodu kisa yazma), 
		//                  maintenance(tamir) faydalari vardir.

		
		
		
		
		
		//5)Inheritance nedir.?
		//				Inheritance parent (super class)= child(sub class) iliskisidir.
		//				A class'i B' class'ina extends ederse A child olur. B parent olur.
        //		        A class'i B' Interface'ina implements ederse A child olur. B parent olur.
        //              A Interface'i  B' Interface'ina extends ederse A child olur. B parent olur.
		//				Child parent'taki kodlarin public ve protected olanlarini kullanabilir.
		//				Reusability , short coding, maintenance(tamir) faydalari vardir.
		
		//6) Encapsulation nedir.
		//             Data hiding(Data gizleme) demektir. Data'lar Private yapilarak gizlenir.
		//			   Gizlenen data'lar getter() ile okunur.setter() ile update edilir.
		//			   Degistirilmesini istemediginiz kodlari koruma altina almak icin kullanilir.
		//			   Maintenance faydasi da vardir.
		//			   Kodun hic degistirilmesini istemiyorsaniz setter() methodlari olusturmayiniz. (Immutable clas)
	
		//7) Polymorphism nedir.
		//				Polymorphism(coklu yapi) overloading ve overridding'dir.
		//				
	
	
		//8)Abstrac Class  nedir?
		// 			    Abstract class uretmek icin abstract keyword kullanmaliyiz.
		//				Abstract class'lardan object uretilemez.(instantiante yapilamaz)
		//				Abstract class'larda hem abstract hemde concrete methodlar bulunabilir.
		//				Abstract method'un oldugu class kesinlikle abstract olmalidir.
		//				Abstract methodlarin(body'siz) concrete child'lar tarafindan override edilme zorunlulugu vardir.
		//				Concrete'ler  edilmesede  olur
		//	***********	Abstract Class'lari child class'lari bazi gorevleri yapmak zorunda birakmak icin olustururuz.
		
		//9-)Interface nedir.
		//				Java normalde multible inheritance 'a musade etmez bu yuzden Abstract class Kullandigimizda 
		//				multiple inheritance yapamayiz. Fakat bazi projelerde multiple multiple inheritance  kullanmak zorunda 
		//				kaliriz. Bunu java bize interface kullanma hakki  vererek halletmistir. Cunku: interface'lere multiple
		//				iplements/extends  yapilbilir.
		
		
		
		//10) Overloading Nedir.?
		//					Method ismi ayni tutularak paramatrelerin sayilari,yerleri, veya data type'leri degistirilerek 
		//					methodlar olusturmadir.
		//					Overloading compile time 'dir. yani overloading'de yaptigiz hata code yazarken belli olur.
		//					Ayni isme sahip metodlar ile farli islemler yapmak icin
		//					Mesela substring(4) ve substring(4,7) fonksiyonlari esasinda ayni fakat paremetreler degisir.
		
		
		
		//11)Overriding nedir.
		// 					Method signature'a(Method ismi+ parametreler) dikunmuyoruz, sadece body'i
		//					degistiriyoruz. Overriding inheritance olunca olur.
		//					Ayni method'un farkli kullanimlari icin overriding gereklidir.
		//					Animal'da ses () ==> Dog(Havlama)==> Kedi(){Miyavlama}
		//					overrriding Run Time Error verir.
		
		
		//Array ile ArrayList arasindaki farklar nelerdir?
		
		//					Array Olustururlurken uzunluk belli edilmek zorundadir.
		//					ve daha Sonra uzunluk degistirlemez.Fakat ArrayList'lerde 
		//					baslangicta uzunluk belirtmek zorunlulugumuz yok, eleman
		//					ekledikcz uzunluk artar, eleman sildikce uzunluk kisalir.
		
		//13) String ile StringBuilder Arasindaki Fark nedir.?
		//					String'ler immutible 'dir. StringBuilder ise mutable'dir
		//					StringBuilder class'i daha fazla kullanisli metodlara sahibtir.
		//					Mesela, Bir string'i tersten  yazdirmak icin kullanilan reverse() metodu.
		
	}

}

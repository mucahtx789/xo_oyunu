package odevv;


public class tekrarlar {

	//String dizi olu�turdum
	public String[] sayilar;

		//1-9 say�lar� diziye atama
	   public void diziOlustur() {
	   sayilar=new String[10];
		   for (int i = 1; i < 10; i++) {
				sayilar[i]=""+i+"";
			}
	   }
	   
	   // kutulara x,o  atama
		 public void setSayilar1(int a) {
			 sayilar[a]="X";
		 }
		 public void setSayilar2(int b) {
			 sayilar[b]="O";
		 }
		 
	 
		//En �st� yer al�cak ba�l�k
		public void bilgilendirme() {
			System.out.println("             XOX Oyunu                ");
			System.out.println("Oyuncu 1 (X) - Oyuncu 2 (O)");
		}
		
		//Tablonun �izgileri
		public void  ilkCizgi() {
			System.out.print("      |");
			System.out.print("      |");
			System.out.println();
		}
		public void ikinciCizgi() {
			System.out.println("______|______|______");
		
		}
		
		
		//tablodaki kutucuklar�
		public void ilksatir() {
			System.out.println("   "+sayilar[1]+"  |  "+sayilar[2]+"   |  "+sayilar[3]);
		}
		public void ikincisatir() {
			System.out.println("   "+sayilar[4]+"  |  "+sayilar[5]+"   |  "+sayilar[6]);
		}
		public void ucuncusatir() {
			System.out.println("   "+sayilar[7]+"  |  "+sayilar[8]+"   |  "+sayilar[9]);
			
		}
		
		//Tablonun birle�ltirilmesi 
		public void tablo() {
			
			bilgilendirme();
			ilkCizgi();
			ilksatir();
			ikinciCizgi();
			
			//ikinci sat�r
			ilkCizgi();
			ikincisatir();
			ikinciCizgi();
			
			//son sat�r
			ilkCizgi();
			ucuncusatir();
			ikinciCizgi();
			System.out.println();
		}
		
		//Burda yan yana ,alt alta ve �apraz XOX kontrol� yap�l�yor.
		public boolean kontrol() {
			if (sayilar[1]=="X" && sayilar[2]=="O" && sayilar[3]=="X")
				return true;
			else if (sayilar[4]=="X" && sayilar[5]=="O" && sayilar[6]=="X")
				return true;
			else if (sayilar[7]=="X" && sayilar[8]=="O" && sayilar[9]=="X")
				return true;
			else if (sayilar[1]=="X" && sayilar[4]=="O" && sayilar[7]=="X")
				return true;
			else if (sayilar[2]=="X" && sayilar[5]=="O" && sayilar[8]=="X")
				return true;
			else if (sayilar[3]=="X" && sayilar[6]=="O" && sayilar[9]=="X")
				return true;
			else if (sayilar[1]=="X" && sayilar[5]=="O" && sayilar[9]=="X")
				return true;
			else if (sayilar[3]=="X" && sayilar[5]=="O" && sayilar[7]=="X")
				return true;
			else { return false;}
		}
		
		//Kutu dolumu ,1-9 aras�nda m� kontrol
		public boolean degerKontrol(int a) {
			 if (sayilar[a]=="X" || sayilar[a]=="O")
				 return true;
			 else if (a>9 || 1>a  ) 
					return true;
			 else 
				return false;
			}
		
		
		
		
		
		
		
		}
		
		
		


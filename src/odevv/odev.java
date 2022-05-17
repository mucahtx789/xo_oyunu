package odevv;
import java.util.Scanner;
public class odev {

	public static void main(String[] args) {
		
		
		//tekrarlar class çaðýrma ve scaner oluþturma
		tekrarlar tekrar =new tekrarlar();
		Scanner al =new Scanner (System.in);
		
		//diziye 1-9 kadar sayýlar atama
		tekrar.diziOlustur();
		
		//Deðiþkenler ve tablo yazdýrma
		int oyuncu1;
		int oyuncu2;
		int hamle=0;
		tekrar.tablo();
		
		//Birisi kazanýncaya kadar oyun devam ediyor
		while(true) {
			
				//ilk oyuncu 
				while(true)
			{	
				System.out.println("Oyuncu 1 (X) Rakam Giriniz:");
				oyuncu1=al.nextInt();
				
				
				//kutu boþmu , 1-9 arasýnda mý kontrol
				  if(tekrar.degerKontrol(oyuncu1)==true) {
					System.out.println("Boþ bir kutuya 1-9 arasýnda deðer girin");
				}	
				//deðilse deðer atama ve hamle artýrma
				else {
				tekrar.setSayilar1(oyuncu1);
				hamle++;
				break;
				}
			}
				
				
				//1. oyuncu kazandý mý kontrol ve hamle doldu mu kontrol et.
				tekrar.tablo();
				if(tekrar.kontrol()==true) {System.out.println("----------Kazanan 1.Oyuncu----------");  break;}
				if(hamle ==9) {System.out.println("Hamle sayýsý 9 oldu"); break;}	
				
				
				//ikinci oyuncu 
				while(true)
			{	
				System.out.println("Oyuncu 2 (O) Rakam Giriniz:");
				oyuncu2=al.nextInt();
				
				
				
				//kutu boþmu , 1-9 arasýnda mý kontrol
				  if(tekrar.degerKontrol(oyuncu2)==true) {
					System.out.println("Boþ bir kutuya 1-9 arasýnda deðer girin");
				}	
				//deðilse deðer atama ve hamle artýrma
				else {
				tekrar.setSayilar2(oyuncu2);
				hamle++;
				break;
				}
			}
				
				//2. oyuncu kazandý mý kontrol ve boþ yer kaldýmý kontrol et 
				tekrar.tablo();
				if(tekrar.kontrol()==true) {System.out.println("----------Kazanan 2.Oyuncu----------"); break;}
				if(hamle ==9) {System.out.println("Hamle sayýsý 9 oldu"); break;}	
				}
		
		
		
			System.out.println("-----------Oyun Bitti-------------");
		
		
		
		
			}
	}
				
		


package odevv;
import java.util.Scanner;
public class odev {

	public static void main(String[] args) {
		
		
		//tekrarlar class �a��rma ve scaner olu�turma
		tekrarlar tekrar =new tekrarlar();
		Scanner al =new Scanner (System.in);
		
		//diziye 1-9 kadar say�lar atama
		tekrar.diziOlustur();
		
		//De�i�kenler ve tablo yazd�rma
		int oyuncu1;
		int oyuncu2;
		int hamle=0;
		tekrar.tablo();
		
		//Birisi kazan�ncaya kadar oyun devam ediyor
		while(true) {
			
				//ilk oyuncu 
				while(true)
			{	
				System.out.println("Oyuncu 1 (X) Rakam Giriniz:");
				oyuncu1=al.nextInt();
				
				
				//kutu bo�mu , 1-9 aras�nda m� kontrol
				  if(tekrar.degerKontrol(oyuncu1)==true) {
					System.out.println("Bo� bir kutuya 1-9 aras�nda de�er girin");
				}	
				//de�ilse de�er atama ve hamle art�rma
				else {
				tekrar.setSayilar1(oyuncu1);
				hamle++;
				break;
				}
			}
				
				
				//1. oyuncu kazand� m� kontrol ve hamle doldu mu kontrol et.
				tekrar.tablo();
				if(tekrar.kontrol()==true) {System.out.println("----------Kazanan 1.Oyuncu----------");  break;}
				if(hamle ==9) {System.out.println("Hamle say�s� 9 oldu"); break;}	
				
				
				//ikinci oyuncu 
				while(true)
			{	
				System.out.println("Oyuncu 2 (O) Rakam Giriniz:");
				oyuncu2=al.nextInt();
				
				
				
				//kutu bo�mu , 1-9 aras�nda m� kontrol
				  if(tekrar.degerKontrol(oyuncu2)==true) {
					System.out.println("Bo� bir kutuya 1-9 aras�nda de�er girin");
				}	
				//de�ilse de�er atama ve hamle art�rma
				else {
				tekrar.setSayilar2(oyuncu2);
				hamle++;
				break;
				}
			}
				
				//2. oyuncu kazand� m� kontrol ve bo� yer kald�m� kontrol et 
				tekrar.tablo();
				if(tekrar.kontrol()==true) {System.out.println("----------Kazanan 2.Oyuncu----------"); break;}
				if(hamle ==9) {System.out.println("Hamle say�s� 9 oldu"); break;}	
				}
		
		
		
			System.out.println("-----------Oyun Bitti-------------");
		
		
		
		
			}
	}
				
		


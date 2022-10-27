package Dersler;

import java.util.Scanner;

public class NotOrtalamasi {

	public static void main(String[] args) {
		
				//İlk önce değişkenlerimizi atadık.
				int mat,fizik,kimya,turkce,tarih,muzik;
				/*Kullanıcıdan veri almak için scanner sınıfı oluştuyoruz ve scanner sınıfını kullanabilmek için
				  bir nesne oluşturuyoruz.Bunu biz belirliyoruz ismini vs. */
				 Scanner inp=new Scanner(System.in);
				 // Kullanıcıdan verileri al.
				 System.out.println("Matematik Notunuzu Girin:");
				 mat=inp.nextInt();
				 
				 System.out.println("Fizik Notunuzu Girin:");
				 fizik=inp.nextInt();
				 
				 System.out.println("Kimya Notunuzu Girin:");
				 kimya=inp.nextInt();
				 
				 System.out.println("Turkce Notunuzu Girin:");
				 turkce=inp.nextInt();
				  
				 System.out.println("Tarih Notunuzu Girin:");
				 tarih=inp.nextInt();
				 
				 System.out.println("Muzik Notunuzu Girin:");
				 muzik=inp.nextInt();
				  
				int toplam=mat+fizik+kimya+turkce+tarih+muzik;
				double ortalama=toplam/6.0;
				
				System.out.println("Not Ortalamanız:"+ortalama);
				
			
			boolean kosul1=ortalama>=50;
			System.out.println("Durum="+ (kosul1==true ? "Geçti": "Kaldı"));
		}

		
	}



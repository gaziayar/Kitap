package Kitap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kitaplik {

	static List<Kitap> kitapListe = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	static int kitapNo = 1000;

	public static void main(String[] args) {
		menu(kitapListe);
	}

	public static void menu(List<Kitap> kitapListe) {
		int tercih = 0;

		do {
			System.out.println(
					"============= KITAPLIK PROJEMIZE HOSGELDINIZ ============== \n1: Kitap  Ekle\n2: Numara ile kitap Sil\n3: Tum kitaplari Listele \n4: Bitir");

			System.out.println("isleminizi seciniz  :");
			tercih = scan.nextInt();
			switch (tercih) {
			case 1:
				kitapEkle(kitapListe);
				break;
			case 2:
				sil(kitapListe);
				break;
			case 3:
				listele(kitapListe);
				break;
			case 4:
				System.out.println("Yine bekleriz");

				break;
			default:
				System.out.println("yanlis giris yaptiniz tekrar deneyin");

				break;
			}
		} while (tercih != 4);

	}

	private static void listele(List<Kitap> kitapListe) {

		if (kitapListe.isEmpty()) {
			System.out.println("listenizde kitap yok");
		} else {

			for (Kitap a : kitapListe) {
				System.out.println(a.toString());
			}
		}

	}

	private static void sil(List<Kitap> kitapListe) {
		System.out.println("lutfen silmek istediginiz kitap numarasini girin");
		boolean flag = true;

		scan.nextLine();
		int silinecekNo = scan.nextInt();
		for (Kitap a : kitapListe) {
			if (a.getKitapNo() == silinecekNo) {
				kitapListe.remove(a);
				System.out.println(silinecekNo + " silindi");
				flag = false;

				break;

			}

		}
		if (flag) {
			System.out.println(silinecekNo + " bulunamdi");

		}

	}

	private static void kitapEkle(List<Kitap> kitapListe) {

		System.out.println("lutfen kitap adini girin");
		scan.nextLine();
		String kitapAdi = scan.nextLine();
		System.out.println("lutfen yazar adini girin");
		String yazarAdi = scan.nextLine();
		System.out.println("lutfen yayin yilini  girin");
		int yayinYili = scan.nextInt();
		System.out.println("lutfen kitabin fiyatini girin");
		double fiyat = scan.nextDouble();
		Kitap kitap = new Kitap(++kitapNo, kitapAdi, yazarAdi, yayinYili, fiyat);
		kitapListe.add(kitap);
		System.out.println(kitap.toString() + "\nkitap basariyla eklendi ");

	}

}

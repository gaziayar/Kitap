package Kitap;

public class Kitap {

	/*
	 * 1. Kullanıcının Kitap ekleme, silme ve listeleme gibi işlemleri yapmasına
	 * imkan tanıyan bir uygulama yazınız. 2. Program, kitaplara 1001’den başlayarak
	 * sıralı ve otomatik numara vermeli. Bunun yanında, her bir kitap için Kitap
	 * Adı, Yazar Adı, Yayın Yılı ve Fiyat gibi bilgiler girilebilmelidir. 3.
	 * Programın başlangıcında Kullanıcıya aşağıdaki gibi bir menü sunulmalıdır.
	 * Kullanıcı programı bitirene kadar işlemlere devam edebilmelidir. =========
	 * KİTAP PROGRAMI ============= 1: Kitap ekle 2: Numara ile kitap sil 3: Tüm
	 * kitapları listele 4: Bitir
	 * 
	 */
	private int kitapNo;
	public int getKitapNo() {
		return kitapNo;
	}
	public Kitap(int kitapNo, String kitapAdi, String yazarAdi, int yayinYili, double fiyat) {
		super();
		this.kitapNo = kitapNo;
		this.kitapAdi = kitapAdi;
		this.yazarAdi = yazarAdi;
		this.yayinYili = yayinYili;
		this.fiyat = fiyat;
		
	}
	
	public Kitap (){
		
	}
	public void setKitapNo(int kitapNo) {
		this.kitapNo = kitapNo;
	}
	public String getKitapAdi() {
		return kitapAdi;
	}
	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}
	public String getYazarAdi() {
		return yazarAdi;
	}
	public void setYazarAdi(String yazarAdi) {
		this.yazarAdi = yazarAdi;
	}
	public int getYayinYili() {
		return yayinYili;
	}
	public void setYayinYili(int yayinYili) {
		this.yayinYili = yayinYili;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	private String kitapAdi;
	private String yazarAdi;
	private int yayinYili;
	private double fiyat;
	@Override
	public String toString() {
		return "Kitap [kitapNo=" + kitapNo + ", kitapAdi=" + kitapAdi + ", yazarAdi=" + yazarAdi + ", yayinYili="
				+ yayinYili + ", fiyat=" + fiyat + "]";
	}
	
	
	
	
}

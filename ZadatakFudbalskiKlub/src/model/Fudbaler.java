package model;

public class Fudbaler extends Osoba{
	
	private double nedeljnaPlata;
	private int brojOdigranihSezona;
	private String sponzor;
	private boolean rezerva;
	private double godisnjaZarada;
	private int brojGolovaIasistencija;
	private String pozicija;
	
	public Fudbaler() {
		
	}
	
	public Fudbaler(String ime, String prezime, String jmbg, String adresa,double nedeljnaPlata, int brojOdigranihSezona, String sponzor, boolean rezerva,
			int brojGolovaIasistencija, String pozicija) {
		super(ime, prezime,jmbg,adresa);
		this.nedeljnaPlata = nedeljnaPlata;
		this.brojOdigranihSezona = brojOdigranihSezona;
		this.sponzor = sponzor;
		this.rezerva = rezerva;
		this.godisnjaZarada = nedeljnaPlata * 52;
		this.brojGolovaIasistencija = brojGolovaIasistencija;
		this.pozicija = pozicija;
		if(brojOdigranihSezona > 0) {
			System.out.println("Sve OK");
		}else {
			System.out.println("Ne moze broj sezona da bude 0!");
		}
	}

	public double getNedeljnaPlata() {
		return nedeljnaPlata;
	}

	public void setNedeljnaPlata(double nedeljnaPlata) {
		this.nedeljnaPlata = nedeljnaPlata;
	}

	public int getBrojOdigranihSezona() {
		return brojOdigranihSezona;
	}

	public void setBrojOdigranihSezona(int brojOdigranihSezona) {
		this.brojOdigranihSezona = brojOdigranihSezona;
	}

	public String getSponzor() {
		return sponzor;
	}

	public void setSponzor(String sponzor) {
		this.sponzor = sponzor;
	}

	public boolean isRezerva() {
		return rezerva;
	}

	public void setRezerva(boolean rezerva) {
		this.rezerva = rezerva;
	}

	public double getGodisnjaZarada() {
		return godisnjaZarada;
	}

	public void setGodisnjaZarada(double godisnjaZarada) {
		this.godisnjaZarada = godisnjaZarada;
	}

	public int getBrojGolovaIasistencija() {
		return brojGolovaIasistencija;
	}

	public void setBrojGolovaIasistencija(int brojGolovaIasistencija) {
		this.brojGolovaIasistencija = brojGolovaIasistencija;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	@Override
	public String toString() {
		return "Fudbaler [nedeljnaPlata=" + nedeljnaPlata + ", brojOdigranihSezona=" + brojOdigranihSezona
				+ ", sponzor=" + sponzor + ", rezerva=" + rezerva + ", godisnjaZarada=" + godisnjaZarada
				+ ", brojGolovaIasistencija=" + brojGolovaIasistencija + ", pozicija=" + pozicija + "]";
	}
	
	
	
	

}

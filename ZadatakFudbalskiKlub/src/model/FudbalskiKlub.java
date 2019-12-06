package model;

import java.util.ArrayList;
import java.util.List;

public class FudbalskiKlub implements IFudbalskiKlub{
	
	private String naziv;
	private Trener trener;
	private List<Fudbaler> listaFudbalera = new ArrayList<Fudbaler>();
	private int brojZaposlenih;
	private int brojTrofeja;
	private double godisnjiIzdaci;
	
	public FudbalskiKlub(String naziv, Trener trener, List<Fudbaler> listaFudbalera,
			int brojTrofeja) {
		super();
		this.naziv = naziv;
		this.trener = trener;
		this.listaFudbalera = listaFudbalera;
		this.brojZaposlenih = listaFudbalera.size() + 1;
		this.brojTrofeja = brojTrofeja;
		
		double pare = 0;
		for(Fudbaler f: listaFudbalera) {
			pare+= f.getGodisnjaZarada();
		}
		
		this.godisnjiIzdaci = pare + trener.getGodisnjaZarada();
		
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Trener getTrener() {
		return trener;
	}

	public void setTrener(Trener trener) {
		this.trener = trener;
	}

	public List<Fudbaler> getListaFudbalera() {
		return listaFudbalera;
	}

	public void setListaFudbalera(List<Fudbaler> listaFudbalera) {
		this.listaFudbalera = listaFudbalera;
	}

	public int getBrojZaposlenih() {
		return brojZaposlenih;
	}

	public void setBrojZaposlenih(int brojZaposlenih) {
		this.brojZaposlenih = brojZaposlenih;
	}

	public int getBrojTrofeja() {
		return brojTrofeja;
	}

	public void setBrojTrofeja(int brojTrofeja) {
		this.brojTrofeja = brojTrofeja;
	}

	public double getGodisnjiIzdaci() {
		return godisnjiIzdaci;
	}

	public void setGodisnjiIzdaci(double godisnjiIzdaci) {
		this.godisnjiIzdaci = godisnjiIzdaci;
	}

	@Override
	public String toString() {
		return "FudbalskiKlub [naziv=" + naziv + ", trener=" + trener + ", listaFudbalera=" + listaFudbalera
				+ ", brojZaposlenih=" + brojZaposlenih + ", brojTrofeja=" + brojTrofeja + ", godisnjiIzdaci="
				+ godisnjiIzdaci + "]";
	}

	@Override
	public double najskupljiFudbaler() {
		
		double max = 0;
		for(Fudbaler f: listaFudbalera) {
			if(f.getGodisnjaZarada() > max) {
				max = f.getGodisnjaZarada();
			}
		}
		
		
		return max;
	}

	@Override
	public int najNeEfikasnijiFudbaler() {
		int min = listaFudbalera.get(0).getBrojGolovaIasistencija();
		for(Fudbaler f: listaFudbalera) {
			if(f.getBrojGolovaIasistencija() < min) {
				min = f.getBrojGolovaIasistencija();
			}
			
		}
		
		for(Fudbaler f: listaFudbalera) {
			if(f.getBrojGolovaIasistencija() == min) {
				System.out.println("Najnefikasniji: " + f.getIme() + " " +  f. getPrezime());
			}
		}
		
		return min;
	}

	@Override
	public int brojFudbaleraNaPoziciji(String pozicija) {
		
		int brojac = 0;
		
		for(Fudbaler f: listaFudbalera) {
			if(f.getPozicija().equals(pozicija)) {
				brojac ++;
			}	
		}
		System.out.println("Broj igraca na poziciji " + pozicija + " je: " + brojac);
		return brojac;
	}

	@Override
	public void najJeftinijiFudbalerRezerva() {
		
		double minimumPara = listaFudbalera.get(0).getNedeljnaPlata();
		for(Fudbaler f: listaFudbalera) {
			if(f.getNedeljnaPlata() < minimumPara) {
				minimumPara = f.getNedeljnaPlata();
			}
		}
		
		for(Fudbaler f: listaFudbalera) {
			if(f.getNedeljnaPlata() == minimumPara && f.isRezerva() == true) {
				System.out.println("Najjeftinija rezerva je: " + f.getIme() + " " + f.getPrezime());
			}
		}
			
	}
	
	
	
	

}

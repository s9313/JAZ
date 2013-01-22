package com.example.jsfdemo.domain;

import javax.validation.constraints.Size;

public class Lekarz {

	protected int id;
	protected String imie;
	protected String nazwisko;
	protected String specjalizacja;
	
	void lecz(){
		przyjeciePacjeta();
		zbadaniePacjeta();
		postawienieDiagnozy();
		wypisanieSwiadczenia();		
	}

	void przyjeciePacjeta(){
		System.out.println("Przyjecie pacjeta przez lekarza");
	}
	
	void zbadaniePacjeta(){
		System.out.println("Zbadanie pacjenta przez lekarza");
	}
	
	void postawienieDiagnozy(){};
	void wypisanieSwiadczenia(){};


	@Size(min = 1)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getSpecjalizacja() {
		return specjalizacja;
	}

	public void setSpecjalizacja(String specjalizacja) {
		this.specjalizacja = specjalizacja;
	}

}

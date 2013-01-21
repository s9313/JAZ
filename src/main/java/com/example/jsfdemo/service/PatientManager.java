package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.example.jsfdemo.domain.Pacjent;

@ApplicationScoped
public class PatientManager {
	private List<Pacjent> db = new ArrayList<Pacjent>();

	public void addPacjent(Pacjent Pacjent) {
		Pacjent newPacjent = new Pacjent(null);

		newPacjent.setImie(Pacjent.getImie());
		newPacjent.setNazwisko(Pacjent.getNazwisko());
		newPacjent.setTelefon(Pacjent.getTelefon());
		newPacjent.setAdres(Pacjent.getAdres());

		db.add(newPacjent);
	}


	public List<Pacjent> getAllPacjents() {
		return db;
	}
}

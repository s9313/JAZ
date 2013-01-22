package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.example.jsfdemo.domain.Lekarz;


@ApplicationScoped
public class LekarzManager {
	private List<Lekarz> db = new ArrayList<Lekarz>();

	public void addLekarz(Lekarz lekarz) {
		Lekarz newLekarz = new Lekarz();

		newLekarz.setId(lekarz.getId());
		newLekarz.setImie(lekarz.getImie());
		newLekarz.setNazwisko(lekarz.getNazwisko());
		newLekarz.setSpecjalizacja(lekarz.getSpecjalizacja());
		
		db.add(newLekarz);
	}


	public List<Lekarz> getAllDoctors() {
		return db;
	}
}

package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.example.jsfdemo.domain.Wizyta;


@ApplicationScoped
public class WizytaManager {
	private List<Wizyta> db = new ArrayList<Wizyta>();

	public void addWizyta(Wizyta wizyta) {
		Wizyta newWizyta = new Wizyta();

		newWizyta.setId(wizyta.getId());
		newWizyta.setData_zabiegu(wizyta.getData_zabiegu());
		newWizyta.setGodzina(wizyta.getGodzina());
		newWizyta.setId_pacjenta(wizyta.getId_pacjenta());
		newWizyta.setId_lekarza(wizyta.getId_lekarza());
		
		db.add(newWizyta);
	}


	public List<Wizyta> getAllVisits() {
		return db;
	}
}

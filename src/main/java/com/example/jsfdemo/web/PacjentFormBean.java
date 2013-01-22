package com.example.jsfdemo.web;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIForm;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
import javax.faces.model.ListDataModel;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;
import javax.inject.Named;

import com.example.jsfdemo.domain.Pacjent;
import com.example.jsfdemo.domain.Person;
import com.example.jsfdemo.service.PacjentManager;
import com.example.jsfdemo.service.PersonManager;

@SessionScoped
@Named("pacjentBean")
public class PacjentFormBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Pacjent pacjent = new Pacjent();

	private ListDataModel<Pacjent> pacjenci = new ListDataModel<Pacjent>();

	@Inject
	private PacjentManager pm;

	public Pacjent getPacjent() {
		return pacjent;
	}

	public void setPerson(Pacjent pacjent) {
		this.pacjent = pacjent;
	}

	public ListDataModel<Pacjent> getAllPatients() {
		pacjenci.setWrappedData(pm.getAllPatients());
		return pacjenci;
	}

	// Actions
	public String addPerson() {
		pm.addPacjent(pacjent);
		return "showPatients";
		//return null;
	}

}

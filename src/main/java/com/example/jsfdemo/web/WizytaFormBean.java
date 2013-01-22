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

import com.example.jsfdemo.domain.Wizyta;
import com.example.jsfdemo.service.WizytaManager;


@SessionScoped
@Named("wizytaBean")
public class WizytaFormBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Wizyta wizyta = new Wizyta();

	private ListDataModel<Wizyta> wizyty = new ListDataModel<Wizyta>();

	@Inject
	private WizytaManager pm;

	public Wizyta getWizyta() {
		return wizyta;
	}

	public void setPerson(Wizyta wizyta) {
		this.wizyta = wizyta;
	}

	public ListDataModel<Wizyta> getAllVisits() {
		wizyty.setWrappedData(pm.getAllVisits());
		return wizyty;
	}

	// Actions
	public String addPerson() {
		pm.addWizyta(wizyta);
		return "showVisits";
		//return null;
	}

}

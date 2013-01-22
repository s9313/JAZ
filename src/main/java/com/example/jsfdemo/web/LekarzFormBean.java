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

import com.example.jsfdemo.domain.Lekarz;
import com.example.jsfdemo.domain.Person;
import com.example.jsfdemo.service.LekarzManager;
import com.example.jsfdemo.service.PersonManager;

@SessionScoped
@Named("lekarzBean")
public class LekarzFormBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Lekarz lekarz = new Lekarz();

	private ListDataModel<Lekarz> lekarze = new ListDataModel<Lekarz>();

	@Inject
	private LekarzManager pm;

	public Lekarz getLekarz() {
		return lekarz;
	}

	public void setPerson(Lekarz lekarz) {
		this.lekarz = lekarz;
	}

	public ListDataModel<Lekarz> getAllDoctors() {
		lekarze.setWrappedData(pm.getAllDoctors());
		return lekarze;
	}

	// Actions
	public String addPerson() {
		pm.addLekarz(lekarz);
		return "showDoctors";
		//return null;
	}

}

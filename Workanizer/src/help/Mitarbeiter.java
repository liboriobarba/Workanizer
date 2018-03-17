package help;

import java.util.ArrayList;

public class Mitarbeiter {

private String vorname;
private String nachname;
private String position;
private ArrayList<Projekt> projekte;
private ArrayList<Arbeitszeit> arbeitszeiten;

public Mitarbeiter() {
	// TODO Auto-generated constructor stub
}

public String getVorname() {
	return vorname;
}

public void setVorname(String vorname) {
	this.vorname = vorname;
}

public String getNachname() {
	return nachname;
}

public void setNachname(String nachname) {
	this.nachname = nachname;
}

public String getPosition() {
	return position;
}

public void setPosition(String position) {
	this.position = position;
}

public ArrayList<Projekt> getProjekte() {
	return projekte;
}

public void setProjekte(ArrayList<Projekt> projekte) {
	this.projekte = projekte;
}

public ArrayList<Arbeitszeit> getArbeitszeiten() {
	return arbeitszeiten;
}

public void setArbeitszeiten(ArrayList<Arbeitszeit> arbeitszeiten) {
	this.arbeitszeiten = arbeitszeiten;
}
}

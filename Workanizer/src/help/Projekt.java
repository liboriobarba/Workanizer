package help;

import java.util.ArrayList;

public class Projekt {

	
private String projektname;
private String dauer;
private Mitarbeiter projektleiter;
private ArrayList<Mitarbeiter> projektmitglieder;

public Projekt() {
	// TODO Auto-generated constructor stub
}

public String getProjektname() {
	return projektname;
}

public void setProjektname(String projektname) {
	this.projektname = projektname;
}

public String getDauer() {
	return dauer;
}

public void setDauer(String dauer) {
	this.dauer = dauer;
}

public Mitarbeiter getProjektleiter() {
	return projektleiter;
}

public void setProjektleiter(Mitarbeiter projektleiter) {
	this.projektleiter = projektleiter;
}

public ArrayList<Mitarbeiter> getProjektmitglieder() {
	return projektmitglieder;
}

public void setProjektmitglieder(ArrayList<Mitarbeiter> projektmitglieder) {
	this.projektmitglieder = projektmitglieder;
}



}

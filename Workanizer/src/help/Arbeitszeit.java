package help;

import java.util.Date;

public class Arbeitszeit {

private Date startzeitpunkt;	
private Date endzeitpunkt;
private int dauer;
private int pause;

public Arbeitszeit() {
	// TODO Auto-generated constructor stub
}

public Date getStartzeitpunkt() {
	return startzeitpunkt;
}

public void setStartzeitpunkt(Date startzeitpunkt) {
	this.startzeitpunkt = startzeitpunkt;
}

public Date getEndzeitpunkt() {
	return endzeitpunkt;
}

public void setEndzeitpunkt(Date endzeitpunkt) {
	this.endzeitpunkt = endzeitpunkt;
}

public int getDauer() {
	return dauer;
}

public void setDauer(int dauer) {
	this.dauer = dauer;
}

public int getPause() {
	return pause;
}

public void setPause(int pause) {
	this.pause = pause;
}

}

package taller3.televisores;

public class Control {
	
	private TV tv;
	
	public void turnOn(){
		
		tv.turnOn();
		
	}
		
	public void turnOff() {
		
		tv.turnOff();
	}
		
	
	public int canalUp() {
		
		return tv.canalUp();
	}
	
	public int canalDown() {
		
		return tv.canalDown();
	}
	
	public int volumenUp() {
		
		return tv.volumenUp();
		
	}
	
	public int volumenDown() {
		return tv.volumenDown();
	}
	
	public void enlazar(TV tv) {
		this.tv = tv;
		tv.setControl(this); ;
	}
	
	public int setCanal(int canal) {
		
		return tv.setCanal(canal);
	}
	
	public int setVolumen(int volumen) {
		
		return tv.setVolumen(volumen);
	}
	
	public void setTv(TV tv) {
		this.tv = tv;
	
	}
	
	public TV getTv() {
		return tv;
	}
}

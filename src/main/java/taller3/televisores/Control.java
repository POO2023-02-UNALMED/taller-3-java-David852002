package taller3.televisores;

public class Control {
	
	TV tv;
	
	public void turnOn(){
		
		tv.turnOn(false);
		
	}
		
	public void turnOff() {
		
		tv.turnOff(true);
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
		this.tv.control = tv.control ;
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

package taller3.televisores;

public class Control {
	
	TV tv;
	
	void turnOn(){
		
		tv.turnOn(false);
		
	}
		
	void turnOff() {
		
		tv.turnOff(true);
	}
		
	
	int canalUp() {
		
		return tv.canalUp();
	}
	
	int canalDown() {
		
		return tv.canalDown();
	}
	
	int volumenUp() {
		
		return tv.volumenUp();
		
	}
	
	int volumenDown() {
		return tv.volumenDown();
	}
	
	void enlazar(TV tv) {
		this.tv = tv;
		this.tv.control = tv.control ;
	}
	
	void setTv(TV tv) {
		this.tv = tv;
	
	}
	
	TV getTv() {
		return tv;
	}
}

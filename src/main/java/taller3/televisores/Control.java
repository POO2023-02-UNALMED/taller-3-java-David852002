package taller3.televisores;

public class Control {
	
	private TV tv;
	
	public void turnOn(){
		
		tv.turnOn();
		
	}
		
	public void turnOff() {
		
		tv.turnOff();
	}
		
	
	public void canalUp() {
        if (tv != null && tv.getEstado() && tv.getCanal() <= 120) {
            tv.canalUp();
        }
    }
	 public void canalDown() {
	        if (tv != null && tv.getEstado() && tv.getCanal() >= 1) {
	            tv.canalDown();
	        }
	    }
	 public void volumenUp() {
	        if (tv != null && tv.getEstado() && tv.getVolumen() <= 7) {
	            tv.volumenUp();
	        }
	    }
	 public void volumenDown() {
	        if (tv != null && tv.getEstado() && tv.getVolumen() >= 0) {
	            tv.volumenDown();
	        }
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

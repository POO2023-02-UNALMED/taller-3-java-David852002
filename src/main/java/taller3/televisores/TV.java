package taller3.televisores;

public class TV {

	Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	Control control;
	private int numTV = 0;
	
	public TV(Marca marca, boolean estado) {
		
		this.marca = marca;
		this.estado = estado;
		canal = 1;
		volumen = 1;
		precio = 500;
		numTV ++;
	}
		
	void setMarca(Marca marca) {
		
		this.marca = marca;
		
		}
	void setCanal(int canal) {
		
		this.canal = canal;
		
	}
	void setVolumen(int volumen) {
		
		this.volumen = volumen; 
		
	}
	void setControl(Control control) {
		
		this.control = control;
		
	}
	void setPrecio(int precio) {
		
		this.precio = precio;
		
	}
	
	 
	 Marca getMarca() {
		
		return  marca;
		
	}
	 int getCanal() {
		 
		 return canal;
	 
	 }
	 int getVolumen() {
		 
		 return volumen;
		 
	 }
	 Control getControl() {
		 
		 return control;
		 
	 }
	 int getPrecio() {
		 return precio;
	 }
	 int getnumTV() {
		 return numTV;
	 }

	 void turnOn(boolean estado) {
		 
		 if (estado = false ) {
			 
			 estado = true; 
			 
		 }
		 
	 }

	 void turnOff(boolean estado) {
		 
		 if (estado = true) {
			 estado = false;
		 }
	 }
	 
	 boolean getEstado() {
		 return estado;
	 }
	 
	int canalUp(){
		if (canal>=1 && canal <=120 && estado ==true) { 
		
			canal++;
		
		}
		
		return canal;
	}
	int canalDown(){
		if (canal>=1 && canal <=120 && estado ==true) { 
			
			canal--;
		
		}
		
		return canal;}
	
	int volumenUp() {
		
		if(volumen>=0 && volumen <=7 && estado==true) {
			
			volumen++;
		}
		
		return volumen;
		
	}
	
	int volumenDown() {
		
		if(volumen>=0 && volumen <=7 && estado==true) {
			
			volumen--;
		}
		
		return volumen;
		
	}
	
}

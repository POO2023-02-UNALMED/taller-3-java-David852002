package taller3.televisores;

public class TV {

	Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	Control control;
	private static int numTV;
	
	public TV(Marca marca, boolean estado) {
		
		this.marca = marca;
		this.estado = estado;
		canal = 1;
		volumen = 1;
		precio = 500;
		
	}
		
	public void setMarca(Marca marca) {
		
		this.marca = marca;
		
		}
	public int setCanal(int canal) {
		
		if (canal>=1 && canal <=120 && estado ==true) { 
			
			this.canal = canal;
		
		}
		return canal;
		
	}
	public int setVolumen(int volumen) {
		
		if(volumen>=0 && volumen <=7 && estado==true) {
			
			this.volumen=volumen;
		}
		return volumen;
		
	}
	public void setControl(Control control) {
		
		this.control = control;
		
	}
	public void setPrecio(int precio) {
		
		this.precio = precio;
		
	}
	
	 
	 public Marca getMarca() {
		
		return  marca;
		
	}
	 public int getCanal() {
		 
		 return canal;
	 
	 }
	 public int getVolumen() {
		 
		 return volumen;
		 
	 }
	 public Control getControl() {
		 
		 return control;
		 
	 }
	 public int getPrecio() {
		 return precio;
	 }
	 public int getnumTV() {
		 return numTV;
	 }

	 public boolean turnOn(boolean estado) {
		 
		 if (estado = false ) {
			 
			 estado = true; 
			 
		 }
		 return estado;
	 }

	 public boolean turnOff(boolean estado) {
		 
		 if (estado = true) {
			 estado = false;
		 }
		 
		 return estado;
	 }
	 
	 public boolean getEstado() {
		 return estado;
	 }
	 
	 public int canalUp(){
		if (canal>=1 && canal <=120 && estado ==true) { 
		
			canal++;
		
		}
		
		return canal;
	}
	 public int canalDown(){
		if (canal>=1 && canal <=120 && estado ==true) { 
			
			canal--;
		
		}
		
		return canal;}
	
	 public int volumenUp() {
		
		if(volumen>=0 && volumen <=7 && estado==true) {
			
			volumen++;
		}
		
		return volumen;
		
	}
	
	 public int volumenDown() {
		
		if(volumen>=0 && volumen <=7 && estado==true) {
			
			volumen--;
		}
		
		return volumen;
		
	}
	
	 public void setNumTV(int numtv) {
		 this.numTV = numtv;
	 }
}

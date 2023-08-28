package taller3.televisores;

public class TV {

	Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	Control control;
	private static int numTV = 0;
	
	public TV(Marca marca, boolean estado) {
		
		this.marca = marca;
		this.estado = estado;
		canal = 1;
		volumen = 1;
		precio = 500;
		numTV++;
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
	 public static int getNumTV() {
		 return numTV;
	 }

	 public void turnOn() {
		  
			 estado = true; 

	 }

	 public void turnOff() {
		 
	
			 estado = false;
		
	 }
	 
	 public boolean getEstado() {
		 return estado;
	 }
	 
	 public void canalUp() {
	        if (estado && canal < 120) {
	            canal++;
	        }
	    }

		

	 public void canalDown() {
	        if (estado && canal > 1) {
	            canal--;
	        }
	    }
	 
	 public void volumenUp() {
	        if (estado && volumen < 7) {
	            volumen++;
	        }
	    }
	
	 public void volumenDown() {
	        if (estado && volumen > 0) {
	            volumen--;
	        }
	    }

	
	 public static void setNumTV(int numTV) {
		 TV.numTV = numTV;
	 }
}

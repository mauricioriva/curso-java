import java.io.Serializable;

public class Disco implements Serializable{
	
	public String nombre;
	public String artista;
	public int anio;
	public int nCanciones;

	public Disco(String nombre, String artista, int anio, int nCanciones){
		this.nombre = nombre;
		this.artista = artista;
		this.anio = anio;
		this.nCanciones = nCanciones;	
	}

	public String toString(){
		return "Nombre del disco: " + this.nombre + "\n" +
			"Artisa: " + this.artista + "\n" + 
			"Año del disco: " + this.anio + "\n" +
			"Canciones del disco: " + this.nCanciones;
	}
}
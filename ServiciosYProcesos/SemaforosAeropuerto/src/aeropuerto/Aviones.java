/**
 * 
 */
package aeropuerto;
import java.util.concurrent.*;
/**
 * @author Alvaro
 *
 */
public class Aviones extends Thread{
	Semaphore pista;
	int numeroavion;
	Aviones(Semaphore pista, int numeroavion){
		this.pista=pista;
		this.numeroavion=numeroavion;
	}
	public void run(){
		try{
			System.out.println("Avion: "+numeroavion+" Solicito aterrizaje");
			pista.acquire();
				Creador.avionesesperando--;
				System.out.println("Avion: "+numeroavion+" Voy a aterrizar, aterrizando");
				Thread.sleep(Creador.tiempo*1000);
				System.out.println("Avion: "+numeroavion+" \bAterrizado");
				Creador.avionesaterrizados++;
			pista.release();
		}catch(InterruptedException e){
			System.out.println("Excepcion de interrupcion");
		}
	}
}

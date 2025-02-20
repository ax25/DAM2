package tg;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.*;
import java.io.*;
public class Creador {
	public static int galletas;
	public static void main(String[] args){
		try{
			galletas=10;
			int ninios=15;
			BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce la cantidad de ninios: ");
			ninios=Integer.parseInt(sc.readLine());
			Semaphore semaforoninios=new Semaphore(1);
			Semaphore semaforomadre=new Semaphore(0);
			Madre madre=new Madre(semaforomadre,semaforoninios);
			Ninio[] ninio=new Ninio[ninios];
			madre.start();
			for(int i=0;i<ninio.length;i++){
				ninio[i]=new Ninio(semaforoninios,semaforomadre);
			}
			for(int i=0;i<ninio.length;i++){
				ninio[i].start();
			}
		}catch(IOException e){
			System.out.println("Excepcion IO");
		}catch(Exception e){
			System.out.println("Excepcion interrupcion");
		}
	}
}

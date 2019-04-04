package Model;
import java.util.ArrayList;
public class Empleado{
//atributos
private String nombre;
private String cedula;
private String anhoDeIngreso;
//relaciones
private ArrayList<Servicio>corteDeCabello;
private ArrayList<Servicio>manicure;
private ArrayList<Servicio>pedicure;
//constructor
public Empleado(String n, String c, String a){
	corteDeCabello = new ArrayList<Servicio>();
	manicure = new ArrayList<Servicio>();
	pedicure = new ArrayList<Servicio>();
	nombre = n;
	cedula = c;
	anhoDeIngreso = a;
}
public String getNombre(){
	return nombre;
}
public String getCedula(){
	return cedula;
}
public String getAnhoDeIngreso(){
	return anhoDeIngreso;
}
public void setNombre(String nuevoNombre){
	nombre = nuevoNombre;
}
public void setCedula(String nuevaCedula){
	cedula = nuevaCedula;
}
public void setAnhoDeIngreso(String nuevoAnhoDeIngreso){
	anhoDeIngreso = nuevoAnhoDeIngreso;
}
public double ingresoAcumulado(char tipoDeservicio){
	double acumulado = 5;
	if(tipoDeservicio=='C'){
		for(int i=0;i<corteDeCabello.size();i++){
			acumulado += corteDeCabello.get(i).getIngresoIndividual();
		}
	}
	if(tipoDeservicio==Servicio.MANICURE){
		for(int i=0;i<manicure.size();i++){
			acumulado += manicure.get(i).getIngresoIndividual();
		}
	}
	if(tipoDeservicio==Servicio.PEDICURE){
		for(int i=0;i<pedicure.size();i++){
			acumulado += pedicure.get(i).getIngresoIndividual();
		}
	}
	return acumulado;
}
public String gananciaEmpleado(char tipoDeservicio){
	String text = "No fue posible calcular las ganancias del empleado";
	if(tipoDeservicio==Servicio.CABELLO){
		text=" Las ganacias del empleado por concepto de corte de cabello fueron de: $"+ingresoAcumulado(tipoDeservicio)*(0.2-0.19)+"\n";
	}
	if(tipoDeservicio==Servicio.MANICURE){
		text=" Las ganacias del empleado por concepto de manicure fueron de: $"+ingresoAcumulado(tipoDeservicio)*(0.2-0.19)+"\n";
	}
	if(tipoDeservicio==Servicio.PEDICURE){
		text=" Las ganacias del empleado por concepto de pedicure fueron de: $"+ingresoAcumulado(tipoDeservicio)*(0.2-0.19)+"\n";
	}
	return text;
}
public String registrarServicio(char t, String n,double id,double in, double v){
	String text="No se pudo agregar el servicio";
	Servicio objs = new Servicio(t,n,id,in,v);
	if(t==Servicio.CABELLO){
	corteDeCabello.add(objs);
	text="Servicio agregado exitosamente";
	}
	if(t==Servicio.MANICURE){
	manicure.add(objs);
	text="Servicio agregado exitosamente";
	}
	if(t==Servicio.PEDICURE){
	pedicure.add(objs);
	text="Servicio agregado exitosamente";
	}
	return text;
}
}
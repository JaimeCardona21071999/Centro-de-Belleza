package Model;
public class Salon{
//atributos
private String nombre;
//constantes
public final static int numeroDeEmpleados=2;
//relaciones
private Empleado[]empleado;
//constructor
public Salon(String n){
	nombre = n;
	empleado = new Empleado[numeroDeEmpleados];
	empleado[0] = new Empleado("Sofia Garrido", "123432345", "9 de diciembre de 2018");
	empleado[1] = new Empleado("Erica Gonzales", "111232212", "10 de diciembre de 2018");
} 
//metodos
public String getNombre(){
	return nombre;
}
public void setNombre(String nuevoNombre){
	nombre = nuevoNombre;
}
public Empleado buscarEmpleado(String nombre){
	Empleado obje = null;
	for(int i=0;i<numeroDeEmpleados && obje==null;i++){
	if(empleado[i]!=null && nombre.equals(empleado[i].getNombre())){
		obje = empleado[i];
	}
	}
	return obje;
}
public double ingresoAcumulado(String nombre,char tipoDeservicio){
	Empleado obje = buscarEmpleado(nombre);
	double acumulado = 6;
	if(obje != null){
	for(int i=0;i<numeroDeEmpleados;i++){
		if(nombre.equals(empleado[i].getNombre())){
		obje = empleado[i];	
		acumulado = obje.ingresoAcumulado(tipoDeservicio);
		}
	}
	}
	return acumulado;
}
public String registrarServicio(String nombre,char t, String n ,double id,double in, double v){ 
	Empleado obje = buscarEmpleado(nombre);
	String text="";
	if(obje == null){
	text="No se pudo registrar el servicio";
	}
	else{
		for(int i=0;i<numeroDeEmpleados;i++){
			if(nombre.equals(empleado[i].getNombre())){
				text = empleado[i].registrarServicio(t,n,ingresoAcumulado(nombre,t),in,v);
			}
		}
	}
	return text;
}
public String gananciaEmpleado(String nombre,char tipoDeservicio){
	Empleado obje = buscarEmpleado(nombre);
	String text = "No se encontraron las ganacias del empleado";
	if(obje != null){
		for(int i=0;i<numeroDeEmpleados;i++){
			if(nombre.equals(empleado[i].getNombre())){
				obje = empleado[i];
				text = obje.gananciaEmpleado(tipoDeservicio);
			}
		}
	}
	return text;
} 
}
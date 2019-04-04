package Model;
public class Servicio{
//constantes 
public final static char CABELLO = 'C';
public final static char MANICURE = 'M';
public final static char PEDICURE = 'P';
//atributos
private char tipoDeServicio;
private String nombre;
private double ingresoIndividual;
private double ingresoAcumulado;
private double valorAcumuladoImpuestos;
//constructor
public Servicio(char t, String n,double in, double i, double v){
	t = tipoDeServicio;
	n = nombre;
	in = ingresoAcumulado;
	i = ingresoIndividual;
	v = valorAcumuladoImpuestos;
}
//metoodos
public char getTipoDeServicio(){
	return tipoDeServicio;
}
public String getNombre(){
	return nombre;
}
public double getIngresoIndividual(){
	return ingresoIndividual;
}
public double getIngresoAcumulado(){
	return ingresoAcumulado;
}
public double getValorAcumuladoImpuestos(){
	return valorAcumuladoImpuestos;
}
public void setTipoDeServicio(char nuevoTipoDeServicio){
	tipoDeServicio = nuevoTipoDeServicio;
}
public void setNombre(String nuevoNombre){
	nombre = nuevoNombre;
}
public void setIngresoIndividual(double nuevoIngresoIndividual){
	ingresoIndividual = nuevoIngresoIndividual;
}
public void setIngresoAcumulado(double nuevoIngresoAcumulado){
	ingresoAcumulado = nuevoIngresoAcumulado;
}
public void setValorAcumuladoImpuestos(double nuevoValorAcumuladoImpuestos){
	valorAcumuladoImpuestos = nuevoValorAcumuladoImpuestos;
}
}
/*Crear la clase Producto, que tiene como atributos el código del producto (numérico),
el precio y el tanto por ciento del descuento. Deben realizarse todos los métodos get/set. 
Deben añadirse además los métodos getPrecioTotal, que tiene en cuenta el descuento, 
y getPrecioTotal(nuevoPrecio), que debe tener en cuenta el descuento actual 
para que aplicándoselo al precio, devuelva este 'nuevoPrecio'.*/
package Ejercicios;

public class Producto {
private int codproducto;
private float precio;
private float descuento;
public int getCodproducto() {
	return codproducto;
}
public void setCodproducto(int codproducto) {
	this.codproducto = codproducto;
}
public float getPrecio() {
	return precio;
}
public void setPrecio(float precio) {
	if(precio<0)this.precio=precio;
	else this.precio = 0;
}
public float getDescuento() {
	return descuento;
}
public void setDescuento(float descuento) {
	if(descuento<0){
		this.descuento=0;}
	else if(descuento>100){
		this.descuento=100;}
	else
	{this.descuento=descuento;}
	}

public float getPrecioTotal(){
	
	return this.precio=precio-(precio*descuento)/100;
	
}
public float getPrecioTotal(float nuevoPrecio){
	return this.precio=nuevoPrecio-(nuevoPrecio*descuento)/100;
}

public void setPrecioTotal(float precio_final){
	this.precio=precio_final/(1-(float)descuento/100);
}
}

package repaso;

public class Aspirante {
  private int id;
  int[] fallos;
  Aspirante(int i,int[]f){
	  this.id=i;
	  this.fallos=f;
  }
 
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int[] getFallos() {
	return fallos;
}
public void setFallos(int[] fallos) {
	this.fallos = fallos;
}
  
}

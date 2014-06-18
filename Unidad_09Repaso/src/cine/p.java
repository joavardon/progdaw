package cine;

public class p {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String p="ET 3D";
		int n=p.lastIndexOf("3D",'3');
		System.out.println(n);
		String j=p.substring(0, n);
		System.out.println(j);
	}

}

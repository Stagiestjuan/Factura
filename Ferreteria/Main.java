package com.jccm.Ferreteria;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		String objeto;
		int cantidad;
		double valor;
		
		Factura factura = new Factura( "0" , "Ninguna" , 0 , 0.0 );
	       
        System.out.println("N�mero de pieza: " + factura.obtenernumPieza() );
        System.out.println("Descripci�n de la pieza: " + factura.obtenerdescPieza() );
        System.out.println("Cantidad del art�culo: " + factura.obtenervendidos() );
        System.out.println("Valor unitario del art�culo: " + factura.obtenerprecio() );
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escriba el n�mero de pieza: ");
        objeto = sc.nextLine();
        factura.fijarnumPieza(objeto);
       
        System.out.print("Escriba la descripci�n de la pieza: ");
        objeto = sc.nextLine();
        factura.fijardescPieza(objeto);
       
        System.out.print("Escriba la cantidad del art�culo: ");
        cantidad = sc.nextInt();
        factura.fijarvendidos(cantidad);
       
        System.out.print("Escriba el valor del art�culo: ");
        valor = sc.nextDouble();
        factura.fijarprecio(valor);
        
        System.out.println();
        System.out.println("N�mero de pieza: " + factura.obtenernumPieza() );
        System.out.println("Descripci�n de la pieza: " + factura.obtenerdescPieza() );
        System.out.println("Cantidad del art�culo: " + factura.obtenervendidos() );
        System.out.println("Valor unitario del art�culo: " + factura.obtenerprecio() );
        System.out.println("Valor total de factura: " + factura.obtenerTotal() );
        System.out.println(factura.desplegarNotasAdicionales());
        sc.close();
	}

}

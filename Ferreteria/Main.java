package com.jccm.Ferreteria;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		String objeto;
		int cantidad;
		double valor;
		
		Factura factura = new Factura( "0" , "Ninguna" , 0 , 0.0 );
	       
        System.out.println("Número de pieza: " + factura.obtenernumPieza() );
        System.out.println("Descripción de la pieza: " + factura.obtenerdescPieza() );
        System.out.println("Cantidad del artículo: " + factura.obtenervendidos() );
        System.out.println("Valor unitario del artículo: " + factura.obtenerprecio() );
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escriba el número de pieza: ");
        objeto = sc.nextLine();
        factura.fijarnumPieza(objeto);
       
        System.out.print("Escriba la descripción de la pieza: ");
        objeto = sc.nextLine();
        factura.fijardescPieza(objeto);
       
        System.out.print("Escriba la cantidad del artículo: ");
        cantidad = sc.nextInt();
        factura.fijarvendidos(cantidad);
       
        System.out.print("Escriba el valor del artículo: ");
        valor = sc.nextDouble();
        factura.fijarprecio(valor);
        
        System.out.println();
        System.out.println("Número de pieza: " + factura.obtenernumPieza() );
        System.out.println("Descripción de la pieza: " + factura.obtenerdescPieza() );
        System.out.println("Cantidad del artículo: " + factura.obtenervendidos() );
        System.out.println("Valor unitario del artículo: " + factura.obtenerprecio() );
        System.out.println("Valor total de factura: " + factura.obtenerTotal() );
        System.out.println(factura.desplegarNotasAdicionales());
        sc.close();
	}

}


package com.memorization.interprete;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

	@SuppressWarnings("unused")
	private static final String EXTENSION = "memo";
	public static String ruta = "";
	
	//RUTA ACTUAL UTILIZADA = "/Users/adrian/Documents/Universidad/TFG/CodigoDePrueba.java"
	public static void main(String[] args) throws IOException {
		String program = "";
		if (args.length == 1){
			
			if (args[0].equals("-actions")) {
				System.out.println("       ++++++++++++++++++  Actions  ++++++++++++++++++");
				System.out.println("Se presentan las siguientes opciones: ");
				System.out.println();
				System.out.println("  -memorization                Aplica la técnica de memorización a las funciones que se deseen");			
			}
			else if (args[0].equals("-aboutus")){
				System.out.println("       ++++++++++++++++++  About Us  ++++++++++++++++++");
				System.out.println();
				System.out.println();
				System.out.println("Hasta el día 2 de Septiembre han participado los siguientes desarrolladores: ");
				System.out.println(" - Adrián Fernández Rodríguez");
				System.out.println();
				System.out.println();
			}
			else {
				System.out.println("Por favor introduzca una sentencia permitida");
			}
		}
		else if (args.length == 2){
			
			if (args[0].equals("-memorization")){
				
				if (args[1].equals("-help")){
					System.out.println("       ++++++++++++++++++  Memorization Help  ++++++++++++++++++");
					System.out.println();
					System.out.println();
					System.out.println("  Descripción: La presente acción aplica la técnica de memorización a los métodos seleccionados mediante la utilización de la etiqueta @memorization en la cabecera de las funciones puras. Se utiliza una gramática LL. Compatible con sintaxis Java \n");
					System.out.println();
					System.out.println("                source2S+ -memorization Ruta");
					System.out.println();
					System.out.println();
					System.out.println("  Argumentos: ");
					System.out.println(" - Ruta: Introduce una ruta válida absoluta del fichero que se desea modificar");
					System.out.println();
					System.out.println();
					
				}
				else {
					File fichero = new File (args[1]);
					
					if (!fichero.exists()){
						System.out.println("Ruta Inválida");
					}
					else {
						FileReader f = new FileReader(args[1]);
						ruta = args[1];
		
						memorizationLexer lexer = new memorizationLexer(new ANTLRFileStream(ruta));
						CommonTokenStream tokens = new CommonTokenStream(lexer);
						memorizationParser parser = new memorizationParser(tokens);
		
						memorizationParser.CompilationUnitContext tree = parser.compilationUnit();
		
						memorizationCustomVisitor visitor = new memorizationCustomVisitor();
						visitor.visit(tree);
		
						System.out.println("Interpretation finished");
					}
				}
			}
			else {
				System.out.println("Por favor introduzca una sentencia permitida");
			}
		}
		else if (args.length > 2){
			System.out.println("Por favor introduzca una sentencia permitida");
		}
		//Se comentan las opciones del programa
		else {
			System.out.println("       ++++++++++++++++++  Source2S+  ++++++++++++++++++");
			System.out.println();
			System.out.println();
			System.out.println("Se presentan las siguientes opciones: ");
			System.out.println();
			System.out.println("  -options                Presenta las diferentes acciones de la herramienta");			
			System.out.println("  -aboutus                Presenta la información adicional de la herramienta");
			System.out.println();
			System.out.println();
		}

		

	}

}

package com.memorization.interprete;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Reader {
	
	int ultimaLineaLeida;
	int ultimaLineaEscrita;
	String ruta;
	
	FileReader f;
	BufferedReader b;
	
	boolean primeraVez;
	
	FileWriter fw;
	
	public Reader (String ruta){
		this.ultimaLineaLeida = 0;
		this.ultimaLineaEscrita = 0;
		this.ruta = ruta;
		try {
			this.f = new FileReader(ruta);
			this.fw = new FileWriter(nombreClaseMemorization ());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.b = new BufferedReader(f);
		this.primeraVez = true;
		
	}
	/**
	 * Obtiene el nombre del fichero a modificar
	 * @return
	 * @throws Exception
	 */
	private String nombreClaseMemorization () throws Exception{
		int aux = ruta.length() - 5;
		
		String aux1 = ruta.substring(aux);
		//Se comprueba si el fichero tiene la extensión adecuada
		if (!aux1.equals(".java"))
			throw new Exception ("El documento introducido no es un archivo .java");
	
		return ruta.substring(0, aux) + "_memorization" + aux1;
	}
	/**
	 * Es el método encargado de encontrar la línea en la que se encuentra el método en cuestión, y reescribir la parte superior de la misma
	 * @param cabeceraMetodo
	 * @throws Exception 
	 */
	private void matchMetodoMemorizacion (String cabeceraMetodo) throws Exception {
		System.out.println("matchMEtodoMemorization");
		String cadena = "";
		cabeceraMetodo = cabeceraMetodo.replace(" ", "");
		String aux = "";
		while((cadena = b.readLine())!=null) {
			ultimaLineaLeida++;
			aux = cadena;
			aux = aux.replaceAll(" ", "");
			if (aux.contains(cabeceraMetodo)){
				System.out.println("FUNCIONA");
        		break;
        	}
			else{
				if (!cadena.contains("@memorization") && !cadena.contains("@Memorization"))
					fw.write(cadena + "\n");
			}
        }
		fw.flush();
	}
	
	
	
	public void memorization (String cabeceraMetodo, String identificadorMetodo, String typeOfReturnMetodo,ArrayList<String> Argumentos) throws IOException {
		
		//Escribimos la clase de los argumentos del método
		fw.write("\tprivate class " + identificadorMetodo + "_Argumentos { \n");
		//Escribimos los argumentos
		
		for (String aux:Argumentos)
			fw.write("\t\t" + aux + "; \n" );
		
		fw.write("\n");
		fw.write("\t\tprivate " + identificadorMetodo + " (");
		
		for (int ii = 0; ii < Argumentos.size(); ii++){
			
			if (ii == Argumentos.size() - 1)
				fw.write(Argumentos.get(ii) + " ) {\n");
			else
				fw.write(Argumentos.get(ii) + ",");
		}
		
		fw.write("\n");
		
		for (int ii = 0; ii < Argumentos.size(); ii++){	
			String aux = Argumentos.get(ii);
			String aux2 = "\t\t\tthis." +  aux + "="+ aux + "\n"; 
			fw.write(aux2);
		}
		fw.write("\t\t}\n");
		fw.write("\t}\n");
		
		fw.write("\n");
		
		//Se escribe la clase HashMap con la clase Argumentos y el resultado de la función
		if (primeraVez == true)
			fw.write("\timport java.util.HashMap;\n");
		
		fw.write("\n");
		
		String nombreHashMap = "resultados_" + identificadorMetodo + "_Argumentos";
		
		fw.write("\tHashMap<" + identificadorMetodo + "_Argumentos, " + typeOfReturnMetodo + "> "+ nombreHashMap +" = new HashMap <>();\n");
		fw.write("\n");
		fw.write("\tpublic " + typeOfReturnMetodo + " " + identificadorMetodo + "(");
		
		for (int ii = 0; ii < Argumentos.size(); ii++){
			if (ii == Argumentos.size() - 1)
				fw.write(Argumentos.get(ii) + " ) {\n");
			else
				fw.write(Argumentos.get(ii) + ",");
		}
		
		fw.write("\n");
		
		fw.write("\t\t" + identificadorMetodo + "_Argumentos argumentos = new " + identificadorMetodo + "_Argumentos" + "(");
		
		for (int ii = 0; ii < Argumentos.size(); ii++){
			if (ii == Argumentos.size() - 1)
				fw.write(Argumentos.get(ii) + " );\n");
			else
				fw.write(Argumentos.get(ii) + ",");
		}
		
		fw.write("\n");
		
		fw.write ("\t\tif ( " + nombreHashMap + ".containsKey(argumentos)\n");
		fw.write("\t\t\treturn argumentos.get(argumentos);\n");
		
		fw.write("\n");
		
		fw.write("\t\treturn " + identificadorMetodo + "_Original ( " );
		
		for (int ii = 0; ii < Argumentos.size(); ii++){
			if (ii == Argumentos.size() - 1)
				fw.write(nombreVariable (Argumentos.get(ii)) + " ); \n");
			else
				fw.write(nombreVariable (Argumentos.get(ii)) + ",");
		}
		
		fw.write("\t}\n");
		
		escribirMetodoOriginal(cabeceraMetodo, identificadorMetodo);
		fw.flush();
		
		primeraVez = false;
	}
	
	
	private String nombreVariable (String variable) {
		int aa = 0;
		while (variable.charAt(aa) != ' ')
			aa++;
		
		return variable.substring(aa);
	}
	
	/**
	 * Una vez se ha realizado la escritura de la memorizacion del método, se escribe el método original
	 * @param cabeceraMetodo
	 * @throws IOException
	 */
	private void escribirMetodoOriginal (String cabeceraMetodo, String identificadorMetodo) throws IOException {
		
		String cabeceraMemorization = "";
		String aux = "";
		char caracter = ' ';
		for (int ii = 0; ii<cabeceraMetodo.length(); ii++ ){
			caracter = cabeceraMetodo.charAt(ii);
			
			if (caracter == ' ' || caracter == '{' || caracter == '('){
				if (aux.equals(identificadorMetodo)){
					aux = aux + "_Original" + caracter;
				}
				cabeceraMemorization = cabeceraMemorization + aux + caracter;
				aux = "";
			}
			else {
				aux = aux + caracter;
			}
		}
		
		fw.write("\t" + cabeceraMemorization + " {"+ "\n");
		
		int abiertos = 1;
		String cadena = "";
		
		while((cadena = b.readLine())!=null) {
			
			if (cadena.contains("{")){
				abiertos++;
        	}
			else if (cadena.contains("}")){
				abiertos--;
			}
			fw.write("\t" + cadena + "\n");
			
			if (abiertos == 0) break;
        }
	}
	
	/**
	 * La utilidad de este radica en poder controlar facilmente las excepciones que se pueden realizar por entrada salida, evitando así tener que ser añadidas
	 * en el códgio de la funcion terminarClase
	 */
	public void finalizarMemorization (){
		try {
			terminarClase();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Este método es el encargardo, de que una vez ha terminado la herramienta de recorrer 
	 * @throws IOException
	 */
	private void terminarClase () throws IOException{
		String cadena = "";
		
		while((cadena = b.readLine())!=null) 
			fw.write(cadena + "\n");			
		fw.flush();
		b.close();
		fw.close();
	}
	
	public String crearCabeceraArgumentos (ArrayList <String> Argumentos){
		String cabecera = "";
		
		for (String aux: Argumentos){
			if (cabecera.equals(""))
				cabecera = aux;
			else 
				cabecera = cabecera + ", " + aux;
		}
		return cabecera;
	}
	
	public void modificarMetodoMemorizacion (String cabeceraMetodo, String identificadorMetodo, String metodoOriginal, String typeOfReturn,ArrayList <String> Argumentos){ 
		// TODO Auto-generated method stub
		try {
			matchMetodoMemorizacion(cabeceraMetodo);
			memorization(cabeceraMetodo, identificadorMetodo, typeOfReturn,Argumentos);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

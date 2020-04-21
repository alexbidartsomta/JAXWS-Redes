package com.ecodeup.ws;

import javax.jws.WebService;

@WebService(endpointInterface="com.ecodeup.ws.Redes")
public class Validacionproceso implements Redes{

	@Override
	public String validarrut(String Rut) {
		// TODO Auto-generated method stub
		
		this.Rut=Rut;
		String newdigito="";
		int cantidad=2;
		//int m = Math.max(0, Rut.length() - cantidad);
		String RutsnD=Rut.substring(0, Rut.length()-cantidad);
		//static String RUT="12345678"
		int M = 0, S = 1;
		int T = Integer.parseInt(RutsnD);
		for (; T != 0; T /= 10) {
		        S = (S + T % 10 * (9 - M++ % 6)) % 11;
		}
		char ultimo = Rut.charAt(Rut.length()-1);
		String cadena=Character.toString(ultimo);
		newdigito=Rut+"-"+(char) (S != 0 ? S + 47 : 75);
		char ultimo2=newdigito.charAt(newdigito.length()-1);
		String cadena2=Character.toString(ultimo2);

		if (cadena2.equals(cadena)) {
			return "Rut Valido";
		}
		else {
			return "Rut Invalido";
		}
	}
	
	public String Rut;
	

}

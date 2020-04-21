package com.ecodeup.ws;

import javax.swing.JOptionPane;

public class ValidarConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ValidacionprocesoService validacionservice=new ValidacionprocesoService();
		Redes consumer=validacionservice.getValidacionprocesoPort();
		System.out.println("");
		String rut="";
		while(true) {
			while (true) {
				rut=JOptionPane.showInputDialog("Ingrese su Rut de la forma XXXXXXXX-X");
				if(rut.length()<9||rut.length()>10) {
					JOptionPane.showMessageDialog(null,"Rut Invalido");
				}
				else {
					break;
				}
				
			}
			if ((consumer.validarrut(rut)).equals("Rut Valido")){
					JOptionPane.showMessageDialog(null,"Rut Valido");
				break;
			}
			else {
				JOptionPane.showMessageDialog(null,"Rut Invalido");
			}
		}
		

	}

}

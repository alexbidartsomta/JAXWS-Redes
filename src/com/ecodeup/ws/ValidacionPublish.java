package com.ecodeup.ws;

import javax.xml.ws.Endpoint;

public class ValidacionPublish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Endpoint.publish("http://localhost:1515/Redes", new Validacionproceso());

	}

}

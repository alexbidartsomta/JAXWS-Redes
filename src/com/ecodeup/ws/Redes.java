
package com.ecodeup.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Redes", targetNamespace = "http://ws.ecodeup.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Redes {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validarrut", targetNamespace = "http://ws.ecodeup.com/", className = "com.ecodeup.ws.Validarrut")
    @ResponseWrapper(localName = "validarrutResponse", targetNamespace = "http://ws.ecodeup.com/", className = "com.ecodeup.ws.ValidarrutResponse")
    @Action(input = "http://ws.ecodeup.com/Redes/validarrutRequest", output = "http://ws.ecodeup.com/Redes/validarrutResponse")
    public String validarrut(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}

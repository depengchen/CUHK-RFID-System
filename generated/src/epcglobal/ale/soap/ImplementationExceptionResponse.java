
package epcglobal.ale.soap;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAXWS SI.
 * JAX-WS RI 2.0_01-b59-fcs
 * Generated source version: 2.0
 * 
 */
@WebFault(name = "ImplementationException", targetNamespace = "urn:epcglobal:ale:wsdl:1")
public class ImplementationExceptionResponse
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ImplementationException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ImplementationExceptionResponse(String message, ImplementationException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param message
     * @param cause
     */
    public ImplementationExceptionResponse(String message, ImplementationException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: epcglobal.ale.soap.ImplementationException
     */
    public ImplementationException getFaultInfo() {
        return faultInfo;
    }

}
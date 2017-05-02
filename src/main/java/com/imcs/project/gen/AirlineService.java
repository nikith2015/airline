
package com.imcs.project.gen;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AirlineService", targetNamespace = "http://com.soap/AirlineService/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AirlineService {


    /**
     * 
     * @param parameters
     * @return
     *     returns com.imcs.project.gen.AddReservationResponse
     */
    @WebMethod(operationName = "AddOperation", action = "http://com.soap/AirlineService/AddOperation")
    @WebResult(name = "AddOperationResponse", targetNamespace = "http://com.soap/AirlineService/", partName = "parameters")
    public AddReservationResponse addOperation(
        @WebParam(name = "AddOperation", targetNamespace = "http://com.soap/AirlineService/", partName = "parameters")
        AddReservationRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.imcs.project.gen.GetReservationResponse
     */
    @WebMethod(operationName = "GetOperation", action = "http://com.soap/AirlineService/GetOperation")
    @WebResult(name = "GetOperationResponse", targetNamespace = "http://com.soap/AirlineService/", partName = "parameters")
    public GetReservationResponse getOperation(
        @WebParam(name = "GetOperation", targetNamespace = "http://com.soap/AirlineService/", partName = "parameters")
        GetReservationRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.imcs.project.gen.DeleteReservationResponse
     */
    @WebMethod(operationName = "DeleteOperation", action = "http://com.soap/AirlineService/DeleteOperation")
    @WebResult(name = "DeleteOperationResponse", targetNamespace = "http://com.soap/AirlineService/", partName = "parameters")
    public DeleteReservationResponse deleteOperation(
        @WebParam(name = "DeleteOperation", targetNamespace = "http://com.soap/AirlineService/", partName = "parameters")
        DeleteReservationRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.imcs.project.gen.UpdateReservationResponse
     */
    @WebMethod(operationName = "UpdateOperation", action = "http://com.soap/AirlineService/UpdateOperation")
    @WebResult(name = "UpdateOperationResponse", targetNamespace = "http://com.soap/AirlineService/", partName = "parameters")
    public UpdateReservationResponse updateOperation(
        @WebParam(name = "UpdateOperation", targetNamespace = "http://com.soap/AirlineService/", partName = "parameters")
        UpdateReservationRequest parameters);

}

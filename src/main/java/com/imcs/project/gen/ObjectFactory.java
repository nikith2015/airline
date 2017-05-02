
package com.imcs.project.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.imcs.project.gen package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UpdateOperation_QNAME = new QName("http://com.soap/AirlineService/", "UpdateOperation");
    private final static QName _AddOperationResponse_QNAME = new QName("http://com.soap/AirlineService/", "AddOperationResponse");
    private final static QName _DeleteOperation_QNAME = new QName("http://com.soap/AirlineService/", "DeleteOperation");
    private final static QName _GetOperation_QNAME = new QName("http://com.soap/AirlineService/", "GetOperation");
    private final static QName _UpdateOperationResponse_QNAME = new QName("http://com.soap/AirlineService/", "UpdateOperationResponse");
    private final static QName _DeleteOperationResponse_QNAME = new QName("http://com.soap/AirlineService/", "DeleteOperationResponse");
    private final static QName _AddOperation_QNAME = new QName("http://com.soap/AirlineService/", "AddOperation");
    private final static QName _GetOperationResponse_QNAME = new QName("http://com.soap/AirlineService/", "GetOperationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.imcs.project.gen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddReservationResponse }
     * 
     */
    public AddReservationResponse createAddReservationResponse() {
        return new AddReservationResponse();
    }

    /**
     * Create an instance of {@link DeleteReservationRequest }
     * 
     */
    public DeleteReservationRequest createDeleteReservationRequest() {
        return new DeleteReservationRequest();
    }

    /**
     * Create an instance of {@link GetReservationRequest }
     * 
     */
    public GetReservationRequest createGetReservationRequest() {
        return new GetReservationRequest();
    }

    /**
     * Create an instance of {@link UpdateReservationRequest }
     * 
     */
    public UpdateReservationRequest createUpdateReservationRequest() {
        return new UpdateReservationRequest();
    }

    /**
     * Create an instance of {@link DeleteReservationResponse }
     * 
     */
    public DeleteReservationResponse createDeleteReservationResponse() {
        return new DeleteReservationResponse();
    }

    /**
     * Create an instance of {@link AddReservationRequest }
     * 
     */
    public AddReservationRequest createAddReservationRequest() {
        return new AddReservationRequest();
    }

    /**
     * Create an instance of {@link GetReservationResponse }
     * 
     */
    public GetReservationResponse createGetReservationResponse() {
        return new GetReservationResponse();
    }

    /**
     * Create an instance of {@link UpdateReservationResponse }
     * 
     */
    public UpdateReservationResponse createUpdateReservationResponse() {
        return new UpdateReservationResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateReservationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.soap/AirlineService/", name = "UpdateOperation")
    public JAXBElement<UpdateReservationRequest> createUpdateOperation(UpdateReservationRequest value) {
        return new JAXBElement<UpdateReservationRequest>(_UpdateOperation_QNAME, UpdateReservationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.soap/AirlineService/", name = "AddOperationResponse")
    public JAXBElement<AddReservationResponse> createAddOperationResponse(AddReservationResponse value) {
        return new JAXBElement<AddReservationResponse>(_AddOperationResponse_QNAME, AddReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteReservationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.soap/AirlineService/", name = "DeleteOperation")
    public JAXBElement<DeleteReservationRequest> createDeleteOperation(DeleteReservationRequest value) {
        return new JAXBElement<DeleteReservationRequest>(_DeleteOperation_QNAME, DeleteReservationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.soap/AirlineService/", name = "GetOperation")
    public JAXBElement<GetReservationRequest> createGetOperation(GetReservationRequest value) {
        return new JAXBElement<GetReservationRequest>(_GetOperation_QNAME, GetReservationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.soap/AirlineService/", name = "UpdateOperationResponse")
    public JAXBElement<UpdateReservationResponse> createUpdateOperationResponse(UpdateReservationResponse value) {
        return new JAXBElement<UpdateReservationResponse>(_UpdateOperationResponse_QNAME, UpdateReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.soap/AirlineService/", name = "DeleteOperationResponse")
    public JAXBElement<DeleteReservationResponse> createDeleteOperationResponse(DeleteReservationResponse value) {
        return new JAXBElement<DeleteReservationResponse>(_DeleteOperationResponse_QNAME, DeleteReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddReservationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.soap/AirlineService/", name = "AddOperation")
    public JAXBElement<AddReservationRequest> createAddOperation(AddReservationRequest value) {
        return new JAXBElement<AddReservationRequest>(_AddOperation_QNAME, AddReservationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.soap/AirlineService/", name = "GetOperationResponse")
    public JAXBElement<GetReservationResponse> createGetOperationResponse(GetReservationResponse value) {
        return new JAXBElement<GetReservationResponse>(_GetOperationResponse_QNAME, GetReservationResponse.class, null, value);
    }

}

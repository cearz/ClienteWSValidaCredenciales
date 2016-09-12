/**
 * ImplLoginServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.cearz.ws.service;

public class ImplLoginServiceLocator extends org.apache.axis.client.Service implements pe.cearz.ws.service.ImplLoginService {

    public ImplLoginServiceLocator() {
    }


    public ImplLoginServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ImplLoginServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ImplLogin
    private java.lang.String ImplLogin_address = "http://localhost:8080/ValidaCredenciales/services/ImplLogin";

    public java.lang.String getImplLoginAddress() {
        return ImplLogin_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ImplLoginWSDDServiceName = "ImplLogin";

    public java.lang.String getImplLoginWSDDServiceName() {
        return ImplLoginWSDDServiceName;
    }

    public void setImplLoginWSDDServiceName(java.lang.String name) {
        ImplLoginWSDDServiceName = name;
    }

    public pe.cearz.ws.service.ImplLogin getImplLogin() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ImplLogin_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getImplLogin(endpoint);
    }

    public pe.cearz.ws.service.ImplLogin getImplLogin(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            pe.cearz.ws.service.ImplLoginSoapBindingStub _stub = new pe.cearz.ws.service.ImplLoginSoapBindingStub(portAddress, this);
            _stub.setPortName(getImplLoginWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setImplLoginEndpointAddress(java.lang.String address) {
        ImplLogin_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (pe.cearz.ws.service.ImplLogin.class.isAssignableFrom(serviceEndpointInterface)) {
                pe.cearz.ws.service.ImplLoginSoapBindingStub _stub = new pe.cearz.ws.service.ImplLoginSoapBindingStub(new java.net.URL(ImplLogin_address), this);
                _stub.setPortName(getImplLoginWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ImplLogin".equals(inputPortName)) {
            return getImplLogin();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.ws.cearz.pe", "ImplLoginService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.ws.cearz.pe", "ImplLogin"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ImplLogin".equals(portName)) {
            setImplLoginEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

/**
 * PdcsvcinfowsdlLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ca.primus.fussemailsso;

public class PdcsvcinfowsdlLocator extends org.apache.axis.client.Service implements ca.primus.fussemailsso.Pdcsvcinfowsdl {

    public PdcsvcinfowsdlLocator() {
    }


    public PdcsvcinfowsdlLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PdcsvcinfowsdlLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for pdcsvcinfowsdlPort
    private java.lang.String pdcsvcinfowsdlPort_address = "http://api-01.pvt.primus.ca/pdc_svc_info_dev2/index.php";

    public java.lang.String getpdcsvcinfowsdlPortAddress() {
        return pdcsvcinfowsdlPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String pdcsvcinfowsdlPortWSDDServiceName = "pdcsvcinfowsdlPort";

    public java.lang.String getpdcsvcinfowsdlPortWSDDServiceName() {
        return pdcsvcinfowsdlPortWSDDServiceName;
    }

    public void setpdcsvcinfowsdlPortWSDDServiceName(java.lang.String name) {
        pdcsvcinfowsdlPortWSDDServiceName = name;
    }

    public ca.primus.fussemailsso.PdcsvcinfowsdlPortType getpdcsvcinfowsdlPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(pdcsvcinfowsdlPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getpdcsvcinfowsdlPort(endpoint);
    }

    public ca.primus.fussemailsso.PdcsvcinfowsdlPortType getpdcsvcinfowsdlPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ca.primus.fussemailsso.PdcsvcinfowsdlBindingStub _stub = new ca.primus.fussemailsso.PdcsvcinfowsdlBindingStub(portAddress, this);
            _stub.setPortName(getpdcsvcinfowsdlPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setpdcsvcinfowsdlPortEndpointAddress(java.lang.String address) {
        pdcsvcinfowsdlPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ca.primus.fussemailsso.PdcsvcinfowsdlPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                ca.primus.fussemailsso.PdcsvcinfowsdlBindingStub _stub = new ca.primus.fussemailsso.PdcsvcinfowsdlBindingStub(new java.net.URL(pdcsvcinfowsdlPort_address), this);
                _stub.setPortName(getpdcsvcinfowsdlPortWSDDServiceName());
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
        if ("pdcsvcinfowsdlPort".equals(inputPortName)) {
            return getpdcsvcinfowsdlPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:pdcsvcinfowsdl", "pdcsvcinfowsdl");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:pdcsvcinfowsdl", "pdcsvcinfowsdlPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("pdcsvcinfowsdlPort".equals(portName)) {
            setpdcsvcinfowsdlPortEndpointAddress(address);
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

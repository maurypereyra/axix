<?xml version="1.0" encoding="ISO-8859-1"?><definitions xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:SOAP-ENC="http://schemas.xmlsoap.org/soap/encoding/" xmlns:si="http://soapinterop.org/xsd" xmlns:tns="urn:pdcsvcinfowsdl" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns="http://schemas.xmlsoap.org/wsdl/" targetNamespace="urn:pdcsvcinfowsdl"><types><xsd:schema targetNamespace="urn:pdcsvcinfowsdl"
>
 <xsd:import namespace="http://schemas.xmlsoap.org/soap/encoding/" />
 <xsd:import namespace="http://schemas.xmlsoap.org/wsdl/" />
 <xsd:complexType name="wanipList">
  <xsd:complexContent>
   <xsd:restriction base="SOAP-ENC:Array">
    <xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="xsd:string[]"/>
   </xsd:restriction>
  </xsd:complexContent>
 </xsd:complexType>
 <xsd:complexType name="deviceLabelsList">
  <xsd:complexContent>
   <xsd:restriction base="SOAP-ENC:Array">
    <xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="xsd:string[]"/>
   </xsd:restriction>
  </xsd:complexContent>
 </xsd:complexType>
 <xsd:complexType name="dslinfobymctrlList">
  <xsd:all>
   <xsd:element name="status" type="xsd:string"/>
   <xsd:element name="message" type="xsd:string"/>
   <xsd:element name="accountInfo" type="tns:accountInfo"/>
   <xsd:element name="modemInfo" type="tns:modemInfo"/>
  </xsd:all>
 </xsd:complexType>
 <xsd:complexType name="pdcStaticIPinfo">
  <xsd:all>
   <xsd:element name="NetworkIP" type="xsd:string"/>
   <xsd:element name="RouterIP" type="xsd:string"/>
  </xsd:all>
 </xsd:complexType>
 <xsd:complexType name="accountInfo">
  <xsd:all>
   <xsd:element name="accountNum" type="xsd:string"/>
   <xsd:element name="province" type="xsd:string"/>
   <xsd:element name="phone" type="xsd:string"/>
   <xsd:element name="orderType" type="xsd:string"/>
   <xsd:element name="carrier" type="xsd:string"/>
   <xsd:element name="PDCStaticIPinfo" type="tns:pdcStaticIPinfo"/>
  </xsd:all>
 </xsd:complexType>
 <xsd:complexType name="modemInfo">
  <xsd:all>
   <xsd:element name="serial" type="xsd:string"/>
   <xsd:element name="mac" type="xsd:string"/>
   <xsd:element name="modemtype" type="xsd:string"/>
   <xsd:element name="manufacturer" type="xsd:string"/>
   <xsd:element name="firmwareVersion" type="xsd:string"/>
   <xsd:element name="loginName" type="xsd:string"/>
   <xsd:element name="wanIP" type="tns:wanipList"/>
   <xsd:element name="lastInform" type="xsd:string"/>
   <xsd:element name="DownstreamCurrRate" type="xsd:string"/>
   <xsd:element name="UpstreamCurrRate" type="xsd:string"/>
   <xsd:element name="UpstreamNoiseMargin" type="xsd:string"/>
   <xsd:element name="DownstreamNoiseMargin" type="xsd:string"/>
   <xsd:element name="deviceLabels" type="tns:deviceLabelsList"/>
  </xsd:all>
 </xsd:complexType>
 <xsd:complexType name="pmNasInfoRec">
  <xsd:all>
   <xsd:element name="nas_user_name" type="xsd:string"/>
   <xsd:element name="nas_master_control" type="xsd:string"/>
   <xsd:element name="nas_start_time" type="xsd:string"/>
   <xsd:element name="nas_end_time" type="xsd:string"/>
  </xsd:all>
 </xsd:complexType>
 <xsd:complexType name="pmTPIAInfoRec">
  <xsd:all>
   <xsd:element name="mac" type="xsd:string"/>
   <xsd:element name="ip" type="xsd:string"/>
   <xsd:element name="company" type="xsd:string"/>
   <xsd:element name="begintime" type="xsd:string"/>
   <xsd:element name="endtime" type="xsd:string"/>
  </xsd:all>
 </xsd:complexType>
 <xsd:complexType name="billInfoRec">
  <xsd:all>
   <xsd:element name="balancedue" type="xsd:string"/>
   <xsd:element name="balanceDue_asofdate" type="xsd:string"/>
   <xsd:element name="currentInvoice_invoiceDueDate" type="xsd:string"/>
   <xsd:element name="lastPayment_amountReceived" type="xsd:string"/>
   <xsd:element name="lastPayment_dateReceived" type="xsd:string"/>
   <xsd:element name="currentInvoice_amountDue" type="xsd:string"/>
   <xsd:element name="balanceDue_amountBalance" type="xsd:string"/>
  </xsd:all>
 </xsd:complexType>
 <xsd:complexType name="pmNasInfoList">
  <xsd:complexContent>
   <xsd:restriction base="SOAP-ENC:Array">
    <xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="tns:pmNasInfoRec[]"/>
   </xsd:restriction>
  </xsd:complexContent>
 </xsd:complexType>
 <xsd:complexType name="pmTPIAInfoList">
  <xsd:complexContent>
   <xsd:restriction base="SOAP-ENC:Array">
    <xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="tns:pmTPIAInfoRec[]"/>
   </xsd:restriction>
  </xsd:complexContent>
 </xsd:complexType>
 <xsd:complexType name="billInfoList">
  <xsd:complexContent>
   <xsd:restriction base="SOAP-ENC:Array">
    <xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="tns:billInfoRec[]"/>
   </xsd:restriction>
  </xsd:complexContent>
 </xsd:complexType>
 <xsd:complexType name="dslinfobyPMList">
  <xsd:all>
   <xsd:element name="status" type="xsd:string"/>
   <xsd:element name="message" type="xsd:string"/>
   <xsd:element name="pmInfo" type="tns:pmInfo"/>
  </xsd:all>
 </xsd:complexType>
 <xsd:complexType name="pmInfo">
  <xsd:all>
   <xsd:element name="loginName" type="xsd:string"/>
   <xsd:element name="hasPMCaptivePortal" type="xsd:string"/>
  </xsd:all>
 </xsd:complexType>
</xsd:schema>
</types><message name="getDSLInfoByMasterCtrlRequest"><part name="masterctrl" type="xsd:string" /></message><message name="getDSLInfoByMasterCtrlResponse"><part name="result" type="tns:dslinfobymctrlList" /></message><message name="getDSLInfoByPMIPRequest"><part name="ipaddress" type="xsd:string" /></message><message name="getDSLInfoByPMIPResponse"><part name="result" type="tns:dslinfobyPMList" /></message><message name="getSSOStringRequest"><part name="appid" type="xsd:string" /><part name="uid" type="xsd:string" /><part name="pid" type="xsd:string" /><part name="email" type="xsd:string" /></message><message name="getSSOStringResponse"><part name="status" type="xsd:string" /><part name="ssos" type="xsd:string" /><part name="msg" type="xsd:string" /></message><message name="getPCSEmailsByIPandTimeRequest"><part name="ip" type="xsd:string" /><part name="time" type="xsd:string" /></message><message name="getPCSEmailsByIPandTimeResponse"><part name="status" type="xsd:string" /><part name="email" type="xsd:string" /><part name="language" type="xsd:string" /><part name="mastercontrol" type="xsd:string" /><part name="msg" type="xsd:string" /></message><message name="getNasInfoByIPandTimePeriodRequest"><part name="appid" type="xsd:string" /><part name="uid" type="xsd:string" /><part name="pid" type="xsd:string" /><part name="ip" type="xsd:string" /><part name="startDate" type="xsd:string" /><part name="endDate" type="xsd:string" /></message><message name="getNasInfoByIPandTimePeriodResponse"><part name="status" type="xsd:string" /><part name="nasInfoList" type="tns:pmNasInfoList" /><part name="tpiaInfoList" type="tns:pmTPIAInfoList" /><part name="msg" type="xsd:string" /></message><message name="getBillInfoByAcctRequest"><part name="appid" type="xsd:string" /><part name="uid" type="xsd:string" /><part name="pid" type="xsd:string" /><part name="acct" type="xsd:string" /></message><message name="getBillInfoByAcctResponse"><part name="status" type="xsd:string" /><part name="billInfo" type="tns:billInfoRec" /><part name="msg" type="xsd:string" /></message><message name="getFusemailLDAPRequest"><part name="appid" type="xsd:string" /><part name="uid" type="xsd:string" /><part name="pid" type="xsd:string" /><part name="eid" type="xsd:string" /><part name="epd" type="xsd:string" /></message><message name="getFusemailLDAPResponse"><part name="status" type="xsd:string" /><part name="isAuthenticated" type="xsd:string" /><part name="msg" type="xsd:string" /></message><message name="getPcsAccInfoByMACandTimeRequest"><part name="mac_address" type="xsd:string" /><part name="time" type="xsd:string" /></message><message name="getPcsAccInfoByMACandTimeResponse"><part name="status" type="xsd:string" /><part name="client_no" type="xsd:string" /><part name="client_name" type="xsd:string" /><part name="client_address" type="xsd:string" /><part name="email_addresses" type="xsd:string" /><part name="equipment_name" type="xsd:string" /><part name="serial_no" type="xsd:string" /><part name="language_indicator" type="xsd:string" /><part name="msg" type="xsd:string" /></message><portType name="pdcsvcinfowsdlPortType"><operation name="getDSLInfoByMasterCtrl"><input message="tns:getDSLInfoByMasterCtrlRequest"/><output message="tns:getDSLInfoByMasterCtrlResponse"/></operation><operation name="getDSLInfoByPMIP"><input message="tns:getDSLInfoByPMIPRequest"/><output message="tns:getDSLInfoByPMIPResponse"/></operation><operation name="getSSOString"><input message="tns:getSSOStringRequest"/><output message="tns:getSSOStringResponse"/></operation><operation name="getPCSEmailsByIPandTime"><input message="tns:getPCSEmailsByIPandTimeRequest"/><output message="tns:getPCSEmailsByIPandTimeResponse"/></operation><operation name="getNasInfoByIPandTimePeriod"><input message="tns:getNasInfoByIPandTimePeriodRequest"/><output message="tns:getNasInfoByIPandTimePeriodResponse"/></operation><operation name="getBillInfoByAcct"><input message="tns:getBillInfoByAcctRequest"/><output message="tns:getBillInfoByAcctResponse"/></operation><operation name="getFusemailLDAP"><input message="tns:getFusemailLDAPRequest"/><output message="tns:getFusemailLDAPResponse"/></operation><operation name="getPcsAccInfoByMACandTime"><input message="tns:getPcsAccInfoByMACandTimeRequest"/><output message="tns:getPcsAccInfoByMACandTimeResponse"/></operation></portType><binding name="pdcsvcinfowsdlBinding" type="tns:pdcsvcinfowsdlPortType"><soap:binding style="rpc" transport="http://schemas.xmlsoap.org/soap/http"/><operation name="getDSLInfoByMasterCtrl"><soap:operation soapAction="urn:pdcsvcinfowsdl#getDSLInfoByMasterCtrl" style="rpc"/><input><soap:body use="encoded" namespace="urn:pdcsvcinfowsdl" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input><output><soap:body use="encoded" namespace="urn:pdcsvcinfowsdl" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output></operation><operation name="getDSLInfoByPMIP"><soap:operation soapAction="urn:pdcsvcinfowsdl#getDSLInfoByPMIP" style="rpc"/><input><soap:body use="encoded" namespace="urn:pdcsvcinfowsdl" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input><output><soap:body use="encoded" namespace="urn:pdcsvcinfowsdl" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output></operation><operation name="getSSOString"><soap:operation soapAction="urn:pdcsvcinfowsdl#getSSOString" style="rpc"/><input><soap:body use="encoded" namespace="urn:pdcsvcinfowsdl" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input><output><soap:body use="encoded" namespace="urn:pdcsvcinfowsdl" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output></operation><operation name="getPCSEmailsByIPandTime"><soap:operation soapAction="urn:pdcsvcinfowsdl#getPCSEmailsByIPandTime" style="rpc"/><input><soap:body use="encoded" namespace="urn:pdcsvcinfowsdl" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input><output><soap:body use="encoded" namespace="urn:pdcsvcinfowsdl" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output></operation><operation name="getNasInfoByIPandTimePeriod"><soap:operation soapAction="urn:pdcsvcinfowsdl#getNasInfoByIPandTimePeriod" style="rpc"/><input><soap:body use="encoded" namespace="urn:pdcsvcinfowsdl" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input><output><soap:body use="encoded" namespace="urn:pdcsvcinfowsdl" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output></operation><operation name="getBillInfoByAcct"><soap:operation soapAction="urn:pdcsvcinfowsdl#getBillInfoByAcct" style="rpc"/><input><soap:body use="encoded" namespace="urn:pdcsvcinfowsdl" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input><output><soap:body use="encoded" namespace="urn:pdcsvcinfowsdl" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output></operation><operation name="getFusemailLDAP"><soap:operation soapAction="urn:pdcsvcinfowsdl#getFusemailLDAP" style="rpc"/><input><soap:body use="encoded" namespace="urn:pdcsvcinfowsdl" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input><output><soap:body use="encoded" namespace="urn:pdcsvcinfowsdl" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output></operation><operation name="getPcsAccInfoByMACandTime"><soap:operation soapAction="urn:pdcsvcinfowsdl#getPCSEmailsByMACandTime" style="rpc"/><input><soap:body use="encoded" namespace="urn:pdcsvcinfowsdl" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input><output><soap:body use="encoded" namespace="urn:pdcsvcinfowsdl" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output></operation></binding><service name="pdcsvcinfowsdl"><port name="pdcsvcinfowsdlPort" binding="tns:pdcsvcinfowsdlBinding"><soap:address location="http://api-01.pvt.primus.ca/pdc_svc_info_dev2/index.php"/></port></service></definitions>
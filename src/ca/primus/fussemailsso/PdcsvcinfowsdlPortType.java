/**
 * PdcsvcinfowsdlPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ca.primus.fussemailsso;

public interface PdcsvcinfowsdlPortType extends java.rmi.Remote {
    public ca.primus.fussemailsso.DslinfobymctrlList getDSLInfoByMasterCtrl(java.lang.String masterctrl) throws java.rmi.RemoteException;
    public ca.primus.fussemailsso.DslinfobyPMList getDSLInfoByPMIP(java.lang.String ipaddress) throws java.rmi.RemoteException;
    public void getSSOString(java.lang.String appid, java.lang.String uid, java.lang.String pid, java.lang.String email, javax.xml.rpc.holders.StringHolder status, javax.xml.rpc.holders.StringHolder ssos, javax.xml.rpc.holders.StringHolder msg) throws java.rmi.RemoteException;
    public void getPCSEmailsByIPandTime(java.lang.String ip, java.lang.String time, javax.xml.rpc.holders.StringHolder status, javax.xml.rpc.holders.StringHolder email, javax.xml.rpc.holders.StringHolder language, javax.xml.rpc.holders.StringHolder mastercontrol, javax.xml.rpc.holders.StringHolder msg) throws java.rmi.RemoteException;
    public void getNasInfoByIPandTimePeriod(java.lang.String appid, java.lang.String uid, java.lang.String pid, java.lang.String ip, java.lang.String startDate, java.lang.String endDate, javax.xml.rpc.holders.StringHolder status, ca.primus.fussemailsso.holders.PmNasInfoListHolder nasInfoList, ca.primus.fussemailsso.holders.PmTPIAInfoListHolder tpiaInfoList, javax.xml.rpc.holders.StringHolder msg) throws java.rmi.RemoteException;
    public void getBillInfoByAcct(java.lang.String appid, java.lang.String uid, java.lang.String pid, java.lang.String acct, javax.xml.rpc.holders.StringHolder status, ca.primus.fussemailsso.holders.BillInfoRecHolder billInfo, javax.xml.rpc.holders.StringHolder msg) throws java.rmi.RemoteException;
    public void getFusemailLDAP(java.lang.String appid, java.lang.String uid, java.lang.String pid, java.lang.String eid, java.lang.String epd, javax.xml.rpc.holders.StringHolder status, javax.xml.rpc.holders.StringHolder isAuthenticated, javax.xml.rpc.holders.StringHolder msg) throws java.rmi.RemoteException;
    public void getPcsAccInfoByMACandTime(java.lang.String mac_address, java.lang.String time, javax.xml.rpc.holders.StringHolder status, javax.xml.rpc.holders.StringHolder client_no, javax.xml.rpc.holders.StringHolder client_name, javax.xml.rpc.holders.StringHolder client_address, javax.xml.rpc.holders.StringHolder email_addresses, javax.xml.rpc.holders.StringHolder equipment_name, javax.xml.rpc.holders.StringHolder serial_no, javax.xml.rpc.holders.StringHolder language_indicator, javax.xml.rpc.holders.StringHolder msg) throws java.rmi.RemoteException;
}

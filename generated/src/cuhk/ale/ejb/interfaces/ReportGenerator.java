/*
 * Generated by XDoclet - Do not edit!
 */
package cuhk.ale.ejb.interfaces;

/**
 * Remote interface for ReportGenerator.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version ${version}
 */
public interface ReportGenerator
   extends javax.ejb.EJBObject
{
   /**
    * Business method
    */
   public epcglobal.ale.ECReports generateReports( cuhk.ale.EventCycle eventCycle )
      throws cuhk.ale.exceptions.ParseURIException, java.rmi.RemoteException;

}
/*
 * Generated by XDoclet - Do not edit!
 */
package cuhk.ale.ejb.interfaces;

/**
 * Local interface for ALEService.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version ${version}
 */
public interface ALEServiceLocal
   extends javax.ejb.EJBLocalObject
{

   public void define( java.lang.String specName,epcglobal.ale.ECSpec spec ) throws cuhk.ale.exceptions.DuplicateNameException, cuhk.ale.exceptions.ECSpecValidationException, cuhk.ale.exceptions.SecurityException, cuhk.ale.exceptions.ImplementationException;

   public void undefine( java.lang.String specName ) throws cuhk.ale.exceptions.NoSuchNameException, cuhk.ale.exceptions.SecurityException, cuhk.ale.exceptions.ImplementationException;

   public epcglobal.ale.ECSpec getECSpec( java.lang.String specName ) throws cuhk.ale.exceptions.NoSuchNameException, cuhk.ale.exceptions.SecurityException, cuhk.ale.exceptions.ImplementationException;

   public java.util.List getECSpecNames(  ) throws cuhk.ale.exceptions.SecurityException, cuhk.ale.exceptions.ImplementationException;

   public void subscribe( java.lang.String specName,java.lang.String notificationURI ) throws cuhk.ale.exceptions.NoSuchNameException, cuhk.ale.exceptions.InvalidURIException, cuhk.ale.exceptions.DuplicateSubscriptionException, cuhk.ale.exceptions.SecurityException, cuhk.ale.exceptions.ImplementationException;

   public void unsubscribe( java.lang.String specName,java.lang.String notificationURI ) throws cuhk.ale.exceptions.NoSuchNameException, cuhk.ale.exceptions.NoSuchSubscriberException, cuhk.ale.exceptions.InvalidURIException, cuhk.ale.exceptions.SecurityException, cuhk.ale.exceptions.ImplementationException;

   public epcglobal.ale.ECReports poll( java.lang.String specName ) throws cuhk.ale.exceptions.NoSuchNameException, cuhk.ale.exceptions.SecurityException, cuhk.ale.exceptions.ImplementationException;

   public epcglobal.ale.ECReports immediate( epcglobal.ale.ECSpec spec ) throws cuhk.ale.exceptions.ECSpecValidationException, cuhk.ale.exceptions.SecurityException, cuhk.ale.exceptions.ImplementationException;

   public java.util.List getSubscribers( java.lang.String specName ) throws cuhk.ale.exceptions.NoSuchNameException, cuhk.ale.exceptions.SecurityException, cuhk.ale.exceptions.ImplementationException;

   public java.lang.String getStandardVersion(  ) ;

   public java.lang.String getVendorVersion(  ) ;

   public void startTrigger( java.lang.String specName ) throws cuhk.ale.exceptions.ImplementationException;

   public void stopTrigger( java.lang.String specName ) throws cuhk.ale.exceptions.ImplementationException;

}
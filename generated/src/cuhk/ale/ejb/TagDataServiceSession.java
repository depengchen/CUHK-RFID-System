/*
 * Generated by XDoclet - Do not edit!
 */
package cuhk.ale.ejb;

/**
 * Session layer for TagDataService.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version ${version}
 */
public class TagDataServiceSession
   extends cuhk.ale.ejb.TagDataServiceBean
   implements javax.ejb.SessionBean
{
   public void ejbActivate() 
   {

   }

   public void ejbPassivate() 
   {
   }

   public void setSessionContext(javax.ejb.SessionContext ctx) 
   {
   }

   public void unsetSessionContext() 
   {
   }

   public void ejbRemove() 
   {
   }

   public void ejbCreate() throws javax.ejb.CreateException
   {
   }

      private static cuhk.ale.dao.TagDataServiceDAO dao = null;

   protected static synchronized cuhk.ale.dao.TagDataServiceDAO getDao()
   {
      if (dao != null) {
         return dao;
      } else {

         dao = (cuhk.ale.dao.TagDataServiceDAO) new cuhk.ale.dao.TagDataServiceDAOImpl();

         dao.init();
         return dao;
      }
   }

    public java.util.List getReaders(java.lang.String tagID)
    {

        return getDao().getReaders(tagID);

    }

}
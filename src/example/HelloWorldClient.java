package example;

import ca.primus.fussemailsso.PdcsvcinfowsdlLocator;

import javax.xml.rpc.holders.StringHolder;

public class HelloWorldClient {
  public static void main(String[] argv) {
    try {
      PdcsvcinfowsdlLocator locator = new PdcsvcinfowsdlLocator();
      //Activator service = locator.get();
      // If authorization is required
      //((PdcsvcinfowsdlBindingStub)service).setUsername("user3");
      //((PdcsvcinfowsdlBindingStub)service).setPassword("pass3");
      // invoke business method
      locator.getpdcsvcinfowsdlPort().getSSOString("","","","", new StringHolder(""), new StringHolder(""), new StringHolder(""));
        //
        // service.businessMethod();


    } catch (javax.xml.rpc.ServiceException ex) {
      System.out.println(ex.getStackTrace());
    } catch (Exception ex) {
      System.out.println(ex.getStackTrace());
    }
  }
}

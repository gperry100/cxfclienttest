
package traffic.wcf.bss.com.bskyb.mamrequest;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.5.1
 * 2015-04-29T16:39:29.626+01:00
 * Generated source version: 2.5.1
 */

@WebFault(name = "BusinessException", targetNamespace = "http://BSkyB.com.BSS.Common")
public class IRequestGetBusinessExceptionFaultFaultMessage extends Exception {
    
    private common.bss.com.bskyb.BusinessException businessException;

    public IRequestGetBusinessExceptionFaultFaultMessage() {
        super();
    }
    
    public IRequestGetBusinessExceptionFaultFaultMessage(String message) {
        super(message);
    }
    
    public IRequestGetBusinessExceptionFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IRequestGetBusinessExceptionFaultFaultMessage(String message, common.bss.com.bskyb.BusinessException businessException) {
        super(message);
        this.businessException = businessException;
    }

    public IRequestGetBusinessExceptionFaultFaultMessage(String message, common.bss.com.bskyb.BusinessException businessException, Throwable cause) {
        super(message, cause);
        this.businessException = businessException;
    }

    public common.bss.com.bskyb.BusinessException getFaultInfo() {
        return this.businessException;
    }
}

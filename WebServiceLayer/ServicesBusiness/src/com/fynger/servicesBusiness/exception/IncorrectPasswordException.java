/**
 * 
 */
package com.fynger.servicesBusiness.exception;

import com.fynger.generic.exception.ApplicationException;
import com.fynger.generic.exception.base.ExceptionDetail;

/**
 * @author Rishi
 *
 */
@SuppressWarnings("serial")
public class IncorrectPasswordException extends ApplicationException{
	
	protected Throwable throwable = null;
	
	String error = "";
	
	/**
     * Constructor for IncorrectPasswordException
     * @param msg - Message associated with the exception
     */
    public IncorrectPasswordException(String msg) {
    	super(msg);
    	error = msg;
    }

    /**
     * Initializes a newly created <code>IncorrectPasswordException</code> object.
     * @param	msg - the message associated with the Exception.
     * @param   cause - Throwable object
     */
    public IncorrectPasswordException(String msg, Throwable cause) {
    	super(msg, cause);
    }
    
    /**
     * Constructor for IncorrectPasswordException to set exceptionDetail
     */
    public IncorrectPasswordException(ExceptionDetail exceptionDetail) {
            super(exceptionDetail);
    }
    
    /**
     * Returns the error message string of the exception object.
     *
     * @return  the error message string of this <code>Exception</code>
     *          object if it was <code>Exception</code> with an
     *          error message string; or <code>null</code> if it was
     *          <code>Exception</code> created} with no error message.
     *
     */
    public String getMessage() {
    	    	
        return error;
    }

}

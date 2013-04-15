package i5.las2peer.httpConnector.coder;

/**
 * Basic Exception for all coding related exceptions in this package
 *
 * @author Holger Janßen
 * @version $Revision: 1.2 $, $Date: 2013/01/23 10:04:54 $
 */

public class CodingException extends Exception
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5836170373639579067L;

	
	/**
	 * create a new exception
	 */
	public CodingException () {
		super ();
	}
	
	/**
	 * create a new exception
	 * @param message
	 */
	public CodingException ( String message ) {
		super ( message );
	}
	
	/**
	 * create a new Exception
	 * @param message
	 * @param cause
	 */
	public CodingException ( String message, Exception cause ) {
		super ( message, cause );
	}
	
}


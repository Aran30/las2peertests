package i5.las2peer.api.execution;

/**
 * Thrown if the service is temporarily not available.
 */
public class ServiceNotAvailableException extends ServiceInvocationException {

	private static final long serialVersionUID = 1L;

	public ServiceNotAvailableException() {

	}

	public ServiceNotAvailableException(String message) {
		super(message);
	}

	public ServiceNotAvailableException(Throwable cause) {
		super(cause);
	}

	public ServiceNotAvailableException(String message, Throwable cause) {
		super(message, cause);
	}
}

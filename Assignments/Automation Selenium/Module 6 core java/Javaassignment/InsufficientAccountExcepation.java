package Javaassignment;

public class InsufficientAccountExcepation extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String message;

	public void  InsufficientAccountException(String message) {
		this.message = message;

	}

	public String getMessage() {

		return this.message;
	}

}

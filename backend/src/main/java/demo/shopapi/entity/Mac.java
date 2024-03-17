package demo.shopapi.entity;

import java.io.Serializable;

//@Data
public class Mac implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5239081311526715105L;

	/**
	 * 
	 */

    private String mac;

    private String vendor;

    public Mac() {
    }

	@Override
	public String toString() {
		return "Mac [" + (mac != null ? "mac=" + mac + ", " : "") + (vendor != null ? "vendor=" + vendor : "") + "]";
	}
    
}

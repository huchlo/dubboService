/**
 * @author ivy	ivy@ivyb2b.com
 * @author yansb
 */
package com;

import java.io.Serializable;

/**
 * @author yansb
 * 2014-2-13
 *
 */
public class Property implements Serializable {

	private static final long serialVersionUID = 3112643817376688712L;
	
	private String systemCode;
	
	private String systemToke;

	public String getSystemCode() {
		return systemCode;
	}

	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}

	public String getSystemToke() {
		return systemToke;
	}

	public void setSystemToke(String systemToke) {
		this.systemToke = systemToke;
	}

}

package serilization;

import java.io.Serializable;

public class AppleProduct implements Serializable {

	private static final long serialVersionUID = 1234567L;

	public String headphonePort;
	public String thunderboltPort;


	public String getHeadphonePort() {
		return headphonePort;
	}

	public String getThunderboltPort() {
		return thunderboltPort;
	}
}

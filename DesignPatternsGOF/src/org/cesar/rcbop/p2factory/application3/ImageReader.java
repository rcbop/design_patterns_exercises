package org.cesar.rcbop.p2factory.application3;

import java.io.InputStream;

public abstract class ImageReader {

	private InputStream is;

	protected ImageReader(InputStream is) {
		this.setIs(is);
	}

	public InputStream getIs() {
		return is;
	}

	public void setIs(InputStream is) {
		this.is = is;
	}
}

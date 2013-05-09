package org.cesar.rcbop.p2factory.application3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ImageInputStreamProcessor {

	public boolean isGIF() {
		//.....
		return true;
	}
	
	public boolean isJPEG() {
		//....
		return false;
	}

	public InputStream getInputStream() throws FileNotFoundException {
		return new FileInputStream(new File("image.jpeg"));
	}

	

}

package org.cesar.rcbop.p2factory.application3;

import java.io.FileNotFoundException;

public class ImageReaderFactory {
	public static ImageReader imageReaderFactoryMethod(
			ImageInputStreamProcessor iisp) {
		ImageReader product = null;
		try {
			if (iisp.isGIF()) {
				product = new GifReader(iisp.getInputStream());
			} else if (iisp.isJPEG()) {
				product = new JpegReader(iisp.getInputStream());
			} else {
				throw new IllegalArgumentException("Unknown image type.");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return product;
	}
}
package org.cesar.rcbop.p1singleton.application5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StaticBlockSingleton {

	private static final StaticBlockSingleton instance;

	private static final String FILE_PATH = "File.txt";

	private BufferedReader in;

	private StaticBlockSingleton() throws FileNotFoundException {
		in = new BufferedReader(new FileReader(FILE_PATH));
	}

	/**
	 * Static block with eager initialization is good for IO
	 */
	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (IOException e) {
			throw new RuntimeException("Error getting external resource", e);
		}
	}

	public static StaticBlockSingleton getInstance() {
		return instance;
	}
	
	public ArrayList<String> read() throws IOException {
		ArrayList<String> rtn = new ArrayList<>();
		while (in.ready()) {
			rtn.add(in.readLine());
		}
		return rtn;
	}
}

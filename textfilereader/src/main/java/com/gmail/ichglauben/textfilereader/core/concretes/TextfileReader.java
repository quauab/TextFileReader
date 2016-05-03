package com.gmail.ichglauben.textfilereader.core.concretes;

import java.io.File;
import java.nio.file.Path;
import java.util.List;

import com.gmail.ichglauben.textfilereader.core.abstracts.AbstractTextfileReader;

public class TextfileReader extends AbstractTextfileReader {
	public static List<String> readTextfile(Path path) {
		return readFile(path);
	}
	
	public static List<String> readTextfile(File file) {
		return readFile(file);
	}
	
	public static List<String> readTextfile(String filePath) {
		return readFile(filePath);
	}
	
	public String toString() { return "Text File Reader"; }
}

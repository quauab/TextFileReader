package com.gmail.ichglauben.textfilereader;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.gmail.ichglauben.textfilereader.core.concretes.TextfileReader;
import com.gmail.ichglauben.textfilereader.core.utils.abstracts.CustomClass;
import com.gmail.ichglauben.textfilereader.core.utils.concretes.TextFileValidator;

public class App extends CustomClass {
	public static void main(String[] args) {
		ClassLoader loader = App.class.getClassLoader();
		File f1 = new File(loader.getResource("textfile1.txt").getFile());
		File f2 = new File(loader.getResource("xmlfile1.xml").getFile());
		
		List<String> l1 = null, l2 = null;
		
		if (null != (l1 = TextfileReader.readTextfile(f1))) {
			for (String line:l1) {
				print(line);
			}
		}
		
		if (null != (l2 = TextfileReader.readTextfile(f2))) {
			for (String line:l2) {
				print(line);
			}
		}
	}
}

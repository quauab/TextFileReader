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
		String f1 = "D:\\_\\Dropbox\\Private\\reference\\_local_places.txt";
		File f2 = new File(f1);
		Path f3 = Paths.get(f1);
		Path f4 = Paths.get("D:\\_\\Dropbox\\Private\\reference\\BTBook.pdf");
				
//		testTextFileValidator(f1, f2, f3, f4);		
		testTextfileReader(f1);		
	}

	private static void testTextfileReader(String f1) {
		List<String> lines = null;		
		if (null != (lines = TextfileReader.readTextfile(f1))) {
			for (String line : lines) {
				print(line);
			}
		}
	}

	private static void testTextFileValidator(String f1, File f2, Path f3, Path f4) {
		print("f1 is a text file:  " + TextFileValidator.valid(f1));
		print(f2.getName() + " is a text file:  " + TextFileValidator.valid(f2));
		print(f3.getFileName() + " is a text file:  " + TextFileValidator.valid(f3));
		print(f4.getFileName() + " is not a text file:  " + (TextFileValidator.valid(f4) == false));
	}
}

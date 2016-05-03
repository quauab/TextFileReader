package com.gmail.ichglauben.textfilereader.core.abstracts;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import com.gmail.ichglauben.textfilereader.core.utils.concretes.TextFileValidator;

public abstract class AbstractTextfileReader {

	protected static List<String> readFile(File file) {
		Charset charset = Charset.forName("ISO-8859-1");
		if (null != file) {
			if (file.exists() && file.isFile() && TextFileValidator.valid(file)) {
				try {
					return Files.readAllLines(file.toPath(), charset);
				} catch (IOException ioe) {
					return null;
				}
			}
		}
		return null;
	}

	protected static List<String> readFile(Path file) {
		Charset charset = Charset.forName("ISO-8859-1");
		if (null != file) {
			if (file.toFile().exists() && file.toFile().isFile() && TextFileValidator.valid(file)) {
				try {
					return Files.readAllLines(file, charset);
				} catch (IOException ioe) {
					return null;
				}
			}
		}
		return null;
	}

	protected static List<String> readFile(String path) {
		Charset charset = Charset.forName("ISO-8859-1");
		File file = null;
		if (null != path) {
			if (null != (file = new File(path))) {
				if (file.exists() && file.isFile() && TextFileValidator.valid(file)) {
					try {
						return Files.readAllLines(file.toPath(), charset);
					} catch (IOException ioe) {
						return null;
					}
				}
			}
		}
		return null;
	}

	public String toString() {
		return "Abstract Text File Reader";
	}

}

package com.gmail.ichglauben.textfilereader.core.utils.concretes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextFileValidator {
	private TextFileValidator() {
		super();
	}

	public static boolean valid(File file) {
		if (null != file && file.exists() && file.isFile()) {
			try {
				String type = Files.probeContentType(file.toPath());
				if (null != type) {
					return (type.equalsIgnoreCase("text/plain") && validTextFileExtension(file));
				}
			} catch (IOException x) {
				return false;
			}
		}
		return false;
	}

	public static boolean valid(Path path) {
		if (null != path && path.toFile().exists() && path.toFile().isFile()) {
			try {
				String type = Files.probeContentType(path);
				if (null != type) {
					return (type.equalsIgnoreCase("text/plain") && validTextFileExtension(path));
				}
			} catch (IOException x) {
				return false;
			}
		}
		return false;
	}

	public static boolean valid(String file) {
		Path path = null;
		if (null != file) {
			if (null != (path = Paths.get(file))) {
				if (path.toFile().isFile()) {
					try {
						String type = Files.probeContentType(path);
						if (null != type) {
							return (type.equalsIgnoreCase("text/plain") && validTextFileExtension(file));
						}
					} catch (IOException x) {
						return false;
					}
				}
			}
		}
		return false;
	}

	private static boolean validTextFileExtension(Path file) {
		return file.getFileName().toString().endsWith(".txt");
	}

	private static boolean validTextFileExtension(File file) {
		return file.toPath().getFileName().toString().endsWith(".txt");
	}

	private static boolean validTextFileExtension(String file) {
		return Paths.get(file).getFileName().toString().endsWith(".txt");
	}

	public String toString() {
		return "Text File Reader";
	}

}
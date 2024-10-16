package de.hup.webjava;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class IO {
	public static void createFile(String content) {
		try {
			var file = new File("index.htm");

			if (file.exists()) {
				file.delete();
			}

			file.createNewFile();
			Files.writeString(Path.of(file.getPath()), content);
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}

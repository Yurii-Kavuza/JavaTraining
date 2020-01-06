package com.practicaljava.lesson16.tryit;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashMap;
import java.util.Map;

public class ReadZip2 {

	public static void main(String[] args) throws IOException {
		Path zipfile = Paths.get("Desktop.zip");
		Map<String, String> env = new HashMap<>();
		env.put("create", "true");
		FileSystem fs = FileSystems.newFileSystem(zipfile, (ClassLoader) null);
		Files.walkFileTree(fs.getPath("/"), new SimpleFileVisitor<Path>()
		{
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
					throws IOException{
				System.out.println(file);
				return FileVisitResult.CONTINUE;
			}
		});	
	}	
}

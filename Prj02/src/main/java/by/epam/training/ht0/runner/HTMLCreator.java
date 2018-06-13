package by.epam.training.ht0.runner;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class HTMLCreator {

	public final static String HTML = "MP3Catalog.html";

	public static void writeHTML(Map<String, Map<String, List<String>>> htmlMap) {
		try (FileWriter writer = new FileWriter(new File(HTML))) {
			writer.write(
					"<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n<meta charset=\"UTF-8\">\n<title>List of MP3 files</title>\n</head>\n\n<body>\n\n");
			for (Map.Entry<String, Map<String, List<String>>> musician : htmlMap.entrySet()) {
				writer.write("<div><h3>" + "Musician: " + musician.getKey() + "</h3>\n");
				for (Map.Entry<String, List<String>> album : musician.getValue().entrySet()) {
					writer.write("<div><h5>" + "Album: " + album.getKey() + "</h5>\n");
					for (String tagInformation : album.getValue()) {
						writer.write(tagInformation + "\n");
					}
					writer.write("</div>\n");
				}
				writer.write("</div>\n\n");
			}
			writer.write("</body>\n</html>");
		} catch (IOException e) {
			System.out.println("Can't make a record " + e.getMessage());
		}
	}
}

package by.epam.training.ht0.runner;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {

		Set<String> inputFolders = new HashSet<String>(Arrays.asList(args));
		MP3 mp3File = new MP3();
		for (String folderPathStr : inputFolders) {
			Path folderPath = Paths.get(folderPathStr);
			if (Files.isDirectory(folderPath)) {
				Files.walkFileTree(folderPath, mp3File);
			}
		}
		HTMLCreator.writeHTML(mp3File.getHTMLMap());
	}

}

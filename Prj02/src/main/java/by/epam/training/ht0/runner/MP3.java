package by.epam.training.ht0.runner;

import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.IOException;
import java.nio.file.FileVisitResult;

import com.mpatric.mp3agic.ID3v2;
import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;

public class MP3 extends SimpleFileVisitor<Path> {

	private Map<String, Map<String, List<String>>> htmlMap = new HashMap<String, Map<String, List<String>>>();

	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		if (file.toString().toLowerCase().endsWith(".mp3")) {
			try {
				Mp3File mp3File = new Mp3File(file);
				if (mp3File.hasId3v2Tag()) {
					addFiles(mp3File, file);
				}
			} catch (UnsupportedTagException e) {
				System.out.println("Can't get tag information from this file.");
				e.printStackTrace();
			} catch (InvalidDataException e) {
				System.out.println("Can't get tag information from this file.");
				e.printStackTrace();
			}
		}
		return FileVisitResult.CONTINUE;
	}

	private void addFiles(Mp3File mp3File, Path file) {
		ID3v2 tag = mp3File.getId3v2Tag();
		String artist = tag.getArtist();
		String album = tag.getAlbum();
		String title = tag.getTitle();
		long length = mp3File.getLengthInSeconds();

		String tags = new StringBuilder().append("<h4>").append("Title: ").append(title).append(" ").append(length)
				.append(" sec ").append("(").append(file).append(")</h4>").toString();

		if (htmlMap.containsKey(artist)) {
			if (htmlMap.get(artist).containsKey(album)) {
				htmlMap.get(artist).get(album).add(tags);
			} else {
				List<String> information = new ArrayList<>();
				information.add(tags);
				htmlMap.get(artist).put(album, information);
			}
		} else {
			List<String> information = new ArrayList<>();
			information.add(tags);
			Map<String, List<String>> albums = new HashMap<>();
			albums.put(album, information);
			htmlMap.put(artist, albums);
		}
	}

	public Map<String, Map<String, List<String>>> getHTMLMap() {
		return htmlMap;
	}
}

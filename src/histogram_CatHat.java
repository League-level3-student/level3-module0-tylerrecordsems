/*
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;

public class histogram_CatHat {
	// histograms
			LinkedList<String> words = new LinkedList<String>();
			try (FileReader fr = new FileReader(new File("catinhat.txt"));
					BufferedReader br = new BufferedReader(fr);
					) {
				while(true) {
					String line = br.readLine();
					if (line == null) {
						break;
					}
					String[] splitLine = line.split(" ");
					for(String word : splitLine) {
						words.add(word);
					}
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			for(String word : words) {
				System.out.println(word);
			}
			System.out.println("read " + words.size() + " words from cat in the hat");
}
}
*/
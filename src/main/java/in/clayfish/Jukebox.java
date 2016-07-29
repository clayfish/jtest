package in.clayfish;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author shuklaalok7
 * @since 29/07/2016
 */
public class Jukebox {

  ArrayList<Song> songList = new ArrayList<>();

  public static void main(String[] args) {
    new Jukebox().go();
  }

  void go() {
    getSongs();
    System.out.println(songList);
    Collections.sort(songList);
    System.out.println(songList);
  }

  void getSongs() {
    try {
      File file = new File("src/main/java/in/clayfish/songList.txt");
      BufferedReader br = new BufferedReader(new FileReader(file));
      String line;

      while ((line = br.readLine()) != null) {
        addSong(line);
      }
    } catch (Exception e) {
        e.printStackTrace();
    }
  }

  void addSong(String line) {
    String[] tokens = line.split("/");
    Song s = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
    songList.add(s);
  }

}

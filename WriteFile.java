import java.io.*;

public class WriteFile {
  public void open() {
    System.out.println("ファイルを開きます");
  }

  public void write() throws Exception {  // IOException をキャッチして新たな例外をスロー
    try {
      throw new IOException();
    } catch (IOException e) {
      throw new Exception("ファイル書き込み中にエラーが発生しました", e);
    }
  }

  public void close() {
    System.out.println("ファイルを保存して閉じます");
  }
}
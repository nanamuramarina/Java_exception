import java.io.*;

public class WriteFile {
  public void open() {
    System.out.println("ファイルを開きます");
  }

  public void write() throws Exception {
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
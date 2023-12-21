public class TryDivide1 {
  public static void main(String[] args) {
    try {
      System.out.println("処理開始");
      int[] a = new int[3];
      for (int i = 0; i < args.length; i++) {
        a[i] = Integer.parseInt(args[i]);
        System.out.println(a[i]);
      }
    } catch (NumberFormatException e) {
      System.out.println("例外：NumberFormatException");
      e.printStackTrace();
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("例外：ArrayIndexOutOfBoundsException");
      e.printStackTrace();
    } finally {
      System.out.println("処理終了");
    }
  }
}
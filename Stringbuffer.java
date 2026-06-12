public class Stringbuffer{
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("M.Kumarasamy");
        StringBuffer b = new StringBuffer(" College");

        StringBuffer c = a.append(b);

        System.out.println(c);
    }
}
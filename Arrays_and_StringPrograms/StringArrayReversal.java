public class StringArrayReversal {
    public static void main(String[] args) {
        reverseString("i.like.this.program.very.much");
        reverseStringDots("............i.like.this.program.very.much....................");
    }
    static void reverseString(String s) {
        String arr[] = s.split(".");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
            if (i != 0) sb.append(".");
        }
        System.out.println("Reversed: " + sb);
    }

    static void reverseStringDots(String s) {
        s = s.replaceAll("^\\.+|\\.+$", "");
        String arr[] = s.split("\\.");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
            if (i != 0) sb.append(".");
        }
        System.out.println("Trimmed + Reversed: " + sb);
    }
}
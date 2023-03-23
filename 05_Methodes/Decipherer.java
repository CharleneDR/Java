public class Decipherer {
    public static String decode(String message) {
        int keyNumber = message.length() / 2;
        String subString = message.substring(5, 5 + keyNumber);
        String subStringWithSpace = subString.replace("@#?", " ");
        return new StringBuilder(subStringWithSpace).reverse().toString();
    }

    public static void main(String[] args) {
        String message1 = "0@sn9sirppa@#?ia'jgtvryko1";
        String message2 = "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
        String message3 = "aopi?sedohtém@#?sedhtmg+p9l!";

        System.out.println(decode(message1));
        System.out.println(decode(message2));
        System.out.println(decode(message3));
    }
}

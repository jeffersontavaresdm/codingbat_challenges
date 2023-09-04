package warmup_2;

/**
 * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
 * <p>
 * altPairs("kitten") → "kien"
 * altPairs("Chocolate") → "Chole"
 * altPairs("CodingHorror") → "Congrr"
 */
public class AltPairs {

    public static void main(String[] args) {
        System.out.println(altPairs("z"));
        System.out.println(altPairs("yay"));
        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));
    }

    public static String altPairs(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i = i + 4) {
            result.append(str.charAt(i));

            if (str.length() > (i + 1)) {
                result.append(str.charAt(i + 1));
            }
        }

        return result.toString();
    }
}
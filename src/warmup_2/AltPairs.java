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
        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));
        System.out.println(altPairs("01..45..89..XZ.."));
    }

    public static String altPairs(String str) {
        StringBuilder result = new StringBuilder();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i == count) {
                result.append(str.charAt(i));
                i++;
                count = count + 2;
                if (str.length() > i) {
                    result.append(str.charAt(i));
                    count = count + 2;
                }
            }
        }

        return result.toString();
    }
}

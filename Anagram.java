import java.util.Hashtable;
import java.util.Set;

public class Anagram {

  static String string1 = "aab";
  static String string2 = "aba";
  static String string3 = "cab";
  static String string4 = "kjfdhskdhfksdhk";

  public boolean anagram(String x, String y) {
    if (x == y) return true;
    if (x.length() != y.length()) return false;

    Hashtable<String, Integer> dictx = new Hashtable<String, Integer>();
    Hashtable<String, Integer> dicty = new Hashtable<String, Integer>();

    for(int i=0; i<x.length(); i++){
      String key = String.valueOf(x.charAt(i));
      int value = 0;
      if (dictx.containsKey(key)) {
        value = dictx.get(key);
      } else {
        dictx.put(key, 0);
      }
      dictx.put(key, value+1 );
    }
    for(int i=0; i<y.length(); i++){
      String key = String.valueOf(y.charAt(i));
      int value = 0;
      if (dicty.containsKey(key)) {
        value = dicty.get(key);
      } else {
        dicty.put(key, 0);
      }
      dicty.put(key, value+1 );
    }

    if (dictx.size() != dicty.size()) {
      return false;
    }

    Set<String> keys = dictx.keySet();
    for(String key: keys) {
      if (dicty.containsKey(key)) {
        if (dictx.get(key) != dicty.get(key)) {
          return false;
        }
      } else {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    Anagram foo = new Anagram();
    System.out.printf("1 %s\n", foo.anagram(string1, string1));
    System.out.printf("2 %s\n", foo.anagram(string1, string2));
    System.out.printf("3 %s\n", foo.anagram(string1, string3));
    System.out.printf("4 %s\n", foo.anagram(string1, string4));
    System.out.printf("5 %s\n", foo.anagram(string1, string5));
    System.out.printf("5 %s\n", foo.anagram(string1, string6));

  }

}

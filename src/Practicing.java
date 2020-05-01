import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practicing {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999 ; j++) {
                int x = i * j;
                String n = String.valueOf(x);
                if (n.length() >= 2 && n.length() % 2 == 0) {
                    while (n.length() >= 2) {
                        if (n.length() == 2 && n.charAt(0) == n.charAt(1)) {
                            list.add(x);
                            break;
                        }
                        if (n.charAt(0) == n.charAt((n.length() - 1))) {
                            n = n.substring(1, (n.length() - 1));
                        }
                        else break;
                    }
                }
                else continue;
            }
        }

        Collections.sort(list);
        System.out.println("Highest Palindrom of 3 Digits: " + list.get(list.size() -1 ));
    }
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class ConvoBOT {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        ArrayList<String> list = new ArrayList<>();

        Random r = new Random();

        //list.add("Mhm");
        //list.add("Alright");
        //list.add("Go on");
        list.add("\uD83D\uDC80");
        //list.add("That's cool");
        //list.add("Amazing");
        //list.add("wow");



        map.put("hi", list);

        System.out.println("workings of the bot: Say 'hi' to start the conversation, You can stop the conversation at anytime by saying 'Done'");
        String str = input.next().toLowerCase().trim();

        if (map.containsKey(str)) {
            System.out.println("Hello there");

        }
        map.put("hi", list);

        System.out.println("Tell me a story!");
        String stri = input.next().toLowerCase().trim();

        if (map.containsKey(stri)) {
            ArrayList<String> tmpList = map.get(stri);
            int randomNumber = r.nextInt(tmpList.size());
            System.out.println(tmpList.get(randomNumber));
        }
    }
    }



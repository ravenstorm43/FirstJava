package week02;

import java.util.*;

public class Week02_homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        String title = sc.nextLine();
        String text;
        switch (type) {
            case "List" :
                ArrayList<String> strList = new ArrayList<String>();
                while (true) {
                    text = sc.nextLine();
                    strList.add(text);
                    if (text.equals("끝")) {
                        break;
                    }
                }
                System.out.println("[ " + type + " 으로 저장된 " + title + " ]");
                for(int i = 0; i < strList.size(); i++) {
                    System.out.println((i+1) + ". " + strList.get(i));
                }
            break;
            case "Set" :
                Set<String> strSet = new HashSet<>();
                while (true) {
                    text = sc.nextLine();
                    strSet.add(text);
                    if (text.equals("끝")) {
                        break;
                    }
                }
                Iterator iterator = strSet.iterator();
                System.out.println("[ " + type + " 으로 저장된 " + title + " ]");
                for (int i = 0; i < strSet.size(); i++) {
                    int number = i + 1;
                    System.out.println(number + ". " + iterator.next()); // Map은 순서가 정해지지 않아서 입력한 순서대로 안나옴
                }
            break;
            case "Map" :
                Map<Integer, String> strMap = new HashMap<>();
                int line = 1;
                while (true) {
                    text = sc.nextLine();
                    strMap.put(line++, text);
                    if (text.equals("끝")) {
                        break;
                    }
                }
                System.out.println("[ " + type + " 으로 저장된 " + title + " ]");
                for(int i : strMap.keySet()) {
                    System.out.println(i + ". " + strMap.get(i));
                }
        }
    }
}

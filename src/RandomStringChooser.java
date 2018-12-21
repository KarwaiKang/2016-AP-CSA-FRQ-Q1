import java.util.ArrayList;

public class RandomStringChooser {
    ArrayList<String> strList = new ArrayList<>();

    public RandomStringChooser(String[] strArr) {
        for (String s : strArr)
            strList.add(s);
    }

    public String getNext() {
        if (strList.size() == 0)
            return "NONE";
        return strList.remove((int) (Math.random() * strList.size()));
    }
}

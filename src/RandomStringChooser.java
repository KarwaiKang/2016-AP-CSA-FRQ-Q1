import java.util.ArrayList;
import java.util.Arrays;

public class RandomStringChooser {
    ArrayList<String> strArrList = new ArrayList<>();

    public RandomStringChooser(String[] strArr) {
        for (String s : strArr)
            strArrList.add(s);
    }

    public String getNext() {
        if (strArrList.size() <= 0)
            return "NONE";
        return strArrList.remove((int)(Math.random() * strArrList.size()));
    }
}

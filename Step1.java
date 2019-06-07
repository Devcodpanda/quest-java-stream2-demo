import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Step1 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("aA", "bB", "cC", "dD", "eE", "fF"));

        List<String> listMapped = new ArrayList<>();

        for (String item : list) {
            listMapped.add(item.toUpperCase());
        }
        System.out.println(listMapped.toString());
    }
}
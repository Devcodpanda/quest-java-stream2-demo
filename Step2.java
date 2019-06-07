import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Step2 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("aA", "bB", "cC", "dD", "eE", "fF"));

        List<String> listMapped = map(list);

        System.out.println(listMapped.toString());
    }

    private static List<String> map(List<String> list) {
        List<String> listMapped = new ArrayList<>();
        for (String item : list) {
            listMapped.add(item.toUpperCase());
        }
        return listMapped;
    }
}
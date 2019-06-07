import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class Step4 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("aA", "bB", "cC", "dD", "eE", "fF"));

        List<String> listMapped = map(list, new Function<String, String>() {
            @Override
            public String apply(String item) {
                return item.toUpperCase();
            }
        });

        System.out.println(listMapped.toString());
    }

    private static List<String> map(List<String> list, Function<String, String> upper) {
        List<String> listMapped = new ArrayList<>();
        for (String item : list) {
            listMapped.add(upper.apply(item));
        }
        return listMapped;
    }
}
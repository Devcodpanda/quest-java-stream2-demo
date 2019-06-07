import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Step3 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("aA", "bB", "cC", "dD", "eE", "fF"));

        List<String> listMapped = map(list, new Upper() {
            @Override
            public String apply(String item) {
                return item.toUpperCase();
            }
        });

        System.out.println(listMapped.toString());
    }

    private static List<String> map(List<String> list, Upper upper) {
        List<String> listMapped = new ArrayList<>();
        for (String item : list) {
            listMapped.add(upper.apply(item));
        }
        return listMapped;
    }

    private interface Upper {

        String apply(String item);
    }
}
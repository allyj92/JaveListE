import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("egg");
        list.add("tree");

        int size = list.size();

        String skill = list.get(0);

        for(int i = 0; i < list.size();i++){
            String str  = list.get(i);
            System.out.println(i+":"+str);

        for (String str1:list){
            System.out.println(str1);
        }

        list.remove(0);


        }
    }
}
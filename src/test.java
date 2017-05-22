import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by wzq on 2017/5/22.
 */
public class test {
    public void print(int index,Object object){
        System.out.println(index+", "+object);
    }
    public void demoStringFun(){
        String s="abcd";
        String s2="abcde";
        ArrayList<String> list=new ArrayList<String>();
        list.add("bbb");
        list.add("a");

        print(1,list);
        ArrayList<String> list2=new ArrayList<String>();
        list2.addAll(list);
        print(2,list2);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return t1.compareTo(s);
            }
        });
        print(3,list);
    }
    public static void main(String[] args){
        test tt=new test();
        tt.demoStringFun();
    }
}


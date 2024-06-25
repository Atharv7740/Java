package JavaCollectionFramework;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnList {
    public static void main(String[] args) {
        List<Integer> l= new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        List<Integer> l3= new ArrayList<>();


        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);

        l2.add(20);
        l2.add(40);
        l2.add(60);
        l2.add(70);

        l3.add(70);
        l3.add(80);
        l3.add(90);
        l3.add(100);

        System.out.print("Created List: ");
        System.out.println(l);
        System.out.println("Collection functions");
        System.out.print("Length of List:");
        System.out.println(l.size());
        System.out.print("String is empty(isEmpty():");
        System.out.println(l.isEmpty());
        System.out.print("Contains 20(contain(element):");
        System.out.println(l.contains(20));
        System.out.print("Add 50 (add(50)");
        System.out.println(l.add(50));
        System.out.println(l);
        System.out.println("Remove 50");
        System.out.println(l.remove(Integer.valueOf(50)));
        System.out.println(l);
        System.out.println("L2 list");
        System.out.println(l2);
        System.out.println("Check l1 contains l2");
        System.out.println(l.containsAll(l2));
        System.out.println(l3);
        System.out.println("addAll(l3) in l2");
        System.out.println(l2.addAll(l3));
        System.out.println("l2:"+l2);
        System.out.println("RemoveAll(collection)");
        System.out.println("L:"+l);
        System.out.println("l2:"+l2);
        System.out.println(l.removeAll(l2));
        System.out.println("l:"+l);
        System.out.println("L3:"+l3);
        System.out.println("l2:"+l2);
        System.out.println("l2 reatainAll(l3)");
        System.out.println(l2.retainAll(l3));
        System.out.println("l2:"+l2);
        System.out.println("list to array of object");
        Object a[]=l3.toArray();

        for(int i=0; i<a.length;i++){
            System.out.println(a[i]);
        }

        System.out.println();
        System.out.println();

        for(Object x:a){
            System.out.println(x);
        }
        System.out.println();
        System.out.println();

        Iterator<Integer> y=l3.iterator();
        while(y.hasNext()){
            System.out.println(y.next());
        }

        System.out.println();
        System.out.println();

        for(Integer z: l){
            System.out.println(z);
        }

        for(int n=0; n<l2.size(); n++){
            System.out.println(l2.get(n));
        }






    }

}

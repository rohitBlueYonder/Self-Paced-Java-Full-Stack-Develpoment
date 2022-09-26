package collectionFramework;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arrayList {

    // methods:
    // 1. add - element
    // 1. add - index,element
    // 2. addAll
    // 3. get
    // 4. remove - index
    // 4. remove - element
    // 5. clear = to remove all the ele
    // 6. set - index, ele = updates the value at a given index
    // 7. contains = checks whether that ele exits in array or not

    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();
        student.add("Rohit");
        student.add("Jitendra");

        List<Integer> list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(1,50);
//        System.out.println("List is: "+ list);

        List<Integer> list1 = new ArrayList();
        list1.add(30);
        list1.add(120);
        list1.add(1,150);
//        System.out.println("\nList2 is: "+list1);

        list.addAll(list1);
        // append list1 at the end of list

        System.out.println("\nAppended list is: "+list);
//
//        System.out.println(list.get(1));
//        // will return ele at index 1
//
//        System.out.println(list.remove(1));
//        // will remove ele at index 1
//
//        System.out.println(list.remove(Integer.valueOf(120)));
//        // will remove ele 120 if it exists
//
//        list.set(2,234);
//        // to update the ele at a given index
//
//        System.out.println("Appended list is: "+list);
//        // calling list in sout -> invokes the toString method of the arrayList class
//
//        // list.clear();
//        // to remove all the elements form the list
//        System.out.println("Is 50 present in the list: "+list.contains(50));
//

        //-----------------------------------------------------------------
        //-----------------------------------------------------------------


        // traversing arrayList

        //1. Standard
        for(int i=0;i < list.size(); i++){
            System.out.println(" the ele is: "+ list.get(i));
        }

        //2. for Each
        for(Integer element : list){
            System.out.println("the ele for each is: "+ element);
        }

        //3. Iterator
        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.println("Iterator: "+ it.next());
        }


    }
}




















//        String shiwangi_thought = "I hate you";
//        String rohit_thought = "";
//
//        for(int i=0;i<shiwangi_thought.length();i++){
//            if(shiwangi_thought.charAt(i)=='h')
//                rohit_thought+='l';
//            else if (shiwangi_thought.charAt(i)=='a')
//                rohit_thought+='i';
//            else if (shiwangi_thought.charAt(i)=='t')
//                rohit_thought+='k';
//            else{
//                rohit_thought+=shiwangi_thought.charAt(i);
//            }
//        }
//
//        System.out.println("Final verdit is : "+ rohit_thought);
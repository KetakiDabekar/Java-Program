import java.util.*;

class LinkListDemo{
public static void main(String args[]){
List cl=new LinkedList();

cl.add("Red");
cl.add("Blue");
cl.add("Yellow");
cl.add("Orange");

Iterator itr=cl.iterator();
System.out.println("Color List");

while(itr.hasNext()){
System.out.println(itr.next());
}
System.out.println("\n");

int n=cl.size();
ListIterator lsitr=cl.listIterator(n);
System.out.println("Reverse Color List");

while(lsitr.hasPrevious()){
System.out.println(lsitr.previous());
}
System.out.println("\n");

List cl1=new LinkedList();
cl1.add("Pink");
cl1.add("Green");
cl.addAll(2,cl1);
System.out.println("Modified color List:"+cl);
}
}

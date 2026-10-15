import java.util.ArrayList;
class magic{
public static void main(String[] args){
    ArrayList<String> animals=new ArrayList<>();
    animals.add("Cat");
    animals.add("Dog");
    animals.add("Panda");
    System.out.println("Displaying current lists");
    System.out.println(animals);
    animals.clear();
    System.out.println(animals);
if (animals.isEmpty()){ 
    System.out.println("Arrays is empty");
}
else{
    System.out.println("Arrays is not empty");
}
animals.add("Cat");
animals.add("Dog");
animals.add("Panda");
animals.remove(2);
System.out.println(animals.size());
}
}

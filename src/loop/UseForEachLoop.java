package loop;
import java.util.ArrayList;
import java.util.List;
public class UseForEachLoop {
    public static void main(String[] args) {

         // For Each Loop
        // syntax: for(datatype variablename:ArrayListName){statement}
    List<String> nameList=new ArrayList<String>();//list type of array object
        //datatype inside of<>. namelist is variable=newArrayList<>
        //list is interface of arraylist class


    nameList.add("Jakiir");
    nameList.add("Abdul");
    nameList.add("Malika");
    nameList.add("Hassan");
    nameList.add("Robin");
    nameList.add("Afsana");
    nameList.add("Tamanna");
        for ( String name : nameList ) {
            // for (DataType VariableName: arrayListName){ // statements     }
            //System.out.println("The length of nameList is "+st.length());
            System.out.println(name);

   // System.out.println(nameList.size());

    }

}
}

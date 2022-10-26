import java.util.*;

public class GameWord {

    public static void main(String[] args) {


        HashMap<String,String> myHaShMap = new HashMap<>();
        Methods.CSVReadMethod("C:\\Users\\user\\Downloads\\Vocabulary - Arkusz1.csv", myHaShMap);


        // for (String i : myHaShMap.keySet()) {
        //    System.out.println(i +  "\t" +  myHaShMap.get(i));
       // }

        List<String> keysAsArray = new ArrayList<String>(myHaShMap.keySet());
        Random r = new Random();

       // System.out.println( myHaShMap.get(keysAsArray.get(r.nextInt(keysAsArray.size()))) );

         int Length = keysAsArray.size();

        Scanner scan = new Scanner(System.in);


       for ( int i=0; i < Length; i++) {
           String toRemove= keysAsArray.get(r.nextInt(keysAsArray.size()));
           System.out.println("Podaj odpowiedne tlumaczenie slowka: " + toRemove);

           String input = scan.nextLine();

           if( input.equals(myHaShMap.get(toRemove)) ){
               System.out.println("Poprawna odpowiedz");
               keysAsArray.remove(toRemove);
               System.out.println("");
           } else{
               System.out.println("Nie poprawna odp");
               System.out.println("Poprawna odp to: " + myHaShMap.get(toRemove));
               keysAsArray.remove(toRemove);
           }


       }}







    }



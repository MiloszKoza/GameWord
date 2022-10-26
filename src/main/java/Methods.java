import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Methods {



    public static void   CSVReadMethod (String path, HashMap<String,String> map) {

        try {
            FileReader fr = new FileReader(path);

            CSVReader csvReader = new CSVReader(fr);

            BufferedReader bufferedReader = new BufferedReader(fr);
            String[] array;

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                array = line.split(",");

                map.put(array[1], array[0]);


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
        public static void writeCSV (String path, ArrayList<String> myArray) {

            try {
                FileWriter fileWriter = new FileWriter( path, true);

                CSVWriter csvWriter = new CSVWriter(fileWriter, ',',CSVWriter.NO_QUOTE_CHARACTER,CSVWriter.DEFAULT_ESCAPE_CHARACTER,CSVWriter.DEFAULT_LINE_END );

               csvWriter.writeAll(myArray);


            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}

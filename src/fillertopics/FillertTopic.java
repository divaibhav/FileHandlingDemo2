package fillertopics;

import java.util.Arrays;

public class FillertTopic {
    public static void main(String[] args) {
                      //name   age gender mobile email
        String line = "Vaibhav,28,male,123456789,abc@example.com";
       /* String name = line.substring(0,7);
        System.out.println(name);*/

        int sizeOfArray = 0;
        for (int i = 0; i < line.length(); i++) {
            if(line.charAt(i) == ','){
                sizeOfArray++;
            }
        }
        System.out.println(sizeOfArray);
        String[] dataArray = new String[sizeOfArray + 1];
        int indexToProcessDataArray = 0;
        int beginIndex = 0;
        int endIndex = 0;
        for (int i = 0; i < line.length(); i++) {

            if(line.charAt(i) == ','){
                endIndex = i;
                dataArray[indexToProcessDataArray] = line.substring(beginIndex, endIndex);
                indexToProcessDataArray++;
                beginIndex = endIndex + 1 ;
            }
        }
        dataArray[indexToProcessDataArray] = line.substring(endIndex + 1, line.length());
        for (int i = 0; i < dataArray.length; i++) {
            System.out.println(dataArray[i]);
        }
        String[] split = line.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }
}

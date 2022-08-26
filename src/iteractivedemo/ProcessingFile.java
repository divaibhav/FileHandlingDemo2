package iteractivedemo;

import iteractivedemo.data.StudentDetails;

import java.io.*;

public class ProcessingFile {
    public StudentDetails[] readFile(String fileName){
        // read file line by line
        // total lines will give me, number stduentdetails aobject
        int countLines = 0;
        StudentDetails[] studentDetails = null;
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();

            while ((line = bufferedReader.readLine()) != null){
                countLines++;
            }
             studentDetails = new StudentDetails[countLines];
            //re-initializing file-reader and buffer reader
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);
            line = bufferedReader.readLine();
            int index = 0;
            while ((line = bufferedReader.readLine()) != null){
                String[] split = line.split(",");
                String name = split[0];
                int age = Integer.parseInt(split[1]);
                String gender = split[2];
                long mobile = Long.parseLong(split[3]);
                String email = split[4];
                studentDetails[index] = new StudentDetails(name, age,gender,mobile,email);
                index++;
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return studentDetails;
    }
    public void writeFile(String fileName, String[] contents){
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < contents.length; i++) {
               /* fileWriter.write(contents[i]);
                //line change
                fileWriter.write("\n");*/

                bufferedWriter.write(contents[i]);
                bufferedWriter.write("\n");
            }
            //fileWriter.flush();
            bufferedWriter.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

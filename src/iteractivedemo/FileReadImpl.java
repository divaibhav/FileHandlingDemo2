package iteractivedemo;

import iteractivedemo.data.StudentDetails;

public class FileReadImpl {
    public static void main(String[] args) {
        ProcessingFile processingFile = new ProcessingFile();
        String fileName = "resources/Data.csv";
        StudentDetails[] studentDetails = processingFile.readFile(fileName);

        for (int i = 0; i < studentDetails.length; i++) {
            System.out.println(studentDetails[i]);
        }
        String[] contents = {"Vaibhav,38,male,12346,abc@email.com",
                "Ramesh,25,male,1456987,r@eamil.com",
                "Suresh,65,male,789456123,s@email.com"
        };
        processingFile.writeFile(fileName,contents);
    }
}

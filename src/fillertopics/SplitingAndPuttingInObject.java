package fillertopics;

public class SplitingAndPuttingInObject {
    public static void main(String[] args) {
        String []line = {"Vaibhav,28,male,123456789,abc@example.com"};
        //separate by comma and create object of details and set the value



        String[] arrayName = line[0].split(",");
        Detail detail = new Detail();
        detail.setName(arrayName[0]);
        detail.setAge(Integer.parseInt(arrayName[1].trim()));
        detail.setGender(arrayName[2]);
        detail.setMobile(Long.parseLong(arrayName[3]));
        detail.setEmail(arrayName[4]);


        System.out.println(detail);

    }
}
/*
WAP to create one string array for containing data given in file, manually create array by copy and paste,
String[] lines = new String[]{"ABHINAV PANDEY,23,male,1569874465,chintu@gmail.com",
"KURAKULA NIKHIL,22,male,9849588370,Nikhil123@a.com",
"",}


Create array of StudentDetail class, and initialize each index with one object of StudentDetail.

Each object will contain values coming form lines.

Print the StudentDetail array, using for loop.

 */

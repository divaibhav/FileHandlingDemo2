package fillertopics;

public class SplitingAndPuttingInObject {
    public static void main(String[] args) {
        String line = "Vaibhav,28,male,123456789,abc@example.com";
        //separate by comma and create object of details and set the value

        String[] arrayName = line.split(",");
        Detail detail = new Detail();
        detail.setName(arrayName[0]);
        detail.setAge(Integer.parseInt(arrayName[1].trim()));
        detail.setGender(arrayName[2]);
        detail.setMobile(Long.parseLong(arrayName[3]));
        detail.setEmail(arrayName[4]);


        System.out.println(detail);

    }
}

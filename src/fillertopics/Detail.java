package fillertopics;

import java.util.Objects;

public class Detail {
    private String name;
    private int age;
    private String gender;
    private Long mobile;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", mobile=" + mobile +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Detail detail = (Detail) o;
        return age == detail.age && Objects.equals(name, detail.name) && Objects.equals(gender, detail.gender) && Objects.equals(mobile, detail.mobile) && Objects.equals(email, detail.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, mobile, email);
    }
}

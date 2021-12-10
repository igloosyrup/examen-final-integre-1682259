package com.lacouf.al420565final.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Client {
    private long id;
    private String firstName;
    private String lastName;
    private String gender;
    private LocalDate birthDate;
    private String city;
    private String province;

    public static Client of(String firstName,
                            String lastName,
                            String gender,
                            LocalDate birthDate,
                            String city,
                            String province) {
        return new Client((long) (Math.random() * 1000000), firstName, lastName, gender, birthDate, city, province);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate=" + birthDate +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }
}
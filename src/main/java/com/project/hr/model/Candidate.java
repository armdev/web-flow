package com.project.hr.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Candidate implements Serializable {

    private String firstName;
    private String middleName;
    private String lastName;
    private String country;
    private String city;
    private String state;
    private String zip;
    private String address;
    private String phoneHome;
    private String phoneWork;
    private String phoneMobile;
    private String company;
    private String position;
    private String linkedin;
    private String github;

}

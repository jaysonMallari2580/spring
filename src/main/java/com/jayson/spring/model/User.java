package com.jayson.spring.model;


import com.jayson.spring.validation.ValidName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long userId;


    @NotEmpty @ValidName
    private String name;

    @Min(value = 18) @Max(value = 100)
    private int age;

    @Email
    private String email;

    private String profilePictureUrl;

    @NotEmpty @ValidName
    private String address;


}

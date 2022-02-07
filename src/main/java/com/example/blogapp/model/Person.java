package com.example.blogapp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name="user_name", nullable = false, unique = true)
    private String username;

    @NotNull
    @Column(name="first_name", nullable = false)
    private String firstName;

    @NotNull
    @Column(name="last_name", nullable = false)
    private String lastName;

    @NotNull
    @Column(unique = true, nullable = false)
    private String email;

    @NotNull
    @Column(nullable = false)
    private String password;

    @NotNull
    @Column(name="phone_number", nullable = false)
    private String phoneNumber;

    @NotNull
    @Column(nullable = false)
    private String gender;

    @NotNull
    @Column(name = "date_of_birth", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-mm-yyyy")
    private Date dateOfBirth;

    

}

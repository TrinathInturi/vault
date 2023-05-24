package com.titanis.vault.model;

import javax.persistence.*;

import java.math.BigInteger;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    public Integer UserId;
    @Column(name = "full_name")
    public String FullName;
    @Column(name="user_name")
    public String UserName;
    @Column(name="email")
    public String Email;
    @Column(name="mobile")
    public BigInteger Mobile;
    @Column(name="password")
    public String Password;
}

package gov.iti.jets;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Account implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "user_name")
    private String username;
    private String address;
    private String phone;
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthday;
    @Column(name = "full_name")
    private String fullName;
    private String password;
    public void setUsername(String string) {
        username= string;
    }
    public void setFullName(String string) {
        fullName = string;
    }
    public void setPassword(String string) {
        password = string;
    }
}
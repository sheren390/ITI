package gov.iti.jets;
// Generated Jan 10, 2023, 4:08:03 PM by Hibernate Tools 6.0.0.Alpha2


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Student generated by hbm2java
 */
@Entity
@DiscriminatorValue("St")
@Table(name="student"
    ,catalog="inheritance2"
)
public class Student  extends Person {

     private String department;

    public Student() {
    }

    public Student( String department) {
       this.department = department;
    }

    
    @Column(name="department", nullable=false, length=45)
    public String getDepartment() {
        return this.department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }

}



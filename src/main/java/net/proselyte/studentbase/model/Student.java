package net.proselyte.studentbase.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "middle_name")
    private String middleName;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column(name = "date_birth")
    private Date dateBirth = new Date();
    @Column(name = "student_group")
    private Integer studentGroup;
}

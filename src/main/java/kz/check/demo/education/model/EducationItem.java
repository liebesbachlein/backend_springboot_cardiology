package kz.check.demo.education.model;

import jakarta.persistence.*; // for Spring Boot 3
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="education_items")
public class EducationItem {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "patro_name")
    private String patro_name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phone_number;

    @Column(name = "speciality")
    private String speciality;

    @Column(name = "address_home")
    private String address_home;

    @Column(name = "address_work")
    private String address_work;

    @Column(name = "picked_time")
    private String picked_time;

    @Column(name = "picked_month")
    private String picked_month;

    @Column(name = "terms")
    private String terms;
    
}

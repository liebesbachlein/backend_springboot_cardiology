package kz.check.demo.membership.model;

import jakarta.persistence.*; // for Spring Boot 3
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="membership_items")
public class MembershipItem {
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

    @Column(name = "date_birth")
    private String date_birth;

    @Column(name = "place_birth")
    private String place_birth;

    @Column(name = "address")
    private String address;

    @Column(name = "id_doc")
    private String id_doc;

    @Column(name = "date_doc")
    private String date_doc;
    
    @Column(name = "place_doc")
    private String place_doc;

    @Column(name = "education")
    private String education;

    @Column(name = "add_education")
    private String add_education;

    @Column(name = "interests")
    private String interests;

    @Column(name = "experience")
    private String experience;

    @Column(name = "date_member")
    private String date_member;

    @Column(name = "terms")
    private String terms;
    
}

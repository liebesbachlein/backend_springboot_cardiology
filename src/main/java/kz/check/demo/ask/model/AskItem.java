package kz.check.demo.ask.model;

import jakarta.persistence.*; // for Spring Boot 3
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="ask_items")
public class AskItem {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;
    
    @Column(name = "content")
    private String content;
    
}

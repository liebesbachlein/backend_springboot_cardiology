package kz.check.demo.news.model;

import jakarta.persistence.*; // for Spring Boot 3
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="news_items")
public class NewsItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "title")
	private String title;

	@Column(name = "date_published")
	private String date_published;

	@Column(name = "phrase")
	private String phrase;

	@Column(name = "summary")
	private String summary;

	@Column(name = "content")
	private String content;
}
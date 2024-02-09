package kz.check.demo.news.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import kz.check.demo.news.model.NewsItem;

public interface ItemRepository extends JpaRepository<NewsItem, Long> {

 //   @Query("SELECT s FROM Item s WHERE s.title = ?1")
    Optional<NewsItem> findItemByTitle(String title);

}

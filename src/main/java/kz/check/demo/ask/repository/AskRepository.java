package kz.check.demo.ask.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kz.check.demo.ask.model.AskItem;


public interface AskRepository extends JpaRepository<AskItem, Long> {
}

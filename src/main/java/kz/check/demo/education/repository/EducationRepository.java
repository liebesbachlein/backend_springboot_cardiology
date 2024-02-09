package kz.check.demo.education.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import kz.check.demo.education.model.EducationItem;


public interface EducationRepository extends JpaRepository<EducationItem, Long> {
     //   @Query("SELECT s FROM MembershipItem s WHERE s.email = ?1")
     //Optional<MembershipItem> findItemByEmail(String email);
}

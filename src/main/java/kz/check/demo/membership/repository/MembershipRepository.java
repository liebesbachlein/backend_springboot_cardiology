package kz.check.demo.membership.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import kz.check.demo.membership.model.MembershipItem;


public interface MembershipRepository extends JpaRepository<MembershipItem, Long> {
     //   @Query("SELECT s FROM MembershipItem s WHERE s.email = ?1")
     //Optional<MembershipItem> findItemByEmail(String email);
}

package com.example.TibaCare.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users,Long> {
    @Query("SELECT u FROM usres u WHERE u.email = ?1")
    Optional<Users> findUsersByEmail(String email);

    @Query("SELECT u FROM usres u WHERE u.national_identity_card = ?1")
    Optional<Users> findUsersBynational_identity_card(String  national_identity_card);

}

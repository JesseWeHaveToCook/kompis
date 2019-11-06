package me.pckv.kompis.repository;

import me.pckv.kompis.data.Listing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListingRepository extends JpaRepository<Listing, Long> {
}

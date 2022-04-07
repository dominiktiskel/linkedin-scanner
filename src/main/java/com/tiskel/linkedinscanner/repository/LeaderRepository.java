package com.tiskel.linkedinscanner.repository;

import com.tiskel.linkedinscanner.domain.Leader;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Leader entity.
 */
@SuppressWarnings("unused")
@Repository
public interface LeaderRepository extends JpaRepository<Leader, Long> {}

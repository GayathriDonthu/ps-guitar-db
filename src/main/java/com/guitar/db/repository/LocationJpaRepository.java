package com.guitar.db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guitar.db.model.Location;

public interface LocationJpaRepository extends JpaRepository<Location, Long> {

	List<Location> findByStateIgnoreCaseStartingWith(String stateName);

	List<Location> findByStateNotLikeOrderByStateDesc(String stateName);

	List<Location> findByStateIsOrCountryEquals(String value1, String value2);

	List<Location> findByStateNot(String value1);

	Location findFirstByStateIgnoreCaseStartingWith(String stateName);

}

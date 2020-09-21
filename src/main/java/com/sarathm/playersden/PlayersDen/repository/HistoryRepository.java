package com.sarathm.playersden.PlayersDen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sarathm.playersden.PlayersDen.model.History;

@Repository
public interface HistoryRepository extends JpaRepository<History,Long>{
	

}

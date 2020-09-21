package com.sarathm.playersden.PlayersDen.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sarathm.playersden.PlayersDen.model.Tournament;

@Repository
public interface TournamentRepository extends JpaRepository<Tournament, Long>{

	@Query(value="SELECT t_id,date_add(t_date,interval 1 day) AS t_date FROM tournament ", nativeQuery=true)
	List<Tournament> findTournaments();

	@Query(value="SELECT t_id,date_add(t_date,interval 1 day) AS t_date FROM tournament WHERE t_id=?1", nativeQuery=true)
	Tournament getTournamentByNumber(long tournament_number);

	@Query(value="SELECT t_id,date_add(t_date,interval 1 day) AS t_date FROM tournament WHERE t_date=?1", nativeQuery=true)
	List<Tournament> findByTId(Date tournament_date);


	@Modifying
	@Query(value="INSERT INTO tournament(t_id,t_date) VALUES(?1,?2) ", nativeQuery=true)
	void saveT(long tournament_id, Date tournament_date);


}

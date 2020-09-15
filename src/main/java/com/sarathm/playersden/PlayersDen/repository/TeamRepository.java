package com.sarathm.playersden.PlayersDen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sarathm.playersden.PlayersDen.model.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team,String>{
    //List<Player> findByTeamNameAndPlayer_PlayerTeamName(String playerTeamName);
	@Query(value="SELECT * FROM team_details ORDER BY RAND() LIMIT 3", nativeQuery = true)
	List<Team> findTeam();

}

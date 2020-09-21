package com.sarathm.playersden.PlayersDen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sarathm.playersden.PlayersDen.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Long> {
	List<Player> findByPlayerTeamName(String playerTeamName);
	
	@Query(value="SELECT * FROM player_details WHERE player_team_name=?1 ORDER BY RAND() LIMIT 2", nativeQuery = true)
    List<Player> findFirstTeamPlayers(String teamName);

	@Modifying
	@Query(value="UPDATE player_details SET player_score=?2 WHERE player_name=?1 ", nativeQuery = true)
	void updatePlayerScore(String player_name,long l);
	
	@Modifying
	@Query(value="UPDATE player_details SET player_score= 0 ", nativeQuery = true)
    void clearScores();

}

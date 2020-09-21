package com.sarathm.playersden.PlayersDen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sarathm.playersden.PlayersDen.model.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team,String>{
    //List<Player> findByTeamNameAndPlayer_PlayerTeamName(String playerTeamName);
//	@Query(value="SELECT COUNT(players.player_details.player_name),teamName,teamCaption,teamScore FROM team_details WHERE COUNT(players.player_details.player_name)>=3 ORDER BY RAND() LIMIT 3", nativeQuery = true)
//	@Query(value="SELECT team_details.team_name,team_details.team_caption,team_details.players,(SELECT COUNT(*) FROM player_details WHERE team_details.team_name=player_details.player_team_name) as cnt FROM team_details ORDER BY cnt DESC", nativeQuery = true)
//	@Query(value="SELECT * FROM team_details ORDER BY RAND() LIMIT 3", nativeQuery = true)
    @Query(value="SELECT team_details.team_name,team_details.team_caption,team_details.team_score,(SELECT COUNT(*) FROM player_details\n" + 
    		"WHERE team_details.team_name=player_details.player_team_name) as cnt FROM team_details WHERE (SELECT COUNT(*) FROM player_details\n" + 
    		"WHERE team_details.team_name=player_details.player_team_name)>=3 ORDER BY RAND() LIMIT 3; ", nativeQuery = true)
	List<Team> findTeam();

	@Modifying
	@Query(value="UPDATE team_details SET team_score=?2 WHERE team_name=?1", nativeQuery = true)
	void updateTeamScore(String team_name, long team_score);

	@Query(value="SELECT team_score FROM team_details WHERE team_name=?1", nativeQuery = true)
	Long getTeamScore(String team_name);

	@Modifying
	@Query(value="UPDATE team_details SET team_score= 0 ", nativeQuery = true)
	void clearTeamScores();

	@Query(value="SELECT COUNT(*) FROM team_details WHERE team_name=?1 ", nativeQuery = true)
	long getTeamCountScore(String team_name);

}

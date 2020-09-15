package com.sarathm.playersden.PlayersDen.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="playerDetails")
public class Player {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long playerId;
	private String playerName;
	private long playerAge;
	private String playerCaption;
	private long playerScore;
	//private long player_team_id;
	private String playerTeamName;
	
	//@Column(name = "player_pic", length = 1000)
	//@Lob
	//private byte[] player_pic;
	
	//@ManyToOne
	//@JoinColumn(name="team_id")
	//private Team team;
	public Player() {
		
	}

	public Player(String playerName, long playerAge, String playerCaption, long playerScore, String playerTeamName) {
		super();
		this.playerName = playerName;
		this.playerAge = playerAge;
		this.playerCaption = playerCaption;
		this.playerScore = playerScore;
		this.playerTeamName = playerTeamName;
	}

	public long getPlayerId() {
		return playerId;
	}

	//public void setPlayerId(long playerId) {
	//	this.playerId = playerId;
	//}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public long getPlayerAge() {
		return playerAge;
	}

	public void setPlayerAge(long playerAge) {
		this.playerAge = playerAge;
	}

	public String getPlayerCaption() {
		return playerCaption;
	}

	public void setPlayerCaption(String playerCaption) {
		this.playerCaption = playerCaption;
	}

	public long getPlayerScore() {
		return playerScore;
	}

	public void setPlayerScore(long playerScore) {
		this.playerScore = playerScore;
	}

	public String getPlayerTeamName() {
		return playerTeamName;
	}

	public void setPlayerTeamName(String playerTeamName) {
		this.playerTeamName = playerTeamName;
	}
    

	//public Team getTeam() {
	//	return team;
	//}

	//public void setTeam(Team team) {
	//	this.team = team;
	//}
	
	
	

}

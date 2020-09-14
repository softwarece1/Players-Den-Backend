package com.sarathm.playersden.PlayersDen.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="player_details")
public class Player {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long player_id;
	private String player_name;
	private long player_age;
	private String player_caption;
	private long player_score;
	//private long player_team_id;
	private long player_team_id;
	
	//@ManyToOne
	//@JoinColumn(name="team_id")
	//private Team team;
	public Player() {
		
	}

	public Player(String player_name, long player_age, String player_caption, long player_score,long player_team_id) {
		super();
		this.player_name = player_name;
		this.player_age = player_age;
		this.player_caption = player_caption;
		this.player_score = player_score;
		this.player_team_id = player_team_id;
	}






	public long getPlayer_team_id() {
		return player_team_id;
	}

	public void setPlayer_team_id(long player_team_id) {
		this.player_team_id = player_team_id;
	}

	public long getPlayer_age() {
		return player_age;
	}

	public void setPlayer_age(long player_age) {
		this.player_age = player_age;
	}


	public long getPlayer_id() {
		return player_id;
	}


	public String getPlayer_name() {
		return player_name;
	}

	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}

	public String getPlayer_caption() {
		return player_caption;
	}

	public void setPlayer_caption(String player_caption) {
		this.player_caption = player_caption;
	}

	public long getPlayer_score() {
		return player_score;
	}

	public void setPlayer_score(long player_score) {
		this.player_score = player_score;
	}

	//public Team getTeam() {
	//	return team;
	//}

	//public void setTeam(Team team) {
	//	this.team = team;
	//}
	
	
	

}

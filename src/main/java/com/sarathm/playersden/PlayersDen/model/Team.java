package com.sarathm.playersden.PlayersDen.model;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "team_details")
public class Team {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long team_id;

	//@GeneratedValue//(strategy=GenerationType.IDENTITY)
	//@GeneratedValue(generator="system-uuid")
	//@GenericGenerator(name="system-uuid", strategy = "uuid")
	private String team_name;
	private String team_caption;
	private long team_score;
	
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="player_team_id", referencedColumnName="team_id",updatable = false)
	List<Player> players = new ArrayList<>();
	
	public Team() {
		
	}

	public Team(String team_name, String team_caption, long team_score) {
		super();
		this.team_name = team_name;
		this.team_caption = team_caption;
		this.team_score = team_score;
	}
	



	public long getTeam_id() {
		return team_id;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	public String getTeam_caption() {
		return team_caption;
	}

	public void setTeam_caption(String team_caption) {
		this.team_caption = team_caption;
	}

	public long getTeam_score() {
		return team_score;
	}

	public void setTeam_score(long team_score) {
		this.team_score = team_score;
	}

	public List<Player> getPlayer() {
	return players;
	}

	public void setPlayer(List<Player> players) {
		this.players = players;
	}
	
	
	

}

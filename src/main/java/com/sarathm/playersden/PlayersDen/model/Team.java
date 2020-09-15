package com.sarathm.playersden.PlayersDen.model;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "teamDetails")
public class Team {
	
	//@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	//private long team_id;

	//@GeneratedValue//(strategy=GenerationType.IDENTITY)
	//@GeneratedValue(generator="system-uuid")
	//@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Id
	private String teamName;
	private String teamCaption;
	private long teamScore;
	
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="playerTeamName", referencedColumnName="teamName")
	List<Player> players = new ArrayList<>();
	
	public Team() {
		
	}

	public Team(String teamName, String teamCaption, long teamScore) {
		super();
		this.teamName = teamName;
		this.teamCaption = teamCaption;
		this.teamScore = teamScore;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamCaption() {
		return teamCaption;
	}

	public void setTeamCaption(String teamCaption) {
		this.teamCaption = teamCaption;
	}

	public long getTeamScore() {
		return teamScore;
	}

	public void setTeamScore(long teamScore) {
		this.teamScore = teamScore;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	
	
	
	

}

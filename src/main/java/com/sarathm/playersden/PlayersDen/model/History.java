package com.sarathm.playersden.PlayersDen.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="history")
public class History {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long hId;
	private long tHistoryId;
	private String tHistoryTeam;
	private long tHistoryScore;
	
	
	public History(){
		
	}

	public History(long tHistoryId, String tHistoryTeam, long tHistoryScore) {
		super();
		this.tHistoryId = tHistoryId;
		this.tHistoryTeam = tHistoryTeam;
		this.tHistoryScore = tHistoryScore;
	}

	public long gethId() {
		return hId;
	}

	public long gettHistoryId() {
		return tHistoryId;
	}

	public void settHistoryId(long tHistoryId) {
		this.tHistoryId = tHistoryId;
	}

	public String gettHistoryTeam() {
		return tHistoryTeam;
	}

	public void settHistoryTeam(String tHistoryTeam) {
		this.tHistoryTeam = tHistoryTeam;
	}

	public long gettHistoryScore() {
		return tHistoryScore;
	}

	public void settHistoryScore(long tHistoryScore) {
		this.tHistoryScore = tHistoryScore;
	}
	
}

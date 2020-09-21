package com.sarathm.playersden.PlayersDen.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="tournament")
public class Tournament {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long tId;
	  //@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    @JsonFormat(pattern="yyyy-MM-dd")
	private Date tDate;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="tHistoryId", referencedColumnName="tId")
	List<History> tDetails = new ArrayList<>();
	
	Tournament(){
		
	}

	public Tournament(Date tDate) {
		super();
		this.tDate = tDate;
	}

	public long gettId() {
		return tId;
	}


	public Date gettDate() {
		return tDate;
	}

	public void settDate(Date tDate) {
		this.tDate = tDate;
	}

	public List<History> gettDetails() {
		return tDetails;
	}

	public void settDetails(List<History> tDetails) {
		this.tDetails = tDetails;
	}
	
}

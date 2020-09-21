package com.sarathm.playersden.PlayersDen.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sarathm.playersden.PlayersDen.model.Tournament;
import com.sarathm.playersden.PlayersDen.service.TournamentService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class TournamentController {
	
	@Autowired
	private TournamentService tournService;
	
	@GetMapping(path="/tournaments")
	public List<Tournament> getAllTournaments(){
		return tournService.getAllTournaments();
	}
	
	@GetMapping(path="/{tournament_number}/detail")
	public Tournament getTournamentByNumber(@PathVariable long tournament_number) {
		return tournService.getTournamentByNumber(tournament_number);
	}
	
	@GetMapping(path="/{tournament_date}/tdetails")
	public List<Tournament> getTournamentByDate(@PathVariable(name = "tournament_date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date tournament_date){
		return tournService.getTournamentBydate(tournament_date);
	}
	
	@PostMapping(path="/{tournament_number}/{tournament_date}/")
	public long createTournament(@PathVariable long tournament_number,@PathVariable(name = "tournament_date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date tournament_date,@RequestBody long l1){
		tournService.createTournament(tournament_number,tournament_date);
	    return 0;
	}
	
	@GetMapping(path="/tournament_id")
	public long getTournamentId() {
		long l = tournService.getTournamentsCount();
		l = l + 1;
		return l;
	}
	

	

}

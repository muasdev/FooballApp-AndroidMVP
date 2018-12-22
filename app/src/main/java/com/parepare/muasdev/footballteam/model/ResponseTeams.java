package com.parepare.muasdev.footballteam.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseTeams{

	@SerializedName("teams")
	private List<TeamsItem> teams;

	public ResponseTeams(List<TeamsItem> teams) {
		this.teams = teams;
	}

	public void setTeams(List<TeamsItem> teams){
		this.teams = teams;
	}

	public List<TeamsItem> getTeams(){
		return teams;
	}
}
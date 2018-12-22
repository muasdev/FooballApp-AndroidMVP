package com.parepare.muasdev.footballteam.data.remote;

import com.parepare.muasdev.footballteam.model.ResponseTeams;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("search_all_teams.php?l=English%20Premier%20League")
    Call<ResponseTeams> getAllTeamEngland();
}

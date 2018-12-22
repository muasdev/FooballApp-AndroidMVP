package com.parepare.muasdev.footballteam.data.remote;

import android.content.Context;

import com.parepare.muasdev.footballteam.data.TeamDataSource;
import com.parepare.muasdev.footballteam.model.ResponseTeams;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TeamRemoteDataSource implements TeamDataSource {

    private final ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);


    @Override
    public void getListTeams(Context context, final GetListTeamsCallBack callBack) {
        Call<ResponseTeams> call = apiInterface.getAllTeamEngland();
        call.enqueue(new Callback<ResponseTeams>() {
            @Override
            public void onResponse(Call<ResponseTeams> call, Response<ResponseTeams> response) {
                if (response.body() != null) {
                    callBack.onSuccess(response.body().getTeams());
                }
            }

            @Override
            public void onFailure(Call<ResponseTeams> call, Throwable t) {
                callBack.onFailed(t.toString());
            }
        });
    }
}

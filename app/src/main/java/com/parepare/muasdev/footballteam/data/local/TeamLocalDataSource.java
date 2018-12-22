package com.parepare.muasdev.footballteam.data.local;

import android.content.Context;

import com.parepare.muasdev.footballteam.data.TeamDataSource;

public class TeamLocalDataSource implements TeamDataSource {


    @Override
    public void getListTeams(Context context, GetListTeamsCallBack callBack) {
        TeamsDatabase teamsDatabase = TeamsDatabase.getTeamsDatabase(context);
        if (teamsDatabase.teamsDao().select() != null) {
            callBack.onSuccess(teamsDatabase.teamsDao().select());
        } else {
            callBack.onFailed("no database on local");
        }
    }
}

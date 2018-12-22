package com.parepare.muasdev.footballteam.data;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

import com.parepare.muasdev.footballteam.data.local.TeamLocalDataSource;
import com.parepare.muasdev.footballteam.data.local.TeamsDatabase;
import com.parepare.muasdev.footballteam.data.remote.TeamRemoteDataSource;
import com.parepare.muasdev.footballteam.model.TeamsItem;

import java.util.List;

public class TeamRepository implements TeamDataSource {

    private final TeamRemoteDataSource teamRemoteDataSource;
    private final TeamLocalDataSource teamLocalDataSource;
    private TeamsDatabase teamsDatabase;

    public TeamRepository(TeamRemoteDataSource teamRemoteDataSource, TeamLocalDataSource teamLocalDataSource) {
        this.teamRemoteDataSource = teamRemoteDataSource;
        this.teamLocalDataSource = teamLocalDataSource;
    }

    @Override
    public void getListTeams(Context context, final GetListTeamsCallBack callBack) {
        NetworkInfo info = ((ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo();
        teamsDatabase = TeamsDatabase.getTeamsDatabase(context);
        if (teamsDatabase.teamsDao().select().size() != 0) {
//            Toast.makeText(context, "use database local", Toast.LENGTH_SHORT).show();
            teamLocalDataSource.getListTeams(context, new GetListTeamsCallBack() {

                @Override
                public void onSuccess(List<TeamsItem> teamsItems) {
                    callBack.onSuccess(teamsItems);
                }

                @Override
                public void onFailed(String errorMessage) {
                    callBack.onFailed(errorMessage);
                }
            });
        } else if (info != null && info.isConnected()) {
//            Toast.makeText(context, "use database cloud", Toast.LENGTH_SHORT).show();
            teamRemoteDataSource.getListTeams(context, new GetListTeamsCallBack() {
                @Override
                public void onSuccess(List<TeamsItem> teamsItems) {
                    callBack.onSuccess(teamsItems);
                    teamsDatabase.teamsDao().insert(teamsItems);
                }

                @Override
                public void onFailed(String errorMessage) {
                    callBack.onFailed(errorMessage);
                }
            });
        } else {
            callBack.onSuccess(null);
            callBack.onFailed("");
        }

    }
}

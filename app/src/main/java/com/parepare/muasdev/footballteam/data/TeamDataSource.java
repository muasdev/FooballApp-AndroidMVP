package com.parepare.muasdev.footballteam.data;

import android.content.Context;

import com.parepare.muasdev.footballteam.model.TeamsItem;

import java.util.List;

public interface TeamDataSource {

    void getListTeams(Context context, GetListTeamsCallBack callBack );

    interface GetListTeamsCallBack {
        void onSuccess(List<TeamsItem> teamsItems);

        void onFailed(String errorMessage);
    }
}

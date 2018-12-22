package com.parepare.muasdev.footballteam.main;

import android.content.Context;

import com.parepare.muasdev.footballteam.model.TeamsItem;

import java.util.List;

public interface MainContract {

    interface View {
        void showProgress();

        void hideProgress();

        void showDataList(List<TeamsItem> teamsItemList);

        void showFailureMessage(String msg);
    }

    interface Presenter {
        void getDataListTeams(Context context);
    }

}

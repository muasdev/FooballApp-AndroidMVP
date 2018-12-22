package com.parepare.muasdev.footballteam.main;

import android.content.Context;

import com.parepare.muasdev.footballteam.data.TeamDataSource;
import com.parepare.muasdev.footballteam.data.TeamRepository;
import com.parepare.muasdev.footballteam.model.TeamsItem;

import java.util.List;

public class MainPresenter implements MainContract.Presenter {

    private final TeamRepository repository;
    private final MainContract.View view;

    public MainPresenter(TeamRepository repository, MainContract.View view) {
        this.repository = repository;
        this.view = view;
    }

    @Override
    public void getDataListTeams(Context context) {
        view.showProgress();
        repository.getListTeams(context, new TeamDataSource.GetListTeamsCallBack() {
            @Override
            public void onSuccess(List<TeamsItem> teamsItems) {
                view.hideProgress();
                view.showDataList(teamsItems);
            }

            @Override
            public void onFailed(String errorMessage) {
                view.hideProgress();
                view.showFailureMessage(errorMessage);
            }
        });
    }
}

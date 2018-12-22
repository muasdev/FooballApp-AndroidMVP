package com.parepare.muasdev.footballteam.view;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.parepare.muasdev.footballteam.Injection;
import com.parepare.muasdev.footballteam.R;
import com.parepare.muasdev.footballteam.adapter.TeamAdapter;
import com.parepare.muasdev.footballteam.main.MainContract;
import com.parepare.muasdev.footballteam.main.MainPresenter;
import com.parepare.muasdev.footballteam.model.TeamsItem;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainContract.View {


    @BindView(R.id.rv_teams)
    public RecyclerView rvTeams;

    private ProgressDialog progressDialog;
    private TeamAdapter adapter;
    private final List<TeamsItem> teamsArrayList = new ArrayList<>();

    private final MainPresenter mainPresenter = new MainPresenter(Injection.provideRepository(), this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initAdapter();
        mainPresenter.getDataListTeams(MainActivity.this);

    }

    private void initAdapter() {
        adapter = new TeamAdapter(getApplicationContext(), teamsArrayList);
        rvTeams.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
        rvTeams.setHasFixedSize(true);
        rvTeams.setAdapter(adapter);
    }

    @Override
    public void showProgress() {
        progressDialog = new ProgressDialog(MainActivity.this);
        progressDialog.setMessage("Loading....");
        progressDialog.setTitle("Harap tunggu");
        progressDialog.show();
    }

    @Override
    public void hideProgress() {
        progressDialog.dismiss();
    }

    @Override
    public void showDataList(List<TeamsItem> teamsItemList) {
        teamsArrayList.addAll(teamsItemList);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void showFailureMessage(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}

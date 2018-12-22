package com.parepare.muasdev.footballteam.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.parepare.muasdev.footballteam.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DetailTeamActivity extends AppCompatActivity {

    @BindView(R.id.bannerClub)
    ImageView bannerClub;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.app_bar_layout)
    AppBarLayout appBarLayout;
    @BindView(R.id.tv_detail_pelatih_club)
    TextView tvDetailPelatihClub;
    @BindView(R.id.tv_detail_desk_club)
    TextView tvDetailDeskClub;
    @BindView(R.id.card_view)
    CardView cardView;
    @BindView(R.id.coordinatorLayout)
    CoordinatorLayout coordinatorLayout;
    String namaTeam;
    @BindView(R.id.tv_detail_stadium)
    TextView tvDetailStadium;
    @BindView(R.id.iv_detail_stadium)
    ImageView ivDetailStadium;
    @BindView(R.id.tv_detail_web_club)
    TextView tvDetailWebClub;
    @BindView(R.id.fab_detail)
    FloatingActionButton fabDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_team);
        ButterKnife.bind(this);
        setDataTeam();

        //untuk membuat tombol back button pada toolbar
        toolbar.setTitle(namaTeam);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    private void setDataTeam() {
        String bannerTeam = getIntent().getStringExtra("bannerTeam");
        namaTeam = getIntent().getStringExtra("namaTeam");
        String deskTeam = getIntent().getStringExtra("deskTeam");
        String managerTeam = getIntent().getStringExtra("managerTeam");
        String stadiumTeam = getIntent().getStringExtra("stadiumTeam");
        String stadiumImageTeam = getIntent().getStringExtra("stadiumImageTeam");
        String webTeam = getIntent().getStringExtra("webTeam");
        RequestOptions options = new RequestOptions()
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .priority(Priority.HIGH);
        Glide.with(getApplicationContext())
                .load(bannerTeam)
                .apply(options)
                .into(bannerClub);
//        tvDetailNamaClub.setText(namaTeam);
        tvDetailPelatihClub.setText(deskTeam);
        tvDetailDeskClub.setText(managerTeam);
        tvDetailStadium.setText(stadiumTeam);
        Glide.with(getApplicationContext())
                .load(stadiumImageTeam)
                .apply(options)
                .into(ivDetailStadium);
        tvDetailWebClub.setText(webTeam);
    }

    //membuat animasi ketika melakukan tombol back
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: {
                finish();
                overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
                break;
            }
        }
        return super.onOptionsItemSelected(item);
    }

    //membuat fungsi tombol back button toolbar berjalan
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
    }

    @OnClick(R.id.fab_detail)
    public void onViewClicked() {
//        Toast.makeText(this, "share", Toast.LENGTH_SHORT).show();
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, namaTeam);
        sendIntent.setType("text/plain");
        startActivity(Intent.createChooser(sendIntent, "Share this team!"));
    }
}

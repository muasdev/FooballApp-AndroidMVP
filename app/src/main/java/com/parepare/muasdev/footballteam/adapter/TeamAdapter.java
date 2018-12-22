package com.parepare.muasdev.footballteam.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.parepare.muasdev.footballteam.ItemClickSupport;
import com.parepare.muasdev.footballteam.R;
import com.parepare.muasdev.footballteam.model.TeamsItem;
import com.parepare.muasdev.footballteam.view.DetailTeamActivity;

import java.util.List;

import static android.support.constraint.Constraints.TAG;

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.ViewHolder> {

    private final Context context;
    private final List<TeamsItem> teamsItems;

    public TeamAdapter(Context context, List<TeamsItem> teamsItems) {
        this.context = context;
        this.teamsItems = teamsItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_team, parent, false);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        view.setLayoutParams(layoutParams);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        final TeamsItem teamsItem = teamsItems.get(position);
        Glide.with(context)
                .load(teamsItem.getStrTeamBadge())
                .into(viewHolder.imageViewLogoClub);
        Log.d(TAG, "imageClub" + teamsItem.getStrTeamLogo());
        viewHolder.textViewNamaClub.setText(teamsItem.getStrTeam());
        Log.d(TAG, "namaClub" + teamsItem.getStrTeam());
//        Toast.makeText(context, "ini" + teamsItem.getStrTeam(), Toast.LENGTH_SHORT);
        viewHolder.cardViewItem.setOnClickListener(new ItemClickSupport(position, new ItemClickSupport.OnItemClick() {
            @Override
            public void onItemClicked(View view, int position) {
//                Toast.makeText(context, "in" + teamsItem.getStrTeam(), Toast.LENGTH_SHORT).show();
                Intent i = new Intent(context, DetailTeamActivity.class);
                i.putExtra("namaTeam", teamsItem.getStrTeam());
                i.putExtra("bannerTeam", teamsItem.getStrTeamBadge());
                i.putExtra("deskTeam", teamsItem.getStrDescriptionEN());
                i.putExtra("managerTeam", teamsItem.getStrManager());
                i.putExtra("stadiumTeam", teamsItem.getStrStadium());
                i.putExtra("stadiumImageTeam", teamsItem.getStrStadiumThumb());
                i.putExtra("webTeam", teamsItem.getStrWebsite());
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(i);

            }
        }));
    }

    @Override
    public int getItemCount() {
        return teamsItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private CardView cardViewItem;
        private ImageView imageViewLogoClub;
        private TextView textViewNamaClub;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardViewItem = itemView.findViewById(R.id.cv_item_team);
            imageViewLogoClub = itemView.findViewById(R.id.iv_logo_club);
            textViewNamaClub = itemView.findViewById(R.id.tv_nama_club);
        }
    }
}

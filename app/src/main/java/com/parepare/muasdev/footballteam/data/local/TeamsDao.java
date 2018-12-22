package com.parepare.muasdev.footballteam.data.local;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.parepare.muasdev.footballteam.model.TeamsItem;

import java.util.List;

@Dao
public interface TeamsDao {

    @Insert
    void insert(List<TeamsItem> teamsItemList);

    @Query("SELECT * FROM teams ORDER BY strTeam ASC")
    List<TeamsItem> select();

    @Delete
    void delete(TeamsItem teams);

    @Update
    void update(TeamsItem teams);

}

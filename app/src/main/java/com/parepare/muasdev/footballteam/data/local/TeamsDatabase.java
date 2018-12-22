package com.parepare.muasdev.footballteam.data.local;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.parepare.muasdev.footballteam.model.TeamsItem;

@Database(entities = TeamsItem.class, version = 1)
public abstract class TeamsDatabase extends RoomDatabase {

    public abstract TeamsDao teamsDao();

    private static TeamsDatabase teamsDatabase;

    public static TeamsDatabase getTeamsDatabase(Context context) {
        synchronized (TeamsDatabase.class) {
            if (teamsDatabase == null) {
                teamsDatabase = Room.databaseBuilder(context, TeamsDatabase.class, "db_football").allowMainThreadQueries().build();
            }
        }
        return teamsDatabase;
    }
}

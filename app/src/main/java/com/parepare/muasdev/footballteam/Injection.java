package com.parepare.muasdev.footballteam;

import com.parepare.muasdev.footballteam.data.TeamRepository;
import com.parepare.muasdev.footballteam.data.local.TeamLocalDataSource;
import com.parepare.muasdev.footballteam.data.remote.TeamRemoteDataSource;

public class Injection {

    public static TeamRepository provideRepository() {
        return new TeamRepository(new TeamRemoteDataSource(), new TeamLocalDataSource());
    }

}

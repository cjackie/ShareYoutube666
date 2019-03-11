package com.chaojie.videos;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class VideoDataSource extends HikariDataSource {

    public VideoDataSource(HikariConfig config) {
        super(config);
    }
}

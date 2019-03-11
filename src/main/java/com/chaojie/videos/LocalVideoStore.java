package com.chaojie.videos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import java.io.File;
import java.net.URI;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Component
@ConditionalOnProperty(prefix = "videos.stores", name = "localVideoStore")
public class LocalVideoStore implements IVideoStore {
    private final File storageDirectory;
    private VideoDataSource dataSource;

    public LocalVideoStore(VideoDataSource dataSource, @Value("localVideoStore.storageDirectory") String dirPath) {
        this.dataSource = dataSource;
        this.storageDirectory = new File(dirPath);
        this.storageDirectory.mkdir();
    }

    @Override
    public URI locate(Long videoId) {
        return null;
    }

    @Override
    public List<Video> search(VideoCriteria videoCriteria) {
        return null;
    }

    @Override
    public void store(Video video, File content) {
        try (Connection con = dataSource.getConnection()) {
            String insert = "INSERT INTO YoutubeVideoRefs(Creator, URL) VALUES (?,?)";
            try (PreparedStatement ps = con.prepareStatement(insert, new String[]{"Id"})) {
                // TODO

            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

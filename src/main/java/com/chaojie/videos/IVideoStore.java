package com.chaojie.videos;

import java.io.File;
import java.net.URI;
import java.util.List;

public interface IVideoStore {
    URI locate(Long videoId);
    List<Video> search(VideoCriteria videoCriteria);
    void store(Video video, File content);

}

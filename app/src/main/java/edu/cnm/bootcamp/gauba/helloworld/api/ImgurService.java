package edu.cnm.bootcamp.gauba.helloworld.api;


import edu.cnm.bootcamp.gauba.helloworld.api.models.GalleryResponse;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Single;

public interface ImgurService {
  @GET("gallery/r/{subreddit}/{sort}/{window}/{page}")
  Single<GalleryResponse> subredditGallery(
      @Path("subreddit") String subreddit,
      @Path("sort") String sort,
      @Path("window") String window,
      @Path("page") int page
  );

}

package com.sf.sofarmusic.online.artist.model;

import com.google.gson.annotations.SerializedName;
import com.sf.base.network.retrofit.response.ListResponse;
import com.sf.sofarmusic.model.Artist;
import java.util.List;

public class ArtistResponse implements ListResponse<Artist> {

  @SerializedName("artist")
  public List<Artist> artists;

  @SerializedName("havemore")
  public int haveMore;

  @Override
  public boolean hasMore() {
    return haveMore == 1;
  }

  @Override
  public List<Artist> getItems() {
    return artists;
  }
}

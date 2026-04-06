package com.lokalise.sdk.api;

import com.lokalise.sdk.api.poko.BundleResponse;
import kotlin.Metadata;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Url;

@Metadata
public interface SdkEndpoints {
    @GET("v2.0/android/")
    Call<BundleResponse> getLinkOnTranslationsFile(@Header("X-Request-Id") String str, @Header("INTERNAL_ATTEMPTS") int i2);

    @GET
    Call<ResponseBody> readJsonObject(@Header("INTERNAL_ATTEMPTS") int i2, @Url String str);
}

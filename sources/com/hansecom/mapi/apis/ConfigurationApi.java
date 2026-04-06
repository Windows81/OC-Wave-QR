package com.hansecom.mapi.apis;

import com.hansecom.mapi.models.EnvironmentConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.GET;

@Metadata
public interface ConfigurationApi {
    @GET("configurations")
    Object a(Continuation<? super Response<EnvironmentConfiguration>> continuation);
}

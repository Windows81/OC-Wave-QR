package com.hansecom.abt.api.oauth;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

@Metadata
public interface OAuthService {
    @FormUrlEncoded
    @POST(" ")
    Object a(@Field("username") String str, @Field("password") String str2, @Field("grant_type") String str3, @Field("client_id") String str4, @Field("client_secret") String str5, Continuation<? super Response<OAuthTokenResponse>> continuation);

    @FormUrlEncoded
    @POST(" ")
    Object b(@Field("refresh_token") String str, @Field("grant_type") String str2, @Field("client_id") String str3, @Field("client_secret") String str4, Continuation<? super Response<OAuthTokenResponse>> continuation);
}

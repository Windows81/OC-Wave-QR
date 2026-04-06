package com.hansecom.mapi.apis;

import com.hansecom.mapi.models.FareMedium;
import com.hansecom.mapi.models.Institution;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

@Metadata
public interface InstitutionsApi {
    @POST("users/fare-medias/{cardId}/institutions/{institutionId}")
    Object a(@Path("cardId") String str, @Path("institutionId") String str2, Continuation<? super Response<FareMedium>> continuation);

    @DELETE("users/fare-medias/{cardId}/institutions/{institutionId}")
    Object b(@Path("cardId") String str, @Path("institutionId") String str2, Continuation<? super Response<Unit>> continuation);

    @GET("v2/users/fare-medias/{cardId}/institutions")
    Object c(@Path("cardId") String str, Continuation<? super Response<List<Institution>>> continuation);

    @GET("users/institutions")
    Object d(Continuation<? super Response<List<Institution>>> continuation);
}

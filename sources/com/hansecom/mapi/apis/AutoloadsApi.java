package com.hansecom.mapi.apis;

import com.hansecom.mapi.models.FareMediaAutoload;
import com.hansecom.mapi.models.FareMediaAutoloadRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntriesKt;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata
public interface AutoloadsApi {

    @Metadata
    public enum AutoloadTypeGetAutoloads {
        PASS("PASS"),
        STORED_VALUE("STORED_VALUE");
        

        /* renamed from: z  reason: collision with root package name */
        public final String f39104z;

        static {
            AutoloadTypeGetAutoloads[] d2;
            f39103B = EnumEntriesKt.a(d2);
        }

        /* access modifiers changed from: public */
        AutoloadTypeGetAutoloads(String str) {
            this.f39104z = str;
        }
    }

    @Metadata
    public static final class DefaultImpls {
        public static /* synthetic */ Object a(AutoloadsApi autoloadsApi, String str, AutoloadTypeGetAutoloads autoloadTypeGetAutoloads, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    autoloadTypeGetAutoloads = null;
                }
                return autoloadsApi.d(str, autoloadTypeGetAutoloads, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAutoloads");
        }
    }

    @PUT("users/fare-medias/{cardId}/autoloads/{autoloadId}")
    Object a(@Path("cardId") String str, @Path("autoloadId") String str2, @Body FareMediaAutoloadRequest fareMediaAutoloadRequest, Continuation<? super Response<FareMediaAutoload>> continuation);

    @POST("users/fare-medias/{cardId}/autoloads")
    Object b(@Path("cardId") String str, @Body FareMediaAutoloadRequest fareMediaAutoloadRequest, Continuation<? super Response<FareMediaAutoload>> continuation);

    @DELETE("users/fare-medias/{cardId}/autoloads/{autoloadId}")
    Object c(@Path("cardId") String str, @Path("autoloadId") String str2, Continuation<? super Response<FareMediaAutoload>> continuation);

    @GET("users/fare-medias/{cardId}/autoloads")
    Object d(@Path("cardId") String str, @Query("autoloadType") AutoloadTypeGetAutoloads autoloadTypeGetAutoloads, Continuation<? super Response<List<FareMediaAutoload>>> continuation);
}

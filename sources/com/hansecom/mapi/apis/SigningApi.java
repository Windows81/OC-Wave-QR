package com.hansecom.mapi.apis;

import com.hansecom.mapi.models.PrivKey;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata
public interface SigningApi {

    @Metadata
    public static final class DefaultImpls {
        public static /* synthetic */ Object a(SigningApi signingApi, Integer num, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    num = null;
                }
                return signingApi.a(num, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllPrivateKeys");
        }
    }

    @GET("fare-medias/private-keys")
    Object a(@Query("version") Integer num, Continuation<? super Response<List<PrivKey>>> continuation);
}

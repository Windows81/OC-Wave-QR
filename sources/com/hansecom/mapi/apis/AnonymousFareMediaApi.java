package com.hansecom.mapi.apis;

import com.hansecom.mapi.models.FareMediaCredentialsWithValidityExtention;
import com.hansecom.mapi.models.FareMedium;
import com.hansecom.mapi.models.FareMediumUsagePermission;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

@Metadata
public interface AnonymousFareMediaApi {

    @Metadata
    public static final class DefaultImpls {
        public static /* synthetic */ Object a(AnonymousFareMediaApi anonymousFareMediaApi, String str, FareMediaCredentialsWithValidityExtention fareMediaCredentialsWithValidityExtention, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    str = null;
                }
                if ((i2 & 2) != 0) {
                    fareMediaCredentialsWithValidityExtention = null;
                }
                return anonymousFareMediaApi.a(str, fareMediaCredentialsWithValidityExtention, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUsagePermissionForFareMedia");
        }
    }

    @POST("fare-medias/usage-permissions")
    Object a(@Header("x-usage-permission") String str, @Body FareMediaCredentialsWithValidityExtention fareMediaCredentialsWithValidityExtention, Continuation<? super Response<FareMediumUsagePermission>> continuation);

    @GET("fare-medias/{cardId}")
    Object b(@Header("x-usage-permission") String str, @Path("cardId") String str2, Continuation<? super Response<FareMedium>> continuation);
}

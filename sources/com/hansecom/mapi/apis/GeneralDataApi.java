package com.hansecom.mapi.apis;

import com.hansecom.mapi.models.Country;
import com.hansecom.mapi.models.FareCategory;
import com.hansecom.mapi.models.FareProductOffer;
import com.hansecom.mapi.models.SecurityQuestionAllResponse;
import com.hansecom.mapi.models.VirtualFareMedia;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

@Metadata
public interface GeneralDataApi {

    @Metadata
    public static final class DefaultImpls {
        public static /* synthetic */ Object a(GeneralDataApi generalDataApi, String str, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    str = null;
                }
                return generalDataApi.f(str, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllAvailableFareMedia");
        }
    }

    @GET("states")
    Object a(@Query("countryId") Integer num, Continuation<? super Response<List<String>>> continuation);

    @GET("fare-products")
    Object b(@Query("cardId") String str, Continuation<? super Response<List<FareProductOffer>>> continuation);

    @GET("v2/fare-medias/fare-categories")
    Object c(Continuation<? super Response<List<FareCategory>>> continuation);

    @GET("security-questions")
    Object d(Continuation<? super Response<List<SecurityQuestionAllResponse>>> continuation);

    @GET("countries")
    Object e(Continuation<? super Response<List<Country>>> continuation);

    @GET("v2/fare-medias/virtual-media")
    Object f(@Header("app-platform") String str, Continuation<? super Response<List<VirtualFareMedia>>> continuation);
}

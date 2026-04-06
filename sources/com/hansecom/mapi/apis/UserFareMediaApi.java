package com.hansecom.mapi.apis;

import com.hansecom.mapi.models.BalanceTransferRequest;
import com.hansecom.mapi.models.CappingPot;
import com.hansecom.mapi.models.FareMediaCredentials;
import com.hansecom.mapi.models.FareMedium;
import com.hansecom.mapi.models.FareMediumConfigurations;
import com.hansecom.mapi.models.FareMediumCreateRequest;
import com.hansecom.mapi.models.FareMediumPurchaseCreateRequest;
import com.hansecom.mapi.models.FareProduct;
import com.hansecom.mapi.models.GoogleWalletProvisioningResponse;
import com.hansecom.mapi.models.NicknameUpdateModel;
import com.hansecom.mapi.models.TransactionSearchResult;
import com.hansecom.mapi.models.TransferTimeResponse;
import java.time.OffsetDateTime;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata
public interface UserFareMediaApi {

    @Metadata
    public static final class DefaultImpls {
        public static /* synthetic */ Object a(UserFareMediaApi userFareMediaApi, String str, String str2, String str3, String str4, String str5, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                return userFareMediaApi.k(str, str2, str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: convertPhysicalToVirtual");
        }

        public static /* synthetic */ Object b(UserFareMediaApi userFareMediaApi, String str, String str2, String str3, String str4, FareMediumCreateRequest fareMediumCreateRequest, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                return userFareMediaApi.n(str, str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : fareMediumCreateRequest, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createNewVirtualCard");
        }

        public static /* synthetic */ Object c(UserFareMediaApi userFareMediaApi, String str, String str2, String str3, String str4, FareMediumPurchaseCreateRequest fareMediumPurchaseCreateRequest, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                return userFareMediaApi.q(str, str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : fareMediumPurchaseCreateRequest, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createNewVirtualCardPurchase");
        }

        public static /* synthetic */ Object d(UserFareMediaApi userFareMediaApi, String str, String str2, String str3, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    str2 = null;
                }
                if ((i2 & 4) != 0) {
                    str3 = null;
                }
                return userFareMediaApi.o(str, str2, str3, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getGoogleWalletProvisioningLink");
        }

        public static /* synthetic */ Object e(UserFareMediaApi userFareMediaApi, String str, Integer num, Integer num2, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                return userFareMediaApi.l(str, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : num2, (i2 & 8) != 0 ? null : offsetDateTime, (i2 & 16) != 0 ? null : offsetDateTime2, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTransactions");
        }

        public static /* synthetic */ Object f(UserFareMediaApi userFareMediaApi, String str, String str2, String str3, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    str3 = null;
                }
                return userFareMediaApi.r(str, str2, str3, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: migrateVirtualCard");
        }
    }

    @GET("users/fare-medias/{cardId}/capping-pots")
    Object a(@Path("cardId") String str, Continuation<? super Response<List<CappingPot>>> continuation);

    @GET("users/fare-medias/{cardId}/fare-products")
    Object b(@Path("cardId") String str, Continuation<? super Response<List<FareProduct>>> continuation);

    @PATCH("users/fare-medias/{cardId}/nickname")
    Object c(@Path("cardId") String str, @Body NicknameUpdateModel nicknameUpdateModel, Continuation<? super Response<FareMedium>> continuation);

    @GET("v2/users/fare-medias")
    Object d(@Header("deviceID") String str, @Header("bundleID") String str2, Continuation<? super Response<List<FareMedium>>> continuation);

    @DELETE("users/fare-medias/{cardId}/links")
    Object e(@Path("cardId") String str, Continuation<? super Response<FareMedium>> continuation);

    @DELETE("users/fare-medias/{cardId}/lock")
    Object f(@Path("cardId") String str, Continuation<? super Response<FareMedium>> continuation);

    @PATCH("users/fare-medias/{cardId}/lock")
    Object g(@Path("cardId") String str, Continuation<? super Response<FareMedium>> continuation);

    @GET("users/fare-medias/{cardId}/configurations")
    Object h(@Path("cardId") String str, Continuation<? super Response<FareMediumConfigurations>> continuation);

    @POST("v2/users/fare-medias/{cardId}/vanilla-direct-barcode")
    Object i(@Path("cardId") String str, Continuation<? super Response<FareMedium>> continuation);

    @POST("users/fare-medias/links")
    Object j(@Header("deviceID") String str, @Header("bundleID") String str2, @Body FareMediaCredentials fareMediaCredentials, Continuation<? super Response<FareMedium>> continuation);

    @PUT("v2/users/fare-medias/{cardId}/convert")
    Object k(@Path("cardId") String str, @Header("deviceID") String str2, @Header("bundleID") String str3, @Header("device-type") String str4, @Header("app-platform") String str5, Continuation<? super Response<FareMedium>> continuation);

    @GET("users/fare-medias/{cardId}/transactions")
    Object l(@Path("cardId") String str, @Query("skip") Integer num, @Query("take") Integer num2, @Query("minDate") OffsetDateTime offsetDateTime, @Query("maxDate") OffsetDateTime offsetDateTime2, Continuation<? super Response<TransactionSearchResult>> continuation);

    @GET("v2/users/fare-medias/{cardId}/transfer-time")
    Object m(@Path("cardId") String str, Continuation<? super Response<TransferTimeResponse>> continuation);

    @POST("v2/users/fare-medias/virtual-card")
    Object n(@Header("deviceID") String str, @Header("bundleID") String str2, @Header("device-type") String str3, @Header("app-platform") String str4, @Body FareMediumCreateRequest fareMediumCreateRequest, Continuation<? super Response<FareMedium>> continuation);

    @GET("v2/users/fare-medias/{cardId}/wallet/provisioning/google")
    Object o(@Path("cardId") String str, @Header("deviceID") String str2, @Header("bundleID") String str3, Continuation<? super Response<GoogleWalletProvisioningResponse>> continuation);

    @PUT("v2/users/fare-medias/{cardId}/transfer-balance")
    Object p(@Path("cardId") String str, @Body BalanceTransferRequest balanceTransferRequest, Continuation<? super Response<Unit>> continuation);

    @POST("v2/users/fare-medias/virtual-card/purchase")
    Object q(@Header("deviceID") String str, @Header("bundleID") String str2, @Header("device-type") String str3, @Header("app-platform") String str4, @Body FareMediumPurchaseCreateRequest fareMediumPurchaseCreateRequest, Continuation<? super Response<FareMedium>> continuation);

    @PUT("v2/users/fare-medias/virtual-card")
    Object r(@Header("deviceID") String str, @Header("bundleID") String str2, @Header("device-type") String str3, Continuation<? super Response<FareMedium>> continuation);
}

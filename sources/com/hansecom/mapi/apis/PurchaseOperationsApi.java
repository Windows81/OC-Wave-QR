package com.hansecom.mapi.apis;

import com.hansecom.mapi.models.CombinedProductOrderGooglePayRequest;
import com.hansecom.mapi.models.CombinedProductOrderRequest;
import com.hansecom.mapi.models.PrePurchasePromoCode;
import com.hansecom.mapi.models.PrePurchaseWithPromoCodeResponse;
import com.hansecom.mapi.models.PreTopUpPromoCode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.PUT;

@Metadata
public interface PurchaseOperationsApi {

    @Metadata
    public static final class DefaultImpls {
    }

    @POST("users/fare-medias/purchase-orders/google-pay")
    Object a(@Body CombinedProductOrderGooglePayRequest combinedProductOrderGooglePayRequest, Continuation<? super Response<Unit>> continuation);

    @POST("users/fare-medias/purchase-orders")
    Object b(@Body CombinedProductOrderRequest combinedProductOrderRequest, Continuation<? super Response<Unit>> continuation);

    @PUT("promo-code/pre-top-up")
    Object c(@Body PreTopUpPromoCode preTopUpPromoCode, Continuation<? super Response<PrePurchaseWithPromoCodeResponse>> continuation);

    @PUT("promo-code/pre-purchase")
    Object d(@Body PrePurchasePromoCode prePurchasePromoCode, Continuation<? super Response<PrePurchaseWithPromoCodeResponse>> continuation);
}

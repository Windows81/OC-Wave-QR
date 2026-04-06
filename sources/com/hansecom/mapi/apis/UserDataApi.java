package com.hansecom.mapi.apis;

import com.hansecom.mapi.models.AddPaymentMethodRequest;
import com.hansecom.mapi.models.ChangeIvrPinRequest;
import com.hansecom.mapi.models.ChangePasswordRequest;
import com.hansecom.mapi.models.CreateCyberSourceFormRequest;
import com.hansecom.mapi.models.DeleteUserRequest;
import com.hansecom.mapi.models.PaymentMethod;
import com.hansecom.mapi.models.ResetPasswordRequest;
import com.hansecom.mapi.models.SecurityQuestionRequest;
import com.hansecom.mapi.models.SecurityQuestionResponse;
import com.hansecom.mapi.models.SendActivationEmailRequest;
import com.hansecom.mapi.models.User;
import com.hansecom.mapi.models.UserAddress;
import com.hansecom.mapi.models.UserCreateRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

@Metadata
public interface UserDataApi {

    @Metadata
    public static final class DefaultImpls {
    }

    @PUT("users/addresses")
    Object a(@Body UserAddress userAddress, Continuation<? super Response<UserAddress>> continuation);

    @POST("users/passwords/reset")
    Object b(@Body ResetPasswordRequest resetPasswordRequest, Continuation<? super Response<Unit>> continuation);

    @POST("users/payment-methods")
    Object c(@Body AddPaymentMethodRequest addPaymentMethodRequest, Continuation<? super Response<Unit>> continuation);

    @PUT("users")
    Object d(@Body User user, Continuation<? super Response<User>> continuation);

    @PUT("users/payment-methods/{paymentMethodId}")
    Object e(@Path("paymentMethodId") long j2, @Body PaymentMethod paymentMethod, Continuation<? super Response<PaymentMethod>> continuation);

    @POST("users/security-questions")
    Object f(@Body List<SecurityQuestionRequest> list, Continuation<? super Response<List<SecurityQuestionResponse>>> continuation);

    @POST("users/payment-methods/cyber-source-form")
    Object g(@Body CreateCyberSourceFormRequest createCyberSourceFormRequest, Continuation<? super Response<String>> continuation);

    @PUT("users/passwords")
    Object h(@Body ChangePasswordRequest changePasswordRequest, Continuation<? super Response<Unit>> continuation);

    @POST("v2/users/delete")
    Object i(@Body DeleteUserRequest deleteUserRequest, Continuation<? super Response<Unit>> continuation);

    @PUT("users/ivr-pin")
    Object j(@Body ChangeIvrPinRequest changeIvrPinRequest, Continuation<? super Response<Unit>> continuation);

    @POST("users/activation")
    Object k(@Body SendActivationEmailRequest sendActivationEmailRequest, Continuation<? super Response<Unit>> continuation);

    @DELETE("users/payment-methods/{paymentMethodId}")
    Object l(@Path("paymentMethodId") long j2, Continuation<? super Response<Unit>> continuation);

    @GET("users/security-questions")
    Object m(Continuation<? super Response<List<SecurityQuestionResponse>>> continuation);

    @POST("users")
    Object n(@Body UserCreateRequest userCreateRequest, Continuation<? super Response<User>> continuation);

    @GET("users/payment-methods")
    Object o(Continuation<? super Response<List<PaymentMethod>>> continuation);

    @GET("users")
    Object p(Continuation<? super Response<User>> continuation);
}

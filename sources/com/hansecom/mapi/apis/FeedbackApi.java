package com.hansecom.mapi.apis;

import com.hansecom.mapi.models.HelpRequestResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody;
import retrofit2.Response;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

@Metadata
public interface FeedbackApi {

    @Metadata
    public static final class DefaultImpls {
        public static /* synthetic */ Object a(FeedbackApi feedbackApi, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, MultipartBody.Part part, Continuation continuation, int i2, Object obj) {
            int i3 = i2;
            if (obj == null) {
                return feedbackApi.a((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? null : str4, (i3 & 16) != 0 ? null : str5, (i3 & 32) != 0 ? null : str6, (i3 & 64) != 0 ? null : str7, (i3 & 128) != 0 ? null : str8, (i3 & 256) != 0 ? null : str9, (i3 & 512) != 0 ? null : str10, (i3 & 1024) != 0 ? null : str11, (i3 & 2048) != 0 ? null : str12, (i3 & 4096) != 0 ? null : part, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitHelpRequest");
        }
    }

    @POST("help-request")
    @Multipart
    Object a(@Header("Authorization") String str, @Part("contactName") String str2, @Part("email") String str3, @Part("phoneNumber") String str4, @Part("subject") String str5, @Part("card") String str6, @Part("description") String str7, @Part("caseReason") String str8, @Part("caseCategory") String str9, @Part("caseResolution") String str10, @Part("appVersion") String str11, @Part("deviceType") String str12, @Part MultipartBody.Part part, Continuation<? super Response<HelpRequestResponse>> continuation);
}

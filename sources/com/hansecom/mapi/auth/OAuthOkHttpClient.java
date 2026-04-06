package com.hansecom.mapi.auth;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.apache.oltu.oauth2.client.HttpClient;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.response.OAuthClientResponse;
import org.apache.oltu.oauth2.client.response.OAuthClientResponseFactory;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;

@Metadata
public final class OAuthOkHttpClient implements HttpClient {

    /* renamed from: a  reason: collision with root package name */
    public OkHttpClient f39116a;

    public OAuthClientResponse a(OAuthClientRequest oAuthClientRequest, Map map, String str, Class cls) {
        RequestBody requestBody;
        MediaType f2;
        Intrinsics.i(oAuthClientRequest, "request");
        Intrinsics.i(str, "requestMethod");
        MediaType b2 = MediaType.f42680e.b("application/json");
        Request.Builder builder = new Request.Builder();
        String c2 = oAuthClientRequest.c();
        Intrinsics.h(c2, "getLocationUri(...)");
        Request.Builder i2 = builder.i(c2);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (StringsKt.B((String) entry.getKey(), "Content-Type", true)) {
                    b2 = MediaType.f42680e.b((String) entry.getValue());
                } else {
                    i2.a((String) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        String str2 = null;
        if (oAuthClientRequest.e() != null) {
            RequestBody.Companion companion = RequestBody.f42761a;
            String e2 = oAuthClientRequest.e();
            Intrinsics.h(e2, "getBody(...)");
            requestBody = companion.a(e2, b2);
        } else {
            requestBody = null;
        }
        i2.f(str, requestBody);
        try {
            Response execute = FirebasePerfOkHttpClient.execute(this.f39116a.b(i2.b()));
            ResponseBody a2 = execute.a();
            String k2 = a2 != null ? a2.k() : null;
            ResponseBody a3 = execute.a();
            if (!(a3 == null || (f2 = a3.f()) == null)) {
                str2 = f2.toString();
            }
            return OAuthClientResponseFactory.b(k2, str2, execute.f(), execute.m().n(), cls);
        } catch (IOException e3) {
            throw new OAuthSystemException(e3);
        }
    }
}

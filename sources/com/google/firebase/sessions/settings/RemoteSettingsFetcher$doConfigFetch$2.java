package com.google.firebase.sessions.settings;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

@Metadata
@DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", f = "RemoteSettingsFetcher.kt", l = {68, 70, 73}, m = "invokeSuspend")
public final class RemoteSettingsFetcher$doConfigFetch$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ RemoteSettingsFetcher E;
    public final /* synthetic */ Map F;
    public final /* synthetic */ Function2 G;
    public final /* synthetic */ Function2 H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RemoteSettingsFetcher$doConfigFetch$2(RemoteSettingsFetcher remoteSettingsFetcher, Map map, Function2 function2, Function2 function22, Continuation continuation) {
        super(2, continuation);
        this.E = remoteSettingsFetcher;
        this.F = map;
        this.G = function2;
        this.H = function22;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((RemoteSettingsFetcher$doConfigFetch$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new RemoteSettingsFetcher$doConfigFetch$2(this.E, this.F, this.G, this.H, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            URLConnection openConnection = this.E.c().openConnection();
            Intrinsics.g(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
            httpsURLConnection.setRequestMethod("GET");
            httpsURLConnection.setRequestProperty("Accept", "application/json");
            for (Map.Entry entry : this.F.entrySet()) {
                httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            int responseCode = httpsURLConnection.getResponseCode();
            if (responseCode == 200) {
                InputStream inputStream = httpsURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder sb = new StringBuilder();
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    objectRef.f40908z = readLine;
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                }
                bufferedReader.close();
                inputStream.close();
                JSONObject jSONObject = new JSONObject(sb.toString());
                Function2 function2 = this.G;
                this.D = 1;
                if (function2.m(jSONObject, this) == f2) {
                    return f2;
                }
            } else {
                Function2 function22 = this.H;
                String str = "Bad response code: " + responseCode;
                this.D = 2;
                if (function22.m(str, this) == f2) {
                    return f2;
                }
            }
        } else if (i2 == 1 || i2 == 2) {
            try {
                ResultKt.b(obj);
            } catch (Exception e2) {
                Function2 function23 = this.H;
                String message = e2.getMessage();
                if (message == null) {
                    message = e2.toString();
                }
                this.D = 3;
                if (function23.m(message, this) == f2) {
                    return f2;
                }
            }
        } else if (i2 == 3) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f40552a;
    }
}

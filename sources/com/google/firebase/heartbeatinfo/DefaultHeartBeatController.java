package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.core.os.UserManagerCompat;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.inject.Provider;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

public class DefaultHeartBeatController implements HeartBeatController, HeartBeatInfo {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f30754a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f30755b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f30756c;

    /* renamed from: d  reason: collision with root package name */
    public final Set f30757d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f30758e;

    public DefaultHeartBeatController(Context context, String str, Set set, Provider provider, Executor executor) {
        this((Provider) new d(context, str), set, executor, provider, context);
    }

    public static Component f() {
        Qualified a2 = Qualified.a(Background.class, Executor.class);
        return Component.f(DefaultHeartBeatController.class, HeartBeatController.class, HeartBeatInfo.class).b(Dependency.j(Context.class)).b(Dependency.j(FirebaseApp.class)).b(Dependency.m(HeartBeatConsumer.class)).b(Dependency.l(UserAgentPublisher.class)).b(Dependency.i(a2)).e(new c(a2)).c();
    }

    public static /* synthetic */ DefaultHeartBeatController g(Qualified qualified, ComponentContainer componentContainer) {
        return new DefaultHeartBeatController((Context) componentContainer.a(Context.class), ((FirebaseApp) componentContainer.a(FirebaseApp.class)).o(), componentContainer.g(HeartBeatConsumer.class), componentContainer.c(UserAgentPublisher.class), (Executor) componentContainer.f(qualified));
    }

    public static /* synthetic */ HeartBeatInfoStorage i(Context context, String str) {
        return new HeartBeatInfoStorage(context, str);
    }

    public Task a() {
        return !UserManagerCompat.a(this.f30755b) ? Tasks.e("") : Tasks.c(this.f30758e, new b(this));
    }

    public final /* synthetic */ String h() {
        Base64OutputStream base64OutputStream;
        GZIPOutputStream gZIPOutputStream;
        String byteArrayOutputStream;
        synchronized (this) {
            try {
                HeartBeatInfoStorage heartBeatInfoStorage = (HeartBeatInfoStorage) this.f30754a.get();
                List c2 = heartBeatInfoStorage.c();
                heartBeatInfoStorage.b();
                JSONArray jSONArray = new JSONArray();
                for (int i2 = 0; i2 < c2.size(); i2++) {
                    HeartBeatResult heartBeatResult = (HeartBeatResult) c2.get(i2);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", heartBeatResult.c());
                    jSONObject.put("dates", new JSONArray(heartBeatResult.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
            } catch (Throwable th) {
                throw th;
            }
        }
        return byteArrayOutputStream;
        throw th;
        throw th;
    }

    public final /* synthetic */ Void j() {
        synchronized (this) {
            ((HeartBeatInfoStorage) this.f30754a.get()).g(System.currentTimeMillis(), ((UserAgentPublisher) this.f30756c.get()).a());
        }
        return null;
    }

    public Task k() {
        return this.f30757d.size() <= 0 ? Tasks.e((Object) null) : !UserManagerCompat.a(this.f30755b) ? Tasks.e((Object) null) : Tasks.c(this.f30758e, new a(this));
    }

    public DefaultHeartBeatController(Provider provider, Set set, Executor executor, Provider provider2, Context context) {
        this.f30754a = provider;
        this.f30757d = set;
        this.f30758e = executor;
        this.f30756c = provider2;
        this.f30755b = context;
    }
}

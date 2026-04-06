package com.google.firebase.crashlytics.internal.settings;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.common.SystemCurrentTimeProvider;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

public class SettingsController implements SettingsProvider {

    /* renamed from: a  reason: collision with root package name */
    public final Context f30669a;

    /* renamed from: b  reason: collision with root package name */
    public final SettingsRequest f30670b;

    /* renamed from: c  reason: collision with root package name */
    public final SettingsJsonParser f30671c;

    /* renamed from: d  reason: collision with root package name */
    public final CurrentTimeProvider f30672d;

    /* renamed from: e  reason: collision with root package name */
    public final CachedSettingsIo f30673e;

    /* renamed from: f  reason: collision with root package name */
    public final SettingsSpiCall f30674f;

    /* renamed from: g  reason: collision with root package name */
    public final DataCollectionArbiter f30675g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReference f30676h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicReference f30677i = new AtomicReference(new TaskCompletionSource());

    public SettingsController(Context context, SettingsRequest settingsRequest, CurrentTimeProvider currentTimeProvider, SettingsJsonParser settingsJsonParser, CachedSettingsIo cachedSettingsIo, SettingsSpiCall settingsSpiCall, DataCollectionArbiter dataCollectionArbiter) {
        AtomicReference atomicReference = new AtomicReference();
        this.f30676h = atomicReference;
        this.f30669a = context;
        this.f30670b = settingsRequest;
        this.f30672d = currentTimeProvider;
        this.f30671c = settingsJsonParser;
        this.f30673e = cachedSettingsIo;
        this.f30674f = settingsSpiCall;
        this.f30675g = dataCollectionArbiter;
        atomicReference.set(DefaultSettingsJsonTransform.b(currentTimeProvider));
    }

    public static SettingsController l(Context context, String str, IdManager idManager, HttpRequestFactory httpRequestFactory, String str2, String str3, FileStore fileStore, DataCollectionArbiter dataCollectionArbiter) {
        String g2 = idManager.g();
        SystemCurrentTimeProvider systemCurrentTimeProvider = new SystemCurrentTimeProvider();
        String str4 = str3;
        return new SettingsController(context, new SettingsRequest(str, idManager.h(), idManager.i(), idManager.j(), idManager, CommonUtils.h(CommonUtils.m(context), str, str4, str2), str4, str2, DeliveryMechanism.f(g2).h()), systemCurrentTimeProvider, new SettingsJsonParser(systemCurrentTimeProvider), new CachedSettingsIo(fileStore), new DefaultSettingsSpiCall(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", new Object[]{str}), httpRequestFactory), dataCollectionArbiter);
    }

    public Task a() {
        return ((TaskCompletionSource) this.f30677i.get()).a();
    }

    public Settings b() {
        return (Settings) this.f30676h.get();
    }

    public boolean k() {
        return !n().equals(this.f30670b.f30685f);
    }

    public final Settings m(SettingsCacheBehavior settingsCacheBehavior) {
        Settings settings = null;
        try {
            if (SettingsCacheBehavior.SKIP_CACHE_LOOKUP.equals(settingsCacheBehavior)) {
                return null;
            }
            JSONObject b2 = this.f30673e.b();
            if (b2 != null) {
                Settings b3 = this.f30671c.b(b2);
                if (b3 != null) {
                    q(b2, "Loaded cached settings: ");
                    long a2 = this.f30672d.a();
                    if (!SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION.equals(settingsCacheBehavior)) {
                        if (b3.a(a2)) {
                            Logger.f().i("Cached settings have expired.");
                            return null;
                        }
                    }
                    try {
                        Logger.f().i("Returning cached settings.");
                        return b3;
                    } catch (Exception e2) {
                        e = e2;
                        settings = b3;
                        Logger.f().e("Failed to get cached settings", e);
                        return settings;
                    }
                } else {
                    Logger.f().e("Failed to parse cached settings data.", (Throwable) null);
                    return null;
                }
            } else {
                Logger.f().b("No cached settings data found.");
                return null;
            }
        } catch (Exception e3) {
            e = e3;
            Logger.f().e("Failed to get cached settings", e);
            return settings;
        }
    }

    public final String n() {
        return CommonUtils.q(this.f30669a).getString("existing_instance_identifier", "");
    }

    public Task o(SettingsCacheBehavior settingsCacheBehavior, Executor executor) {
        Settings m2;
        if (k() || (m2 = m(settingsCacheBehavior)) == null) {
            Settings m3 = m(SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION);
            if (m3 != null) {
                this.f30676h.set(m3);
                ((TaskCompletionSource) this.f30677i.get()).e(m3);
            }
            return this.f30675g.i(executor).p(executor, new SuccessContinuation<Void, Void>() {
                /* renamed from: b */
                public Task a(Void voidR) {
                    JSONObject a2 = SettingsController.this.f30674f.a(SettingsController.this.f30670b, true);
                    if (a2 != null) {
                        Settings b2 = SettingsController.this.f30671c.b(a2);
                        SettingsController.this.f30673e.c(b2.f30655c, a2);
                        SettingsController.this.q(a2, "Loaded settings: ");
                        SettingsController settingsController = SettingsController.this;
                        boolean unused = settingsController.r(settingsController.f30670b.f30685f);
                        SettingsController.this.f30676h.set(b2);
                        ((TaskCompletionSource) SettingsController.this.f30677i.get()).e(b2);
                    }
                    return Tasks.e((Object) null);
                }
            });
        }
        this.f30676h.set(m2);
        ((TaskCompletionSource) this.f30677i.get()).e(m2);
        return Tasks.e((Object) null);
    }

    public Task p(Executor executor) {
        return o(SettingsCacheBehavior.USE_CACHE, executor);
    }

    public final void q(JSONObject jSONObject, String str) {
        Logger f2 = Logger.f();
        f2.b(str + jSONObject.toString());
    }

    public final boolean r(String str) {
        SharedPreferences.Editor edit = CommonUtils.q(this.f30669a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }
}

package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

public final class CrashlyticsNativeComponentDeferredProxy implements CrashlyticsNativeComponent {

    /* renamed from: c  reason: collision with root package name */
    public static final NativeSessionFileProvider f29907c = new MissingNativeSessionFileProvider();

    /* renamed from: a  reason: collision with root package name */
    public final Deferred f29908a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference f29909b = new AtomicReference((Object) null);

    public static final class MissingNativeSessionFileProvider implements NativeSessionFileProvider {
        public MissingNativeSessionFileProvider() {
        }

        public File a() {
            return null;
        }

        public File b() {
            return null;
        }

        public File c() {
            return null;
        }

        public CrashlyticsReport.ApplicationExitInfo d() {
            return null;
        }

        public File e() {
            return null;
        }

        public File f() {
            return null;
        }

        public File g() {
            return null;
        }
    }

    public CrashlyticsNativeComponentDeferredProxy(Deferred deferred) {
        this.f29908a = deferred;
        deferred.a(new b(this));
    }

    public NativeSessionFileProvider a(String str) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = (CrashlyticsNativeComponent) this.f29909b.get();
        return crashlyticsNativeComponent == null ? f29907c : crashlyticsNativeComponent.a(str);
    }

    public boolean b() {
        CrashlyticsNativeComponent crashlyticsNativeComponent = (CrashlyticsNativeComponent) this.f29909b.get();
        return crashlyticsNativeComponent != null && crashlyticsNativeComponent.b();
    }

    public void c(String str, String str2, long j2, StaticSessionData staticSessionData) {
        Logger f2 = Logger.f();
        f2.i("Deferring native open session: " + str);
        this.f29908a.a(new a(str, str2, j2, staticSessionData));
    }

    public boolean d(String str) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = (CrashlyticsNativeComponent) this.f29909b.get();
        return crashlyticsNativeComponent != null && crashlyticsNativeComponent.d(str);
    }

    public final /* synthetic */ void g(Provider provider) {
        Logger.f().b("Crashlytics native component now available.");
        this.f29909b.set((CrashlyticsNativeComponent) provider.get());
    }
}

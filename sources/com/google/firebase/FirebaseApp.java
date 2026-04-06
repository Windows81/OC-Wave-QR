package com.google.firebase;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.compose.animation.core.h;
import androidx.core.os.UserManagerCompat;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.components.Lazy;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.events.Publisher;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.DataCollectionConfigStorage;
import com.google.firebase.provider.FirebaseInitProvider;
import com.google.firebase.tracing.ComponentMonitor;
import com.google.firebase.tracing.FirebaseTrace;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class FirebaseApp {

    /* renamed from: k  reason: collision with root package name */
    public static final Object f29633k = new Object();

    /* renamed from: l  reason: collision with root package name */
    public static final Map f29634l = new ArrayMap();

    /* renamed from: a  reason: collision with root package name */
    public final Context f29635a;

    /* renamed from: b  reason: collision with root package name */
    public final String f29636b;

    /* renamed from: c  reason: collision with root package name */
    public final FirebaseOptions f29637c;

    /* renamed from: d  reason: collision with root package name */
    public final ComponentRuntime f29638d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f29639e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f29640f = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    public final Lazy f29641g;

    /* renamed from: h  reason: collision with root package name */
    public final Provider f29642h;

    /* renamed from: i  reason: collision with root package name */
    public final List f29643i = new CopyOnWriteArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final List f29644j = new CopyOnWriteArrayList();

    public interface BackgroundStateChangeListener {
        void a(boolean z2);
    }

    public static class GlobalBackgroundStateListener implements BackgroundDetector.BackgroundStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static AtomicReference f29645a = new AtomicReference();

        public static void c(Context context) {
            if (PlatformVersion.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f29645a.get() == null) {
                    GlobalBackgroundStateListener globalBackgroundStateListener = new GlobalBackgroundStateListener();
                    if (h.a(f29645a, (Object) null, globalBackgroundStateListener)) {
                        BackgroundDetector.c(application);
                        BackgroundDetector.b().a(globalBackgroundStateListener);
                    }
                }
            }
        }

        public void a(boolean z2) {
            synchronized (FirebaseApp.f29633k) {
                try {
                    Iterator it = new ArrayList(FirebaseApp.f29634l.values()).iterator();
                    while (it.hasNext()) {
                        FirebaseApp firebaseApp = (FirebaseApp) it.next();
                        if (firebaseApp.f29639e.get()) {
                            firebaseApp.y(z2);
                        }
                    }
                } finally {
                }
            }
        }
    }

    public static class UserUnlockReceiver extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static AtomicReference f29646b = new AtomicReference();

        /* renamed from: a  reason: collision with root package name */
        public final Context f29647a;

        public UserUnlockReceiver(Context context) {
            this.f29647a = context;
        }

        public static void b(Context context) {
            if (f29646b.get() == null) {
                UserUnlockReceiver userUnlockReceiver = new UserUnlockReceiver(context);
                if (h.a(f29646b, (Object) null, userUnlockReceiver)) {
                    context.registerReceiver(userUnlockReceiver, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f29647a.unregisterReceiver(this);
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (FirebaseApp.f29633k) {
                try {
                    for (FirebaseApp d2 : FirebaseApp.f29634l.values()) {
                        d2.p();
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            c();
        }
    }

    public FirebaseApp(Context context, String str, FirebaseOptions firebaseOptions) {
        this.f29635a = (Context) Preconditions.m(context);
        this.f29636b = Preconditions.g(str);
        this.f29637c = (FirebaseOptions) Preconditions.m(firebaseOptions);
        StartupTime b2 = FirebaseInitProvider.b();
        FirebaseTrace.b("Firebase");
        FirebaseTrace.b("ComponentDiscovery");
        List b3 = ComponentDiscovery.c(context, ComponentDiscoveryService.class).b();
        FirebaseTrace.a();
        FirebaseTrace.b("Runtime");
        ComponentRuntime.Builder g2 = ComponentRuntime.m(UiExecutor.INSTANCE).d(b3).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(Component.s(context, Context.class, new Class[0])).b(Component.s(this, FirebaseApp.class, new Class[0])).b(Component.s(firebaseOptions, FirebaseOptions.class, new Class[0])).g(new ComponentMonitor());
        if (UserManagerCompat.a(context) && FirebaseInitProvider.c()) {
            g2.b(Component.s(b2, StartupTime.class, new Class[0]));
        }
        ComponentRuntime e2 = g2.e();
        this.f29638d = e2;
        FirebaseTrace.a();
        this.f29641g = new Lazy(new a(this, context));
        this.f29642h = e2.c(DefaultHeartBeatController.class);
        g(new b(this));
        FirebaseTrace.a();
    }

    public static FirebaseApp l() {
        FirebaseApp firebaseApp;
        synchronized (f29633k) {
            try {
                firebaseApp = (FirebaseApp) f29634l.get("[DEFAULT]");
                if (firebaseApp != null) {
                    ((DefaultHeartBeatController) firebaseApp.f29642h.get()).k();
                } else {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return firebaseApp;
    }

    public static FirebaseApp q(Context context) {
        synchronized (f29633k) {
            try {
                if (f29634l.containsKey("[DEFAULT]")) {
                    FirebaseApp l2 = l();
                    return l2;
                }
                FirebaseOptions a2 = FirebaseOptions.a(context);
                if (a2 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                FirebaseApp r2 = r(context, a2);
                return r2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static FirebaseApp r(Context context, FirebaseOptions firebaseOptions) {
        return s(context, firebaseOptions, "[DEFAULT]");
    }

    public static FirebaseApp s(Context context, FirebaseOptions firebaseOptions, String str) {
        FirebaseApp firebaseApp;
        GlobalBackgroundStateListener.c(context);
        String x2 = x(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f29633k) {
            Map map = f29634l;
            Preconditions.r(!map.containsKey(x2), "FirebaseApp name " + x2 + " already exists!");
            Preconditions.n(context, "Application context cannot be null.");
            firebaseApp = new FirebaseApp(context, x2, firebaseOptions);
            map.put(x2, firebaseApp);
        }
        firebaseApp.p();
        return firebaseApp;
    }

    public static String x(String str) {
        return str.trim();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseApp)) {
            return false;
        }
        return this.f29636b.equals(((FirebaseApp) obj).m());
    }

    public void g(BackgroundStateChangeListener backgroundStateChangeListener) {
        i();
        if (this.f29639e.get() && BackgroundDetector.b().d()) {
            backgroundStateChangeListener.a(true);
        }
        this.f29643i.add(backgroundStateChangeListener);
    }

    public void h(FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
        i();
        Preconditions.m(firebaseAppLifecycleListener);
        this.f29644j.add(firebaseAppLifecycleListener);
    }

    public int hashCode() {
        return this.f29636b.hashCode();
    }

    public final void i() {
        Preconditions.r(!this.f29640f.get(), "FirebaseApp was deleted");
    }

    public Object j(Class cls) {
        i();
        return this.f29638d.a(cls);
    }

    public Context k() {
        i();
        return this.f29635a;
    }

    public String m() {
        i();
        return this.f29636b;
    }

    public FirebaseOptions n() {
        i();
        return this.f29637c;
    }

    public String o() {
        return Base64Utils.c(m().getBytes(Charset.defaultCharset())) + "+" + Base64Utils.c(n().c().getBytes(Charset.defaultCharset()));
    }

    public final void p() {
        if (!UserManagerCompat.a(this.f29635a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + m());
            UserUnlockReceiver.b(this.f29635a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + m());
        this.f29638d.p(u());
        ((DefaultHeartBeatController) this.f29642h.get()).k();
    }

    public boolean t() {
        i();
        return ((DataCollectionConfigStorage) this.f29641g.get()).b();
    }

    public String toString() {
        return Objects.c(this).a("name", this.f29636b).a("options", this.f29637c).toString();
    }

    public boolean u() {
        return "[DEFAULT]".equals(m());
    }

    public final /* synthetic */ DataCollectionConfigStorage v(Context context) {
        return new DataCollectionConfigStorage(context, o(), (Publisher) this.f29638d.a(Publisher.class));
    }

    public final /* synthetic */ void w(boolean z2) {
        if (!z2) {
            ((DefaultHeartBeatController) this.f29642h.get()).k();
        }
    }

    public final void y(boolean z2) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (BackgroundStateChangeListener a2 : this.f29643i) {
            a2.a(z2);
        }
    }
}

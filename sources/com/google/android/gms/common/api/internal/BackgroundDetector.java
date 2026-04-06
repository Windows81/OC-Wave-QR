package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

public final class BackgroundDetector implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final BackgroundDetector D = new BackgroundDetector();

    /* renamed from: A  reason: collision with root package name */
    public final AtomicBoolean f24456A = new AtomicBoolean();

    /* renamed from: B  reason: collision with root package name */
    public final ArrayList f24457B = new ArrayList();
    public boolean C = false;

    /* renamed from: z  reason: collision with root package name */
    public final AtomicBoolean f24458z = new AtomicBoolean();

    public interface BackgroundStateChangeListener {
        void a(boolean z2);
    }

    public static BackgroundDetector b() {
        return D;
    }

    public static void c(Application application) {
        BackgroundDetector backgroundDetector = D;
        synchronized (backgroundDetector) {
            try {
                if (!backgroundDetector.C) {
                    application.registerActivityLifecycleCallbacks(backgroundDetector);
                    application.registerComponentCallbacks(backgroundDetector);
                    backgroundDetector.C = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(BackgroundStateChangeListener backgroundStateChangeListener) {
        synchronized (D) {
            this.f24457B.add(backgroundStateChangeListener);
        }
    }

    public boolean d() {
        return this.f24458z.get();
    }

    public boolean e(boolean z2) {
        if (!this.f24456A.get()) {
            if (!PlatformVersion.b()) {
                return z2;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f24456A.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f24458z.set(true);
            }
        }
        return d();
    }

    public final void f(boolean z2) {
        synchronized (D) {
            try {
                Iterator it = this.f24457B.iterator();
                while (it.hasNext()) {
                    ((BackgroundStateChangeListener) it.next()).a(z2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f24456A;
        boolean compareAndSet = this.f24458z.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f24456A;
        boolean compareAndSet = this.f24458z.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i2) {
        if (i2 == 20 && this.f24458z.compareAndSet(false, true)) {
            this.f24456A.set(true);
            f(true);
        }
    }
}

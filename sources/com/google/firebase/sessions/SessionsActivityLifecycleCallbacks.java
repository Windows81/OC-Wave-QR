package com.google.firebase.sessions;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SessionsActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {

    /* renamed from: A  reason: collision with root package name */
    public static boolean f31573A;

    /* renamed from: B  reason: collision with root package name */
    public static SessionLifecycleClient f31574B;

    /* renamed from: z  reason: collision with root package name */
    public static final SessionsActivityLifecycleCallbacks f31575z = new SessionsActivityLifecycleCallbacks();

    public final void a(SessionLifecycleClient sessionLifecycleClient) {
        f31574B = sessionLifecycleClient;
        if (sessionLifecycleClient != null && f31573A) {
            f31573A = false;
            sessionLifecycleClient.k();
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.i(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        Intrinsics.i(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        Intrinsics.i(activity, "activity");
        SessionLifecycleClient sessionLifecycleClient = f31574B;
        if (sessionLifecycleClient != null) {
            sessionLifecycleClient.h();
        }
    }

    public void onActivityResumed(Activity activity) {
        Unit unit;
        Intrinsics.i(activity, "activity");
        SessionLifecycleClient sessionLifecycleClient = f31574B;
        if (sessionLifecycleClient != null) {
            sessionLifecycleClient.k();
            unit = Unit.f40552a;
        } else {
            unit = null;
        }
        if (unit == null) {
            f31573A = true;
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.i(activity, "activity");
        Intrinsics.i(bundle, "outState");
    }

    public void onActivityStarted(Activity activity) {
        Intrinsics.i(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        Intrinsics.i(activity, "activity");
    }
}

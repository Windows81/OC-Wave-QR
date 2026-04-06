package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdv;
import com.google.android.gms.measurement.internal.zzky;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallations;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class FirebaseAnalytics {

    /* renamed from: b  reason: collision with root package name */
    public static volatile FirebaseAnalytics f29685b;

    /* renamed from: a  reason: collision with root package name */
    public final zzdv f29686a;

    public enum ConsentStatus {
        GRANTED,
        DENIED
    }

    public enum ConsentType {
        AD_STORAGE,
        ANALYTICS_STORAGE,
        AD_USER_DATA,
        AD_PERSONALIZATION
    }

    public static class Event {
    }

    public static class Param {
    }

    public static class UserProperty {
    }

    public FirebaseAnalytics(zzdv zzdv) {
        Preconditions.m(zzdv);
        this.f29686a = zzdv;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (f29685b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f29685b == null) {
                        f29685b = new FirebaseAnalytics(zzdv.e(context));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f29685b;
    }

    public static zzky getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzdv f2 = zzdv.f(context, (String) null, (String) null, (String) null, bundle);
        if (f2 == null) {
            return null;
        }
        return new zzc(f2);
    }

    public final String getFirebaseInstanceId() {
        try {
            return (String) Tasks.b(FirebaseInstallations.q().m(), 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e3) {
            throw new IllegalStateException(e3);
        }
    }

    @Deprecated
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        this.f29686a.j(activity, str, str2);
    }
}

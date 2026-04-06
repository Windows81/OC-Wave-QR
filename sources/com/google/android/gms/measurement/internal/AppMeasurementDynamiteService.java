package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzdj;
import com.google.android.gms.internal.measurement.zzdl;
import com.google.android.gms.internal.measurement.zzdq;
import com.google.android.gms.internal.measurement.zzdr;
import com.google.android.gms.internal.measurement.zzdt;
import java.util.Map;

public class AppMeasurementDynamiteService extends zzdj {

    /* renamed from: l  reason: collision with root package name */
    public zzhw f26155l = null;

    /* renamed from: m  reason: collision with root package name */
    public final Map f26156m = new ArrayMap();

    public class zza implements zzjj {

        /* renamed from: a  reason: collision with root package name */
        public zzdq f26157a;

        public zza(zzdq zzdq) {
            this.f26157a = zzdq;
        }

        public final void a(String str, String str2, Bundle bundle, long j2) {
            try {
                this.f26157a.O1(str, str2, bundle, j2);
            } catch (RemoteException e2) {
                zzhw zzhw = AppMeasurementDynamiteService.this.f26155l;
                if (zzhw != null) {
                    zzhw.m().L().b("Event listener threw exception", e2);
                }
            }
        }
    }

    public class zzb implements zzjg {

        /* renamed from: a  reason: collision with root package name */
        public zzdq f26159a;

        public zzb(zzdq zzdq) {
            this.f26159a = zzdq;
        }

        public final void a(String str, String str2, Bundle bundle, long j2) {
            try {
                this.f26159a.O1(str, str2, bundle, j2);
            } catch (RemoteException e2) {
                zzhw zzhw = AppMeasurementDynamiteService.this.f26155l;
                if (zzhw != null) {
                    zzhw.m().L().b("Event interceptor threw exception", e2);
                }
            }
        }
    }

    public final void N() {
        if (this.f26155l == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public final void P(zzdl zzdl, String str) {
        N();
        this.f26155l.L().S(zzdl, str);
    }

    public void beginAdUnitExposure(String str, long j2) {
        N();
        this.f26155l.y().z(str, j2);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        N();
        this.f26155l.H().h0(str, str2, bundle);
    }

    public void clearMeasurementEnabled(long j2) {
        N();
        this.f26155l.H().b0((Boolean) null);
    }

    public void endAdUnitExposure(String str, long j2) {
        N();
        this.f26155l.y().D(str, j2);
    }

    public void generateEventId(zzdl zzdl) {
        N();
        long R0 = this.f26155l.L().R0();
        N();
        this.f26155l.L().Q(zzdl, R0);
    }

    public void getAppInstanceId(zzdl zzdl) {
        N();
        this.f26155l.f().D(new zzj(this, zzdl));
    }

    public void getCachedAppInstanceId(zzdl zzdl) {
        N();
        P(zzdl, this.f26155l.H().v0());
    }

    public void getConditionalUserProperties(String str, String str2, zzdl zzdl) {
        N();
        this.f26155l.f().D(new zzn(this, zzdl, str, str2));
    }

    public void getCurrentScreenClass(zzdl zzdl) {
        N();
        P(zzdl, this.f26155l.H().w0());
    }

    public void getCurrentScreenName(zzdl zzdl) {
        N();
        P(zzdl, this.f26155l.H().x0());
    }

    public void getGmpAppId(zzdl zzdl) {
        N();
        P(zzdl, this.f26155l.H().y0());
    }

    public void getMaxUserProperties(String str, zzdl zzdl) {
        N();
        this.f26155l.H();
        zzjk.E(str);
        N();
        this.f26155l.L().P(zzdl, 25);
    }

    public void getSessionId(zzdl zzdl) {
        N();
        this.f26155l.H().P(zzdl);
    }

    public void getTestFlag(zzdl zzdl, int i2) {
        N();
        if (i2 == 0) {
            this.f26155l.L().S(zzdl, this.f26155l.H().z0());
        } else if (i2 == 1) {
            this.f26155l.L().Q(zzdl, this.f26155l.H().u0().longValue());
        } else if (i2 == 2) {
            zzop L = this.f26155l.L();
            double doubleValue = this.f26155l.H().s0().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                zzdl.u(bundle);
            } catch (RemoteException e2) {
                L.f26587a.m().L().b("Error returning double value to wrapper", e2);
            }
        } else if (i2 == 3) {
            this.f26155l.L().P(zzdl, this.f26155l.H().t0().intValue());
        } else if (i2 == 4) {
            this.f26155l.L().U(zzdl, this.f26155l.H().r0().booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z2, zzdl zzdl) {
        N();
        this.f26155l.f().D(new zzl(this, zzdl, str, str2, z2));
    }

    public void initForTests(Map map) {
        N();
    }

    public void initialize(IObjectWrapper iObjectWrapper, zzdt zzdt, long j2) {
        zzhw zzhw = this.f26155l;
        if (zzhw == null) {
            this.f26155l = zzhw.c((Context) Preconditions.m((Context) ObjectWrapper.P(iObjectWrapper)), zzdt, Long.valueOf(j2));
        } else {
            zzhw.m().L().a("Attempting to initialize multiple times");
        }
    }

    public void isDataCollectionEnabled(zzdl zzdl) {
        N();
        this.f26155l.f().D(new zzm(this, zzdl));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z2, boolean z3, long j2) {
        N();
        this.f26155l.H().j0(str, str2, bundle, z2, z3, j2);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, zzdl zzdl, long j2) {
        Bundle bundle2;
        N();
        Preconditions.g(str2);
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.f26155l.f().D(new zzi(this, zzdl, new zzbh(str2, new zzbc(bundle), "app", j2), str));
    }

    public void logHealthData(int i2, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        N();
        Object obj = null;
        Object P = iObjectWrapper == null ? null : ObjectWrapper.P(iObjectWrapper);
        Object P2 = iObjectWrapper2 == null ? null : ObjectWrapper.P(iObjectWrapper2);
        if (iObjectWrapper3 != null) {
            obj = ObjectWrapper.P(iObjectWrapper3);
        }
        this.f26155l.m().z(i2, true, false, str, P, P2, obj);
    }

    public void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j2) {
        N();
        Application.ActivityLifecycleCallbacks p0 = this.f26155l.H().p0();
        if (p0 != null) {
            this.f26155l.H().D0();
            p0.onActivityCreated((Activity) ObjectWrapper.P(iObjectWrapper), bundle);
        }
    }

    public void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j2) {
        N();
        Application.ActivityLifecycleCallbacks p0 = this.f26155l.H().p0();
        if (p0 != null) {
            this.f26155l.H().D0();
            p0.onActivityDestroyed((Activity) ObjectWrapper.P(iObjectWrapper));
        }
    }

    public void onActivityPaused(IObjectWrapper iObjectWrapper, long j2) {
        N();
        Application.ActivityLifecycleCallbacks p0 = this.f26155l.H().p0();
        if (p0 != null) {
            this.f26155l.H().D0();
            p0.onActivityPaused((Activity) ObjectWrapper.P(iObjectWrapper));
        }
    }

    public void onActivityResumed(IObjectWrapper iObjectWrapper, long j2) {
        N();
        Application.ActivityLifecycleCallbacks p0 = this.f26155l.H().p0();
        if (p0 != null) {
            this.f26155l.H().D0();
            p0.onActivityResumed((Activity) ObjectWrapper.P(iObjectWrapper));
        }
    }

    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzdl zzdl, long j2) {
        N();
        Application.ActivityLifecycleCallbacks p0 = this.f26155l.H().p0();
        Bundle bundle = new Bundle();
        if (p0 != null) {
            this.f26155l.H().D0();
            p0.onActivitySaveInstanceState((Activity) ObjectWrapper.P(iObjectWrapper), bundle);
        }
        try {
            zzdl.u(bundle);
        } catch (RemoteException e2) {
            this.f26155l.m().L().b("Error returning bundle value to wrapper", e2);
        }
    }

    public void onActivityStarted(IObjectWrapper iObjectWrapper, long j2) {
        N();
        Application.ActivityLifecycleCallbacks p0 = this.f26155l.H().p0();
        if (p0 != null) {
            this.f26155l.H().D0();
            p0.onActivityStarted((Activity) ObjectWrapper.P(iObjectWrapper));
        }
    }

    public void onActivityStopped(IObjectWrapper iObjectWrapper, long j2) {
        N();
        Application.ActivityLifecycleCallbacks p0 = this.f26155l.H().p0();
        if (p0 != null) {
            this.f26155l.H().D0();
            p0.onActivityStopped((Activity) ObjectWrapper.P(iObjectWrapper));
        }
    }

    public void performAction(Bundle bundle, zzdl zzdl, long j2) {
        N();
        zzdl.u((Bundle) null);
    }

    public void registerOnMeasurementEventListener(zzdq zzdq) {
        zzjj zzjj;
        N();
        synchronized (this.f26156m) {
            try {
                zzjj = (zzjj) this.f26156m.get(Integer.valueOf(zzdq.a()));
                if (zzjj == null) {
                    zzjj = new zza(zzdq);
                    this.f26156m.put(Integer.valueOf(zzdq.a()), zzjj);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.f26155l.H().U(zzjj);
    }

    public void resetAnalyticsData(long j2) {
        N();
        this.f26155l.H().I(j2);
    }

    public void setConditionalUserProperty(Bundle bundle, long j2) {
        N();
        if (bundle == null) {
            this.f26155l.m().G().a("Conditional user property must not be null");
        } else {
            this.f26155l.H().O0(bundle, j2);
        }
    }

    public void setConsent(Bundle bundle, long j2) {
        N();
        this.f26155l.H().Y0(bundle, j2);
    }

    public void setConsentThirdParty(Bundle bundle, long j2) {
        N();
        this.f26155l.H().e1(bundle, j2);
    }

    public void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j2) {
        N();
        this.f26155l.I().H((Activity) ObjectWrapper.P(iObjectWrapper), str, str2);
    }

    public void setDataCollectionEnabled(boolean z2) {
        N();
        this.f26155l.H().c1(z2);
    }

    public void setDefaultEventParameters(Bundle bundle) {
        N();
        this.f26155l.H().d1(bundle);
    }

    public void setDefaultEventParametersWithBackfill(Bundle bundle) {
        N();
        this.f26155l.H().f1(bundle);
    }

    public void setEventInterceptor(zzdq zzdq) {
        N();
        zzb zzb2 = new zzb(zzdq);
        if (this.f26155l.f().J()) {
            this.f26155l.H().T(zzb2);
        } else {
            this.f26155l.f().D(new zzk(this, zzb2));
        }
    }

    public void setInstanceIdProvider(zzdr zzdr) {
        N();
    }

    public void setMeasurementEnabled(boolean z2, long j2) {
        N();
        this.f26155l.H().b0(Boolean.valueOf(z2));
    }

    public void setMinimumSessionDuration(long j2) {
        N();
    }

    public void setSessionTimeoutDuration(long j2) {
        N();
        this.f26155l.H().W0(j2);
    }

    public void setSgtmDebugInfo(Intent intent) {
        N();
        this.f26155l.H().K(intent);
    }

    public void setUserId(String str, long j2) {
        N();
        this.f26155l.H().d0(str, j2);
    }

    public void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z2, long j2) {
        N();
        this.f26155l.H().m0(str, str2, ObjectWrapper.P(iObjectWrapper), z2, j2);
    }

    public void unregisterOnMeasurementEventListener(zzdq zzdq) {
        zzjj zzjj;
        N();
        synchronized (this.f26156m) {
            zzjj = (zzjj) this.f26156m.remove(Integer.valueOf(zzdq.a()));
        }
        if (zzjj == null) {
            zzjj = new zza(zzdq);
        }
        this.f26155l.H().P0(zzjj);
    }
}

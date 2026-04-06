package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.common.internal.zzag;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.errorprone.annotations.CheckReturnValue;
import java.security.MessageDigest;

@CheckReturnValue
final class zzn {

    /* renamed from: a  reason: collision with root package name */
    public static final zzl f25168a = new zzf(zzj.P("0\u0005È0\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010e\bsù/Qí"));

    /* renamed from: b  reason: collision with root package name */
    public static final zzl f25169b = new zzg(zzj.P("0\u0006\u00040\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²­×árÊkì"));

    /* renamed from: c  reason: collision with root package name */
    public static final zzl f25170c = new zzh(zzj.P("0\u0004C0\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000ÂàFdJ00"));

    /* renamed from: d  reason: collision with root package name */
    public static final zzl f25171d = new zzi(zzj.P("0\u0004¨0\u0003 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ¸l}ÓNõ0"));

    /* renamed from: e  reason: collision with root package name */
    public static volatile zzag f25172e;

    /* renamed from: f  reason: collision with root package name */
    public static final Object f25173f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static Context f25174g;

    public static zzx a(String str, zzj zzj, boolean z2, boolean z3) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, zzj, z2, z3);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static zzx b(String str, boolean z2, boolean z3, boolean z4) {
        return g(str, z2, false, false, true);
    }

    public static /* synthetic */ String c(boolean z2, String str, zzj zzj) {
        String str2 = (z2 || !f(str, zzj, true, false).f25186a) ? "not allowed" : "debug cert rejected";
        MessageDigest b2 = AndroidUtilsLight.b("SHA-256");
        Preconditions.m(b2);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", new Object[]{str2, str, Hex.a(b2.digest(zzj.u1())), Boolean.valueOf(z2), "12451000.false"});
    }

    public static synchronized void d(Context context) {
        synchronized (zzn.class) {
            if (f25174g != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f25174g = context.getApplicationContext();
            }
        }
    }

    public static boolean e() {
        boolean z2;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            h();
            z2 = f25172e.d();
        } catch (RemoteException | DynamiteModule.LoadingException e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            z2 = false;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return z2;
    }

    public static zzx f(String str, zzj zzj, boolean z2, boolean z3) {
        try {
            h();
            Preconditions.m(f25174g);
            try {
                return f25172e.o0(new zzs(str, zzj, z2, z3), ObjectWrapper.u1(f25174g.getPackageManager())) ? zzx.b() : new zzv(new zze(z2, str, zzj), (zzu) null);
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return zzx.d("module call", e2);
            }
        } catch (DynamiteModule.LoadingException e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            return zzx.d("module init: ".concat(String.valueOf(e3.getMessage())), e3);
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.google.android.gms.dynamic.IObjectWrapper, android.os.IBinder] */
    public static zzx g(String str, boolean z2, boolean z3, boolean z4, boolean z5) {
        zzx zzx;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Preconditions.m(f25174g);
            try {
                h();
                zzo zzo = new zzo(str, z2, false, ObjectWrapper.u1(f25174g), false, true);
                zzq j1 = z5 ? f25172e.j1(zzo) : f25172e.G1(zzo);
                if (j1.Q()) {
                    zzx = zzx.f(j1.S());
                } else {
                    String H = j1.H();
                    PackageManager.NameNotFoundException nameNotFoundException = j1.X() == 4 ? new PackageManager.NameNotFoundException() : null;
                    if (H == null) {
                        H = "error checking package certificate";
                    }
                    zzx = zzx.g(j1.S(), j1.X(), H, nameNotFoundException);
                }
            } catch (DynamiteModule.LoadingException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                zzx = zzx.d("module init: ".concat(String.valueOf(e2.getMessage())), e2);
            }
        } catch (RemoteException e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            zzx = zzx.d("module call", e3);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return zzx;
    }

    public static void h() {
        if (f25172e == null) {
            Preconditions.m(f25174g);
            synchronized (f25173f) {
                try {
                    if (f25172e == null) {
                        f25172e = zzaf.N(DynamiteModule.e(f25174g, DynamiteModule.f25223f, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}

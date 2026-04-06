package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.RestrictedInheritance;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
@CheckReturnValue
public class GoogleSignatureVerifier {

    /* renamed from: c  reason: collision with root package name */
    public static GoogleSignatureVerifier f24403c;

    /* renamed from: a  reason: collision with root package name */
    public final Context f24404a;

    /* renamed from: b  reason: collision with root package name */
    public volatile String f24405b;

    public GoogleSignatureVerifier(Context context) {
        this.f24404a = context.getApplicationContext();
    }

    public static GoogleSignatureVerifier a(Context context) {
        Preconditions.m(context);
        synchronized (GoogleSignatureVerifier.class) {
            try {
                if (f24403c == null) {
                    zzn.d(context);
                    f24403c = new GoogleSignatureVerifier(context);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return f24403c;
    }

    public static final zzj d(PackageInfo packageInfo, zzj... zzjArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            zzk zzk = new zzk(packageInfo.signatures[0].toByteArray());
            for (int i2 = 0; i2 < zzjArr.length; i2++) {
                if (zzjArr[i2].equals(zzk)) {
                    return zzjArr[i2];
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0047 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean e(android.content.pm.PackageInfo r4, boolean r5) {
        /*
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x0027
            if (r4 == 0) goto L_0x0029
            java.lang.String r2 = "com.android.vending"
            java.lang.String r3 = r4.packageName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x001a
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0027
        L_0x001a:
            android.content.pm.ApplicationInfo r5 = r4.applicationInfo
            if (r5 != 0) goto L_0x0020
        L_0x001e:
            r5 = r1
            goto L_0x0027
        L_0x0020:
            int r5 = r5.flags
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L_0x001e
            r5 = r0
        L_0x0027:
            r2 = r4
            goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            if (r4 == 0) goto L_0x0048
            android.content.pm.Signature[] r4 = r2.signatures
            if (r4 == 0) goto L_0x0048
            if (r5 == 0) goto L_0x0039
            com.google.android.gms.common.zzj[] r4 = com.google.android.gms.common.zzm.f25167a
            com.google.android.gms.common.zzj r4 = d(r2, r4)
            goto L_0x0045
        L_0x0039:
            com.google.android.gms.common.zzj[] r4 = com.google.android.gms.common.zzm.f25167a
            r4 = r4[r1]
            com.google.android.gms.common.zzj[] r4 = new com.google.android.gms.common.zzj[]{r4}
            com.google.android.gms.common.zzj r4 = d(r2, r4)
        L_0x0045:
            if (r4 == 0) goto L_0x0048
            return r0
        L_0x0048:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleSignatureVerifier.e(android.content.pm.PackageInfo, boolean):boolean");
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (e(packageInfo, false)) {
            return true;
        }
        if (e(packageInfo, true)) {
            if (GooglePlayServicesUtilLight.g(this.f24404a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int i2) {
        zzx zzx;
        int length;
        String[] packagesForUid = this.f24404a.getPackageManager().getPackagesForUid(i2);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            zzx = null;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    Preconditions.m(zzx);
                    break;
                }
                zzx = f(packagesForUid[i3], false, false);
                if (zzx.f25186a) {
                    break;
                }
                i3++;
            }
        } else {
            zzx = zzx.c("no pkgs");
        }
        zzx.e();
        return zzx.f25186a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        r8 = r8.applicationInfo;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.common.zzx f(java.lang.String r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            java.lang.String r7 = "null pkg"
            if (r6 != 0) goto L_0x0009
            com.google.android.gms.common.zzx r6 = com.google.android.gms.common.zzx.c(r7)
            return r6
        L_0x0009:
            java.lang.String r8 = r5.f24405b
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L_0x0090
            boolean r8 = com.google.android.gms.common.zzn.e()
            r0 = 0
            if (r8 == 0) goto L_0x0023
            android.content.Context r7 = r5.f24404a
            boolean r7 = com.google.android.gms.common.GooglePlayServicesUtilLight.g(r7)
            com.google.android.gms.common.zzx r7 = com.google.android.gms.common.zzn.b(r6, r7, r0, r0)
            goto L_0x007d
        L_0x0023:
            android.content.Context r8 = r5.f24404a     // Catch:{ NameNotFoundException -> 0x0084 }
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0084 }
            r1 = 64
            android.content.pm.PackageInfo r8 = r8.getPackageInfo(r6, r1)     // Catch:{ NameNotFoundException -> 0x0084 }
            android.content.Context r1 = r5.f24404a
            boolean r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.g(r1)
            if (r8 != 0) goto L_0x003c
            com.google.android.gms.common.zzx r7 = com.google.android.gms.common.zzx.c(r7)
            goto L_0x007d
        L_0x003c:
            android.content.pm.Signature[] r7 = r8.signatures
            if (r7 == 0) goto L_0x0077
            int r7 = r7.length
            r2 = 1
            if (r7 == r2) goto L_0x0045
            goto L_0x0077
        L_0x0045:
            com.google.android.gms.common.zzk r7 = new com.google.android.gms.common.zzk
            android.content.pm.Signature[] r3 = r8.signatures
            r3 = r3[r0]
            byte[] r3 = r3.toByteArray()
            r7.<init>(r3)
            java.lang.String r3 = r8.packageName
            com.google.android.gms.common.zzx r1 = com.google.android.gms.common.zzn.a(r3, r7, r1, r0)
            boolean r4 = r1.f25186a
            if (r4 == 0) goto L_0x0075
            android.content.pm.ApplicationInfo r8 = r8.applicationInfo
            if (r8 == 0) goto L_0x0075
            int r8 = r8.flags
            r8 = r8 & 2
            if (r8 == 0) goto L_0x0075
            com.google.android.gms.common.zzx r7 = com.google.android.gms.common.zzn.a(r3, r7, r0, r2)
            boolean r7 = r7.f25186a
            if (r7 == 0) goto L_0x0075
            java.lang.String r7 = "debuggable release cert app rejected"
            com.google.android.gms.common.zzx r7 = com.google.android.gms.common.zzx.c(r7)
            goto L_0x007d
        L_0x0075:
            r7 = r1
            goto L_0x007d
        L_0x0077:
            java.lang.String r7 = "single cert required"
            com.google.android.gms.common.zzx r7 = com.google.android.gms.common.zzx.c(r7)
        L_0x007d:
            boolean r8 = r7.f25186a
            if (r8 == 0) goto L_0x0083
            r5.f24405b = r6
        L_0x0083:
            return r7
        L_0x0084:
            r7 = move-exception
            java.lang.String r8 = "no pkg "
            java.lang.String r6 = r8.concat(r6)
            com.google.android.gms.common.zzx r6 = com.google.android.gms.common.zzx.d(r6, r7)
            return r6
        L_0x0090:
            com.google.android.gms.common.zzx r6 = com.google.android.gms.common.zzx.b()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleSignatureVerifier.f(java.lang.String, boolean, boolean):com.google.android.gms.common.zzx");
    }
}

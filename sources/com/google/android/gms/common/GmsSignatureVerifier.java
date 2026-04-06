package com.google.android.gms.common;

import com.google.android.gms.internal.common.zzag;
import com.google.errorprone.annotations.RestrictedInheritance;
import java.util.HashMap;

@RestrictedInheritance(allowedOnPath = ".*javatests/com/google/android/gmscore/integ/client/common/robolectric/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
public class GmsSignatureVerifier {

    /* renamed from: a  reason: collision with root package name */
    public static final zzab f24385a;

    /* renamed from: b  reason: collision with root package name */
    public static final zzab f24386b;

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap f24387c = new HashMap();

    static {
        zzz zzz = new zzz();
        zzz.d("com.google.android.gms");
        zzz.a(204200000);
        zzl zzl = zzn.f25171d;
        zzz.c(zzag.w(zzl.u1(), zzn.f25169b.u1()));
        zzl zzl2 = zzn.f25170c;
        zzz.b(zzag.w(zzl2.u1(), zzn.f25168a.u1()));
        f24385a = zzz.e();
        zzz zzz2 = new zzz();
        zzz2.d("com.android.vending");
        zzz2.a(82240000);
        zzz2.c(zzag.v(zzl.u1()));
        zzz2.b(zzag.v(zzl2.u1()));
        f24386b = zzz2.e();
    }
}

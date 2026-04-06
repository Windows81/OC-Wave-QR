package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzqh;

public final class zzgi extends zzix {

    /* renamed from: c  reason: collision with root package name */
    public char f26321c = 0;

    /* renamed from: d  reason: collision with root package name */
    public long f26322d = -1;

    /* renamed from: e  reason: collision with root package name */
    public String f26323e;

    /* renamed from: f  reason: collision with root package name */
    public final zzgk f26324f = new zzgk(this, 6, false, false);

    /* renamed from: g  reason: collision with root package name */
    public final zzgk f26325g = new zzgk(this, 6, true, false);

    /* renamed from: h  reason: collision with root package name */
    public final zzgk f26326h = new zzgk(this, 6, false, true);

    /* renamed from: i  reason: collision with root package name */
    public final zzgk f26327i = new zzgk(this, 5, false, false);

    /* renamed from: j  reason: collision with root package name */
    public final zzgk f26328j = new zzgk(this, 5, true, false);

    /* renamed from: k  reason: collision with root package name */
    public final zzgk f26329k = new zzgk(this, 5, false, true);

    /* renamed from: l  reason: collision with root package name */
    public final zzgk f26330l = new zzgk(this, 4, false, false);

    /* renamed from: m  reason: collision with root package name */
    public final zzgk f26331m = new zzgk(this, 3, false, false);

    /* renamed from: n  reason: collision with root package name */
    public final zzgk f26332n = new zzgk(this, 2, false, false);

    public zzgi(zzhw zzhw) {
        super(zzhw);
    }

    public static String E(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? (!zzqh.a() || !((Boolean) zzbj.E0.a((Object) null)).booleanValue()) ? str : "" : str.substring(0, lastIndexOf);
    }

    private final String P() {
        String str;
        synchronized (this) {
            try {
                if (this.f26323e == null) {
                    this.f26323e = this.f26587a.O() != null ? this.f26587a.O() : "FA";
                }
                Preconditions.m(this.f26323e);
                str = this.f26323e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public static Object v(String str) {
        if (str == null) {
            return null;
        }
        return new zzgn(str);
    }

    public static String w(boolean z2, Object obj) {
        String className;
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i2 = 0;
        if (obj instanceof Long) {
            if (!z2) {
                return String.valueOf(obj);
            }
            Long l2 = (Long) obj;
            if (Math.abs(l2.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l2.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d);
            return str + round + "..." + str + round2;
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (!(obj instanceof Throwable)) {
                return obj instanceof zzgn ? ((zzgn) obj).f26344a : z2 ? "-" : String.valueOf(obj);
            }
            Throwable th = (Throwable) obj;
            StringBuilder sb = new StringBuilder(z2 ? th.getClass().getName() : th.toString());
            String E = E(zzhw.class.getCanonicalName());
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && E(className).equals(E)) {
                    sb.append(": ");
                    sb.append(stackTraceElement);
                    break;
                }
                i2++;
            }
            return sb.toString();
        }
    }

    public static String x(boolean z2, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String w2 = w(z2, obj);
        String w3 = w(z2, obj2);
        String w4 = w(z2, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(w2)) {
            sb.append(str2);
            sb.append(w2);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(w3)) {
            sb.append(str2);
            sb.append(w3);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(w4)) {
            sb.append(str3);
            sb.append(w4);
        }
        return sb.toString();
    }

    public final boolean C(int i2) {
        return Log.isLoggable(P(), i2);
    }

    public final zzgk F() {
        return this.f26331m;
    }

    public final zzgk G() {
        return this.f26324f;
    }

    public final zzgk H() {
        return this.f26326h;
    }

    public final zzgk I() {
        return this.f26325g;
    }

    public final zzgk J() {
        return this.f26330l;
    }

    public final zzgk K() {
        return this.f26332n;
    }

    public final zzgk L() {
        return this.f26327i;
    }

    public final zzgk M() {
        return this.f26329k;
    }

    public final zzgk N() {
        return this.f26328j;
    }

    public final String O() {
        Pair a2;
        if (i().f26359f == null || (a2 = i().f26359f.a()) == null || a2 == zzgu.f26354B) {
            return null;
        }
        String valueOf = String.valueOf(a2.second);
        return valueOf + ":" + ((String) a2.first);
    }

    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ Clock b() {
        return super.b();
    }

    public final /* bridge */ /* synthetic */ zzah d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ zzac e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ zzhp f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ zzbb g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ zzgh h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ zzgu i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ zzop j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    public final /* bridge */ /* synthetic */ zzgi m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    public final boolean t() {
        return false;
    }

    public final void y(int i2, String str) {
        Log.println(i2, P(), str);
    }

    public final void z(int i2, boolean z2, boolean z3, String str, Object obj, Object obj2, Object obj3) {
        if (!z2 && C(i2)) {
            y(i2, x(false, str, obj, obj2, obj3));
        }
        if (!z3 && i2 >= 5) {
            Preconditions.m(str);
            zzhp G = this.f26587a.G();
            if (G == null) {
                y(6, "Scheduler not set. Not logging error/warn");
            } else if (!G.s()) {
                y(6, "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= 9) {
                    i2 = 8;
                }
                G.D(new zzgl(this, i2, str, obj, obj2, obj3));
            }
        }
    }
}

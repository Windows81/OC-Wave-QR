package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

final class zzh {

    /* renamed from: A  reason: collision with root package name */
    public Long f26401A;

    /* renamed from: B  reason: collision with root package name */
    public Long f26402B;
    public long C;
    public String D;
    public int E;
    public int F;
    public long G;
    public String H;
    public byte[] I;
    public long J;
    public long K;
    public long L;
    public long M;
    public long N;
    public long O;
    public String P;
    public boolean Q;
    public long R;
    public long S;

    /* renamed from: a  reason: collision with root package name */
    public final zzhw f26403a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26404b;

    /* renamed from: c  reason: collision with root package name */
    public String f26405c;

    /* renamed from: d  reason: collision with root package name */
    public String f26406d;

    /* renamed from: e  reason: collision with root package name */
    public String f26407e;

    /* renamed from: f  reason: collision with root package name */
    public String f26408f;

    /* renamed from: g  reason: collision with root package name */
    public long f26409g;

    /* renamed from: h  reason: collision with root package name */
    public long f26410h;

    /* renamed from: i  reason: collision with root package name */
    public long f26411i;

    /* renamed from: j  reason: collision with root package name */
    public String f26412j;

    /* renamed from: k  reason: collision with root package name */
    public long f26413k;

    /* renamed from: l  reason: collision with root package name */
    public String f26414l;

    /* renamed from: m  reason: collision with root package name */
    public long f26415m;

    /* renamed from: n  reason: collision with root package name */
    public long f26416n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f26417o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f26418p;

    /* renamed from: q  reason: collision with root package name */
    public String f26419q;

    /* renamed from: r  reason: collision with root package name */
    public Boolean f26420r;

    /* renamed from: s  reason: collision with root package name */
    public long f26421s;

    /* renamed from: t  reason: collision with root package name */
    public List f26422t;

    /* renamed from: u  reason: collision with root package name */
    public String f26423u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f26424v;

    /* renamed from: w  reason: collision with root package name */
    public long f26425w;

    /* renamed from: x  reason: collision with root package name */
    public long f26426x;

    /* renamed from: y  reason: collision with root package name */
    public int f26427y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f26428z;

    public zzh(zzhw zzhw, String str) {
        Preconditions.m(zzhw);
        Preconditions.g(str);
        this.f26403a = zzhw;
        this.f26404b = str;
        zzhw.f().n();
    }

    public final boolean A() {
        this.f26403a.f().n();
        return this.f26417o;
    }

    public final void A0(long j2) {
        boolean z2 = false;
        Preconditions.a(j2 >= 0);
        this.f26403a.f().n();
        boolean z3 = this.Q;
        if (this.f26409g != j2) {
            z2 = true;
        }
        this.Q = z3 | z2;
        this.f26409g = j2;
    }

    public final boolean B() {
        this.f26403a.f().n();
        return this.Q;
    }

    public final long B0() {
        this.f26403a.f().n();
        return this.G;
    }

    public final boolean C() {
        this.f26403a.f().n();
        return this.f26424v;
    }

    public final void C0(long j2) {
        this.f26403a.f().n();
        this.Q |= this.f26410h != j2;
        this.f26410h = j2;
    }

    public final boolean D() {
        this.f26403a.f().n();
        return this.f26428z;
    }

    public final long D0() {
        this.f26403a.f().n();
        return this.f26411i;
    }

    public final byte[] E() {
        this.f26403a.f().n();
        return this.I;
    }

    public final void E0(long j2) {
        this.f26403a.f().n();
        this.Q |= this.f26426x != j2;
        this.f26426x = j2;
    }

    public final int F() {
        this.f26403a.f().n();
        return this.F;
    }

    public final long F0() {
        this.f26403a.f().n();
        return this.f26409g;
    }

    public final void G(int i2) {
        this.f26403a.f().n();
        this.Q |= this.F != i2;
        this.F = i2;
    }

    public final void G0(long j2) {
        this.f26403a.f().n();
        this.Q |= this.f26425w != j2;
        this.f26425w = j2;
    }

    public final void H(long j2) {
        this.f26403a.f().n();
        this.Q |= this.f26413k != j2;
        this.f26413k = j2;
    }

    public final long H0() {
        this.f26403a.f().n();
        return this.f26410h;
    }

    public final void I(Long l2) {
        this.f26403a.f().n();
        this.Q |= !Objects.equals(this.f26402B, l2);
        this.f26402B = l2;
    }

    public final long I0() {
        this.f26403a.f().n();
        return this.f26426x;
    }

    public final void J(String str) {
        this.f26403a.f().n();
        this.Q |= !Objects.equals(this.f26405c, str);
        this.f26405c = str;
    }

    public final long J0() {
        this.f26403a.f().n();
        return this.f26425w;
    }

    public final void K(boolean z2) {
        this.f26403a.f().n();
        this.Q |= this.f26417o != z2;
        this.f26417o = z2;
    }

    public final Boolean K0() {
        this.f26403a.f().n();
        return this.f26420r;
    }

    public final int L() {
        this.f26403a.f().n();
        return this.E;
    }

    public final Long L0() {
        this.f26403a.f().n();
        return this.f26401A;
    }

    public final void M(int i2) {
        this.f26403a.f().n();
        this.Q |= this.E != i2;
        this.E = i2;
    }

    public final Long M0() {
        this.f26403a.f().n();
        return this.f26402B;
    }

    public final void N(long j2) {
        this.f26403a.f().n();
        this.Q |= this.C != j2;
        this.C = j2;
    }

    public final void O(String str) {
        this.f26403a.f().n();
        this.Q |= !Objects.equals(this.f26414l, str);
        this.f26414l = str;
    }

    public final void P(boolean z2) {
        this.f26403a.f().n();
        this.Q |= this.f26424v != z2;
        this.f26424v = z2;
    }

    public final long Q() {
        this.f26403a.f().n();
        return 0;
    }

    public final void R(long j2) {
        this.f26403a.f().n();
        this.Q |= this.R != j2;
        this.R = j2;
    }

    public final void S(String str) {
        this.f26403a.f().n();
        this.Q |= !Objects.equals(this.f26412j, str);
        this.f26412j = str;
    }

    public final void T(boolean z2) {
        this.f26403a.f().n();
        this.Q |= this.f26428z != z2;
        this.f26428z = z2;
    }

    public final long U() {
        this.f26403a.f().n();
        return this.f26413k;
    }

    public final void V(long j2) {
        this.f26403a.f().n();
        this.Q |= this.M != j2;
        this.M = j2;
    }

    public final void W(String str) {
        this.f26403a.f().n();
        this.Q |= !Objects.equals(this.f26408f, str);
        this.f26408f = str;
    }

    public final long X() {
        this.f26403a.f().n();
        return this.C;
    }

    public final void Y(long j2) {
        this.f26403a.f().n();
        this.Q |= this.N != j2;
        this.N = j2;
    }

    public final void Z(String str) {
        this.f26403a.f().n();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.Q |= !Objects.equals(this.f26406d, str);
        this.f26406d = str;
    }

    public final int a() {
        this.f26403a.f().n();
        return this.f26427y;
    }

    public final long a0() {
        this.f26403a.f().n();
        return this.R;
    }

    public final void b(int i2) {
        this.f26403a.f().n();
        this.Q |= this.f26427y != i2;
        this.f26427y = i2;
    }

    public final void b0(long j2) {
        this.f26403a.f().n();
        this.Q |= this.L != j2;
        this.L = j2;
    }

    public final void c(long j2) {
        this.f26403a.f().n();
        long j3 = this.f26409g + j2;
        if (j3 > 2147483647L) {
            this.f26403a.m().L().b("Bundle index overflow. appId", zzgi.v(this.f26404b));
            j3 = j2 - 1;
        }
        long j4 = this.G + 1;
        if (j4 > 2147483647L) {
            this.f26403a.m().L().b("Delivery index overflow. appId", zzgi.v(this.f26404b));
            j4 = 0;
        }
        this.Q = true;
        this.f26409g = j3;
        this.G = j4;
    }

    public final void c0(String str) {
        this.f26403a.f().n();
        this.Q |= !Objects.equals(this.P, str);
        this.P = str;
    }

    public final void d(Boolean bool) {
        this.f26403a.f().n();
        this.Q |= !Objects.equals(this.f26420r, bool);
        this.f26420r = bool;
    }

    public final long d0() {
        this.f26403a.f().n();
        return this.M;
    }

    public final void e(Long l2) {
        this.f26403a.f().n();
        this.Q |= !Objects.equals(this.f26401A, l2);
        this.f26401A = l2;
    }

    public final void e0(long j2) {
        this.f26403a.f().n();
        this.Q |= this.K != j2;
        this.K = j2;
    }

    public final void f(String str) {
        this.f26403a.f().n();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.Q |= !Objects.equals(this.f26419q, str);
        this.f26419q = str;
    }

    public final void f0(String str) {
        this.f26403a.f().n();
        this.Q |= !Objects.equals(this.f26407e, str);
        this.f26407e = str;
    }

    public final void g(List list) {
        this.f26403a.f().n();
        if (!Objects.equals(this.f26422t, list)) {
            this.Q = true;
            this.f26422t = list != null ? new ArrayList(list) : null;
        }
    }

    public final long g0() {
        this.f26403a.f().n();
        return this.N;
    }

    public final void h(boolean z2) {
        this.f26403a.f().n();
        this.Q |= this.f26418p != z2;
        this.f26418p = z2;
    }

    public final void h0(long j2) {
        this.f26403a.f().n();
        this.Q |= this.O != j2;
        this.O = j2;
    }

    public final void i(byte[] bArr) {
        this.f26403a.f().n();
        this.Q |= this.I != bArr;
        this.I = bArr;
    }

    public final void i0(String str) {
        this.f26403a.f().n();
        this.Q |= this.H != str;
        this.H = str;
    }

    public final String j() {
        this.f26403a.f().n();
        return this.f26419q;
    }

    public final long j0() {
        this.f26403a.f().n();
        return this.L;
    }

    public final String k() {
        this.f26403a.f().n();
        String str = this.P;
        c0((String) null);
        return str;
    }

    public final void k0(long j2) {
        this.f26403a.f().n();
        this.Q |= this.J != j2;
        this.J = j2;
    }

    public final String l() {
        this.f26403a.f().n();
        return this.f26404b;
    }

    public final void l0(String str) {
        this.f26403a.f().n();
        this.Q |= !Objects.equals(this.f26423u, str);
        this.f26423u = str;
    }

    public final String m() {
        this.f26403a.f().n();
        return this.f26405c;
    }

    public final long m0() {
        this.f26403a.f().n();
        return this.K;
    }

    public final String n() {
        this.f26403a.f().n();
        return this.f26414l;
    }

    public final void n0(long j2) {
        this.f26403a.f().n();
        this.Q |= this.f26416n != j2;
        this.f26416n = j2;
    }

    public final String o() {
        this.f26403a.f().n();
        return this.f26412j;
    }

    public final void o0(String str) {
        this.f26403a.f().n();
        this.Q |= this.D != str;
        this.D = str;
    }

    public final String p() {
        this.f26403a.f().n();
        return this.f26408f;
    }

    public final long p0() {
        this.f26403a.f().n();
        return this.O;
    }

    public final String q() {
        this.f26403a.f().n();
        return this.f26406d;
    }

    public final void q0(long j2) {
        this.f26403a.f().n();
        this.Q |= this.f26421s != j2;
        this.f26421s = j2;
    }

    public final String r() {
        this.f26403a.f().n();
        return this.P;
    }

    public final long r0() {
        this.f26403a.f().n();
        return this.J;
    }

    public final String s() {
        this.f26403a.f().n();
        return this.f26407e;
    }

    public final void s0(long j2) {
        this.f26403a.f().n();
        this.Q |= this.S != j2;
        this.S = j2;
    }

    public final String t() {
        this.f26403a.f().n();
        return this.H;
    }

    public final long t0() {
        this.f26403a.f().n();
        return this.f26416n;
    }

    public final String u() {
        this.f26403a.f().n();
        return this.f26423u;
    }

    public final void u0(long j2) {
        this.f26403a.f().n();
        this.Q |= this.f26415m != j2;
        this.f26415m = j2;
    }

    public final String v() {
        this.f26403a.f().n();
        return this.D;
    }

    public final long v0() {
        this.f26403a.f().n();
        return this.f26421s;
    }

    public final List w() {
        this.f26403a.f().n();
        return this.f26422t;
    }

    public final void w0(long j2) {
        this.f26403a.f().n();
        this.Q |= this.G != j2;
        this.G = j2;
    }

    public final void x() {
        this.f26403a.f().n();
        this.Q = false;
    }

    public final long x0() {
        this.f26403a.f().n();
        return this.S;
    }

    public final void y() {
        this.f26403a.f().n();
        long j2 = this.f26409g + 1;
        if (j2 > 2147483647L) {
            this.f26403a.m().L().b("Bundle index overflow. appId", zzgi.v(this.f26404b));
            j2 = 0;
        }
        this.Q = true;
        this.f26409g = j2;
    }

    public final void y0(long j2) {
        this.f26403a.f().n();
        this.Q |= this.f26411i != j2;
        this.f26411i = j2;
    }

    public final boolean z() {
        this.f26403a.f().n();
        return this.f26418p;
    }

    public final long z0() {
        this.f26403a.f().n();
        return this.f26415m;
    }
}

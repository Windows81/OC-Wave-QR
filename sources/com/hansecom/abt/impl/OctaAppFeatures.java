package com.hansecom.abt.impl;

import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.data.config.help.HelpScreenConfig;
import com.hansecom.abt.data.localDomain.PaymentMethodType;
import com.hansecom.abt.data.localDomain.VirtualCardType;
import com.hansecom.abt.presentation.model.PaymentProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;

@Metadata
public final class OctaAppFeatures implements AppFeatures {

    /* renamed from: A  reason: collision with root package name */
    public final VirtualCardType f34058A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f34059B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final HelpScreenConfig I;
    public final HelpScreenConfig J;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f34060a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f34061b = true;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f34062c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f34063d = true;

    /* renamed from: e  reason: collision with root package name */
    public final int f34064e = 500;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f34065f;

    /* renamed from: g  reason: collision with root package name */
    public final int f34066g = 20;

    /* renamed from: h  reason: collision with root package name */
    public final int f34067h = 3;

    /* renamed from: i  reason: collision with root package name */
    public final int f34068i = 4;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f34069j = true;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f34070k = true;

    /* renamed from: l  reason: collision with root package name */
    public final long f34071l = 10000;

    /* renamed from: m  reason: collision with root package name */
    public final long f34072m = 15000;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f34073n = true;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f34074o = true;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f34075p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f34076q = true;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f34077r = true;

    /* renamed from: s  reason: collision with root package name */
    public final PersistentList f34078s;

    /* renamed from: t  reason: collision with root package name */
    public final PersistentList f34079t;

    /* renamed from: u  reason: collision with root package name */
    public final PersistentList f34080u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f34081v;

    /* renamed from: w  reason: collision with root package name */
    public final PersistentList f34082w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f34083x;

    /* renamed from: y  reason: collision with root package name */
    public final PaymentProvider f34084y;

    /* renamed from: z  reason: collision with root package name */
    public final int f34085z;

    public OctaAppFeatures() {
        PaymentMethodType paymentMethodType = PaymentMethodType.CREDIT_CARD;
        this.f34078s = ExtensionsKt.b(paymentMethodType);
        PaymentMethodType paymentMethodType2 = PaymentMethodType.GOOGLE_PAY;
        this.f34079t = ExtensionsKt.b(paymentMethodType, paymentMethodType2, PaymentMethodType.CASH);
        this.f34080u = ExtensionsKt.b(paymentMethodType, paymentMethodType2);
        this.f34081v = true;
        this.f34082w = ExtensionsKt.b(paymentMethodType);
        this.f34083x = true;
        this.f34084y = PaymentProvider.NMI;
        this.f34085z = 1;
        this.f34058A = VirtualCardType.BARCODE;
        this.f34059B = true;
        this.C = true;
        this.E = true;
        this.F = true;
        this.G = true;
        this.I = new HelpScreenConfig((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, 511, (DefaultConstructorMarker) null);
        this.J = n();
    }

    public boolean A() {
        return this.f34063d;
    }

    public boolean B() {
        return this.f34059B;
    }

    public boolean C() {
        return this.F;
    }

    public int D() {
        return this.f34068i;
    }

    public boolean E() {
        return this.H;
    }

    public boolean F() {
        return this.D;
    }

    public HelpScreenConfig G() {
        return this.J;
    }

    public long H() {
        return this.f34071l;
    }

    public boolean I() {
        return this.C;
    }

    public int J() {
        return this.f34085z;
    }

    public boolean a() {
        return this.f34073n;
    }

    public boolean b() {
        return this.f34061b;
    }

    public int c() {
        return this.f34066g;
    }

    public boolean d() {
        return this.G;
    }

    public boolean e() {
        return this.f34074o;
    }

    public boolean f() {
        return this.f34062c;
    }

    public boolean g() {
        return this.f34069j;
    }

    public boolean h() {
        return this.f34081v;
    }

    public int i() {
        return this.f34064e;
    }

    public long j() {
        return this.f34072m;
    }

    public boolean k() {
        return this.f34077r;
    }

    public boolean l() {
        return this.f34060a;
    }

    public boolean m() {
        return this.f34083x;
    }

    public HelpScreenConfig n() {
        return this.I;
    }

    public int o() {
        return this.f34067h;
    }

    public PersistentList p() {
        return this.f34078s;
    }

    public boolean q() {
        return this.f34065f;
    }

    public boolean r() {
        return this.f34076q;
    }

    public boolean s() {
        return this.f34070k;
    }

    public PersistentList t() {
        return this.f34080u;
    }

    public PaymentProvider u() {
        return this.f34084y;
    }

    public boolean v() {
        return this.E;
    }

    public VirtualCardType w() {
        return this.f34058A;
    }

    public PersistentList x() {
        return this.f34079t;
    }

    public PersistentList y() {
        return this.f34082w;
    }

    public boolean z() {
        return this.f34075p;
    }
}

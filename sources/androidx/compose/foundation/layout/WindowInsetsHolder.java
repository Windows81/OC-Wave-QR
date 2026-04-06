package androidx.compose.foundation.layout;

import android.view.View;
import android.view.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class WindowInsetsHolder {

    /* renamed from: A  reason: collision with root package name */
    public static boolean f4214A;

    /* renamed from: x  reason: collision with root package name */
    public static final Companion f4215x = new Companion((DefaultConstructorMarker) null);

    /* renamed from: y  reason: collision with root package name */
    public static final int f4216y = 8;

    /* renamed from: z  reason: collision with root package name */
    public static final WeakHashMap f4217z = new WeakHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final AndroidWindowInsets f4218a;

    /* renamed from: b  reason: collision with root package name */
    public final AndroidWindowInsets f4219b;

    /* renamed from: c  reason: collision with root package name */
    public final AndroidWindowInsets f4220c;

    /* renamed from: d  reason: collision with root package name */
    public final AndroidWindowInsets f4221d;

    /* renamed from: e  reason: collision with root package name */
    public final AndroidWindowInsets f4222e;

    /* renamed from: f  reason: collision with root package name */
    public final AndroidWindowInsets f4223f;

    /* renamed from: g  reason: collision with root package name */
    public final AndroidWindowInsets f4224g;

    /* renamed from: h  reason: collision with root package name */
    public final AndroidWindowInsets f4225h;

    /* renamed from: i  reason: collision with root package name */
    public final AndroidWindowInsets f4226i;

    /* renamed from: j  reason: collision with root package name */
    public final ValueInsets f4227j;

    /* renamed from: k  reason: collision with root package name */
    public final WindowInsets f4228k;

    /* renamed from: l  reason: collision with root package name */
    public final WindowInsets f4229l;

    /* renamed from: m  reason: collision with root package name */
    public final WindowInsets f4230m;

    /* renamed from: n  reason: collision with root package name */
    public final ValueInsets f4231n;

    /* renamed from: o  reason: collision with root package name */
    public final ValueInsets f4232o;

    /* renamed from: p  reason: collision with root package name */
    public final ValueInsets f4233p;

    /* renamed from: q  reason: collision with root package name */
    public final ValueInsets f4234q;

    /* renamed from: r  reason: collision with root package name */
    public final ValueInsets f4235r;

    /* renamed from: s  reason: collision with root package name */
    public final ValueInsets f4236s;

    /* renamed from: t  reason: collision with root package name */
    public final ValueInsets f4237t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f4238u;

    /* renamed from: v  reason: collision with root package name */
    public int f4239v;

    /* renamed from: w  reason: collision with root package name */
    public final InsetsListener f4240w;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WindowInsetsHolder c(Composer composer, int i2) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1366542614, i2, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:578)");
            }
            View view = (View) composer.C(AndroidCompositionLocals_androidKt.j());
            WindowInsetsHolder d2 = d(view);
            boolean l2 = composer.l(d2) | composer.l(view);
            Object g2 = composer.g();
            if (l2 || g2 == Composer.f14567a.a()) {
                g2 = new WindowInsetsHolder$Companion$current$1$1(d2, view);
                composer.N(g2);
            }
            EffectsKt.c(d2, (Function1) g2, composer, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
            return d2;
        }

        public final WindowInsetsHolder d(View view) {
            WindowInsetsHolder windowInsetsHolder;
            synchronized (WindowInsetsHolder.f4217z) {
                try {
                    WeakHashMap a2 = WindowInsetsHolder.f4217z;
                    Object obj = a2.get(view);
                    if (obj == null) {
                        obj = new WindowInsetsHolder((WindowInsetsCompat) null, view, (DefaultConstructorMarker) null);
                        a2.put(view, obj);
                    }
                    windowInsetsHolder = (WindowInsetsHolder) obj;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return windowInsetsHolder;
        }

        public final AndroidWindowInsets e(WindowInsetsCompat windowInsetsCompat, int i2, String str) {
            AndroidWindowInsets androidWindowInsets = new AndroidWindowInsets(i2, str);
            if (windowInsetsCompat != null) {
                androidWindowInsets.j(windowInsetsCompat, i2);
            }
            return androidWindowInsets;
        }

        public final ValueInsets f(WindowInsetsCompat windowInsetsCompat, int i2, String str) {
            Insets insets;
            if (windowInsetsCompat == null || (insets = windowInsetsCompat.g(i2)) == null) {
                insets = Insets.f19773e;
            }
            return WindowInsets_androidKt.a(insets, str);
        }

        public Companion() {
        }
    }

    public /* synthetic */ WindowInsetsHolder(WindowInsetsCompat windowInsetsCompat, View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(windowInsetsCompat, view);
    }

    public static /* synthetic */ void r(WindowInsetsHolder windowInsetsHolder, WindowInsetsCompat windowInsetsCompat, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        windowInsetsHolder.q(windowInsetsCompat, i2);
    }

    public final void b(View view) {
        int i2 = this.f4239v - 1;
        this.f4239v = i2;
        if (i2 == 0) {
            ViewCompat.d0(view, (OnApplyWindowInsetsListener) null);
            ViewCompat.i0(view, (WindowInsetsAnimationCompat.Callback) null);
            view.removeOnAttachStateChangeListener(this.f4240w);
        }
    }

    public final AndroidWindowInsets c() {
        return this.f4218a;
    }

    public final boolean d() {
        return this.f4238u;
    }

    public final AndroidWindowInsets e() {
        return this.f4219b;
    }

    public final AndroidWindowInsets f() {
        return this.f4220c;
    }

    public final AndroidWindowInsets g() {
        return this.f4221d;
    }

    public final AndroidWindowInsets h() {
        return this.f4222e;
    }

    public final WindowInsets i() {
        return this.f4230m;
    }

    public final WindowInsets j() {
        return this.f4228k;
    }

    public final WindowInsets k() {
        return this.f4229l;
    }

    public final AndroidWindowInsets l() {
        return this.f4223f;
    }

    public final AndroidWindowInsets m() {
        return this.f4224g;
    }

    public final AndroidWindowInsets n() {
        return this.f4225h;
    }

    public final ValueInsets o() {
        return this.f4227j;
    }

    public final void p(View view) {
        if (this.f4239v == 0) {
            ViewCompat.d0(view, this.f4240w);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.f4240w);
            ViewCompat.i0(view, this.f4240w);
        }
        this.f4239v++;
    }

    public final void q(WindowInsetsCompat windowInsetsCompat, int i2) {
        if (f4214A) {
            WindowInsets w2 = windowInsetsCompat.w();
            Intrinsics.f(w2);
            windowInsetsCompat = WindowInsetsCompat.x(w2);
        }
        this.f4218a.j(windowInsetsCompat, i2);
        this.f4220c.j(windowInsetsCompat, i2);
        this.f4219b.j(windowInsetsCompat, i2);
        this.f4222e.j(windowInsetsCompat, i2);
        this.f4223f.j(windowInsetsCompat, i2);
        this.f4224g.j(windowInsetsCompat, i2);
        this.f4225h.j(windowInsetsCompat, i2);
        this.f4226i.j(windowInsetsCompat, i2);
        this.f4221d.j(windowInsetsCompat, i2);
        if (i2 == 0) {
            this.f4231n.f(WindowInsets_androidKt.f(windowInsetsCompat.g(WindowInsetsCompat.Type.b())));
            this.f4232o.f(WindowInsets_androidKt.f(windowInsetsCompat.g(WindowInsetsCompat.Type.g())));
            this.f4233p.f(WindowInsets_androidKt.f(windowInsetsCompat.g(WindowInsetsCompat.Type.h())));
            this.f4234q.f(WindowInsets_androidKt.f(windowInsetsCompat.g(WindowInsetsCompat.Type.i())));
            this.f4235r.f(WindowInsets_androidKt.f(windowInsetsCompat.g(WindowInsetsCompat.Type.k())));
            DisplayCutoutCompat e2 = windowInsetsCompat.e();
            if (e2 != null) {
                this.f4227j.f(WindowInsets_androidKt.f(e2.e()));
            }
        }
        Snapshot.f15255e.n();
    }

    public final void s(WindowInsetsCompat windowInsetsCompat) {
        this.f4237t.f(WindowInsets_androidKt.f(windowInsetsCompat.f(WindowInsetsCompat.Type.d())));
    }

    public final void t(WindowInsetsCompat windowInsetsCompat) {
        this.f4236s.f(WindowInsets_androidKt.f(windowInsetsCompat.f(WindowInsetsCompat.Type.d())));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0079, code lost:
        r7 = (r7 = r10.e()).e();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public WindowInsetsHolder(androidx.core.view.WindowInsetsCompat r10, android.view.View r11) {
        /*
            r9 = this;
            r9.<init>()
            androidx.compose.foundation.layout.WindowInsetsHolder$Companion r0 = f4215x
            int r1 = androidx.core.view.WindowInsetsCompat.Type.b()
            java.lang.String r2 = "captionBar"
            androidx.compose.foundation.layout.AndroidWindowInsets r1 = r0.e(r10, r1, r2)
            r9.f4218a = r1
            int r1 = androidx.core.view.WindowInsetsCompat.Type.c()
            java.lang.String r2 = "displayCutout"
            androidx.compose.foundation.layout.AndroidWindowInsets r1 = r0.e(r10, r1, r2)
            r9.f4219b = r1
            int r2 = androidx.core.view.WindowInsetsCompat.Type.d()
            java.lang.String r3 = "ime"
            androidx.compose.foundation.layout.AndroidWindowInsets r2 = r0.e(r10, r2, r3)
            r9.f4220c = r2
            int r3 = androidx.core.view.WindowInsetsCompat.Type.f()
            java.lang.String r4 = "mandatorySystemGestures"
            androidx.compose.foundation.layout.AndroidWindowInsets r3 = r0.e(r10, r3, r4)
            r9.f4221d = r3
            int r4 = androidx.core.view.WindowInsetsCompat.Type.g()
            java.lang.String r5 = "navigationBars"
            androidx.compose.foundation.layout.AndroidWindowInsets r4 = r0.e(r10, r4, r5)
            r9.f4222e = r4
            int r4 = androidx.core.view.WindowInsetsCompat.Type.h()
            java.lang.String r5 = "statusBars"
            androidx.compose.foundation.layout.AndroidWindowInsets r4 = r0.e(r10, r4, r5)
            r9.f4223f = r4
            int r4 = androidx.core.view.WindowInsetsCompat.Type.i()
            java.lang.String r5 = "systemBars"
            androidx.compose.foundation.layout.AndroidWindowInsets r4 = r0.e(r10, r4, r5)
            r9.f4224g = r4
            int r5 = androidx.core.view.WindowInsetsCompat.Type.j()
            java.lang.String r6 = "systemGestures"
            androidx.compose.foundation.layout.AndroidWindowInsets r5 = r0.e(r10, r5, r6)
            r9.f4225h = r5
            int r6 = androidx.core.view.WindowInsetsCompat.Type.k()
            java.lang.String r7 = "tappableElement"
            androidx.compose.foundation.layout.AndroidWindowInsets r6 = r0.e(r10, r6, r7)
            r9.f4226i = r6
            if (r10 == 0) goto L_0x007f
            androidx.core.view.DisplayCutoutCompat r7 = r10.e()
            if (r7 == 0) goto L_0x007f
            androidx.core.graphics.Insets r7 = r7.e()
            if (r7 != 0) goto L_0x0081
        L_0x007f:
            androidx.core.graphics.Insets r7 = androidx.core.graphics.Insets.f19773e
        L_0x0081:
            java.lang.String r8 = "waterfall"
            androidx.compose.foundation.layout.ValueInsets r7 = androidx.compose.foundation.layout.WindowInsets_androidKt.a(r7, r8)
            r9.f4227j = r7
            androidx.compose.foundation.layout.WindowInsets r2 = androidx.compose.foundation.layout.WindowInsetsKt.k(r4, r2)
            androidx.compose.foundation.layout.WindowInsets r1 = androidx.compose.foundation.layout.WindowInsetsKt.k(r2, r1)
            r9.f4228k = r1
            androidx.compose.foundation.layout.WindowInsets r2 = androidx.compose.foundation.layout.WindowInsetsKt.k(r6, r3)
            androidx.compose.foundation.layout.WindowInsets r2 = androidx.compose.foundation.layout.WindowInsetsKt.k(r2, r5)
            androidx.compose.foundation.layout.WindowInsets r2 = androidx.compose.foundation.layout.WindowInsetsKt.k(r2, r7)
            r9.f4229l = r2
            androidx.compose.foundation.layout.WindowInsets r1 = androidx.compose.foundation.layout.WindowInsetsKt.k(r1, r2)
            r9.f4230m = r1
            int r1 = androidx.core.view.WindowInsetsCompat.Type.b()
            java.lang.String r2 = "captionBarIgnoringVisibility"
            androidx.compose.foundation.layout.ValueInsets r1 = r0.f(r10, r1, r2)
            r9.f4231n = r1
            int r1 = androidx.core.view.WindowInsetsCompat.Type.g()
            java.lang.String r2 = "navigationBarsIgnoringVisibility"
            androidx.compose.foundation.layout.ValueInsets r1 = r0.f(r10, r1, r2)
            r9.f4232o = r1
            int r1 = androidx.core.view.WindowInsetsCompat.Type.h()
            java.lang.String r2 = "statusBarsIgnoringVisibility"
            androidx.compose.foundation.layout.ValueInsets r1 = r0.f(r10, r1, r2)
            r9.f4233p = r1
            int r1 = androidx.core.view.WindowInsetsCompat.Type.i()
            java.lang.String r2 = "systemBarsIgnoringVisibility"
            androidx.compose.foundation.layout.ValueInsets r1 = r0.f(r10, r1, r2)
            r9.f4234q = r1
            int r1 = androidx.core.view.WindowInsetsCompat.Type.k()
            java.lang.String r2 = "tappableElementIgnoringVisibility"
            androidx.compose.foundation.layout.ValueInsets r1 = r0.f(r10, r1, r2)
            r9.f4235r = r1
            int r1 = androidx.core.view.WindowInsetsCompat.Type.d()
            java.lang.String r2 = "imeAnimationTarget"
            androidx.compose.foundation.layout.ValueInsets r1 = r0.f(r10, r1, r2)
            r9.f4236s = r1
            int r1 = androidx.core.view.WindowInsetsCompat.Type.d()
            java.lang.String r2 = "imeAnimationSource"
            androidx.compose.foundation.layout.ValueInsets r10 = r0.f(r10, r1, r2)
            r9.f4237t = r10
            android.view.ViewParent r10 = r11.getParent()
            boolean r11 = r10 instanceof android.view.View
            r0 = 0
            if (r11 == 0) goto L_0x0107
            android.view.View r10 = (android.view.View) r10
            goto L_0x0108
        L_0x0107:
            r10 = r0
        L_0x0108:
            if (r10 == 0) goto L_0x0111
            int r11 = androidx.compose.ui.R.id.I
            java.lang.Object r10 = r10.getTag(r11)
            goto L_0x0112
        L_0x0111:
            r10 = r0
        L_0x0112:
            boolean r11 = r10 instanceof java.lang.Boolean
            if (r11 == 0) goto L_0x0119
            r0 = r10
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L_0x0119:
            if (r0 == 0) goto L_0x0120
            boolean r10 = r0.booleanValue()
            goto L_0x0121
        L_0x0120:
            r10 = 1
        L_0x0121:
            r9.f4238u = r10
            androidx.compose.foundation.layout.InsetsListener r10 = new androidx.compose.foundation.layout.InsetsListener
            r10.<init>(r9)
            r9.f4240w = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.WindowInsetsHolder.<init>(androidx.core.view.WindowInsetsCompat, android.view.View):void");
    }
}

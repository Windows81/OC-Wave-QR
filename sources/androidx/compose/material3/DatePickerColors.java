package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class DatePickerColors {

    /* renamed from: a  reason: collision with root package name */
    public final long f9657a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9658b;

    /* renamed from: c  reason: collision with root package name */
    public final long f9659c;

    /* renamed from: d  reason: collision with root package name */
    public final long f9660d;

    /* renamed from: e  reason: collision with root package name */
    public final long f9661e;

    /* renamed from: f  reason: collision with root package name */
    public final long f9662f;

    /* renamed from: g  reason: collision with root package name */
    public final long f9663g;

    /* renamed from: h  reason: collision with root package name */
    public final long f9664h;

    /* renamed from: i  reason: collision with root package name */
    public final long f9665i;

    /* renamed from: j  reason: collision with root package name */
    public final long f9666j;

    /* renamed from: k  reason: collision with root package name */
    public final long f9667k;

    /* renamed from: l  reason: collision with root package name */
    public final long f9668l;

    /* renamed from: m  reason: collision with root package name */
    public final long f9669m;

    /* renamed from: n  reason: collision with root package name */
    public final long f9670n;

    /* renamed from: o  reason: collision with root package name */
    public final long f9671o;

    /* renamed from: p  reason: collision with root package name */
    public final long f9672p;

    /* renamed from: q  reason: collision with root package name */
    public final long f9673q;

    /* renamed from: r  reason: collision with root package name */
    public final long f9674r;

    /* renamed from: s  reason: collision with root package name */
    public final long f9675s;

    /* renamed from: t  reason: collision with root package name */
    public final long f9676t;

    /* renamed from: u  reason: collision with root package name */
    public final long f9677u;

    /* renamed from: v  reason: collision with root package name */
    public final long f9678v;

    /* renamed from: w  reason: collision with root package name */
    public final long f9679w;

    /* renamed from: x  reason: collision with root package name */
    public final long f9680x;

    /* renamed from: y  reason: collision with root package name */
    public final TextFieldColors f9681y;

    public /* synthetic */ DatePickerColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, TextFieldColors textFieldColors, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, textFieldColors);
    }

    public final State a(boolean z2, boolean z3, boolean z4, Composer composer, int i2) {
        State state;
        if (ComposerKt.P()) {
            ComposerKt.Y(-1240482658, i2, -1, "androidx.compose.material3.DatePickerColors.dayContainerColor (DatePicker.kt:976)");
        }
        long e2 = z2 ? z3 ? this.f9674r : this.f9675s : Color.f15975b.e();
        if (z4) {
            composer.X(-1319856736);
            state = SingleValueAnimationKt.a(e2, MotionSchemeKt.b(MotionSchemeKeyTokens.DefaultEffects, composer, 6), (String) null, (Function1) null, composer, 0, 12);
            composer.M();
        } else {
            composer.X(-1319630064);
            state = SnapshotStateKt.p(Color.h(e2), composer, 0);
            composer.M();
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return state;
    }

    public final State b(boolean z2, boolean z3, boolean z4, boolean z5, Composer composer, int i2) {
        State state;
        if (ComposerKt.P()) {
            ComposerKt.Y(-1233694918, i2, -1, "androidx.compose.material3.DatePickerColors.dayContentColor (DatePicker.kt:940)");
        }
        long j2 = (!z3 || !z5) ? (!z3 || z5) ? (!z4 || !z5) ? (!z4 || z5) ? (!z2 || !z5) ? z5 ? this.f9670n : this.f9671o : this.f9676t : this.f9671o : this.f9679w : this.f9673q : this.f9672p;
        if (z4) {
            composer.X(-969483020);
            state = SnapshotStateKt.p(Color.h(j2), composer, 0);
            composer.M();
        } else {
            composer.X(-969417610);
            state = SingleValueAnimationKt.a(j2, MotionSchemeKt.b(MotionSchemeKeyTokens.DefaultEffects, composer, 6), (String) null, (Function1) null, composer, 0, 12);
            composer.M();
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return state;
    }

    public final long c() {
        return this.f9657a;
    }

    public final TextFieldColors d() {
        return this.f9681y;
    }

    public final long e() {
        return this.f9678v;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DatePickerColors)) {
            return false;
        }
        DatePickerColors datePickerColors = (DatePickerColors) obj;
        return Color.n(this.f9657a, datePickerColors.f9657a) && Color.n(this.f9658b, datePickerColors.f9658b) && Color.n(this.f9659c, datePickerColors.f9659c) && Color.n(this.f9660d, datePickerColors.f9660d) && Color.n(this.f9661e, datePickerColors.f9661e) && Color.n(this.f9663g, datePickerColors.f9663g) && Color.n(this.f9664h, datePickerColors.f9664h) && Color.n(this.f9665i, datePickerColors.f9665i) && Color.n(this.f9666j, datePickerColors.f9666j) && Color.n(this.f9667k, datePickerColors.f9667k) && Color.n(this.f9668l, datePickerColors.f9668l) && Color.n(this.f9669m, datePickerColors.f9669m) && Color.n(this.f9670n, datePickerColors.f9670n) && Color.n(this.f9671o, datePickerColors.f9671o) && Color.n(this.f9672p, datePickerColors.f9672p) && Color.n(this.f9673q, datePickerColors.f9673q) && Color.n(this.f9674r, datePickerColors.f9674r) && Color.n(this.f9675s, datePickerColors.f9675s) && Color.n(this.f9676t, datePickerColors.f9676t) && Color.n(this.f9677u, datePickerColors.f9677u) && Color.n(this.f9678v, datePickerColors.f9678v) && Color.n(this.f9679w, datePickerColors.f9679w);
    }

    public final long f() {
        return this.f9680x;
    }

    public final long g() {
        return this.f9659c;
    }

    public final long h() {
        return this.f9662f;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((Color.t(this.f9657a) * 31) + Color.t(this.f9658b)) * 31) + Color.t(this.f9659c)) * 31) + Color.t(this.f9660d)) * 31) + Color.t(this.f9661e)) * 31) + Color.t(this.f9663g)) * 31) + Color.t(this.f9664h)) * 31) + Color.t(this.f9665i)) * 31) + Color.t(this.f9666j)) * 31) + Color.t(this.f9667k)) * 31) + Color.t(this.f9668l)) * 31) + Color.t(this.f9669m)) * 31) + Color.t(this.f9670n)) * 31) + Color.t(this.f9671o)) * 31) + Color.t(this.f9672p)) * 31) + Color.t(this.f9673q)) * 31) + Color.t(this.f9674r)) * 31) + Color.t(this.f9675s)) * 31) + Color.t(this.f9676t)) * 31) + Color.t(this.f9677u)) * 31) + Color.t(this.f9678v)) * 31) + Color.t(this.f9679w);
    }

    public final long i() {
        return this.f9661e;
    }

    public final long j() {
        return this.f9658b;
    }

    public final long k() {
        return this.f9677u;
    }

    public final long l() {
        return this.f9660d;
    }

    public final State m(boolean z2, boolean z3, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1306331107, i2, -1, "androidx.compose.material3.DatePickerColors.yearContainerColor (DatePicker.kt:1030)");
        }
        State a2 = SingleValueAnimationKt.a(z2 ? z3 ? this.f9668l : this.f9669m : Color.f15975b.e(), MotionSchemeKt.b(MotionSchemeKeyTokens.DefaultEffects, composer, 6), (String) null, (Function1) null, composer, 0, 12);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return a2;
    }

    public final State n(boolean z2, boolean z3, boolean z4, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(874111097, i2, -1, "androidx.compose.material3.DatePickerColors.yearContentColor (DatePicker.kt:1006)");
        }
        State a2 = SingleValueAnimationKt.a((!z3 || !z4) ? (!z3 || z4) ? (!z2 || !z4) ? z4 ? this.f9663g : this.f9664h : this.f9665i : this.f9667k : this.f9666j, MotionSchemeKt.b(MotionSchemeKeyTokens.DefaultEffects, composer, 6), (String) null, (Function1) null, composer, 0, 12);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return a2;
    }

    public DatePickerColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, TextFieldColors textFieldColors) {
        this.f9657a = j2;
        this.f9658b = j3;
        this.f9659c = j4;
        this.f9660d = j5;
        this.f9661e = j6;
        this.f9662f = j7;
        this.f9663g = j8;
        this.f9664h = j9;
        this.f9665i = j10;
        this.f9666j = j11;
        this.f9667k = j12;
        this.f9668l = j13;
        this.f9669m = j14;
        this.f9670n = j15;
        this.f9671o = j16;
        this.f9672p = j17;
        this.f9673q = j18;
        this.f9674r = j19;
        this.f9675s = j20;
        this.f9676t = j21;
        this.f9677u = j22;
        this.f9678v = j23;
        this.f9679w = j24;
        this.f9680x = j25;
        this.f9681y = textFieldColors;
    }
}

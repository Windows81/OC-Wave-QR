package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.Metadata;

@Metadata
final class StaticLayoutParams {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f18555a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18556b;

    /* renamed from: c  reason: collision with root package name */
    public final int f18557c;

    /* renamed from: d  reason: collision with root package name */
    public final TextPaint f18558d;

    /* renamed from: e  reason: collision with root package name */
    public final int f18559e;

    /* renamed from: f  reason: collision with root package name */
    public final TextDirectionHeuristic f18560f;

    /* renamed from: g  reason: collision with root package name */
    public final Layout.Alignment f18561g;

    /* renamed from: h  reason: collision with root package name */
    public final int f18562h;

    /* renamed from: i  reason: collision with root package name */
    public final TextUtils.TruncateAt f18563i;

    /* renamed from: j  reason: collision with root package name */
    public final int f18564j;

    /* renamed from: k  reason: collision with root package name */
    public final float f18565k;

    /* renamed from: l  reason: collision with root package name */
    public final float f18566l;

    /* renamed from: m  reason: collision with root package name */
    public final int f18567m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f18568n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f18569o;

    /* renamed from: p  reason: collision with root package name */
    public final int f18570p;

    /* renamed from: q  reason: collision with root package name */
    public final int f18571q;

    /* renamed from: r  reason: collision with root package name */
    public final int f18572r;

    /* renamed from: s  reason: collision with root package name */
    public final int f18573s;

    /* renamed from: t  reason: collision with root package name */
    public final int[] f18574t;

    /* renamed from: u  reason: collision with root package name */
    public final int[] f18575u;

    public StaticLayoutParams(CharSequence charSequence, int i2, int i3, TextPaint textPaint, int i4, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i5, TextUtils.TruncateAt truncateAt, int i6, float f2, float f3, int i7, boolean z2, boolean z3, int i8, int i9, int i10, int i11, int[] iArr, int[] iArr2) {
        int i12 = i2;
        int i13 = i3;
        int i14 = i4;
        int i15 = i5;
        int i16 = i6;
        float f4 = f2;
        this.f18555a = charSequence;
        this.f18556b = i12;
        this.f18557c = i13;
        this.f18558d = textPaint;
        this.f18559e = i14;
        this.f18560f = textDirectionHeuristic;
        this.f18561g = alignment;
        this.f18562h = i15;
        this.f18563i = truncateAt;
        this.f18564j = i16;
        this.f18565k = f4;
        this.f18566l = f3;
        this.f18567m = i7;
        this.f18568n = z2;
        this.f18569o = z3;
        this.f18570p = i8;
        this.f18571q = i9;
        this.f18572r = i10;
        this.f18573s = i11;
        this.f18574t = iArr;
        this.f18575u = iArr2;
        boolean z4 = true;
        if (!(i12 >= 0 && i12 <= i13)) {
            InlineClassHelperKt.a("invalid start value");
        }
        if (!(i13 >= 0 && i13 <= charSequence.length())) {
            InlineClassHelperKt.a("invalid end value");
        }
        if (!(i15 >= 0)) {
            InlineClassHelperKt.a("invalid maxLines value");
        }
        if (!(i14 >= 0)) {
            InlineClassHelperKt.a("invalid width value");
        }
        if (!(i16 >= 0)) {
            InlineClassHelperKt.a("invalid ellipsizedWidth value");
        }
        if (!(f4 < 0.0f ? false : z4)) {
            InlineClassHelperKt.a("invalid lineSpacingMultiplier value");
        }
    }

    public final Layout.Alignment a() {
        return this.f18561g;
    }

    public final int b() {
        return this.f18570p;
    }

    public final TextUtils.TruncateAt c() {
        return this.f18563i;
    }

    public final int d() {
        return this.f18564j;
    }

    public final int e() {
        return this.f18557c;
    }

    public final int f() {
        return this.f18573s;
    }

    public final boolean g() {
        return this.f18568n;
    }

    public final int h() {
        return this.f18567m;
    }

    public final int[] i() {
        return this.f18574t;
    }

    public final int j() {
        return this.f18571q;
    }

    public final int k() {
        return this.f18572r;
    }

    public final float l() {
        return this.f18566l;
    }

    public final float m() {
        return this.f18565k;
    }

    public final int n() {
        return this.f18562h;
    }

    public final TextPaint o() {
        return this.f18558d;
    }

    public final int[] p() {
        return this.f18575u;
    }

    public final int q() {
        return this.f18556b;
    }

    public final CharSequence r() {
        return this.f18555a;
    }

    public final TextDirectionHeuristic s() {
        return this.f18560f;
    }

    public final boolean t() {
        return this.f18569o;
    }

    public final int u() {
        return this.f18559e;
    }
}

package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.Metadata;

@Metadata
public final class LineHeightStyleSpan implements LineHeightSpan {

    /* renamed from: a  reason: collision with root package name */
    public final float f18624a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18625b;

    /* renamed from: c  reason: collision with root package name */
    public final int f18626c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f18627d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f18628e;

    /* renamed from: f  reason: collision with root package name */
    public final float f18629f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f18630g;

    /* renamed from: h  reason: collision with root package name */
    public int f18631h = Integer.MIN_VALUE;

    /* renamed from: i  reason: collision with root package name */
    public int f18632i = Integer.MIN_VALUE;

    /* renamed from: j  reason: collision with root package name */
    public int f18633j = Integer.MIN_VALUE;

    /* renamed from: k  reason: collision with root package name */
    public int f18634k = Integer.MIN_VALUE;

    /* renamed from: l  reason: collision with root package name */
    public int f18635l;

    /* renamed from: m  reason: collision with root package name */
    public int f18636m;

    public LineHeightStyleSpan(float f2, int i2, int i3, boolean z2, boolean z3, float f3, boolean z4) {
        this.f18624a = f2;
        this.f18625b = i2;
        this.f18626c = i3;
        this.f18627d = z2;
        this.f18628e = z3;
        this.f18629f = f3;
        this.f18630g = z4;
        if (!((0.0f <= f3 && f3 <= 1.0f) || f3 == -1.0f)) {
            InlineClassHelperKt.c("topRatio should be in [0..1] range or -1");
        }
    }

    public final void a(Paint.FontMetricsInt fontMetricsInt) {
        int a2 = LineHeightStyleSpan_androidKt.a(fontMetricsInt);
        int ceil = (int) ((float) Math.ceil((double) this.f18624a));
        int i2 = ceil - a2;
        if (!this.f18630g || i2 > 0) {
            float f2 = this.f18629f;
            if (f2 == -1.0f) {
                f2 = Math.abs((float) fontMetricsInt.ascent) / ((float) LineHeightStyleSpan_androidKt.a(fontMetricsInt));
            }
            int ceil2 = (int) ((float) (i2 <= 0 ? Math.ceil((double) (((float) i2) * f2)) : Math.ceil((double) (((float) i2) * (1.0f - f2)))));
            int i3 = fontMetricsInt.descent;
            int i4 = ceil2 + i3;
            this.f18633j = i4;
            int i5 = i4 - ceil;
            this.f18632i = i5;
            if (this.f18627d) {
                i5 = fontMetricsInt.ascent;
            }
            this.f18631h = i5;
            if (this.f18628e) {
                i4 = i3;
            }
            this.f18634k = i4;
            this.f18635l = fontMetricsInt.ascent - i5;
            this.f18636m = i4 - i3;
            return;
        }
        int i6 = fontMetricsInt.ascent;
        this.f18632i = i6;
        int i7 = fontMetricsInt.descent;
        this.f18633j = i7;
        this.f18631h = i6;
        this.f18634k = i7;
        this.f18635l = 0;
        this.f18636m = 0;
    }

    public final LineHeightStyleSpan b(int i2, int i3, boolean z2) {
        return new LineHeightStyleSpan(this.f18624a, i2, i3, z2, this.f18628e, this.f18629f, this.f18630g);
    }

    public final int c() {
        return this.f18635l;
    }

    public void chooseHeight(CharSequence charSequence, int i2, int i3, int i4, int i5, Paint.FontMetricsInt fontMetricsInt) {
        if (LineHeightStyleSpan_androidKt.a(fontMetricsInt) > 0) {
            boolean z2 = false;
            boolean z3 = i2 == this.f18625b;
            if (i3 == this.f18626c) {
                z2 = true;
            }
            if (!z3 || !z2 || !this.f18627d || !this.f18628e) {
                if (this.f18631h == Integer.MIN_VALUE) {
                    a(fontMetricsInt);
                }
                fontMetricsInt.ascent = z3 ? this.f18631h : this.f18632i;
                fontMetricsInt.descent = z2 ? this.f18634k : this.f18633j;
            }
        }
    }

    public final int d() {
        return this.f18636m;
    }

    public final boolean e() {
        return this.f18628e;
    }
}

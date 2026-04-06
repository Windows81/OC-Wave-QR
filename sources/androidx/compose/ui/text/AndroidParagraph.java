package androidx.compose.ui.text;

import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.android.LayoutIntrinsics;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.selection.WordBoundary_androidKt;
import androidx.compose.ui.text.android.selection.WordIterator;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AndroidParagraph implements Paragraph {

    /* renamed from: a  reason: collision with root package name */
    public final AndroidParagraphIntrinsics f18211a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18212b;

    /* renamed from: c  reason: collision with root package name */
    public final int f18213c;

    /* renamed from: d  reason: collision with root package name */
    public final long f18214d;

    /* renamed from: e  reason: collision with root package name */
    public final TextLayout f18215e;

    /* renamed from: f  reason: collision with root package name */
    public final CharSequence f18216f;

    /* renamed from: g  reason: collision with root package name */
    public final List f18217g;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18218a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.ui.text.style.ResolvedTextDirection[] r0 = androidx.compose.ui.text.style.ResolvedTextDirection.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.text.style.ResolvedTextDirection r1 = androidx.compose.ui.text.style.ResolvedTextDirection.Ltr     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.text.style.ResolvedTextDirection r1 = androidx.compose.ui.text.style.ResolvedTextDirection.Rtl     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f18218a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.AndroidParagraph.WhenMappings.<clinit>():void");
        }
    }

    public /* synthetic */ AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i2, int i3, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(androidParagraphIntrinsics, i2, i3, j2);
    }

    public static /* synthetic */ TextLayout I(AndroidParagraph androidParagraph, int i2, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, int i6, int i7, int i8, CharSequence charSequence, int i9, Object obj) {
        CharSequence charSequence2;
        if ((i9 & 256) != 0) {
            charSequence2 = androidParagraph.f18216f;
        } else {
            AndroidParagraph androidParagraph2 = androidParagraph;
            charSequence2 = charSequence;
        }
        return androidParagraph.H(i2, i3, truncateAt, i4, i5, i6, i7, i8, charSequence2);
    }

    public int A(int i2, boolean z2) {
        return z2 ? this.f18215e.x(i2) : this.f18215e.p(i2);
    }

    public int C() {
        return this.f18215e.m();
    }

    public boolean D() {
        return this.f18215e.d();
    }

    public int E(float f2) {
        return this.f18215e.r((int) f2);
    }

    public Path F(int i2, int i3) {
        if (!(i2 >= 0 && i2 <= i3 && i3 <= this.f18216f.length())) {
            InlineClassHelperKt.a("start(" + i2 + ") or end(" + i3 + ") is out of range [0.." + this.f18216f.length() + "], or start > end!");
        }
        android.graphics.Path path = new android.graphics.Path();
        this.f18215e.F(i2, i3, path);
        return AndroidPath_androidKt.c(path);
    }

    public float G(int i2, boolean z2) {
        return z2 ? TextLayout.B(this.f18215e, i2, false, 2, (Object) null) : TextLayout.E(this.f18215e, i2, false, 2, (Object) null);
    }

    public final TextLayout H(int i2, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, int i6, int i7, int i8, CharSequence charSequence) {
        TextUtils.TruncateAt truncateAt2 = truncateAt;
        int i9 = i4;
        int i10 = i5;
        int i11 = i6;
        int i12 = i7;
        int i13 = i8;
        CharSequence charSequence2 = charSequence;
        float b2 = b();
        AndroidTextPaint L = L();
        int j2 = this.f18211a.j();
        LayoutIntrinsics h2 = this.f18211a.h();
        return new TextLayout(charSequence2, b2, L, i2, truncateAt2, j2, 1.0f, 0.0f, AndroidParagraphHelper_androidKt.b(this.f18211a.i()), true, i9, i11, i12, i13, i10, i3, (int[]) null, (int[]) null, h2, 196736, (DefaultConstructorMarker) null);
    }

    public float J(int i2) {
        return this.f18215e.k(i2);
    }

    public final ShaderBrushSpan[] K(TextLayout textLayout) {
        if (!(textLayout.G() instanceof Spanned)) {
            return null;
        }
        CharSequence G = textLayout.G();
        Intrinsics.g(G, "null cannot be cast to non-null type android.text.Spanned");
        Class<ShaderBrushSpan> cls = ShaderBrushSpan.class;
        if (!M((Spanned) G, cls)) {
            return null;
        }
        CharSequence G2 = textLayout.G();
        Intrinsics.g(G2, "null cannot be cast to non-null type android.text.Spanned");
        return (ShaderBrushSpan[]) ((Spanned) G2).getSpans(0, textLayout.G().length(), cls);
    }

    public final AndroidTextPaint L() {
        return this.f18211a.k();
    }

    public final boolean M(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public final void N(Canvas canvas) {
        android.graphics.Canvas d2 = AndroidCanvas_androidKt.d(canvas);
        if (D()) {
            d2.save();
            d2.clipRect(0.0f, 0.0f, b(), a());
        }
        this.f18215e.M(d2);
        if (D()) {
            d2.restore();
        }
    }

    public float a() {
        return (float) this.f18215e.f();
    }

    public float b() {
        return (float) Constraints.l(this.f18214d);
    }

    public float c() {
        return this.f18211a.c();
    }

    public Rect d(int i2) {
        boolean z2 = false;
        if (i2 >= 0 && i2 < this.f18216f.length()) {
            z2 = true;
        }
        if (!z2) {
            InlineClassHelperKt.a("offset(" + i2 + ") is out of bounds [0," + this.f18216f.length() + ')');
        }
        RectF c2 = this.f18215e.c(i2);
        return new Rect(c2.left, c2.top, c2.right, c2.bottom);
    }

    public float e(int i2) {
        return this.f18215e.u(i2);
    }

    public float f(int i2) {
        return this.f18215e.s(i2);
    }

    public float g() {
        return this.f18211a.g();
    }

    public float h(int i2) {
        return this.f18215e.t(i2);
    }

    public void j(Canvas canvas, Brush brush, float f2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2) {
        int b2 = L().b();
        AndroidTextPaint L = L();
        float b3 = b();
        float a2 = a();
        long floatToRawIntBits = (long) Float.floatToRawIntBits(b3);
        L.e(brush, Size.d((((long) Float.floatToRawIntBits(a2)) & 4294967295L) | (floatToRawIntBits << 32)), f2);
        L.h(shadow);
        L.i(textDecoration);
        L.g(drawStyle);
        L.d(i2);
        N(canvas);
        L().d(b2);
    }

    public void k(long j2, float[] fArr, int i2) {
        this.f18215e.a(TextRange.l(j2), TextRange.k(j2), fArr, i2);
    }

    public ResolvedTextDirection l(int i2) {
        return this.f18215e.z(this.f18215e.q(i2)) == 1 ? ResolvedTextDirection.Ltr : ResolvedTextDirection.Rtl;
    }

    public float m(int i2) {
        return this.f18215e.w(i2);
    }

    public float n() {
        return J(C() - 1);
    }

    public Rect o(int i2) {
        if (!(i2 >= 0 && i2 <= this.f18216f.length())) {
            InlineClassHelperKt.a("offset(" + i2 + ") is out of bounds [0," + this.f18216f.length() + ']');
        }
        float B2 = TextLayout.B(this.f18215e, i2, false, 2, (Object) null);
        int q2 = this.f18215e.q(i2);
        return new Rect(B2, this.f18215e.w(q2), B2, this.f18215e.l(q2));
    }

    public void p(Canvas canvas, long j2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2) {
        int b2 = L().b();
        AndroidTextPaint L = L();
        L.f(j2);
        L.h(shadow);
        L.i(textDecoration);
        L.g(drawStyle);
        L.d(i2);
        N(canvas);
        L().d(b2);
    }

    public long q(int i2) {
        WordIterator I = this.f18215e.I();
        return TextRangeKt.b(WordBoundary_androidKt.b(I, i2), WordBoundary_androidKt.a(I, i2));
    }

    public int r(int i2) {
        return this.f18215e.q(i2);
    }

    public float s() {
        return J(0);
    }

    public long t(Rect rect, int i2, TextInclusionStrategy textInclusionStrategy) {
        int[] C = this.f18215e.C(RectHelper_androidKt.c(rect), AndroidParagraph_androidKt.r(i2), new AndroidParagraph$getRangeForRect$range$1(textInclusionStrategy));
        return C == null ? TextRange.f18496b.a() : TextRangeKt.b(C[0], C[1]);
    }

    public ResolvedTextDirection u(int i2) {
        return this.f18215e.L(i2) ? ResolvedTextDirection.Rtl : ResolvedTextDirection.Ltr;
    }

    public float v(int i2) {
        return this.f18215e.l(i2);
    }

    public int w(long j2) {
        return this.f18215e.y(this.f18215e.r((int) Float.intBitsToFloat((int) (4294967295L & j2))), Float.intBitsToFloat((int) (j2 >> 32)));
    }

    public List x() {
        return this.f18217g;
    }

    public boolean y(int i2) {
        return this.f18215e.K(i2);
    }

    public int z(int i2) {
        return this.f18215e.v(i2);
    }

    /* JADX WARNING: type inference failed for: r15v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r15v2 */
    /* JADX WARNING: type inference failed for: r15v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0302, code lost:
        r10 = r7 - ((float) r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0316, code lost:
        r7 = new androidx.compose.ui.geometry.Rect(r5, r10, r6, ((float) r4.b()) + r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02c4, code lost:
        r10 = r10 + r7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x021b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AndroidParagraph(androidx.compose.ui.text.platform.AndroidParagraphIntrinsics r30, int r31, int r32, long r33) {
        /*
            r29 = this;
            r12 = r29
            r13 = r31
            r14 = r32
            r29.<init>()
            r0 = r30
            r12.f18211a = r0
            r12.f18212b = r13
            r12.f18213c = r14
            r10 = r33
            r12.f18214d = r10
            int r1 = androidx.compose.ui.unit.Constraints.m(r33)
            r9 = 0
            r8 = 1
            if (r1 != 0) goto L_0x0025
            int r1 = androidx.compose.ui.unit.Constraints.n(r33)
            if (r1 != 0) goto L_0x0025
            r1 = r8
            goto L_0x0026
        L_0x0025:
            r1 = r9
        L_0x0026:
            if (r1 != 0) goto L_0x002d
            java.lang.String r1 = "Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead."
            androidx.compose.ui.text.internal.InlineClassHelperKt.a(r1)
        L_0x002d:
            if (r13 < r8) goto L_0x0031
            r1 = r8
            goto L_0x0032
        L_0x0031:
            r1 = r9
        L_0x0032:
            if (r1 != 0) goto L_0x0039
            java.lang.String r1 = "maxLines should be greater than 0"
            androidx.compose.ui.text.internal.InlineClassHelperKt.a(r1)
        L_0x0039:
            androidx.compose.ui.text.TextStyle r7 = r30.i()
            androidx.compose.ui.text.style.TextOverflow$Companion r16 = androidx.compose.ui.text.style.TextOverflow.f19125b
            int r1 = r16.b()
            boolean r1 = androidx.compose.ui.text.style.TextOverflow.h(r14, r1)
            boolean r1 = androidx.compose.ui.text.AndroidParagraph_androidKt.l(r7, r1)
            if (r1 == 0) goto L_0x0057
            java.lang.CharSequence r0 = r30.e()
            java.lang.CharSequence r0 = androidx.compose.ui.text.AndroidParagraph_androidKt.j(r0)
        L_0x0055:
            r6 = r0
            goto L_0x005c
        L_0x0057:
            java.lang.CharSequence r0 = r30.e()
            goto L_0x0055
        L_0x005c:
            r12.f18216f = r6
            int r0 = r7.z()
            int r17 = androidx.compose.ui.text.AndroidParagraph_androidKt.m(r0)
            int r0 = r7.z()
            androidx.compose.ui.text.style.TextAlign$Companion r1 = androidx.compose.ui.text.style.TextAlign.f19080b
            int r1 = r1.c()
            boolean r18 = androidx.compose.ui.text.style.TextAlign.k(r0, r1)
            androidx.compose.ui.text.ParagraphStyle r0 = r7.v()
            int r0 = r0.c()
            int r19 = androidx.compose.ui.text.AndroidParagraph_androidKt.o(r0)
            int r0 = r7.r()
            int r0 = androidx.compose.ui.text.style.LineBreak.g(r0)
            int r20 = androidx.compose.ui.text.AndroidParagraph_androidKt.n(r0)
            int r0 = r7.r()
            int r0 = androidx.compose.ui.text.style.LineBreak.h(r0)
            int r21 = androidx.compose.ui.text.AndroidParagraph_androidKt.p(r0)
            int r0 = r7.r()
            int r0 = androidx.compose.ui.text.style.LineBreak.i(r0)
            int r22 = androidx.compose.ui.text.AndroidParagraph_androidKt.q(r0)
            int r0 = r16.b()
            boolean r0 = androidx.compose.ui.text.style.TextOverflow.h(r14, r0)
            r23 = 0
            if (r0 == 0) goto L_0x00b5
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
        L_0x00b2:
            r24 = r0
            goto L_0x00d1
        L_0x00b5:
            int r0 = r16.c()
            boolean r0 = androidx.compose.ui.text.style.TextOverflow.h(r14, r0)
            if (r0 == 0) goto L_0x00c2
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L_0x00b2
        L_0x00c2:
            int r0 = r16.d()
            boolean r0 = androidx.compose.ui.text.style.TextOverflow.h(r14, r0)
            if (r0 == 0) goto L_0x00cf
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.START
            goto L_0x00b2
        L_0x00cf:
            r24 = r23
        L_0x00d1:
            r25 = 256(0x100, float:3.59E-43)
            r26 = 0
            r27 = 0
            r0 = r29
            r1 = r17
            r2 = r18
            r3 = r24
            r4 = r31
            r5 = r19
            r15 = r6
            r6 = r20
            r28 = r7
            r7 = r21
            r8 = r22
            r9 = r27
            r10 = r25
            r11 = r26
            androidx.compose.ui.text.android.TextLayout r0 = I(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 35
            if (r1 >= r2) goto L_0x0109
            androidx.compose.ui.text.platform.AndroidTextPaint r1 = r29.L()
            float r1 = r1.getLetterSpacing()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x010c
        L_0x0109:
            r11 = 0
        L_0x010a:
            r15 = 1
            goto L_0x0163
        L_0x010c:
            int r1 = r16.d()
            boolean r1 = androidx.compose.ui.text.style.TextOverflow.h(r14, r1)
            if (r1 != 0) goto L_0x0120
            int r1 = r16.c()
            boolean r1 = androidx.compose.ui.text.style.TextOverflow.h(r14, r1)
            if (r1 == 0) goto L_0x0109
        L_0x0120:
            r11 = 0
            int r1 = r0.n(r11)
            if (r1 <= 0) goto L_0x010a
            int r1 = r0.o(r11)
            int r0 = r0.n(r11)
            int r0 = r0 + r1
            java.lang.CharSequence r1 = r15.subSequence(r11, r1)
            int r2 = r15.length()
            java.lang.CharSequence r0 = r15.subSequence(r0, r2)
            r2 = 3
            java.lang.CharSequence[] r2 = new java.lang.CharSequence[r2]
            r2[r11] = r1
            java.lang.String r1 = "…"
            r15 = 1
            r2[r15] = r1
            r1 = 2
            r2[r1] = r0
            java.lang.CharSequence r9 = android.text.TextUtils.concat(r2)
            r0 = r29
            r1 = r17
            r2 = r18
            r3 = r24
            r4 = r31
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            androidx.compose.ui.text.android.TextLayout r0 = r0.H(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0163:
            int r1 = r16.b()
            boolean r1 = androidx.compose.ui.text.style.TextOverflow.h(r14, r1)
            if (r1 == 0) goto L_0x01a8
            int r1 = r0.f()
            int r2 = androidx.compose.ui.unit.Constraints.k(r33)
            if (r1 <= r2) goto L_0x01a8
            if (r13 <= r15) goto L_0x01a8
            int r1 = androidx.compose.ui.unit.Constraints.k(r33)
            int r1 = androidx.compose.ui.text.AndroidParagraph_androidKt.k(r0, r1)
            if (r1 < 0) goto L_0x01a4
            if (r1 == r13) goto L_0x01a4
            int r4 = kotlin.ranges.RangesKt.e(r1, r15)
            r10 = 256(0x100, float:3.59E-43)
            r13 = 0
            r9 = 0
            r0 = r29
            r1 = r17
            r2 = r18
            r3 = r24
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r14 = r11
            r11 = r13
            androidx.compose.ui.text.android.TextLayout r0 = I(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x01a5
        L_0x01a4:
            r14 = r11
        L_0x01a5:
            r12.f18215e = r0
            goto L_0x01ab
        L_0x01a8:
            r14 = r11
            r12.f18215e = r0
        L_0x01ab:
            androidx.compose.ui.text.platform.AndroidTextPaint r0 = r29.L()
            androidx.compose.ui.graphics.Brush r1 = r28.g()
            float r2 = r29.b()
            float r3 = r29.a()
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            long r4 = (long) r2
            int r2 = java.lang.Float.floatToRawIntBits(r3)
            long r2 = (long) r2
            r6 = 32
            long r4 = r4 << r6
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r7
            long r2 = r2 | r4
            long r2 = androidx.compose.ui.geometry.Size.d(r2)
            float r4 = r28.d()
            r0.e(r1, r2, r4)
            androidx.compose.ui.text.android.TextLayout r0 = r12.f18215e
            androidx.compose.ui.text.platform.style.ShaderBrushSpan[] r0 = r12.K(r0)
            if (r0 == 0) goto L_0x020f
            java.util.Iterator r0 = kotlin.jvm.internal.ArrayIteratorKt.a(r0)
        L_0x01e6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x020f
            java.lang.Object r1 = r0.next()
            androidx.compose.ui.text.platform.style.ShaderBrushSpan r1 = (androidx.compose.ui.text.platform.style.ShaderBrushSpan) r1
            float r2 = r29.b()
            float r3 = r29.a()
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            long r4 = (long) r2
            int r2 = java.lang.Float.floatToRawIntBits(r3)
            long r2 = (long) r2
            long r4 = r4 << r6
            long r2 = r2 & r7
            long r2 = r2 | r4
            long r2 = androidx.compose.ui.geometry.Size.d(r2)
            r1.c(r2)
            goto L_0x01e6
        L_0x020f:
            java.lang.CharSequence r0 = r12.f18216f
            boolean r1 = r0 instanceof android.text.Spanned
            if (r1 != 0) goto L_0x021b
            java.util.List r0 = kotlin.collections.CollectionsKt.m()
            goto L_0x032b
        L_0x021b:
            r1 = r0
            android.text.Spanned r1 = (android.text.Spanned) r1
            int r0 = r0.length()
            java.lang.Class<androidx.compose.ui.text.android.style.PlaceholderSpan> r2 = androidx.compose.ui.text.android.style.PlaceholderSpan.class
            java.lang.Object[] r0 = r1.getSpans(r14, r0, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r0.length
            r2.<init>(r3)
            int r3 = r0.length
            r9 = r14
        L_0x0230:
            if (r9 >= r3) goto L_0x032a
            r4 = r0[r9]
            androidx.compose.ui.text.android.style.PlaceholderSpan r4 = (androidx.compose.ui.text.android.style.PlaceholderSpan) r4
            int r5 = r1.getSpanStart(r4)
            int r6 = r1.getSpanEnd(r4)
            androidx.compose.ui.text.android.TextLayout r7 = r12.f18215e
            int r7 = r7.q(r5)
            int r8 = r12.f18212b
            if (r7 < r8) goto L_0x024a
            r8 = r15
            goto L_0x024b
        L_0x024a:
            r8 = r14
        L_0x024b:
            androidx.compose.ui.text.android.TextLayout r10 = r12.f18215e
            int r10 = r10.n(r7)
            if (r10 <= 0) goto L_0x025d
            androidx.compose.ui.text.android.TextLayout r10 = r12.f18215e
            int r10 = r10.o(r7)
            if (r6 <= r10) goto L_0x025d
            r10 = r15
            goto L_0x025e
        L_0x025d:
            r10 = r14
        L_0x025e:
            androidx.compose.ui.text.android.TextLayout r11 = r12.f18215e
            int r11 = r11.p(r7)
            if (r6 <= r11) goto L_0x0268
            r6 = r15
            goto L_0x0269
        L_0x0268:
            r6 = r14
        L_0x0269:
            if (r10 != 0) goto L_0x026f
            if (r6 != 0) goto L_0x026f
            if (r8 == 0) goto L_0x0272
        L_0x026f:
            r11 = 2
            goto L_0x0322
        L_0x0272:
            androidx.compose.ui.text.style.ResolvedTextDirection r6 = r12.u(r5)
            int[] r8 = androidx.compose.ui.text.AndroidParagraph.WhenMappings.f18218a
            int r6 = r6.ordinal()
            r6 = r8[r6]
            if (r6 == r15) goto L_0x0294
            r8 = 2
            if (r6 != r8) goto L_0x028e
            float r5 = r12.G(r5, r15)
            int r6 = r4.d()
            float r6 = (float) r6
            float r5 = r5 - r6
            goto L_0x0298
        L_0x028e:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0294:
            float r5 = r12.G(r5, r15)
        L_0x0298:
            int r6 = r4.d()
            float r6 = (float) r6
            float r6 = r6 + r5
            androidx.compose.ui.text.android.TextLayout r8 = r12.f18215e
            int r10 = r4.c()
            switch(r10) {
                case 0: goto L_0x030c;
                case 1: goto L_0x0306;
                case 2: goto L_0x02f9;
                case 3: goto L_0x02e6;
                case 4: goto L_0x02da;
                case 5: goto L_0x02c7;
                case 6: goto L_0x02af;
                default: goto L_0x02a7;
            }
        L_0x02a7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unexpected verticalAlignment"
            r0.<init>(r1)
            throw r0
        L_0x02af:
            android.graphics.Paint$FontMetricsInt r10 = r4.a()
            int r11 = r10.ascent
            int r10 = r10.descent
            int r11 = r11 + r10
            int r10 = r4.b()
            int r11 = r11 - r10
            r10 = 2
            int r11 = r11 / r10
            float r10 = (float) r11
            float r7 = r8.k(r7)
        L_0x02c4:
            float r10 = r10 + r7
        L_0x02c5:
            r11 = 2
            goto L_0x0316
        L_0x02c7:
            android.graphics.Paint$FontMetricsInt r10 = r4.a()
            int r10 = r10.descent
            float r10 = (float) r10
            float r7 = r8.k(r7)
            float r10 = r10 + r7
            int r7 = r4.b()
            float r7 = (float) r7
            float r10 = r10 - r7
            goto L_0x02c5
        L_0x02da:
            android.graphics.Paint$FontMetricsInt r10 = r4.a()
            int r10 = r10.ascent
            float r10 = (float) r10
            float r7 = r8.k(r7)
            goto L_0x02c4
        L_0x02e6:
            float r10 = r8.w(r7)
            float r7 = r8.l(r7)
            float r10 = r10 + r7
            int r7 = r4.b()
            float r7 = (float) r7
            float r10 = r10 - r7
            r11 = 2
            float r7 = (float) r11
            float r10 = r10 / r7
            goto L_0x0316
        L_0x02f9:
            r11 = 2
            float r7 = r8.l(r7)
            int r8 = r4.b()
        L_0x0302:
            float r8 = (float) r8
            float r10 = r7 - r8
            goto L_0x0316
        L_0x0306:
            r11 = 2
            float r10 = r8.w(r7)
            goto L_0x0316
        L_0x030c:
            r11 = 2
            float r7 = r8.k(r7)
            int r8 = r4.b()
            goto L_0x0302
        L_0x0316:
            int r4 = r4.b()
            float r4 = (float) r4
            float r4 = r4 + r10
            androidx.compose.ui.geometry.Rect r7 = new androidx.compose.ui.geometry.Rect
            r7.<init>(r5, r10, r6, r4)
            goto L_0x0324
        L_0x0322:
            r7 = r23
        L_0x0324:
            r2.add(r7)
            int r9 = r9 + r15
            goto L_0x0230
        L_0x032a:
            r0 = r2
        L_0x032b:
            r12.f18217g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.AndroidParagraph.<init>(androidx.compose.ui.text.platform.AndroidParagraphIntrinsics, int, int, long):void");
    }
}

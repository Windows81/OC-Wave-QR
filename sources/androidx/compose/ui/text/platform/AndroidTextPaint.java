package androidx.compose.ui.text.platform;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AndroidTextPaint extends TextPaint {

    /* renamed from: a  reason: collision with root package name */
    public Paint f18966a;

    /* renamed from: b  reason: collision with root package name */
    public TextDecoration f18967b = TextDecoration.f19089b.c();

    /* renamed from: c  reason: collision with root package name */
    public int f18968c = DrawScope.f16288g.a();

    /* renamed from: d  reason: collision with root package name */
    public Shadow f18969d = Shadow.f16116d.a();

    /* renamed from: e  reason: collision with root package name */
    public Color f18970e;

    /* renamed from: f  reason: collision with root package name */
    public Brush f18971f;

    /* renamed from: g  reason: collision with root package name */
    public State f18972g;

    /* renamed from: h  reason: collision with root package name */
    public Size f18973h;

    /* renamed from: i  reason: collision with root package name */
    public DrawStyle f18974i;

    public AndroidTextPaint(int i2, float f2) {
        super(i2);
        this.density = f2;
    }

    public final void a() {
        this.f18972g = null;
        this.f18971f = null;
        this.f18973h = null;
        setShader((Shader) null);
    }

    public final int b() {
        return this.f18968c;
    }

    public final Paint c() {
        Paint paint = this.f18966a;
        if (paint != null) {
            return paint;
        }
        Paint b2 = AndroidPaint_androidKt.b(this);
        this.f18966a = b2;
        return b2;
    }

    public final void d(int i2) {
        if (!BlendMode.F(i2, this.f18968c)) {
            c().v(i2);
            this.f18968c = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if ((r0 == null ? false : androidx.compose.ui.geometry.Size.f(r0.m(), r6)) == false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(androidx.compose.ui.graphics.Brush r5, long r6, float r8) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x0006
            r4.a()
            goto L_0x006d
        L_0x0006:
            boolean r0 = r5 instanceof androidx.compose.ui.graphics.SolidColor
            if (r0 == 0) goto L_0x0018
            androidx.compose.ui.graphics.SolidColor r5 = (androidx.compose.ui.graphics.SolidColor) r5
            long r5 = r5.c()
            long r5 = androidx.compose.ui.text.style.TextDrawStyleKt.c(r5, r8)
            r4.f(r5)
            goto L_0x006d
        L_0x0018:
            boolean r0 = r5 instanceof androidx.compose.ui.graphics.ShaderBrush
            if (r0 == 0) goto L_0x006d
            androidx.compose.ui.graphics.Brush r0 = r4.f18971f
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r5)
            r1 = 0
            if (r0 == 0) goto L_0x0035
            androidx.compose.ui.geometry.Size r0 = r4.f18973h
            if (r0 != 0) goto L_0x002b
            r0 = r1
            goto L_0x0033
        L_0x002b:
            long r2 = r0.m()
            boolean r0 = androidx.compose.ui.geometry.Size.f(r2, r6)
        L_0x0033:
            if (r0 != 0) goto L_0x0054
        L_0x0035:
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x003f
            r1 = 1
        L_0x003f:
            if (r1 == 0) goto L_0x0054
            r4.f18971f = r5
            androidx.compose.ui.geometry.Size r0 = androidx.compose.ui.geometry.Size.c(r6)
            r4.f18973h = r0
            androidx.compose.ui.text.platform.AndroidTextPaint$setBrush$1 r0 = new androidx.compose.ui.text.platform.AndroidTextPaint$setBrush$1
            r0.<init>(r5, r6)
            androidx.compose.runtime.State r5 = androidx.compose.runtime.SnapshotStateKt.e(r0)
            r4.f18972g = r5
        L_0x0054:
            androidx.compose.ui.graphics.Paint r5 = r4.c()
            androidx.compose.runtime.State r6 = r4.f18972g
            r7 = 0
            if (r6 == 0) goto L_0x0064
            java.lang.Object r6 = r6.getValue()
            android.graphics.Shader r6 = (android.graphics.Shader) r6
            goto L_0x0065
        L_0x0064:
            r6 = r7
        L_0x0065:
            r5.y(r6)
            r4.f18970e = r7
            androidx.compose.ui.text.platform.AndroidTextPaint_androidKt.a(r4, r8)
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.AndroidTextPaint.e(androidx.compose.ui.graphics.Brush, long, float):void");
    }

    public final void f(long j2) {
        Color color = this.f18970e;
        boolean z2 = false;
        if (!(color == null ? false : Color.n(color.v(), j2))) {
            if (j2 != 16) {
                z2 = true;
            }
            if (z2) {
                this.f18970e = Color.h(j2);
                setColor(ColorKt.j(j2));
                a();
            }
        }
    }

    public final void g(DrawStyle drawStyle) {
        if (drawStyle != null && !Intrinsics.d(this.f18974i, drawStyle)) {
            this.f18974i = drawStyle;
            if (Intrinsics.d(drawStyle, Fill.f16295a)) {
                setStyle(Paint.Style.FILL);
            } else if (drawStyle instanceof Stroke) {
                c().H(PaintingStyle.f16061b.b());
                Stroke stroke = (Stroke) drawStyle;
                c().K(stroke.f());
                c().B(stroke.d());
                c().G(stroke.c());
                c().u(stroke.b());
                c().F(stroke.e());
            }
        }
    }

    public final void h(Shadow shadow) {
        if (shadow != null && !Intrinsics.d(this.f18969d, shadow)) {
            this.f18969d = shadow;
            if (Intrinsics.d(shadow, Shadow.f16116d.a())) {
                clearShadowLayer();
            } else {
                setShadowLayer(TextPaintExtensions_androidKt.b(this.f18969d.b()), Float.intBitsToFloat((int) (this.f18969d.d() >> 32)), Float.intBitsToFloat((int) (this.f18969d.d() & 4294967295L)), ColorKt.j(this.f18969d.c()));
            }
        }
    }

    public final void i(TextDecoration textDecoration) {
        if (textDecoration != null && !Intrinsics.d(this.f18967b, textDecoration)) {
            this.f18967b = textDecoration;
            TextDecoration.Companion companion = TextDecoration.f19089b;
            setUnderlineText(textDecoration.d(companion.d()));
            setStrikeThruText(this.f18967b.d(companion.b()));
        }
    }
}

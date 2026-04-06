package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ButtonDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final ButtonDefaults f7422a = new ButtonDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final float f7423b;

    /* renamed from: c  reason: collision with root package name */
    public static final float f7424c;

    /* renamed from: d  reason: collision with root package name */
    public static final PaddingValues f7425d;

    /* renamed from: e  reason: collision with root package name */
    public static final float f7426e = Dp.m((float) 64);

    /* renamed from: f  reason: collision with root package name */
    public static final float f7427f = Dp.m((float) 36);

    /* renamed from: g  reason: collision with root package name */
    public static final float f7428g = Dp.m((float) 18);

    /* renamed from: h  reason: collision with root package name */
    public static final float f7429h;

    /* renamed from: i  reason: collision with root package name */
    public static final float f7430i = Dp.m((float) 1);

    /* renamed from: j  reason: collision with root package name */
    public static final float f7431j;

    /* renamed from: k  reason: collision with root package name */
    public static final PaddingValues f7432k;

    static {
        float m2 = Dp.m((float) 16);
        f7423b = m2;
        float f2 = (float) 8;
        float m3 = Dp.m(f2);
        f7424c = m3;
        PaddingValues d2 = PaddingKt.d(m2, m3, m2, m3);
        f7425d = d2;
        f7429h = Dp.m(f2);
        float m4 = Dp.m(f2);
        f7431j = m4;
        f7432k = PaddingKt.d(m4, d2.d(), m4, d2.a());
    }

    public final ButtonColors a(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        long j6;
        Composer composer2 = composer;
        int i4 = i2;
        long j7 = (i3 & 1) != 0 ? MaterialTheme.f7937a.a(composer2, 6).j() : j2;
        long b2 = (i3 & 2) != 0 ? ColorsKt.b(j7, composer2, i4 & 14) : j3;
        if ((i3 & 4) != 0) {
            MaterialTheme materialTheme = MaterialTheme.f7937a;
            j6 = ColorKt.g(Color.l(materialTheme.a(composer2, 6).i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null), materialTheme.a(composer2, 6).n());
        } else {
            j6 = j4;
        }
        long l2 = (i3 & 8) != 0 ? Color.l(MaterialTheme.f7937a.a(composer2, 6).i(), ContentAlpha.f7561a.b(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j5;
        if (ComposerKt.P()) {
            ComposerKt.Y(1870371134, i4, -1, "androidx.compose.material.ButtonDefaults.buttonColors (Button.kt:415)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(j7, b2, j6, l2, (DefaultConstructorMarker) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return defaultButtonColors;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: androidx.compose.material.DefaultButtonElevation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: androidx.compose.material.DefaultButtonElevation} */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00be, code lost:
        if (r9 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x00c0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.material.ButtonElevation b(float r8, float r9, float r10, float r11, float r12, androidx.compose.runtime.Composer r13, int r14, int r15) {
        /*
            r7 = this;
            r0 = r15 & 1
            if (r0 == 0) goto L_0x000a
            r8 = 2
            float r8 = (float) r8
            float r8 = androidx.compose.ui.unit.Dp.m(r8)
        L_0x000a:
            r1 = r8
            r8 = r15 & 2
            if (r8 == 0) goto L_0x0016
            r8 = 8
            float r8 = (float) r8
            float r9 = androidx.compose.ui.unit.Dp.m(r8)
        L_0x0016:
            r2 = r9
            r8 = r15 & 4
            r9 = 0
            if (r8 == 0) goto L_0x0021
            float r8 = (float) r9
            float r10 = androidx.compose.ui.unit.Dp.m(r8)
        L_0x0021:
            r3 = r10
            r8 = r15 & 8
            r10 = 4
            if (r8 == 0) goto L_0x002c
            float r8 = (float) r10
            float r11 = androidx.compose.ui.unit.Dp.m(r8)
        L_0x002c:
            r4 = r11
            r8 = r15 & 16
            if (r8 == 0) goto L_0x0036
            float r8 = (float) r10
            float r12 = androidx.compose.ui.unit.Dp.m(r8)
        L_0x0036:
            r5 = r12
            boolean r8 = androidx.compose.runtime.ComposerKt.P()
            if (r8 == 0) goto L_0x0046
            r8 = -1
            java.lang.String r11 = "androidx.compose.material.ButtonDefaults.elevation (Button.kt:377)"
            r12 = -737170518(0xffffffffd40fabaa, float:-2.46824147E12)
            androidx.compose.runtime.ComposerKt.Y(r12, r14, r8, r11)
        L_0x0046:
            r8 = r14 & 14
            r8 = r8 ^ 6
            r11 = 1
            if (r8 <= r10) goto L_0x0053
            boolean r8 = r13.h(r1)
            if (r8 != 0) goto L_0x0057
        L_0x0053:
            r8 = r14 & 6
            if (r8 != r10) goto L_0x0059
        L_0x0057:
            r8 = r11
            goto L_0x005a
        L_0x0059:
            r8 = r9
        L_0x005a:
            r10 = r14 & 112(0x70, float:1.57E-43)
            r10 = r10 ^ 48
            r12 = 32
            if (r10 <= r12) goto L_0x0068
            boolean r10 = r13.h(r2)
            if (r10 != 0) goto L_0x006c
        L_0x0068:
            r10 = r14 & 48
            if (r10 != r12) goto L_0x006e
        L_0x006c:
            r10 = r11
            goto L_0x006f
        L_0x006e:
            r10 = r9
        L_0x006f:
            r8 = r8 | r10
            r10 = r14 & 896(0x380, float:1.256E-42)
            r10 = r10 ^ 384(0x180, float:5.38E-43)
            r12 = 256(0x100, float:3.59E-43)
            if (r10 <= r12) goto L_0x007e
            boolean r10 = r13.h(r3)
            if (r10 != 0) goto L_0x0082
        L_0x007e:
            r10 = r14 & 384(0x180, float:5.38E-43)
            if (r10 != r12) goto L_0x0084
        L_0x0082:
            r10 = r11
            goto L_0x0085
        L_0x0084:
            r10 = r9
        L_0x0085:
            r8 = r8 | r10
            r10 = r14 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 ^ 3072(0xc00, float:4.305E-42)
            r12 = 2048(0x800, float:2.87E-42)
            if (r10 <= r12) goto L_0x0094
            boolean r10 = r13.h(r4)
            if (r10 != 0) goto L_0x0098
        L_0x0094:
            r10 = r14 & 3072(0xc00, float:4.305E-42)
            if (r10 != r12) goto L_0x009a
        L_0x0098:
            r10 = r11
            goto L_0x009b
        L_0x009a:
            r10 = r9
        L_0x009b:
            r8 = r8 | r10
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r14
            r10 = r10 ^ 24576(0x6000, float:3.4438E-41)
            r12 = 16384(0x4000, float:2.2959E-41)
            if (r10 <= r12) goto L_0x00ac
            boolean r10 = r13.h(r5)
            if (r10 != 0) goto L_0x00b0
        L_0x00ac:
            r10 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r10 != r12) goto L_0x00b1
        L_0x00b0:
            r9 = r11
        L_0x00b1:
            r8 = r8 | r9
            java.lang.Object r9 = r13.g()
            if (r8 != 0) goto L_0x00c0
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r9 != r8) goto L_0x00ca
        L_0x00c0:
            androidx.compose.material.DefaultButtonElevation r9 = new androidx.compose.material.DefaultButtonElevation
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r13.N(r9)
        L_0x00ca:
            androidx.compose.material.DefaultButtonElevation r9 = (androidx.compose.material.DefaultButtonElevation) r9
            boolean r8 = androidx.compose.runtime.ComposerKt.P()
            if (r8 == 0) goto L_0x00d5
            androidx.compose.runtime.ComposerKt.X()
        L_0x00d5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ButtonDefaults.b(float, float, float, float, float, androidx.compose.runtime.Composer, int, int):androidx.compose.material.ButtonElevation");
    }

    public final PaddingValues c() {
        return f7425d;
    }

    public final float d() {
        return f7427f;
    }

    public final float e() {
        return f7426e;
    }

    public final PaddingValues f() {
        return f7432k;
    }

    public final ButtonColors g(long j2, long j3, long j4, Composer composer, int i2, int i3) {
        Composer composer2 = composer;
        long e2 = (i3 & 1) != 0 ? Color.f15975b.e() : j2;
        long j5 = (i3 & 2) != 0 ? MaterialTheme.f7937a.a(composer2, 6).j() : j3;
        long l2 = (i3 & 4) != 0 ? Color.l(MaterialTheme.f7937a.a(composer2, 6).i(), ContentAlpha.f7561a.b(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j4;
        if (ComposerKt.P()) {
            ComposerKt.Y(182742216, i2, -1, "androidx.compose.material.ButtonDefaults.textButtonColors (Button.kt:459)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(e2, j5, e2, l2, (DefaultConstructorMarker) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return defaultButtonColors;
    }
}

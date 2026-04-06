package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class AndroidCursorHandle_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f5460a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f5461b;

    static {
        float m2 = Dp.m((float) 25);
        f5460a = m2;
        f5461b = Dp.m(Dp.m(m2 * 2.0f) / 2.4142137f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0079, code lost:
        if ((r14 & 4) != 0) goto L_0x007b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.foundation.text.selection.OffsetProvider r8, androidx.compose.ui.Modifier r9, long r10, androidx.compose.runtime.Composer r12, int r13, int r14) {
        /*
            r0 = 1776202187(0x69deb1cb, float:3.3652642E25)
            androidx.compose.runtime.Composer r12 = r12.q(r0)
            r1 = r14 & 1
            r2 = 4
            if (r1 == 0) goto L_0x000f
            r1 = r13 | 6
            goto L_0x0028
        L_0x000f:
            r1 = r13 & 6
            if (r1 != 0) goto L_0x0027
            r1 = r13 & 8
            if (r1 != 0) goto L_0x001c
            boolean r1 = r12.W(r8)
            goto L_0x0020
        L_0x001c:
            boolean r1 = r12.l(r8)
        L_0x0020:
            if (r1 == 0) goto L_0x0024
            r1 = r2
            goto L_0x0025
        L_0x0024:
            r1 = 2
        L_0x0025:
            r1 = r1 | r13
            goto L_0x0028
        L_0x0027:
            r1 = r13
        L_0x0028:
            r3 = r14 & 2
            if (r3 == 0) goto L_0x002f
            r1 = r1 | 48
            goto L_0x003f
        L_0x002f:
            r3 = r13 & 48
            if (r3 != 0) goto L_0x003f
            boolean r3 = r12.W(r9)
            if (r3 == 0) goto L_0x003c
            r3 = 32
            goto L_0x003e
        L_0x003c:
            r3 = 16
        L_0x003e:
            r1 = r1 | r3
        L_0x003f:
            r3 = r13 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0053
            r3 = r14 & 4
            if (r3 != 0) goto L_0x0050
            boolean r3 = r12.j(r10)
            if (r3 == 0) goto L_0x0050
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0052
        L_0x0050:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0052:
            r1 = r1 | r3
        L_0x0053:
            r3 = r1 & 147(0x93, float:2.06E-43)
            r4 = 146(0x92, float:2.05E-43)
            r5 = 0
            r6 = 1
            if (r3 == r4) goto L_0x005d
            r3 = r6
            goto L_0x005e
        L_0x005d:
            r3 = r5
        L_0x005e:
            r4 = r1 & 1
            boolean r3 = r12.E(r3, r4)
            if (r3 == 0) goto L_0x00eb
            r12.p()
            r3 = r13 & 1
            if (r3 == 0) goto L_0x007e
            boolean r3 = r12.J()
            if (r3 == 0) goto L_0x0074
            goto L_0x007e
        L_0x0074:
            r12.B()
            r3 = r14 & 4
            if (r3 == 0) goto L_0x0089
        L_0x007b:
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x0089
        L_0x007e:
            r3 = r14 & 4
            if (r3 == 0) goto L_0x0089
            androidx.compose.ui.unit.DpSize$Companion r10 = androidx.compose.ui.unit.DpSize.f19156b
            long r10 = r10.a()
            goto L_0x007b
        L_0x0089:
            r12.U()
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0098
            r3 = -1
            java.lang.String r4 = "androidx.compose.foundation.text.CursorHandle (AndroidCursorHandle.android.kt:51)"
            androidx.compose.runtime.ComposerKt.Y(r0, r1, r3, r4)
        L_0x0098:
            r0 = r1 & 14
            if (r0 == r2) goto L_0x00a9
            r1 = r1 & 8
            if (r1 == 0) goto L_0x00a7
            boolean r1 = r12.l(r8)
            if (r1 == 0) goto L_0x00a7
            goto L_0x00a9
        L_0x00a7:
            r1 = r5
            goto L_0x00aa
        L_0x00a9:
            r1 = r6
        L_0x00aa:
            java.lang.Object r2 = r12.g()
            if (r1 != 0) goto L_0x00b8
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x00c0
        L_0x00b8:
            androidx.compose.foundation.text.AndroidCursorHandle_androidKt$CursorHandle$finalModifier$1$1 r2 = new androidx.compose.foundation.text.AndroidCursorHandle_androidKt$CursorHandle$finalModifier$1$1
            r2.<init>(r8)
            r12.N(r2)
        L_0x00c0:
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r1 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r9, r5, r2, r6, r1)
            androidx.compose.ui.Alignment$Companion r2 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r2 = r2.m()
            androidx.compose.foundation.text.AndroidCursorHandle_androidKt$CursorHandle$1 r3 = new androidx.compose.foundation.text.AndroidCursorHandle_androidKt$CursorHandle$1
            r3.<init>(r10, r1)
            r1 = 54
            r4 = -1653527038(0xffffffff9d712e02, float:-3.191987E-21)
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r4, r6, r3, r12, r1)
            r0 = r0 | 432(0x1b0, float:6.05E-43)
            androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.a(r8, r2, r1, r12, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00e9
            androidx.compose.runtime.ComposerKt.X()
        L_0x00e9:
            r4 = r10
            goto L_0x00ef
        L_0x00eb:
            r12.B()
            goto L_0x00e9
        L_0x00ef:
            androidx.compose.runtime.ScopeUpdateScope r10 = r12.x()
            if (r10 == 0) goto L_0x0102
            androidx.compose.foundation.text.AndroidCursorHandle_androidKt$CursorHandle$2 r11 = new androidx.compose.foundation.text.AndroidCursorHandle_androidKt$CursorHandle$2
            r1 = r11
            r2 = r8
            r3 = r9
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r6, r7)
            r10.a(r11)
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.AndroidCursorHandle_androidKt.a(androidx.compose.foundation.text.selection.OffsetProvider, androidx.compose.ui.Modifier, long, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(Modifier modifier, Composer composer, int i2, int i3) {
        int i4;
        Composer q2 = composer.q(694251107);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (q2.W(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if (q2.E((i4 & 3) != 2, i4 & 1)) {
            if (i5 != 0) {
                modifier = Modifier.f15489d;
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(694251107, i4, -1, "androidx.compose.foundation.text.DefaultCursorHandle (AndroidCursorHandle.android.kt:82)");
            }
            SpacerKt.a(d(SizeKt.v(modifier, f5461b, f5460a)), q2, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new AndroidCursorHandle_androidKt$DefaultCursorHandle$1(modifier, i2, i3));
        }
    }

    public static final Modifier d(Modifier modifier) {
        return ComposedModifierKt.c(modifier, (Function1) null, AndroidCursorHandle_androidKt$drawCursorHandle$1.f5471z, 1, (Object) null);
    }
}

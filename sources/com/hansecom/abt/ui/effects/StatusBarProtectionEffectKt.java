package com.hansecom.abt.ui.effects;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class StatusBarProtectionEffectKt {
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        if ((r13 & 1) != 0) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(long r9, androidx.compose.runtime.Composer r11, int r12, int r13) {
        /*
            r0 = -1938718083(0xffffffff8c71827d, float:-1.8605232E-31)
            androidx.compose.runtime.Composer r11 = r11.q(r0)
            r1 = r12 & 6
            r2 = 2
            r3 = 4
            if (r1 != 0) goto L_0x001c
            r1 = r13 & 1
            if (r1 != 0) goto L_0x0019
            boolean r1 = r11.j(r9)
            if (r1 == 0) goto L_0x0019
            r1 = r3
            goto L_0x001a
        L_0x0019:
            r1 = r2
        L_0x001a:
            r1 = r1 | r12
            goto L_0x001d
        L_0x001c:
            r1 = r12
        L_0x001d:
            r4 = r1 & 3
            if (r4 != r2) goto L_0x002d
            boolean r2 = r11.t()
            if (r2 != 0) goto L_0x0028
            goto L_0x002d
        L_0x0028:
            r11.B()
            goto L_0x00b3
        L_0x002d:
            r11.p()
            r2 = r12 & 1
            r4 = 6
            if (r2 == 0) goto L_0x0046
            boolean r2 = r11.J()
            if (r2 == 0) goto L_0x003c
            goto L_0x0046
        L_0x003c:
            r11.B()
            r2 = r13 & 1
            if (r2 == 0) goto L_0x0055
        L_0x0043:
            r1 = r1 & -15
            goto L_0x0055
        L_0x0046:
            r2 = r13 & 1
            if (r2 == 0) goto L_0x0055
            com.hansecom.abt.ui.theme.AbtTheme r9 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r9 = r9.b(r11, r4)
            long r9 = r9.z()
            goto L_0x0043
        L_0x0055:
            r11.U()
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0064
            r2 = -1
            java.lang.String r5 = "com.hansecom.abt.ui.effects.StatusBarProtectionEffect (StatusBarProtectionEffect.kt:17)"
            androidx.compose.runtime.ComposerKt.Y(r0, r1, r2, r5)
        L_0x0064:
            r0 = 0
            float r2 = f(r11, r0)
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.f15489d
            r6 = 0
            r7 = 0
            r8 = 1
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.f(r5, r6, r8, r7)
            r6 = 1076297239(0x4026fe17, float:2.6092584)
            r11.X(r6)
            r6 = r1 & 14
            r6 = r6 ^ r4
            if (r6 <= r3) goto L_0x0083
            boolean r6 = r11.j(r9)
            if (r6 != 0) goto L_0x0086
        L_0x0083:
            r1 = r1 & r4
            if (r1 != r3) goto L_0x0087
        L_0x0086:
            r0 = r8
        L_0x0087:
            boolean r1 = r11.h(r2)
            r0 = r0 | r1
            java.lang.Object r1 = r11.g()
            if (r0 != 0) goto L_0x009a
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x00a2
        L_0x009a:
            z.k r1 = new z.k
            r1.<init>(r9, r2)
            r11.N(r1)
        L_0x00a2:
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r11.M()
            androidx.compose.foundation.CanvasKt.b(r5, r1, r11, r4)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00b3
            androidx.compose.runtime.ComposerKt.X()
        L_0x00b3:
            androidx.compose.runtime.ScopeUpdateScope r11 = r11.x()
            if (r11 == 0) goto L_0x00c1
            z.l r0 = new z.l
            r0.<init>(r9, r12, r13)
            r11.a(r0)
        L_0x00c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.effects.StatusBarProtectionEffectKt.c(long, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit d(long j2, float f2, DrawScope drawScope) {
        DrawScope drawScope2 = drawScope;
        Intrinsics.i(drawScope2, "$this$Canvas");
        DrawScope.G0(drawScope2, Brush.Companion.e(Brush.f15962b, CollectionsKt.p(Color.h(Color.l(j2, 1.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), Color.h(Color.l(j2, 0.85f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), Color.h(Color.f15975b.e())), 0.0f, f2, 0, 8, (Object) null), 0, Size.d((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.c() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L)), 0.0f, (DrawStyle) null, (ColorFilter) null, 0, ModuleDescriptor.MODULE_VERSION, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit e(long j2, int i2, int i3, Composer composer, int i4) {
        c(j2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final float f(Composer composer, int i2) {
        composer.X(1905046100);
        if (ComposerKt.P()) {
            ComposerKt.Y(1905046100, i2, -1, "com.hansecom.abt.ui.effects.calculateGradientHeight (StatusBarProtectionEffect.kt:37)");
        }
        float a2 = ((float) WindowInsets_androidKt.d(WindowInsets.f4206a, composer, 6).a((Density) composer.C(CompositionLocalsKt.g()))) * 1.3f;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return a2;
    }
}

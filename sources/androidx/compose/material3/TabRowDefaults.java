package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata
public final class TabRowDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final TabRowDefaults f11293a = new TabRowDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final float f11294b = Dp.m((float) 90);

    /* renamed from: c  reason: collision with root package name */
    public static final float f11295c = Dp.m((float) 52);

    public static final Unit d(TabRowDefaults tabRowDefaults, Modifier modifier, float f2, float f3, long j2, Shape shape, int i2, int i3, Composer composer, int i4) {
        tabRowDefaults.c(modifier, f2, f3, j2, shape, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final Unit f(TabRowDefaults tabRowDefaults, Modifier modifier, float f2, long j2, int i2, int i3, Composer composer, int i4) {
        tabRowDefaults.e(modifier, f2, j2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.compose.ui.Modifier r17, float r18, float r19, long r20, androidx.compose.ui.graphics.Shape r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            r16 = this;
            r8 = r24
            r0 = -1895596205(0xffffffff8f037f53, float:-6.4833204E-30)
            r1 = r23
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r25 & 1
            if (r2 == 0) goto L_0x0015
            r3 = r8 | 6
            r4 = r3
            r3 = r17
            goto L_0x0029
        L_0x0015:
            r3 = r8 & 6
            if (r3 != 0) goto L_0x0026
            r3 = r17
            boolean r4 = r1.W(r3)
            if (r4 == 0) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r8
            goto L_0x0029
        L_0x0026:
            r3 = r17
            r4 = r8
        L_0x0029:
            r5 = r25 & 2
            if (r5 == 0) goto L_0x0032
            r4 = r4 | 48
        L_0x002f:
            r6 = r18
            goto L_0x0044
        L_0x0032:
            r6 = r8 & 48
            if (r6 != 0) goto L_0x002f
            r6 = r18
            boolean r7 = r1.h(r6)
            if (r7 == 0) goto L_0x0041
            r7 = 32
            goto L_0x0043
        L_0x0041:
            r7 = 16
        L_0x0043:
            r4 = r4 | r7
        L_0x0044:
            r7 = r25 & 4
            if (r7 == 0) goto L_0x004d
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r9 = r19
            goto L_0x005f
        L_0x004d:
            r9 = r8 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x004a
            r9 = r19
            boolean r10 = r1.h(r9)
            if (r10 == 0) goto L_0x005c
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r4 = r4 | r10
        L_0x005f:
            r10 = r8 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0078
            r10 = r25 & 8
            if (r10 != 0) goto L_0x0072
            r10 = r20
            boolean r12 = r1.j(r10)
            if (r12 == 0) goto L_0x0074
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0072:
            r10 = r20
        L_0x0074:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r4 = r4 | r12
            goto L_0x007a
        L_0x0078:
            r10 = r20
        L_0x007a:
            r12 = r25 & 16
            if (r12 == 0) goto L_0x0083
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r13 = r22
            goto L_0x0095
        L_0x0083:
            r13 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0080
            r13 = r22
            boolean r14 = r1.W(r13)
            if (r14 == 0) goto L_0x0092
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r4 = r4 | r14
        L_0x0095:
            r14 = r4 & 9363(0x2493, float:1.312E-41)
            r15 = 9362(0x2492, float:1.3119E-41)
            r0 = 0
            if (r14 == r15) goto L_0x009e
            r14 = 1
            goto L_0x009f
        L_0x009e:
            r14 = r0
        L_0x009f:
            r15 = r4 & 1
            boolean r14 = r1.E(r14, r15)
            if (r14 == 0) goto L_0x0122
            r1.p()
            r14 = r8 & 1
            if (r14 == 0) goto L_0x00c0
            boolean r14 = r1.J()
            if (r14 == 0) goto L_0x00b5
            goto L_0x00c0
        L_0x00b5:
            r1.B()
            r2 = r25 & 8
            if (r2 == 0) goto L_0x00be
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00be:
            r2 = r3
            goto L_0x00f3
        L_0x00c0:
            if (r2 == 0) goto L_0x00c5
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00c6
        L_0x00c5:
            r2 = r3
        L_0x00c6:
            if (r5 == 0) goto L_0x00d0
            r3 = 24
            float r3 = (float) r3
            float r3 = androidx.compose.ui.unit.Dp.m(r3)
            r6 = r3
        L_0x00d0:
            if (r7 == 0) goto L_0x00d9
            androidx.compose.material3.tokens.PrimaryNavigationTabTokens r3 = androidx.compose.material3.tokens.PrimaryNavigationTabTokens.f13859a
            float r3 = r3.b()
            r9 = r3
        L_0x00d9:
            r3 = r25 & 8
            if (r3 == 0) goto L_0x00ea
            androidx.compose.material3.tokens.PrimaryNavigationTabTokens r3 = androidx.compose.material3.tokens.PrimaryNavigationTabTokens.f13859a
            androidx.compose.material3.tokens.ColorSchemeKeyTokens r3 = r3.a()
            r5 = 6
            long r10 = androidx.compose.material3.ColorSchemeKt.k(r3, r1, r5)
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00ea:
            if (r12 == 0) goto L_0x00f3
            androidx.compose.material3.tokens.PrimaryNavigationTabTokens r3 = androidx.compose.material3.tokens.PrimaryNavigationTabTokens.f13859a
            androidx.compose.foundation.shape.RoundedCornerShape r3 = r3.c()
            r13 = r3
        L_0x00f3:
            r1.U()
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0105
            r3 = -1
            java.lang.String r5 = "androidx.compose.material3.TabRowDefaults.PrimaryIndicator (TabRow.kt:1059)"
            r7 = -1895596205(0xffffffff8f037f53, float:-6.4833204E-30)
            androidx.compose.runtime.ComposerKt.Y(r7, r4, r3, r5)
        L_0x0105:
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.l(r2, r9)
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.s(r3, r6)
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.BackgroundKt.a(r3, r10, r13)
            androidx.compose.foundation.layout.SpacerKt.a(r3, r1, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x011d
            androidx.compose.runtime.ComposerKt.X()
        L_0x011d:
            r3 = r6
            r4 = r9
            r5 = r10
            r7 = r13
            goto L_0x0127
        L_0x0122:
            r1.B()
            r2 = r3
            goto L_0x011d
        L_0x0127:
            androidx.compose.runtime.ScopeUpdateScope r10 = r1.x()
            if (r10 == 0) goto L_0x013c
            androidx.compose.material3.R6 r11 = new androidx.compose.material3.R6
            r0 = r11
            r1 = r16
            r8 = r24
            r9 = r25
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9)
            r10.a(r11)
        L_0x013c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowDefaults.c(androidx.compose.ui.Modifier, float, float, long, androidx.compose.ui.graphics.Shape, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(androidx.compose.ui.Modifier r21, float r22, long r23, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            r20 = this;
            r6 = r26
            r0 = -1498258020(0xffffffffa6b2659c, float:-1.2378772E-15)
            r1 = r25
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r27 & 1
            if (r2 == 0) goto L_0x0015
            r3 = r6 | 6
            r4 = r3
            r3 = r21
            goto L_0x0029
        L_0x0015:
            r3 = r6 & 6
            if (r3 != 0) goto L_0x0026
            r3 = r21
            boolean r4 = r1.W(r3)
            if (r4 == 0) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r6
            goto L_0x0029
        L_0x0026:
            r3 = r21
            r4 = r6
        L_0x0029:
            r5 = r27 & 2
            if (r5 == 0) goto L_0x0032
            r4 = r4 | 48
        L_0x002f:
            r7 = r22
            goto L_0x0044
        L_0x0032:
            r7 = r6 & 48
            if (r7 != 0) goto L_0x002f
            r7 = r22
            boolean r8 = r1.h(r7)
            if (r8 == 0) goto L_0x0041
            r8 = 32
            goto L_0x0043
        L_0x0041:
            r8 = 16
        L_0x0043:
            r4 = r4 | r8
        L_0x0044:
            r8 = r6 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x005d
            r8 = r27 & 4
            if (r8 != 0) goto L_0x0057
            r8 = r23
            boolean r10 = r1.j(r8)
            if (r10 == 0) goto L_0x0059
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0057:
            r8 = r23
        L_0x0059:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r4 = r4 | r10
            goto L_0x005f
        L_0x005d:
            r8 = r23
        L_0x005f:
            r10 = r4 & 147(0x93, float:2.06E-43)
            r11 = 146(0x92, float:2.05E-43)
            r12 = 0
            r13 = 1
            if (r10 == r11) goto L_0x0069
            r10 = r13
            goto L_0x006a
        L_0x0069:
            r10 = r12
        L_0x006a:
            r11 = r4 & 1
            boolean r10 = r1.E(r10, r11)
            if (r10 == 0) goto L_0x00e0
            r1.p()
            r10 = r6 & 1
            if (r10 == 0) goto L_0x008c
            boolean r10 = r1.J()
            if (r10 == 0) goto L_0x0080
            goto L_0x008c
        L_0x0080:
            r1.B()
            r2 = r27 & 4
            if (r2 == 0) goto L_0x0089
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0089:
            r2 = r3
            r3 = r7
            goto L_0x00ae
        L_0x008c:
            if (r2 == 0) goto L_0x0091
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0092
        L_0x0091:
            r2 = r3
        L_0x0092:
            if (r5 == 0) goto L_0x009b
            androidx.compose.material3.tokens.PrimaryNavigationTabTokens r3 = androidx.compose.material3.tokens.PrimaryNavigationTabTokens.f13859a
            float r3 = r3.b()
            goto L_0x009c
        L_0x009b:
            r3 = r7
        L_0x009c:
            r5 = r27 & 4
            if (r5 == 0) goto L_0x00ae
            androidx.compose.material3.tokens.PrimaryNavigationTabTokens r5 = androidx.compose.material3.tokens.PrimaryNavigationTabTokens.f13859a
            androidx.compose.material3.tokens.ColorSchemeKeyTokens r5 = r5.a()
            r7 = 6
            long r7 = androidx.compose.material3.ColorSchemeKt.k(r5, r1, r7)
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            r8 = r7
        L_0x00ae:
            r1.U()
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x00bd
            r5 = -1
            java.lang.String r7 = "androidx.compose.material3.TabRowDefaults.SecondaryIndicator (TabRow.kt:1081)"
            androidx.compose.runtime.ComposerKt.Y(r0, r4, r5, r7)
        L_0x00bd:
            r0 = 0
            r4 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.h(r2, r0, r13, r4)
            androidx.compose.ui.Modifier r14 = androidx.compose.foundation.layout.SizeKt.i(r0, r3)
            r18 = 2
            r19 = 0
            r17 = 0
            r15 = r8
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.BackgroundKt.b(r14, r15, r17, r18, r19)
            androidx.compose.foundation.layout.BoxKt.a(r0, r1, r12)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00de
            androidx.compose.runtime.ComposerKt.X()
        L_0x00de:
            r4 = r8
            goto L_0x00e6
        L_0x00e0:
            r1.B()
            r2 = r3
            r3 = r7
            goto L_0x00de
        L_0x00e6:
            androidx.compose.runtime.ScopeUpdateScope r8 = r1.x()
            if (r8 == 0) goto L_0x00fb
            androidx.compose.material3.S6 r9 = new androidx.compose.material3.S6
            r0 = r9
            r1 = r20
            r6 = r26
            r7 = r27
            r0.<init>(r1, r2, r3, r4, r6, r7)
            r8.a(r9)
        L_0x00fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowDefaults.e(androidx.compose.ui.Modifier, float, long, androidx.compose.runtime.Composer, int, int):void");
    }

    public final float g() {
        return f11294b;
    }

    public final Modifier h(Modifier modifier, TabPosition tabPosition) {
        return ComposedModifierKt.b(modifier, InspectableValueKt.b() ? new TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1(tabPosition) : InspectableValueKt.a(), new TabRowDefaults$tabIndicatorOffset$2(tabPosition));
    }
}

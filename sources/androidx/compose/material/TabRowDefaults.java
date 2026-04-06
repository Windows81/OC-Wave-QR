package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata
public final class TabRowDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final TabRowDefaults f8682a = new TabRowDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final float f8683b = Dp.m((float) 1);

    /* renamed from: c  reason: collision with root package name */
    public static final float f8684c = Dp.m((float) 2);

    /* renamed from: d  reason: collision with root package name */
    public static final float f8685d = Dp.m((float) 52);

    public final void a(Modifier modifier, float f2, long j2, Composer composer, int i2, int i3) {
        int i4;
        Modifier modifier2;
        float f3;
        long j3;
        long j4;
        float f4;
        Modifier modifier3;
        int i5;
        int i6;
        int i7 = i2;
        Composer q2 = composer.q(910934799);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i4 = i7 | 6;
            modifier2 = modifier;
        } else if ((i7 & 6) == 0) {
            modifier2 = modifier;
            i4 = (q2.W(modifier2) ? 4 : 2) | i7;
        } else {
            modifier2 = modifier;
            i4 = i7;
        }
        if ((i7 & 48) == 0) {
            if ((i3 & 2) == 0) {
                f3 = f2;
                if (q2.h(f3)) {
                    i6 = 32;
                    i4 |= i6;
                }
            } else {
                f3 = f2;
            }
            i6 = 16;
            i4 |= i6;
        } else {
            f3 = f2;
        }
        if ((i7 & 384) == 0) {
            if ((i3 & 4) == 0) {
                j3 = j2;
                if (q2.j(j3)) {
                    i5 = 256;
                    i4 |= i5;
                }
            } else {
                j3 = j2;
            }
            i5 = 128;
            i4 |= i5;
        } else {
            j3 = j2;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else {
            if ((i7 & 3072) == 0) {
                i4 |= q2.W(this) ? 2048 : 1024;
            }
        }
        if (q2.E((i4 & 1171) != 1170, i4 & 1)) {
            q2.p();
            if ((i7 & 1) == 0 || q2.J()) {
                modifier3 = i8 != 0 ? Modifier.f15489d : modifier2;
                if ((i3 & 2) != 0) {
                    f4 = f8683b;
                    i4 &= -113;
                } else {
                    f4 = f3;
                }
                if ((i3 & 4) != 0) {
                    j3 = Color.l(((Color) q2.C(ContentColorKt.a())).v(), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                    i4 &= -897;
                }
            } else {
                q2.B();
                if ((i3 & 2) != 0) {
                    i4 &= -113;
                }
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
                modifier3 = modifier2;
                f4 = f3;
            }
            long j5 = j3;
            int i9 = i4;
            j4 = j5;
            q2.U();
            if (ComposerKt.P()) {
                ComposerKt.Y(910934799, i9, -1, "androidx.compose.material.TabRowDefaults.Divider (TabRow.kt:357)");
            }
            DividerKt.a(modifier3, j4, f4, 0.0f, q2, (i9 & 14) | ((i9 >> 3) & 112) | ((i9 << 3) & 896), 8);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            modifier3 = modifier2;
            f4 = f3;
            j4 = j3;
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new TabRowDefaults$Divider$1(this, modifier3, f4, j4, i2, i3));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.compose.ui.Modifier r21, float r22, long r23, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            r20 = this;
            r6 = r26
            r0 = 1499002201(0x5958f559, float:3.81677235E15)
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
            r5 = r6 & 48
            if (r5 != 0) goto L_0x0042
            r5 = r27 & 2
            if (r5 != 0) goto L_0x003c
            r5 = r22
            boolean r7 = r1.h(r5)
            if (r7 == 0) goto L_0x003e
            r7 = 32
            goto L_0x0040
        L_0x003c:
            r5 = r22
        L_0x003e:
            r7 = 16
        L_0x0040:
            r4 = r4 | r7
            goto L_0x0044
        L_0x0042:
            r5 = r22
        L_0x0044:
            r7 = r6 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x005d
            r7 = r27 & 4
            if (r7 != 0) goto L_0x0057
            r7 = r23
            boolean r9 = r1.j(r7)
            if (r9 == 0) goto L_0x0059
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0057:
            r7 = r23
        L_0x0059:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r4 = r4 | r9
            goto L_0x005f
        L_0x005d:
            r7 = r23
        L_0x005f:
            r9 = r27 & 8
            if (r9 == 0) goto L_0x0068
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r9 = r20
            goto L_0x007a
        L_0x0068:
            r9 = r6 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0065
            r9 = r20
            boolean r10 = r1.W(r9)
            if (r10 == 0) goto L_0x0077
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r4 = r4 | r10
        L_0x007a:
            r10 = r4 & 1171(0x493, float:1.641E-42)
            r11 = 1170(0x492, float:1.64E-42)
            r12 = 0
            r13 = 1
            if (r10 == r11) goto L_0x0084
            r10 = r13
            goto L_0x0085
        L_0x0084:
            r10 = r12
        L_0x0085:
            r11 = r4 & 1
            boolean r10 = r1.E(r10, r11)
            if (r10 == 0) goto L_0x0103
            r1.p()
            r10 = r6 & 1
            if (r10 == 0) goto L_0x00ad
            boolean r10 = r1.J()
            if (r10 == 0) goto L_0x009b
            goto L_0x00ad
        L_0x009b:
            r1.B()
            r2 = r27 & 2
            if (r2 == 0) goto L_0x00a4
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00a4:
            r2 = r27 & 4
            if (r2 == 0) goto L_0x00aa
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00aa:
            r2 = r3
            r3 = r5
            goto L_0x00d1
        L_0x00ad:
            if (r2 == 0) goto L_0x00b2
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00b3
        L_0x00b2:
            r2 = r3
        L_0x00b3:
            r3 = r27 & 2
            if (r3 == 0) goto L_0x00bc
            float r3 = f8684c
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x00bd
        L_0x00bc:
            r3 = r5
        L_0x00bd:
            r5 = r27 & 4
            if (r5 == 0) goto L_0x00d1
            androidx.compose.runtime.ProvidableCompositionLocal r5 = androidx.compose.material.ContentColorKt.a()
            java.lang.Object r5 = r1.C(r5)
            androidx.compose.ui.graphics.Color r5 = (androidx.compose.ui.graphics.Color) r5
            long r7 = r5.v()
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00d1:
            r1.U()
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x00e0
            r5 = -1
            java.lang.String r10 = "androidx.compose.material.TabRowDefaults.Indicator (TabRow.kt:374)"
            androidx.compose.runtime.ComposerKt.Y(r0, r4, r5, r10)
        L_0x00e0:
            r0 = 0
            r4 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.h(r2, r0, r13, r4)
            androidx.compose.ui.Modifier r14 = androidx.compose.foundation.layout.SizeKt.i(r0, r3)
            r18 = 2
            r19 = 0
            r17 = 0
            r15 = r7
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.BackgroundKt.b(r14, r15, r17, r18, r19)
            androidx.compose.foundation.layout.BoxKt.a(r0, r1, r12)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0101
            androidx.compose.runtime.ComposerKt.X()
        L_0x0101:
            r4 = r7
            goto L_0x0109
        L_0x0103:
            r1.B()
            r2 = r3
            r3 = r5
            goto L_0x0101
        L_0x0109:
            androidx.compose.runtime.ScopeUpdateScope r8 = r1.x()
            if (r8 == 0) goto L_0x011e
            androidx.compose.material.TabRowDefaults$Indicator$1 r10 = new androidx.compose.material.TabRowDefaults$Indicator$1
            r0 = r10
            r1 = r20
            r6 = r26
            r7 = r27
            r0.<init>(r1, r2, r3, r4, r6, r7)
            r8.a(r10)
        L_0x011e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabRowDefaults.b(androidx.compose.ui.Modifier, float, long, androidx.compose.runtime.Composer, int, int):void");
    }

    public final float c() {
        return f8684c;
    }

    public final float d() {
        return f8685d;
    }

    public final Modifier e(Modifier modifier, TabPosition tabPosition) {
        return ComposedModifierKt.b(modifier, InspectableValueKt.b() ? new TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1(tabPosition) : InspectableValueKt.a(), new TabRowDefaults$tabIndicatorOffset$2(tabPosition));
    }
}

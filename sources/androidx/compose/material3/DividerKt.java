package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata
public final class DividerKt {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(androidx.compose.ui.Modifier r16, float r17, long r18, androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            r5 = r21
            r0 = 75144485(0x47a9d25, float:2.9459516E-36)
            r1 = r20
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r22 & 1
            if (r2 == 0) goto L_0x0015
            r3 = r5 | 6
            r4 = r3
            r3 = r16
            goto L_0x0029
        L_0x0015:
            r3 = r5 & 6
            if (r3 != 0) goto L_0x0026
            r3 = r16
            boolean r4 = r1.W(r3)
            if (r4 == 0) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r5
            goto L_0x0029
        L_0x0026:
            r3 = r16
            r4 = r5
        L_0x0029:
            r6 = r22 & 2
            r7 = 32
            if (r6 == 0) goto L_0x0034
            r4 = r4 | 48
        L_0x0031:
            r8 = r17
            goto L_0x0045
        L_0x0034:
            r8 = r5 & 48
            if (r8 != 0) goto L_0x0031
            r8 = r17
            boolean r9 = r1.h(r8)
            if (r9 == 0) goto L_0x0042
            r9 = r7
            goto L_0x0044
        L_0x0042:
            r9 = 16
        L_0x0044:
            r4 = r4 | r9
        L_0x0045:
            r9 = r5 & 384(0x180, float:5.38E-43)
            r10 = 256(0x100, float:3.59E-43)
            if (r9 != 0) goto L_0x005d
            r9 = r22 & 4
            r11 = r18
            if (r9 != 0) goto L_0x0059
            boolean r9 = r1.j(r11)
            if (r9 == 0) goto L_0x0059
            r9 = r10
            goto L_0x005b
        L_0x0059:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r4 = r4 | r9
            goto L_0x005f
        L_0x005d:
            r11 = r18
        L_0x005f:
            r9 = r4 & 147(0x93, float:2.06E-43)
            r13 = 146(0x92, float:2.05E-43)
            r14 = 0
            r15 = 1
            if (r9 == r13) goto L_0x0069
            r9 = r15
            goto L_0x006a
        L_0x0069:
            r9 = r14
        L_0x006a:
            r13 = r4 & 1
            boolean r9 = r1.E(r9, r13)
            if (r9 == 0) goto L_0x0103
            r1.p()
            r9 = r5 & 1
            if (r9 == 0) goto L_0x008c
            boolean r9 = r1.J()
            if (r9 == 0) goto L_0x0080
            goto L_0x008c
        L_0x0080:
            r1.B()
            r2 = r22 & 4
            if (r2 == 0) goto L_0x0089
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0089:
            r2 = r3
            r3 = r8
            goto L_0x00aa
        L_0x008c:
            if (r2 == 0) goto L_0x0091
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0092
        L_0x0091:
            r2 = r3
        L_0x0092:
            if (r6 == 0) goto L_0x009b
            androidx.compose.material3.DividerDefaults r3 = androidx.compose.material3.DividerDefaults.f9860a
            float r3 = r3.b()
            goto L_0x009c
        L_0x009b:
            r3 = r8
        L_0x009c:
            r6 = r22 & 4
            if (r6 == 0) goto L_0x00aa
            androidx.compose.material3.DividerDefaults r6 = androidx.compose.material3.DividerDefaults.f9860a
            r8 = 6
            long r8 = r6.a(r1, r8)
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            r11 = r8
        L_0x00aa:
            r1.U()
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x00b9
            r6 = -1
            java.lang.String r8 = "androidx.compose.material3.HorizontalDivider (Divider.kt:53)"
            androidx.compose.runtime.ComposerKt.Y(r0, r4, r6, r8)
        L_0x00b9:
            r0 = 0
            r6 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.h(r2, r0, r15, r6)
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.i(r0, r3)
            r6 = r4 & 112(0x70, float:1.57E-43)
            if (r6 != r7) goto L_0x00c9
            r6 = r15
            goto L_0x00ca
        L_0x00c9:
            r6 = r14
        L_0x00ca:
            r7 = r4 & 896(0x380, float:1.256E-42)
            r7 = r7 ^ 384(0x180, float:5.38E-43)
            if (r7 <= r10) goto L_0x00d6
            boolean r7 = r1.j(r11)
            if (r7 != 0) goto L_0x00dc
        L_0x00d6:
            r4 = r4 & 384(0x180, float:5.38E-43)
            if (r4 != r10) goto L_0x00db
            goto L_0x00dc
        L_0x00db:
            r15 = r14
        L_0x00dc:
            r4 = r6 | r15
            java.lang.Object r6 = r1.g()
            if (r4 != 0) goto L_0x00ec
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r6 != r4) goto L_0x00f4
        L_0x00ec:
            androidx.compose.material3.o2 r6 = new androidx.compose.material3.o2
            r6.<init>(r3, r11)
            r1.N(r6)
        L_0x00f4:
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            androidx.compose.foundation.CanvasKt.b(r0, r6, r1, r14)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0108
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x0108
        L_0x0103:
            r1.B()
            r2 = r3
            r3 = r8
        L_0x0108:
            androidx.compose.runtime.ScopeUpdateScope r7 = r1.x()
            if (r7 == 0) goto L_0x011e
            androidx.compose.material3.p2 r8 = new androidx.compose.material3.p2
            r0 = r8
            r1 = r2
            r2 = r3
            r3 = r11
            r5 = r21
            r6 = r22
            r0.<init>(r1, r2, r3, r5, r6)
            r7.a(r8)
        L_0x011e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DividerKt.e(androidx.compose.ui.Modifier, float, long, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit f(float f2, long j2, DrawScope drawScope) {
        float f3 = f2;
        DrawScope drawScope2 = drawScope;
        float B1 = drawScope2.B1(f3);
        float f4 = (float) 2;
        DrawScope.j2(drawScope, j2, Offset.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(drawScope2.B1(f3) / f4)) & 4294967295L)), Offset.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.c() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(drawScope2.B1(f3) / f4)) & 4294967295L)), B1, 0, (PathEffect) null, 0.0f, (ColorFilter) null, 0, 496, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit g(Modifier modifier, float f2, long j2, int i2, int i3, Composer composer, int i4) {
        e(modifier, f2, j2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(androidx.compose.ui.Modifier r16, float r17, long r18, androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            r5 = r21
            r0 = -1534852205(0xffffffffa4840393, float:-5.725193E-17)
            r1 = r20
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r22 & 1
            if (r2 == 0) goto L_0x0015
            r3 = r5 | 6
            r4 = r3
            r3 = r16
            goto L_0x0029
        L_0x0015:
            r3 = r5 & 6
            if (r3 != 0) goto L_0x0026
            r3 = r16
            boolean r4 = r1.W(r3)
            if (r4 == 0) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r5
            goto L_0x0029
        L_0x0026:
            r3 = r16
            r4 = r5
        L_0x0029:
            r6 = r22 & 2
            r7 = 32
            if (r6 == 0) goto L_0x0034
            r4 = r4 | 48
        L_0x0031:
            r8 = r17
            goto L_0x0045
        L_0x0034:
            r8 = r5 & 48
            if (r8 != 0) goto L_0x0031
            r8 = r17
            boolean r9 = r1.h(r8)
            if (r9 == 0) goto L_0x0042
            r9 = r7
            goto L_0x0044
        L_0x0042:
            r9 = 16
        L_0x0044:
            r4 = r4 | r9
        L_0x0045:
            r9 = r5 & 384(0x180, float:5.38E-43)
            r10 = 256(0x100, float:3.59E-43)
            if (r9 != 0) goto L_0x005d
            r9 = r22 & 4
            r11 = r18
            if (r9 != 0) goto L_0x0059
            boolean r9 = r1.j(r11)
            if (r9 == 0) goto L_0x0059
            r9 = r10
            goto L_0x005b
        L_0x0059:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r4 = r4 | r9
            goto L_0x005f
        L_0x005d:
            r11 = r18
        L_0x005f:
            r9 = r4 & 147(0x93, float:2.06E-43)
            r13 = 146(0x92, float:2.05E-43)
            r14 = 0
            r15 = 1
            if (r9 == r13) goto L_0x0069
            r9 = r15
            goto L_0x006a
        L_0x0069:
            r9 = r14
        L_0x006a:
            r13 = r4 & 1
            boolean r9 = r1.E(r9, r13)
            if (r9 == 0) goto L_0x0103
            r1.p()
            r9 = r5 & 1
            if (r9 == 0) goto L_0x008c
            boolean r9 = r1.J()
            if (r9 == 0) goto L_0x0080
            goto L_0x008c
        L_0x0080:
            r1.B()
            r2 = r22 & 4
            if (r2 == 0) goto L_0x0089
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0089:
            r2 = r3
            r3 = r8
            goto L_0x00aa
        L_0x008c:
            if (r2 == 0) goto L_0x0091
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0092
        L_0x0091:
            r2 = r3
        L_0x0092:
            if (r6 == 0) goto L_0x009b
            androidx.compose.material3.DividerDefaults r3 = androidx.compose.material3.DividerDefaults.f9860a
            float r3 = r3.b()
            goto L_0x009c
        L_0x009b:
            r3 = r8
        L_0x009c:
            r6 = r22 & 4
            if (r6 == 0) goto L_0x00aa
            androidx.compose.material3.DividerDefaults r6 = androidx.compose.material3.DividerDefaults.f9860a
            r8 = 6
            long r8 = r6.a(r1, r8)
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            r11 = r8
        L_0x00aa:
            r1.U()
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x00b9
            r6 = -1
            java.lang.String r8 = "androidx.compose.material3.VerticalDivider (Divider.kt:81)"
            androidx.compose.runtime.ComposerKt.Y(r0, r4, r6, r8)
        L_0x00b9:
            r0 = 0
            r6 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.d(r2, r0, r15, r6)
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.y(r0, r3)
            r6 = r4 & 112(0x70, float:1.57E-43)
            if (r6 != r7) goto L_0x00c9
            r6 = r15
            goto L_0x00ca
        L_0x00c9:
            r6 = r14
        L_0x00ca:
            r7 = r4 & 896(0x380, float:1.256E-42)
            r7 = r7 ^ 384(0x180, float:5.38E-43)
            if (r7 <= r10) goto L_0x00d6
            boolean r7 = r1.j(r11)
            if (r7 != 0) goto L_0x00dc
        L_0x00d6:
            r4 = r4 & 384(0x180, float:5.38E-43)
            if (r4 != r10) goto L_0x00db
            goto L_0x00dc
        L_0x00db:
            r15 = r14
        L_0x00dc:
            r4 = r6 | r15
            java.lang.Object r6 = r1.g()
            if (r4 != 0) goto L_0x00ec
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r6 != r4) goto L_0x00f4
        L_0x00ec:
            androidx.compose.material3.q2 r6 = new androidx.compose.material3.q2
            r6.<init>(r3, r11)
            r1.N(r6)
        L_0x00f4:
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            androidx.compose.foundation.CanvasKt.b(r0, r6, r1, r14)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0108
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x0108
        L_0x0103:
            r1.B()
            r2 = r3
            r3 = r8
        L_0x0108:
            androidx.compose.runtime.ScopeUpdateScope r7 = r1.x()
            if (r7 == 0) goto L_0x011e
            androidx.compose.material3.r2 r8 = new androidx.compose.material3.r2
            r0 = r8
            r1 = r2
            r2 = r3
            r3 = r11
            r5 = r21
            r6 = r22
            r0.<init>(r1, r2, r3, r5, r6)
            r7.a(r8)
        L_0x011e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DividerKt.h(androidx.compose.ui.Modifier, float, long, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit i(float f2, long j2, DrawScope drawScope) {
        float f3 = f2;
        DrawScope drawScope2 = drawScope;
        float B1 = drawScope2.B1(f3);
        float f4 = (float) 2;
        long e2 = Offset.e((((long) Float.floatToRawIntBits(drawScope2.B1(f3) / f4)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
        float B12 = drawScope2.B1(f3) / f4;
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.c() & 4294967295L));
        DrawScope.j2(drawScope, j2, e2, Offset.e((((long) Float.floatToRawIntBits(B12)) << 32) | (((long) Float.floatToRawIntBits(intBitsToFloat)) & 4294967295L)), B1, 0, (PathEffect) null, 0.0f, (ColorFilter) null, 0, 496, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit j(Modifier modifier, float f2, long j2, int i2, int i3, Composer composer, int i4) {
        h(modifier, f2, j2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}

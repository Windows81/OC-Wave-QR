package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class TextFieldDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final TextFieldDefaults f8730a = new TextFieldDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final float f8731b = Dp.m((float) 56);

    /* renamed from: c  reason: collision with root package name */
    public static final float f8732c = Dp.m((float) 280);

    /* renamed from: d  reason: collision with root package name */
    public static final float f8733d = Dp.m((float) 1);

    /* renamed from: e  reason: collision with root package name */
    public static final float f8734e = Dp.m((float) 2);

    public static /* synthetic */ Modifier k(TextFieldDefaults textFieldDefaults, Modifier modifier, boolean z2, boolean z3, InteractionSource interactionSource, TextFieldColors textFieldColors, float f2, float f3, int i2, Object obj) {
        return textFieldDefaults.j(modifier, z2, z3, interactionSource, textFieldColors, (i2 & 16) != 0 ? f8734e : f2, (i2 & 32) != 0 ? f8733d : f3);
    }

    public static /* synthetic */ PaddingValues n(TextFieldDefaults textFieldDefaults, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = TextFieldImplKt.f();
        }
        if ((i2 & 2) != 0) {
            f3 = TextFieldImplKt.f();
        }
        if ((i2 & 4) != 0) {
            f4 = TextFieldImplKt.f();
        }
        if ((i2 & 8) != 0) {
            f5 = TextFieldImplKt.f();
        }
        return textFieldDefaults.m(f2, f3, f4, f5);
    }

    public static /* synthetic */ PaddingValues q(TextFieldDefaults textFieldDefaults, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = TextFieldImplKt.f();
        }
        if ((i2 & 2) != 0) {
            f3 = TextFieldImplKt.f();
        }
        if ((i2 & 4) != 0) {
            f4 = TextFieldKt.o();
        }
        if ((i2 & 8) != 0) {
            f5 = TextFieldKt.p();
        }
        return textFieldDefaults.p(f2, f3, f4, f5);
    }

    public static /* synthetic */ PaddingValues s(TextFieldDefaults textFieldDefaults, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = TextFieldImplKt.f();
        }
        if ((i2 & 2) != 0) {
            f3 = TextFieldImplKt.f();
        }
        if ((i2 & 4) != 0) {
            f4 = TextFieldImplKt.f();
        }
        if ((i2 & 8) != 0) {
            f5 = TextFieldImplKt.f();
        }
        return textFieldDefaults.r(f2, f3, f4, f5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0123, code lost:
        if ((r10 & 64) != 0) goto L_0x0125;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x018e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r19, boolean r20, androidx.compose.foundation.interaction.InteractionSource r21, androidx.compose.material.TextFieldColors r22, androidx.compose.ui.graphics.Shape r23, float r24, float r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            r18 = this;
            r11 = r18
            r9 = r27
            r10 = r28
            r0 = 943754022(0x38408b26, float:4.590596E-5)
            r1 = r26
            androidx.compose.runtime.Composer r12 = r1.q(r0)
            r1 = r10 & 1
            if (r1 == 0) goto L_0x0018
            r1 = r9 | 6
            r13 = r19
            goto L_0x002a
        L_0x0018:
            r1 = r9 & 6
            r13 = r19
            if (r1 != 0) goto L_0x0029
            boolean r1 = r12.d(r13)
            if (r1 == 0) goto L_0x0026
            r1 = 4
            goto L_0x0027
        L_0x0026:
            r1 = 2
        L_0x0027:
            r1 = r1 | r9
            goto L_0x002a
        L_0x0029:
            r1 = r9
        L_0x002a:
            r2 = r10 & 2
            if (r2 == 0) goto L_0x0033
            r1 = r1 | 48
            r14 = r20
            goto L_0x0045
        L_0x0033:
            r2 = r9 & 48
            r14 = r20
            if (r2 != 0) goto L_0x0045
            boolean r2 = r12.d(r14)
            if (r2 == 0) goto L_0x0042
            r2 = 32
            goto L_0x0044
        L_0x0042:
            r2 = 16
        L_0x0044:
            r1 = r1 | r2
        L_0x0045:
            r2 = r10 & 4
            if (r2 == 0) goto L_0x004e
            r1 = r1 | 384(0x180, float:5.38E-43)
            r15 = r21
            goto L_0x0060
        L_0x004e:
            r2 = r9 & 384(0x180, float:5.38E-43)
            r15 = r21
            if (r2 != 0) goto L_0x0060
            boolean r2 = r12.W(r15)
            if (r2 == 0) goto L_0x005d
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r2 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r1 = r1 | r2
        L_0x0060:
            r2 = r10 & 8
            if (r2 == 0) goto L_0x0069
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r8 = r22
            goto L_0x007b
        L_0x0069:
            r2 = r9 & 3072(0xc00, float:4.305E-42)
            r8 = r22
            if (r2 != 0) goto L_0x007b
            boolean r2 = r12.W(r8)
            if (r2 == 0) goto L_0x0078
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r1 = r1 | r2
        L_0x007b:
            r2 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x0094
            r2 = r10 & 16
            if (r2 != 0) goto L_0x008e
            r2 = r23
            boolean r3 = r12.W(r2)
            if (r3 == 0) goto L_0x0090
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0092
        L_0x008e:
            r2 = r23
        L_0x0090:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x0092:
            r1 = r1 | r3
            goto L_0x0096
        L_0x0094:
            r2 = r23
        L_0x0096:
            r3 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 & r9
            if (r3 != 0) goto L_0x00b0
            r3 = r10 & 32
            if (r3 != 0) goto L_0x00aa
            r3 = r24
            boolean r4 = r12.h(r3)
            if (r4 == 0) goto L_0x00ac
            r4 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ae
        L_0x00aa:
            r3 = r24
        L_0x00ac:
            r4 = 65536(0x10000, float:9.18355E-41)
        L_0x00ae:
            r1 = r1 | r4
            goto L_0x00b2
        L_0x00b0:
            r3 = r24
        L_0x00b2:
            r4 = 1572864(0x180000, float:2.204052E-39)
            r4 = r4 & r9
            if (r4 != 0) goto L_0x00cc
            r4 = r10 & 64
            if (r4 != 0) goto L_0x00c6
            r4 = r25
            boolean r5 = r12.h(r4)
            if (r5 == 0) goto L_0x00c8
            r5 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ca
        L_0x00c6:
            r4 = r25
        L_0x00c8:
            r5 = 524288(0x80000, float:7.34684E-40)
        L_0x00ca:
            r1 = r1 | r5
            goto L_0x00ce
        L_0x00cc:
            r4 = r25
        L_0x00ce:
            r5 = r10 & 128(0x80, float:1.794E-43)
            r6 = 12582912(0xc00000, float:1.7632415E-38)
            if (r5 == 0) goto L_0x00d6
            r1 = r1 | r6
            goto L_0x00e6
        L_0x00d6:
            r5 = r9 & r6
            if (r5 != 0) goto L_0x00e6
            boolean r5 = r12.W(r11)
            if (r5 == 0) goto L_0x00e3
            r5 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e5
        L_0x00e3:
            r5 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e5:
            r1 = r1 | r5
        L_0x00e6:
            r5 = 4793491(0x492493, float:6.717112E-39)
            r5 = r5 & r1
            r6 = 4793490(0x492492, float:6.71711E-39)
            r7 = 0
            if (r5 == r6) goto L_0x00f2
            r5 = 1
            goto L_0x00f3
        L_0x00f2:
            r5 = r7
        L_0x00f3:
            r6 = r1 & 1
            boolean r5 = r12.E(r5, r6)
            if (r5 == 0) goto L_0x0197
            r12.p()
            r5 = r9 & 1
            r6 = -3670017(0xffffffffffc7ffff, float:NaN)
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            if (r5 == 0) goto L_0x012c
            boolean r5 = r12.J()
            if (r5 == 0) goto L_0x0112
            goto L_0x012c
        L_0x0112:
            r12.B()
            r5 = r10 & 16
            if (r5 == 0) goto L_0x011b
            r1 = r1 & r17
        L_0x011b:
            r5 = r10 & 32
            if (r5 == 0) goto L_0x0121
            r1 = r1 & r16
        L_0x0121:
            r5 = r10 & 64
            if (r5 == 0) goto L_0x0126
        L_0x0125:
            r1 = r1 & r6
        L_0x0126:
            r6 = r2
            r16 = r3
            r17 = r4
            goto L_0x0149
        L_0x012c:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x013a
            int r2 = r1 >> 21
            r2 = r2 & 14
            androidx.compose.ui.graphics.Shape r2 = r11.h(r12, r2)
            r1 = r1 & r17
        L_0x013a:
            r5 = r10 & 32
            if (r5 == 0) goto L_0x0142
            float r3 = f8734e
            r1 = r1 & r16
        L_0x0142:
            r5 = r10 & 64
            if (r5 == 0) goto L_0x0126
            float r4 = f8733d
            goto L_0x0125
        L_0x0149:
            r12.U()
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0158
            r2 = -1
            java.lang.String r3 = "androidx.compose.material.TextFieldDefaults.BorderBox (TextFieldDefaults.kt:325)"
            androidx.compose.runtime.ComposerKt.Y(r0, r1, r2, r3)
        L_0x0158:
            r0 = r1 & 8190(0x1ffe, float:1.1477E-41)
            int r1 = r1 >> 3
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r2
            r0 = r0 | r1
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r16
            r9 = r6
            r6 = r17
            r10 = r7
            r7 = r12
            r8 = r0
            androidx.compose.runtime.State r0 = androidx.compose.material.TextFieldDefaultsKt.b(r1, r2, r3, r4, r5, r6, r7, r8)
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            java.lang.Object r0 = r0.getValue()
            androidx.compose.foundation.BorderStroke r0 = (androidx.compose.foundation.BorderStroke) r0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.BorderKt.e(r1, r0, r9)
            androidx.compose.foundation.layout.BoxKt.a(r0, r12, r10)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0191
            androidx.compose.runtime.ComposerKt.X()
        L_0x0191:
            r6 = r9
            r7 = r16
            r8 = r17
            goto L_0x019d
        L_0x0197:
            r12.B()
            r6 = r2
            r7 = r3
            r8 = r4
        L_0x019d:
            androidx.compose.runtime.ScopeUpdateScope r12 = r12.x()
            if (r12 == 0) goto L_0x01bb
            androidx.compose.material.TextFieldDefaults$BorderBox$1 r10 = new androidx.compose.material.TextFieldDefaults$BorderBox$1
            r0 = r10
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r9 = r27
            r13 = r10
            r10 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r12.a(r13)
        L_0x01bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.a(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material.TextFieldColors, androidx.compose.ui.graphics.Shape, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0362  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void b(java.lang.String r59, kotlin.jvm.functions.Function2 r60, boolean r61, boolean r62, androidx.compose.ui.text.input.VisualTransformation r63, androidx.compose.foundation.interaction.InteractionSource r64, boolean r65, kotlin.jvm.functions.Function2 r66, kotlin.jvm.functions.Function2 r67, kotlin.jvm.functions.Function2 r68, kotlin.jvm.functions.Function2 r69, androidx.compose.material.TextFieldColors r70, androidx.compose.foundation.layout.PaddingValues r71, kotlin.jvm.functions.Function2 r72, androidx.compose.runtime.Composer r73, int r74, int r75, int r76) {
        /*
            r58 = this;
            r0 = r58
            r15 = r61
            r13 = r64
            r14 = r74
            r11 = r75
            r12 = r76
            r9 = -1280721485(0xffffffffb3a9bdb3, float:-7.904182E-8)
            r1 = r73
            androidx.compose.runtime.Composer r10 = r1.q(r9)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x001e
            r1 = r14 | 6
            r7 = r59
            goto L_0x0030
        L_0x001e:
            r1 = r14 & 6
            r7 = r59
            if (r1 != 0) goto L_0x002f
            boolean r1 = r10.W(r7)
            if (r1 == 0) goto L_0x002c
            r1 = 4
            goto L_0x002d
        L_0x002c:
            r1 = 2
        L_0x002d:
            r1 = r1 | r14
            goto L_0x0030
        L_0x002f:
            r1 = r14
        L_0x0030:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x0039
            r1 = r1 | 48
            r8 = r60
            goto L_0x004b
        L_0x0039:
            r4 = r14 & 48
            r8 = r60
            if (r4 != 0) goto L_0x004b
            boolean r4 = r10.l(r8)
            if (r4 == 0) goto L_0x0048
            r4 = 32
            goto L_0x004a
        L_0x0048:
            r4 = 16
        L_0x004a:
            r1 = r1 | r4
        L_0x004b:
            r4 = r12 & 4
            r16 = 128(0x80, float:1.794E-43)
            r17 = 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x0056
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0056:
            r4 = r14 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0066
            boolean r4 = r10.d(r15)
            if (r4 == 0) goto L_0x0063
            r4 = r17
            goto L_0x0065
        L_0x0063:
            r4 = r16
        L_0x0065:
            r1 = r1 | r4
        L_0x0066:
            r4 = r12 & 8
            r18 = 1024(0x400, float:1.435E-42)
            r19 = 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x0073
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0070:
            r4 = r62
            goto L_0x0086
        L_0x0073:
            r4 = r14 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x0070
            r4 = r62
            boolean r20 = r10.d(r4)
            if (r20 == 0) goto L_0x0082
            r20 = r19
            goto L_0x0084
        L_0x0082:
            r20 = r18
        L_0x0084:
            r1 = r1 | r20
        L_0x0086:
            r20 = r12 & 16
            r21 = 8192(0x2000, float:1.14794E-41)
            r22 = 16384(0x4000, float:2.2959E-41)
            if (r20 == 0) goto L_0x0093
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0090:
            r2 = r63
            goto L_0x00a6
        L_0x0093:
            r2 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x0090
            r2 = r63
            boolean r20 = r10.W(r2)
            if (r20 == 0) goto L_0x00a2
            r20 = r22
            goto L_0x00a4
        L_0x00a2:
            r20 = r21
        L_0x00a4:
            r1 = r1 | r20
        L_0x00a6:
            r20 = r12 & 32
            r23 = 196608(0x30000, float:2.75506E-40)
            if (r20 == 0) goto L_0x00af
            r1 = r1 | r23
            goto L_0x00c0
        L_0x00af:
            r20 = r14 & r23
            if (r20 != 0) goto L_0x00c0
            boolean r20 = r10.W(r13)
            if (r20 == 0) goto L_0x00bc
            r20 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00be
        L_0x00bc:
            r20 = 65536(0x10000, float:9.18355E-41)
        L_0x00be:
            r1 = r1 | r20
        L_0x00c0:
            r20 = r12 & 64
            r23 = 1572864(0x180000, float:2.204052E-39)
            if (r20 == 0) goto L_0x00cb
            r1 = r1 | r23
            r3 = r65
            goto L_0x00de
        L_0x00cb:
            r23 = r14 & r23
            r3 = r65
            if (r23 != 0) goto L_0x00de
            boolean r24 = r10.d(r3)
            if (r24 == 0) goto L_0x00da
            r24 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dc
        L_0x00da:
            r24 = 524288(0x80000, float:7.34684E-40)
        L_0x00dc:
            r1 = r1 | r24
        L_0x00de:
            r5 = r12 & 128(0x80, float:1.794E-43)
            r25 = 12582912(0xc00000, float:1.7632415E-38)
            if (r5 == 0) goto L_0x00e9
            r1 = r1 | r25
            r6 = r66
            goto L_0x00fc
        L_0x00e9:
            r25 = r14 & r25
            r6 = r66
            if (r25 != 0) goto L_0x00fc
            boolean r26 = r10.l(r6)
            if (r26 == 0) goto L_0x00f8
            r26 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fa
        L_0x00f8:
            r26 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fa:
            r1 = r1 | r26
        L_0x00fc:
            r9 = r12 & 256(0x100, float:3.59E-43)
            r27 = 100663296(0x6000000, float:2.4074124E-35)
            if (r9 == 0) goto L_0x0107
            r1 = r1 | r27
            r2 = r67
            goto L_0x011a
        L_0x0107:
            r27 = r14 & r27
            r2 = r67
            if (r27 != 0) goto L_0x011a
            boolean r27 = r10.l(r2)
            if (r27 == 0) goto L_0x0116
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0118
        L_0x0116:
            r27 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0118:
            r1 = r1 | r27
        L_0x011a:
            r2 = r12 & 512(0x200, float:7.175E-43)
            r27 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0125
            r1 = r1 | r27
            r3 = r68
            goto L_0x0138
        L_0x0125:
            r27 = r14 & r27
            r3 = r68
            if (r27 != 0) goto L_0x0138
            boolean r27 = r10.l(r3)
            if (r27 == 0) goto L_0x0134
            r27 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0136
        L_0x0134:
            r27 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0136:
            r1 = r1 | r27
        L_0x0138:
            r3 = r12 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0141
            r23 = r11 | 6
            r4 = r69
            goto L_0x0157
        L_0x0141:
            r27 = r11 & 6
            r4 = r69
            if (r27 != 0) goto L_0x0155
            boolean r27 = r10.l(r4)
            if (r27 == 0) goto L_0x0150
            r23 = 4
            goto L_0x0152
        L_0x0150:
            r23 = 2
        L_0x0152:
            r23 = r11 | r23
            goto L_0x0157
        L_0x0155:
            r23 = r11
        L_0x0157:
            r27 = r11 & 48
            if (r27 != 0) goto L_0x0171
            r4 = r12 & 2048(0x800, float:2.87E-42)
            if (r4 != 0) goto L_0x016a
            r4 = r70
            boolean r27 = r10.W(r4)
            if (r27 == 0) goto L_0x016c
            r24 = 32
            goto L_0x016e
        L_0x016a:
            r4 = r70
        L_0x016c:
            r24 = 16
        L_0x016e:
            r23 = r23 | r24
            goto L_0x0173
        L_0x0171:
            r4 = r70
        L_0x0173:
            r4 = r11 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x018d
            r4 = r12 & 4096(0x1000, float:5.74E-42)
            if (r4 != 0) goto L_0x0186
            r4 = r71
            boolean r24 = r10.W(r4)
            if (r24 == 0) goto L_0x0188
            r16 = r17
            goto L_0x0188
        L_0x0186:
            r4 = r71
        L_0x0188:
            r23 = r23 | r16
        L_0x018a:
            r4 = r23
            goto L_0x0190
        L_0x018d:
            r4 = r71
            goto L_0x018a
        L_0x0190:
            r15 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0199
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0196:
            r6 = r72
            goto L_0x01a9
        L_0x0199:
            r6 = r11 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x0196
            r6 = r72
            boolean r16 = r10.l(r6)
            if (r16 == 0) goto L_0x01a7
            r18 = r19
        L_0x01a7:
            r4 = r4 | r18
        L_0x01a9:
            r6 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r6 == 0) goto L_0x01b1
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x01af:
            r6 = r4
            goto L_0x01c0
        L_0x01b1:
            r6 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x01af
            boolean r6 = r10.W(r0)
            if (r6 == 0) goto L_0x01bd
            r21 = r22
        L_0x01bd:
            r4 = r4 | r21
            goto L_0x01af
        L_0x01c0:
            r4 = 306783379(0x12492493, float:6.34695E-28)
            r4 = r4 & r1
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            r16 = r15
            r15 = 1
            if (r4 != r0) goto L_0x01d5
            r0 = r6 & 9363(0x2493, float:1.312E-41)
            r4 = 9362(0x2492, float:1.3119E-41)
            if (r0 == r4) goto L_0x01d3
            goto L_0x01d5
        L_0x01d3:
            r0 = 0
            goto L_0x01d6
        L_0x01d5:
            r0 = r15
        L_0x01d6:
            r4 = r1 & 1
            boolean r0 = r10.E(r0, r4)
            if (r0 == 0) goto L_0x0362
            r10.p()
            r0 = r14 & 1
            if (r0 == 0) goto L_0x0213
            boolean r0 = r10.J()
            if (r0 == 0) goto L_0x01ec
            goto L_0x0213
        L_0x01ec:
            r10.B()
            r0 = r12 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x01f5
            r6 = r6 & -113(0xffffffffffffff8f, float:NaN)
        L_0x01f5:
            r0 = r12 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x01fb
            r6 = r6 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x01fb:
            r14 = r61
            r20 = r65
            r48 = r66
            r49 = r67
            r50 = r68
            r51 = r69
            r21 = r70
            r22 = r71
            r23 = r72
            r53 = r1
            r11 = r10
            r15 = r12
            goto L_0x02e8
        L_0x0213:
            if (r20 == 0) goto L_0x0217
            r0 = 0
            goto L_0x0219
        L_0x0217:
            r0 = r65
        L_0x0219:
            r4 = 0
            if (r5 == 0) goto L_0x021f
            r48 = r4
            goto L_0x0221
        L_0x021f:
            r48 = r66
        L_0x0221:
            if (r9 == 0) goto L_0x0226
            r49 = r4
            goto L_0x0228
        L_0x0226:
            r49 = r67
        L_0x0228:
            if (r2 == 0) goto L_0x022d
            r50 = r4
            goto L_0x022f
        L_0x022d:
            r50 = r68
        L_0x022f:
            if (r3 == 0) goto L_0x0234
            r51 = r4
            goto L_0x0236
        L_0x0234:
            r51 = r69
        L_0x0236:
            r2 = r12 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x0286
            int r2 = r6 >> 9
            r46 = r2 & 112(0x70, float:1.57E-43)
            r47 = 2097151(0x1fffff, float:2.938734E-39)
            r2 = 0
            r9 = r1
            r1 = r2
            r3 = 0
            r17 = 0
            r52 = r6
            r5 = r17
            r7 = r17
            r53 = r9
            r73 = r10
            r9 = r17
            r11 = r17
            r13 = r17
            r54 = r16
            r15 = r17
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r39 = 0
            r41 = 0
            r44 = 0
            r45 = 0
            r55 = r0
            r0 = r58
            r43 = r73
            androidx.compose.material.TextFieldColors r0 = r0.l(r1, r3, r5, r7, r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r44, r45, r46, r47)
            r6 = r52 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x0292
        L_0x0286:
            r55 = r0
            r53 = r1
            r52 = r6
            r73 = r10
            r54 = r16
            r0 = r70
        L_0x0292:
            r15 = r76
            r1 = r15 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x02b5
            r1 = 15
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r65 = r58
            r66 = r3
            r67 = r4
            r68 = r5
            r69 = r7
            r70 = r1
            r71 = r2
            androidx.compose.foundation.layout.PaddingValues r1 = n(r65, r66, r67, r68, r69, r70, r71)
            r2 = r6 & -897(0xfffffffffffffc7f, float:NaN)
            r6 = r2
            goto L_0x02b7
        L_0x02b5:
            r1 = r71
        L_0x02b7:
            if (r54 == 0) goto L_0x02d9
            androidx.compose.material.TextFieldDefaults$OutlinedTextFieldDecorationBox$3 r2 = new androidx.compose.material.TextFieldDefaults$OutlinedTextFieldDecorationBox$3
            r14 = r61
            r13 = r64
            r3 = r55
            r2.<init>(r14, r3, r13, r0)
            r4 = 54
            r5 = 1261916269(0x4b37506d, float:1.2013677E7)
            r11 = r73
            r7 = 1
            androidx.compose.runtime.internal.ComposableLambda r2 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r5, r7, r2, r11, r4)
            r21 = r0
            r22 = r1
            r23 = r2
        L_0x02d6:
            r20 = r3
            goto L_0x02e8
        L_0x02d9:
            r14 = r61
            r13 = r64
            r11 = r73
            r3 = r55
            r23 = r72
            r21 = r0
            r22 = r1
            goto L_0x02d6
        L_0x02e8:
            r11.U()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x02fc
            java.lang.String r0 = "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:747)"
            r2 = r53
            r1 = -1280721485(0xffffffffb3a9bdb3, float:-7.904182E-8)
            androidx.compose.runtime.ComposerKt.Y(r1, r2, r6, r0)
            goto L_0x02fe
        L_0x02fc:
            r2 = r53
        L_0x02fe:
            int r0 = r6 >> 12
            r0 = r0 & 14
            r10 = r58
            androidx.compose.ui.graphics.Shape r12 = r10.h(r11, r0)
            r0 = 2147483646(0x7ffffffe, float:NaN)
            r17 = r2 & r0
            r0 = r6 & 14
            int r1 = r6 << 3
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r2
            r18 = r0 | r1
            r19 = 0
            r0 = r58
            r1 = r59
            r2 = r60
            r3 = r61
            r4 = r62
            r5 = r63
            r6 = r64
            r7 = r20
            r8 = r48
            r9 = r49
            r10 = r50
            r24 = r11
            r11 = r51
            r13 = r21
            r14 = r22
            r15 = r23
            r16 = r24
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0351
            androidx.compose.runtime.ComposerKt.X()
        L_0x0351:
            r8 = r20
            r13 = r21
            r14 = r22
            r15 = r23
            r9 = r48
            r10 = r49
            r11 = r50
            r12 = r51
            goto L_0x0377
        L_0x0362:
            r24 = r10
            r24.B()
            r8 = r65
            r9 = r66
            r10 = r67
            r11 = r68
            r12 = r69
            r13 = r70
            r14 = r71
            r15 = r72
        L_0x0377:
            androidx.compose.runtime.ScopeUpdateScope r7 = r24.x()
            if (r7 == 0) goto L_0x03a2
            androidx.compose.material.TextFieldDefaults$OutlinedTextFieldDecorationBox$4 r6 = new androidx.compose.material.TextFieldDefaults$OutlinedTextFieldDecorationBox$4
            r0 = r6
            r1 = r58
            r2 = r59
            r3 = r60
            r4 = r61
            r5 = r62
            r56 = r6
            r6 = r63
            r57 = r7
            r7 = r64
            r16 = r74
            r17 = r75
            r18 = r76
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = r56
            r0 = r57
            r0.a(r1)
        L_0x03a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.b(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.material.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x03db  */
    /* JADX WARNING: Removed duplicated region for block: B:235:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(java.lang.String r60, kotlin.jvm.functions.Function2 r61, boolean r62, boolean r63, androidx.compose.ui.text.input.VisualTransformation r64, androidx.compose.foundation.interaction.InteractionSource r65, boolean r66, kotlin.jvm.functions.Function2 r67, kotlin.jvm.functions.Function2 r68, kotlin.jvm.functions.Function2 r69, kotlin.jvm.functions.Function2 r70, androidx.compose.ui.graphics.Shape r71, androidx.compose.material.TextFieldColors r72, androidx.compose.foundation.layout.PaddingValues r73, kotlin.jvm.functions.Function2 r74, androidx.compose.runtime.Composer r75, int r76, int r77, int r78) {
        /*
            r59 = this;
            r0 = r59
            r15 = r76
            r13 = r77
            r14 = r78
            r11 = -920823490(0xffffffffc91d593e, float:-644499.9)
            r1 = r75
            androidx.compose.runtime.Composer r12 = r1.q(r11)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x001a
            r1 = r15 | 6
            r9 = r60
            goto L_0x002c
        L_0x001a:
            r1 = r15 & 6
            r9 = r60
            if (r1 != 0) goto L_0x002b
            boolean r1 = r12.W(r9)
            if (r1 == 0) goto L_0x0028
            r1 = 4
            goto L_0x0029
        L_0x0028:
            r1 = 2
        L_0x0029:
            r1 = r1 | r15
            goto L_0x002c
        L_0x002b:
            r1 = r15
        L_0x002c:
            r4 = r14 & 2
            if (r4 == 0) goto L_0x0035
            r1 = r1 | 48
            r10 = r61
            goto L_0x0047
        L_0x0035:
            r4 = r15 & 48
            r10 = r61
            if (r4 != 0) goto L_0x0047
            boolean r4 = r12.l(r10)
            if (r4 == 0) goto L_0x0044
            r4 = 32
            goto L_0x0046
        L_0x0044:
            r4 = 16
        L_0x0046:
            r1 = r1 | r4
        L_0x0047:
            r4 = r14 & 4
            if (r4 == 0) goto L_0x0050
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x004d:
            r4 = r62
            goto L_0x0063
        L_0x0050:
            r4 = r15 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x004d
            r4 = r62
            boolean r16 = r12.d(r4)
            if (r16 == 0) goto L_0x005f
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r1 = r1 | r16
        L_0x0063:
            r16 = r14 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x0070
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x006d:
            r2 = r63
            goto L_0x0083
        L_0x0070:
            r2 = r15 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x006d
            r2 = r63
            boolean r16 = r12.d(r2)
            if (r16 == 0) goto L_0x007f
            r16 = r18
            goto L_0x0081
        L_0x007f:
            r16 = r17
        L_0x0081:
            r1 = r1 | r16
        L_0x0083:
            r16 = r14 & 16
            r19 = 16384(0x4000, float:2.2959E-41)
            r20 = 8192(0x2000, float:1.14794E-41)
            if (r16 == 0) goto L_0x0090
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x008d:
            r3 = r64
            goto L_0x00a3
        L_0x0090:
            r3 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x008d
            r3 = r64
            boolean r21 = r12.W(r3)
            if (r21 == 0) goto L_0x009f
            r21 = r19
            goto L_0x00a1
        L_0x009f:
            r21 = r20
        L_0x00a1:
            r1 = r1 | r21
        L_0x00a3:
            r21 = r14 & 32
            r22 = 196608(0x30000, float:2.75506E-40)
            if (r21 == 0) goto L_0x00ae
            r1 = r1 | r22
            r11 = r65
            goto L_0x00c1
        L_0x00ae:
            r21 = r15 & r22
            r11 = r65
            if (r21 != 0) goto L_0x00c1
            boolean r23 = r12.W(r11)
            if (r23 == 0) goto L_0x00bd
            r23 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bf
        L_0x00bd:
            r23 = 65536(0x10000, float:9.18355E-41)
        L_0x00bf:
            r1 = r1 | r23
        L_0x00c1:
            r23 = r14 & 64
            r24 = 1572864(0x180000, float:2.204052E-39)
            if (r23 == 0) goto L_0x00cc
            r1 = r1 | r24
            r5 = r66
            goto L_0x00df
        L_0x00cc:
            r24 = r15 & r24
            r5 = r66
            if (r24 != 0) goto L_0x00df
            boolean r25 = r12.d(r5)
            if (r25 == 0) goto L_0x00db
            r25 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dd
        L_0x00db:
            r25 = 524288(0x80000, float:7.34684E-40)
        L_0x00dd:
            r1 = r1 | r25
        L_0x00df:
            r6 = r14 & 128(0x80, float:1.794E-43)
            r26 = 12582912(0xc00000, float:1.7632415E-38)
            if (r6 == 0) goto L_0x00ea
            r1 = r1 | r26
            r7 = r67
            goto L_0x00fd
        L_0x00ea:
            r26 = r15 & r26
            r7 = r67
            if (r26 != 0) goto L_0x00fd
            boolean r27 = r12.l(r7)
            if (r27 == 0) goto L_0x00f9
            r27 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fb
        L_0x00f9:
            r27 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fb:
            r1 = r1 | r27
        L_0x00fd:
            r8 = r14 & 256(0x100, float:3.59E-43)
            r28 = 100663296(0x6000000, float:2.4074124E-35)
            if (r8 == 0) goto L_0x0108
            r1 = r1 | r28
            r2 = r68
            goto L_0x011b
        L_0x0108:
            r28 = r15 & r28
            r2 = r68
            if (r28 != 0) goto L_0x011b
            boolean r28 = r12.l(r2)
            if (r28 == 0) goto L_0x0117
            r28 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0119
        L_0x0117:
            r28 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0119:
            r1 = r1 | r28
        L_0x011b:
            r2 = r14 & 512(0x200, float:7.175E-43)
            r28 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0126
            r1 = r1 | r28
            r3 = r69
            goto L_0x0139
        L_0x0126:
            r28 = r15 & r28
            r3 = r69
            if (r28 != 0) goto L_0x0139
            boolean r28 = r12.l(r3)
            if (r28 == 0) goto L_0x0135
            r28 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0137
        L_0x0135:
            r28 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0137:
            r1 = r1 | r28
        L_0x0139:
            r3 = r14 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0142
            r16 = r13 | 6
            r4 = r70
            goto L_0x0158
        L_0x0142:
            r28 = r13 & 6
            r4 = r70
            if (r28 != 0) goto L_0x0156
            boolean r28 = r12.l(r4)
            if (r28 == 0) goto L_0x0151
            r16 = 4
            goto L_0x0153
        L_0x0151:
            r16 = 2
        L_0x0153:
            r16 = r13 | r16
            goto L_0x0158
        L_0x0156:
            r16 = r13
        L_0x0158:
            r28 = r13 & 48
            if (r28 != 0) goto L_0x0172
            r4 = r14 & 2048(0x800, float:2.87E-42)
            if (r4 != 0) goto L_0x016b
            r4 = r71
            boolean r28 = r12.W(r4)
            if (r28 == 0) goto L_0x016d
            r24 = 32
            goto L_0x016f
        L_0x016b:
            r4 = r71
        L_0x016d:
            r24 = 16
        L_0x016f:
            r16 = r16 | r24
            goto L_0x0174
        L_0x0172:
            r4 = r71
        L_0x0174:
            r4 = r13 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x018e
            r4 = r14 & 4096(0x1000, float:5.74E-42)
            if (r4 != 0) goto L_0x0187
            r4 = r72
            boolean r24 = r12.W(r4)
            if (r24 == 0) goto L_0x0189
            r26 = 256(0x100, float:3.59E-43)
            goto L_0x018b
        L_0x0187:
            r4 = r72
        L_0x0189:
            r26 = 128(0x80, float:1.794E-43)
        L_0x018b:
            r16 = r16 | r26
            goto L_0x0190
        L_0x018e:
            r4 = r72
        L_0x0190:
            r4 = r13 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x01aa
            r4 = r14 & 8192(0x2000, float:1.14794E-41)
            if (r4 != 0) goto L_0x01a3
            r4 = r73
            boolean r24 = r12.W(r4)
            if (r24 == 0) goto L_0x01a5
            r17 = r18
            goto L_0x01a5
        L_0x01a3:
            r4 = r73
        L_0x01a5:
            r16 = r16 | r17
        L_0x01a7:
            r4 = r16
            goto L_0x01ad
        L_0x01aa:
            r4 = r73
            goto L_0x01a7
        L_0x01ad:
            r11 = r14 & 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto L_0x01b6
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x01b3:
            r5 = r74
            goto L_0x01c7
        L_0x01b6:
            r5 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x01b3
            r5 = r74
            boolean r16 = r12.l(r5)
            if (r16 == 0) goto L_0x01c3
            goto L_0x01c5
        L_0x01c3:
            r19 = r20
        L_0x01c5:
            r4 = r4 | r19
        L_0x01c7:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r14 & r16
            if (r16 == 0) goto L_0x01d1
            r4 = r4 | r22
            goto L_0x01e2
        L_0x01d1:
            r16 = r13 & r22
            if (r16 != 0) goto L_0x01e2
            boolean r16 = r12.W(r0)
            if (r16 == 0) goto L_0x01de
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01e0
        L_0x01de:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x01e0:
            r4 = r4 | r16
        L_0x01e2:
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r5 = r1 & r16
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            r13 = 1
            if (r5 != r7) goto L_0x01f9
            r5 = 74899(0x12493, float:1.04956E-40)
            r5 = r5 & r4
            r7 = 74898(0x12492, float:1.04954E-40)
            if (r5 == r7) goto L_0x01f7
            goto L_0x01f9
        L_0x01f7:
            r5 = 0
            goto L_0x01fa
        L_0x01f9:
            r5 = r13
        L_0x01fa:
            r7 = r1 & 1
            boolean r5 = r12.E(r5, r7)
            if (r5 == 0) goto L_0x03be
            r12.p()
            r5 = r15 & 1
            if (r5 == 0) goto L_0x023d
            boolean r5 = r12.J()
            if (r5 == 0) goto L_0x0210
            goto L_0x023d
        L_0x0210:
            r12.B()
            r2 = r14 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x0219
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0219:
            r2 = r14 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x021f
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x021f:
            r2 = r14 & 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x0225
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0225:
            r48 = r66
            r49 = r67
            r50 = r68
            r51 = r69
            r52 = r70
            r53 = r71
            r0 = r72
            r2 = r74
            r55 = r1
            r6 = r12
            r11 = r14
            r1 = r73
            goto L_0x031c
        L_0x023d:
            if (r23 == 0) goto L_0x0243
            r5 = 0
            r48 = r5
            goto L_0x0245
        L_0x0243:
            r48 = r66
        L_0x0245:
            r5 = 0
            if (r6 == 0) goto L_0x024b
            r49 = r5
            goto L_0x024d
        L_0x024b:
            r49 = r67
        L_0x024d:
            if (r8 == 0) goto L_0x0252
            r50 = r5
            goto L_0x0254
        L_0x0252:
            r50 = r68
        L_0x0254:
            if (r2 == 0) goto L_0x0259
            r51 = r5
            goto L_0x025b
        L_0x0259:
            r51 = r69
        L_0x025b:
            if (r3 == 0) goto L_0x0260
            r52 = r5
            goto L_0x0262
        L_0x0260:
            r52 = r70
        L_0x0262:
            r2 = r14 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x0274
            int r2 = r4 >> 15
            r2 = r2 & 14
            androidx.compose.ui.graphics.Shape r2 = r0.h(r12, r2)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
            r53 = r2
        L_0x0272:
            r7 = r4
            goto L_0x0277
        L_0x0274:
            r53 = r71
            goto L_0x0272
        L_0x0277:
            r2 = r14 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x02c9
            int r2 = r7 >> 12
            r46 = r2 & 112(0x70, float:1.57E-43)
            r47 = 2097151(0x1fffff, float:2.938734E-39)
            r2 = 0
            r8 = r1
            r1 = r2
            r3 = 0
            r5 = 0
            r16 = 0
            r54 = r7
            r55 = r8
            r7 = r16
            r9 = r16
            r56 = r11
            r75 = r12
            r11 = r16
            r13 = r16
            r15 = r16
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r39 = 0
            r41 = 0
            r44 = 0
            r45 = 0
            r0 = r59
            r43 = r75
            androidx.compose.material.TextFieldColors r0 = r0.l(r1, r3, r5, r7, r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r44, r45, r46, r47)
            r4 = r54
            r7 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x02d2
        L_0x02c9:
            r55 = r1
            r4 = r7
            r56 = r11
            r75 = r12
            r0 = r72
        L_0x02d2:
            r11 = r78
            r1 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x02f5
            r1 = 15
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r66 = r59
            r67 = r3
            r68 = r4
            r69 = r5
            r70 = r6
            r71 = r1
            r72 = r2
            androidx.compose.foundation.layout.PaddingValues r1 = n(r66, r67, r68, r69, r70, r71, r72)
            r2 = r7 & -7169(0xffffffffffffe3ff, float:NaN)
            r4 = r2
            goto L_0x02f8
        L_0x02f5:
            r1 = r73
            r4 = r7
        L_0x02f8:
            if (r56 == 0) goto L_0x0318
            androidx.compose.material.TextFieldDefaults$OutlinedTextFieldDecorationBox$1 r2 = new androidx.compose.material.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
            r66 = r2
            r67 = r62
            r68 = r48
            r69 = r65
            r70 = r0
            r71 = r53
            r66.<init>(r67, r68, r69, r70, r71)
            r3 = 54
            r5 = 2147252344(0x7ffc7878, float:NaN)
            r6 = r75
            r7 = 1
            androidx.compose.runtime.internal.ComposableLambda r2 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r5, r7, r2, r6, r3)
            goto L_0x031c
        L_0x0318:
            r6 = r75
            r2 = r74
        L_0x031c:
            r6.U()
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0330
            java.lang.String r3 = "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:661)"
            r7 = r55
            r5 = -920823490(0xffffffffc91d593e, float:-644499.9)
            androidx.compose.runtime.ComposerKt.Y(r5, r7, r4, r3)
            goto L_0x0332
        L_0x0330:
            r7 = r55
        L_0x0332:
            androidx.compose.material.TextFieldType r12 = androidx.compose.material.TextFieldType.Outlined
            int r3 = r7 << 3
            r5 = r3 & 112(0x70, float:1.57E-43)
            r5 = r5 | 6
            r3 = r3 & 896(0x380, float:1.256E-42)
            r3 = r3 | r5
            int r5 = r7 >> 3
            r5 = r5 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r5
            int r5 = r7 >> 9
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r5
            r3 = r3 | r8
            r8 = 458752(0x70000, float:6.42848E-40)
            r8 = r8 & r5
            r3 = r3 | r8
            r8 = 3670016(0x380000, float:5.142788E-39)
            r5 = r5 & r8
            r3 = r3 | r5
            int r5 = r4 << 21
            r8 = 29360128(0x1c00000, float:7.052966E-38)
            r5 = r5 & r8
            r3 = r3 | r5
            int r5 = r7 << 15
            r8 = 234881024(0xe000000, float:1.5777218E-30)
            r5 = r5 & r8
            r3 = r3 | r5
            int r5 = r7 << 21
            r8 = 1879048192(0x70000000, float:1.58456325E29)
            r5 = r5 & r8
            r29 = r3 | r5
            int r3 = r7 >> 18
            r3 = r3 & 14
            int r5 = r7 >> 12
            r5 = r5 & 112(0x70, float:1.57E-43)
            r3 = r3 | r5
            int r5 = r4 >> 3
            r5 = r5 & 896(0x380, float:1.256E-42)
            r3 = r3 | r5
            int r5 = r4 << 6
            r7 = r5 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r7
            r7 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r7
            r3 = r3 | r5
            r5 = 458752(0x70000, float:6.42848E-40)
            int r4 = r4 << 3
            r4 = r4 & r5
            r30 = r3 | r4
            r13 = r60
            r14 = r61
            r15 = r64
            r16 = r49
            r17 = r50
            r18 = r51
            r19 = r52
            r20 = r63
            r21 = r62
            r22 = r48
            r23 = r65
            r24 = r1
            r25 = r53
            r26 = r0
            r27 = r2
            r28 = r6
            androidx.compose.material.TextFieldImplKt.a(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x03af
            androidx.compose.runtime.ComposerKt.X()
        L_0x03af:
            r14 = r0
            r15 = r1
            r16 = r2
            r8 = r48
            r9 = r49
            r10 = r50
            r12 = r52
            r13 = r53
            goto L_0x03d5
        L_0x03be:
            r6 = r12
            r11 = r14
            r6.B()
            r8 = r66
            r9 = r67
            r10 = r68
            r51 = r69
            r12 = r70
            r13 = r71
            r14 = r72
            r15 = r73
            r16 = r74
        L_0x03d5:
            androidx.compose.runtime.ScopeUpdateScope r7 = r6.x()
            if (r7 == 0) goto L_0x0402
            androidx.compose.material.TextFieldDefaults$OutlinedTextFieldDecorationBox$2 r6 = new androidx.compose.material.TextFieldDefaults$OutlinedTextFieldDecorationBox$2
            r0 = r6
            r1 = r59
            r2 = r60
            r3 = r61
            r4 = r62
            r5 = r63
            r57 = r6
            r6 = r64
            r58 = r7
            r7 = r65
            r11 = r51
            r17 = r76
            r18 = r77
            r19 = r78
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1 = r57
            r0 = r58
            r0.a(r1)
        L_0x0402:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.c(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void d(java.lang.String r58, kotlin.jvm.functions.Function2 r59, boolean r60, boolean r61, androidx.compose.ui.text.input.VisualTransformation r62, androidx.compose.foundation.interaction.InteractionSource r63, boolean r64, kotlin.jvm.functions.Function2 r65, kotlin.jvm.functions.Function2 r66, kotlin.jvm.functions.Function2 r67, kotlin.jvm.functions.Function2 r68, androidx.compose.material.TextFieldColors r69, androidx.compose.foundation.layout.PaddingValues r70, androidx.compose.runtime.Composer r71, int r72, int r73, int r74) {
        /*
            r57 = this;
            r0 = r57
            r15 = r72
            r13 = r73
            r14 = r74
            r11 = 1171040065(0x45cca741, float:6548.9067)
            r1 = r71
            androidx.compose.runtime.Composer r12 = r1.q(r11)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x001a
            r1 = r15 | 6
            r9 = r58
            goto L_0x002c
        L_0x001a:
            r1 = r15 & 6
            r9 = r58
            if (r1 != 0) goto L_0x002b
            boolean r1 = r12.W(r9)
            if (r1 == 0) goto L_0x0028
            r1 = 4
            goto L_0x0029
        L_0x0028:
            r1 = 2
        L_0x0029:
            r1 = r1 | r15
            goto L_0x002c
        L_0x002b:
            r1 = r15
        L_0x002c:
            r4 = r14 & 2
            if (r4 == 0) goto L_0x0035
            r1 = r1 | 48
            r10 = r59
            goto L_0x0047
        L_0x0035:
            r4 = r15 & 48
            r10 = r59
            if (r4 != 0) goto L_0x0047
            boolean r4 = r12.l(r10)
            if (r4 == 0) goto L_0x0044
            r4 = 32
            goto L_0x0046
        L_0x0044:
            r4 = 16
        L_0x0046:
            r1 = r1 | r4
        L_0x0047:
            r4 = r14 & 4
            if (r4 == 0) goto L_0x0050
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x004d:
            r4 = r60
            goto L_0x0063
        L_0x0050:
            r4 = r15 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x004d
            r4 = r60
            boolean r16 = r12.d(r4)
            if (r16 == 0) goto L_0x005f
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r1 = r1 | r16
        L_0x0063:
            r16 = r14 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x0070
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x006d:
            r2 = r61
            goto L_0x0083
        L_0x0070:
            r2 = r15 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x006d
            r2 = r61
            boolean r16 = r12.d(r2)
            if (r16 == 0) goto L_0x007f
            r16 = r18
            goto L_0x0081
        L_0x007f:
            r16 = r17
        L_0x0081:
            r1 = r1 | r16
        L_0x0083:
            r16 = r14 & 16
            if (r16 == 0) goto L_0x008c
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0089:
            r3 = r62
            goto L_0x009f
        L_0x008c:
            r3 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x0089
            r3 = r62
            boolean r19 = r12.W(r3)
            if (r19 == 0) goto L_0x009b
            r19 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x009b:
            r19 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r1 = r1 | r19
        L_0x009f:
            r19 = r14 & 32
            r20 = 196608(0x30000, float:2.75506E-40)
            if (r19 == 0) goto L_0x00aa
            r1 = r1 | r20
            r11 = r63
            goto L_0x00bd
        L_0x00aa:
            r19 = r15 & r20
            r11 = r63
            if (r19 != 0) goto L_0x00bd
            boolean r20 = r12.W(r11)
            if (r20 == 0) goto L_0x00b9
            r20 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bb
        L_0x00b9:
            r20 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r1 = r1 | r20
        L_0x00bd:
            r20 = r14 & 64
            r21 = 1572864(0x180000, float:2.204052E-39)
            if (r20 == 0) goto L_0x00c8
            r1 = r1 | r21
            r5 = r64
            goto L_0x00db
        L_0x00c8:
            r21 = r15 & r21
            r5 = r64
            if (r21 != 0) goto L_0x00db
            boolean r22 = r12.d(r5)
            if (r22 == 0) goto L_0x00d7
            r22 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r22 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r1 = r1 | r22
        L_0x00db:
            r6 = r14 & 128(0x80, float:1.794E-43)
            r23 = 12582912(0xc00000, float:1.7632415E-38)
            if (r6 == 0) goto L_0x00e6
            r1 = r1 | r23
            r7 = r65
            goto L_0x00f9
        L_0x00e6:
            r23 = r15 & r23
            r7 = r65
            if (r23 != 0) goto L_0x00f9
            boolean r24 = r12.l(r7)
            if (r24 == 0) goto L_0x00f5
            r24 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f7
        L_0x00f5:
            r24 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f7:
            r1 = r1 | r24
        L_0x00f9:
            r8 = r14 & 256(0x100, float:3.59E-43)
            r25 = 100663296(0x6000000, float:2.4074124E-35)
            if (r8 == 0) goto L_0x0104
            r1 = r1 | r25
            r2 = r66
            goto L_0x0117
        L_0x0104:
            r25 = r15 & r25
            r2 = r66
            if (r25 != 0) goto L_0x0117
            boolean r25 = r12.l(r2)
            if (r25 == 0) goto L_0x0113
            r25 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0115
        L_0x0113:
            r25 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0115:
            r1 = r1 | r25
        L_0x0117:
            r2 = r14 & 512(0x200, float:7.175E-43)
            r25 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0122
            r1 = r1 | r25
            r3 = r67
            goto L_0x0135
        L_0x0122:
            r25 = r15 & r25
            r3 = r67
            if (r25 != 0) goto L_0x0135
            boolean r25 = r12.l(r3)
            if (r25 == 0) goto L_0x0131
            r25 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0133
        L_0x0131:
            r25 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0133:
            r1 = r1 | r25
        L_0x0135:
            r3 = r14 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x013e
            r16 = r13 | 6
            r4 = r68
            goto L_0x0154
        L_0x013e:
            r25 = r13 & 6
            r4 = r68
            if (r25 != 0) goto L_0x0152
            boolean r25 = r12.l(r4)
            if (r25 == 0) goto L_0x014d
            r16 = 4
            goto L_0x014f
        L_0x014d:
            r16 = 2
        L_0x014f:
            r16 = r13 | r16
            goto L_0x0154
        L_0x0152:
            r16 = r13
        L_0x0154:
            r25 = r13 & 48
            if (r25 != 0) goto L_0x016e
            r4 = r14 & 2048(0x800, float:2.87E-42)
            if (r4 != 0) goto L_0x0167
            r4 = r69
            boolean r25 = r12.W(r4)
            if (r25 == 0) goto L_0x0169
            r21 = 32
            goto L_0x016b
        L_0x0167:
            r4 = r69
        L_0x0169:
            r21 = 16
        L_0x016b:
            r16 = r16 | r21
            goto L_0x0170
        L_0x016e:
            r4 = r69
        L_0x0170:
            r4 = r13 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x018c
            r4 = r14 & 4096(0x1000, float:5.74E-42)
            if (r4 != 0) goto L_0x0183
            r4 = r70
            boolean r21 = r12.W(r4)
            if (r21 == 0) goto L_0x0185
            r23 = 256(0x100, float:3.59E-43)
            goto L_0x0187
        L_0x0183:
            r4 = r70
        L_0x0185:
            r23 = 128(0x80, float:1.794E-43)
        L_0x0187:
            r16 = r16 | r23
        L_0x0189:
            r4 = r16
            goto L_0x018f
        L_0x018c:
            r4 = r70
            goto L_0x0189
        L_0x018f:
            r5 = r14 & 8192(0x2000, float:1.14794E-41)
            if (r5 == 0) goto L_0x0197
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0195:
            r5 = r4
            goto L_0x01a6
        L_0x0197:
            r5 = r13 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x0195
            boolean r5 = r12.W(r0)
            if (r5 == 0) goto L_0x01a3
            r17 = r18
        L_0x01a3:
            r4 = r4 | r17
            goto L_0x0195
        L_0x01a6:
            r4 = 306783379(0x12492493, float:6.34695E-28)
            r4 = r4 & r1
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r4 != r0) goto L_0x01b8
            r0 = r5 & 1171(0x493, float:1.641E-42)
            r4 = 1170(0x492, float:1.64E-42)
            if (r0 == r4) goto L_0x01b6
            goto L_0x01b8
        L_0x01b6:
            r0 = 0
            goto L_0x01b9
        L_0x01b8:
            r0 = 1
        L_0x01b9:
            r4 = r1 & 1
            boolean r0 = r12.E(r0, r4)
            if (r0 == 0) goto L_0x0329
            r12.p()
            r0 = r15 & 1
            if (r0 == 0) goto L_0x01f3
            boolean r0 = r12.J()
            if (r0 == 0) goto L_0x01cf
            goto L_0x01f3
        L_0x01cf:
            r12.B()
            r0 = r14 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x01d8
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
        L_0x01d8:
            r0 = r14 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x01de
            r5 = r5 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x01de:
            r48 = r64
            r50 = r66
            r51 = r67
            r52 = r68
            r19 = r69
            r20 = r70
            r54 = r1
            r49 = r7
            r71 = r12
            r15 = r14
            goto L_0x02b5
        L_0x01f3:
            if (r20 == 0) goto L_0x01f9
            r0 = 0
            r48 = r0
            goto L_0x01fb
        L_0x01f9:
            r48 = r64
        L_0x01fb:
            r0 = 0
            if (r6 == 0) goto L_0x0201
            r49 = r0
            goto L_0x0203
        L_0x0201:
            r49 = r7
        L_0x0203:
            if (r8 == 0) goto L_0x0208
            r50 = r0
            goto L_0x020a
        L_0x0208:
            r50 = r66
        L_0x020a:
            if (r2 == 0) goto L_0x020f
            r51 = r0
            goto L_0x0211
        L_0x020f:
            r51 = r67
        L_0x0211:
            if (r3 == 0) goto L_0x0216
            r52 = r0
            goto L_0x0218
        L_0x0216:
            r52 = r68
        L_0x0218:
            r0 = r14 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0267
            int r0 = r5 >> 6
            r46 = r0 & 112(0x70, float:1.57E-43)
            r47 = 2097151(0x1fffff, float:2.938734E-39)
            r2 = 0
            r0 = r1
            r1 = r2
            r3 = 0
            r6 = 0
            r53 = r5
            r5 = r6
            r7 = 0
            r16 = 0
            r9 = r16
            r71 = r12
            r11 = r16
            r13 = r16
            r15 = r16
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r39 = 0
            r41 = 0
            r44 = 0
            r45 = 0
            r54 = r0
            r0 = r57
            r43 = r71
            androidx.compose.material.TextFieldColors r0 = r0.o(r1, r3, r5, r7, r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r44, r45, r46, r47)
            r5 = r53 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x026f
        L_0x0267:
            r54 = r1
            r53 = r5
            r71 = r12
            r0 = r69
        L_0x026f:
            r15 = r74
            r1 = r15 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x02b1
            if (r49 != 0) goto L_0x0291
            r1 = 15
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r64 = r57
            r65 = r3
            r66 = r4
            r67 = r6
            r68 = r7
            r69 = r1
            r70 = r2
            androidx.compose.foundation.layout.PaddingValues r1 = s(r64, r65, r66, r67, r68, r69, r70)
            goto L_0x02aa
        L_0x0291:
            r1 = 15
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r64 = r57
            r65 = r3
            r66 = r4
            r67 = r6
            r68 = r7
            r69 = r1
            r70 = r2
            androidx.compose.foundation.layout.PaddingValues r1 = q(r64, r65, r66, r67, r68, r69, r70)
        L_0x02aa:
            r5 = r5 & -897(0xfffffffffffffc7f, float:NaN)
            r19 = r0
            r20 = r1
            goto L_0x02b5
        L_0x02b1:
            r20 = r70
            r19 = r0
        L_0x02b5:
            r71.U()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x02c9
            java.lang.String r0 = "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:708)"
            r2 = r54
            r1 = 1171040065(0x45cca741, float:6548.9067)
            androidx.compose.runtime.ComposerKt.Y(r1, r2, r5, r0)
            goto L_0x02cb
        L_0x02c9:
            r2 = r54
        L_0x02cb:
            int r0 = r5 >> 9
            r0 = r0 & 14
            r14 = r57
            r13 = r71
            androidx.compose.ui.graphics.Shape r12 = r14.i(r13, r0)
            r0 = 2147483646(0x7ffffffe, float:NaN)
            r16 = r2 & r0
            r0 = r5 & 14
            int r1 = r5 << 3
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r2
            r17 = r0 | r1
            r18 = 0
            r0 = r57
            r1 = r58
            r2 = r59
            r3 = r60
            r4 = r61
            r5 = r62
            r6 = r63
            r7 = r48
            r8 = r49
            r9 = r50
            r10 = r51
            r11 = r52
            r21 = r13
            r13 = r19
            r14 = r20
            r15 = r21
            r0.e(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x031a
            androidx.compose.runtime.ComposerKt.X()
        L_0x031a:
            r13 = r19
            r14 = r20
            r8 = r48
            r9 = r49
            r10 = r50
            r11 = r51
            r12 = r52
            goto L_0x033b
        L_0x0329:
            r21 = r12
            r21.B()
            r8 = r64
            r10 = r66
            r11 = r67
            r12 = r68
            r13 = r69
            r14 = r70
            r9 = r7
        L_0x033b:
            androidx.compose.runtime.ScopeUpdateScope r15 = r21.x()
            if (r15 == 0) goto L_0x0366
            androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$2 r7 = new androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$2
            r0 = r7
            r1 = r57
            r2 = r58
            r3 = r59
            r4 = r60
            r5 = r61
            r6 = r62
            r55 = r7
            r7 = r63
            r56 = r15
            r15 = r72
            r16 = r73
            r17 = r74
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = r55
            r0 = r56
            r0.a(r1)
        L_0x0366:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.d(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.material.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:224:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(java.lang.String r61, kotlin.jvm.functions.Function2 r62, boolean r63, boolean r64, androidx.compose.ui.text.input.VisualTransformation r65, androidx.compose.foundation.interaction.InteractionSource r66, boolean r67, kotlin.jvm.functions.Function2 r68, kotlin.jvm.functions.Function2 r69, kotlin.jvm.functions.Function2 r70, kotlin.jvm.functions.Function2 r71, androidx.compose.ui.graphics.Shape r72, androidx.compose.material.TextFieldColors r73, androidx.compose.foundation.layout.PaddingValues r74, androidx.compose.runtime.Composer r75, int r76, int r77, int r78) {
        /*
            r60 = this;
            r0 = r60
            r15 = r76
            r13 = r77
            r14 = r78
            r11 = -1391531252(0xffffffffad0eeb0c, float:-8.123956E-12)
            r1 = r75
            androidx.compose.runtime.Composer r12 = r1.q(r11)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x001a
            r1 = r15 | 6
            r9 = r61
            goto L_0x002c
        L_0x001a:
            r1 = r15 & 6
            r9 = r61
            if (r1 != 0) goto L_0x002b
            boolean r1 = r12.W(r9)
            if (r1 == 0) goto L_0x0028
            r1 = 4
            goto L_0x0029
        L_0x0028:
            r1 = 2
        L_0x0029:
            r1 = r1 | r15
            goto L_0x002c
        L_0x002b:
            r1 = r15
        L_0x002c:
            r4 = r14 & 2
            if (r4 == 0) goto L_0x0035
            r1 = r1 | 48
            r10 = r62
            goto L_0x0047
        L_0x0035:
            r4 = r15 & 48
            r10 = r62
            if (r4 != 0) goto L_0x0047
            boolean r4 = r12.l(r10)
            if (r4 == 0) goto L_0x0044
            r4 = 32
            goto L_0x0046
        L_0x0044:
            r4 = 16
        L_0x0046:
            r1 = r1 | r4
        L_0x0047:
            r4 = r14 & 4
            if (r4 == 0) goto L_0x0050
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x004d:
            r4 = r63
            goto L_0x0063
        L_0x0050:
            r4 = r15 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x004d
            r4 = r63
            boolean r16 = r12.d(r4)
            if (r16 == 0) goto L_0x005f
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r1 = r1 | r16
        L_0x0063:
            r16 = r14 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x0070
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x006d:
            r2 = r64
            goto L_0x0083
        L_0x0070:
            r2 = r15 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x006d
            r2 = r64
            boolean r16 = r12.d(r2)
            if (r16 == 0) goto L_0x007f
            r16 = r18
            goto L_0x0081
        L_0x007f:
            r16 = r17
        L_0x0081:
            r1 = r1 | r16
        L_0x0083:
            r16 = r14 & 16
            r19 = 16384(0x4000, float:2.2959E-41)
            r20 = 8192(0x2000, float:1.14794E-41)
            if (r16 == 0) goto L_0x0090
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x008d:
            r3 = r65
            goto L_0x00a3
        L_0x0090:
            r3 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x008d
            r3 = r65
            boolean r21 = r12.W(r3)
            if (r21 == 0) goto L_0x009f
            r21 = r19
            goto L_0x00a1
        L_0x009f:
            r21 = r20
        L_0x00a1:
            r1 = r1 | r21
        L_0x00a3:
            r21 = r14 & 32
            r48 = 196608(0x30000, float:2.75506E-40)
            if (r21 == 0) goto L_0x00ae
            r1 = r1 | r48
            r11 = r66
            goto L_0x00c1
        L_0x00ae:
            r21 = r15 & r48
            r11 = r66
            if (r21 != 0) goto L_0x00c1
            boolean r22 = r12.W(r11)
            if (r22 == 0) goto L_0x00bd
            r22 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bf
        L_0x00bd:
            r22 = 65536(0x10000, float:9.18355E-41)
        L_0x00bf:
            r1 = r1 | r22
        L_0x00c1:
            r22 = r14 & 64
            r23 = 1572864(0x180000, float:2.204052E-39)
            if (r22 == 0) goto L_0x00cc
            r1 = r1 | r23
            r5 = r67
            goto L_0x00df
        L_0x00cc:
            r23 = r15 & r23
            r5 = r67
            if (r23 != 0) goto L_0x00df
            boolean r24 = r12.d(r5)
            if (r24 == 0) goto L_0x00db
            r24 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dd
        L_0x00db:
            r24 = 524288(0x80000, float:7.34684E-40)
        L_0x00dd:
            r1 = r1 | r24
        L_0x00df:
            r6 = r14 & 128(0x80, float:1.794E-43)
            r25 = 12582912(0xc00000, float:1.7632415E-38)
            if (r6 == 0) goto L_0x00ea
            r1 = r1 | r25
            r7 = r68
            goto L_0x00fd
        L_0x00ea:
            r25 = r15 & r25
            r7 = r68
            if (r25 != 0) goto L_0x00fd
            boolean r26 = r12.l(r7)
            if (r26 == 0) goto L_0x00f9
            r26 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fb
        L_0x00f9:
            r26 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fb:
            r1 = r1 | r26
        L_0x00fd:
            r8 = r14 & 256(0x100, float:3.59E-43)
            r27 = 100663296(0x6000000, float:2.4074124E-35)
            if (r8 == 0) goto L_0x0108
            r1 = r1 | r27
            r2 = r69
            goto L_0x011b
        L_0x0108:
            r27 = r15 & r27
            r2 = r69
            if (r27 != 0) goto L_0x011b
            boolean r27 = r12.l(r2)
            if (r27 == 0) goto L_0x0117
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0119
        L_0x0117:
            r27 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0119:
            r1 = r1 | r27
        L_0x011b:
            r2 = r14 & 512(0x200, float:7.175E-43)
            r27 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0126
            r1 = r1 | r27
            r3 = r70
            goto L_0x0139
        L_0x0126:
            r27 = r15 & r27
            r3 = r70
            if (r27 != 0) goto L_0x0139
            boolean r27 = r12.l(r3)
            if (r27 == 0) goto L_0x0135
            r27 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0137
        L_0x0135:
            r27 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0137:
            r1 = r1 | r27
        L_0x0139:
            r3 = r14 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0142
            r16 = r13 | 6
            r4 = r71
            goto L_0x0158
        L_0x0142:
            r27 = r13 & 6
            r4 = r71
            if (r27 != 0) goto L_0x0156
            boolean r27 = r12.l(r4)
            if (r27 == 0) goto L_0x0151
            r16 = 4
            goto L_0x0153
        L_0x0151:
            r16 = 2
        L_0x0153:
            r16 = r13 | r16
            goto L_0x0158
        L_0x0156:
            r16 = r13
        L_0x0158:
            r27 = r13 & 48
            if (r27 != 0) goto L_0x0172
            r4 = r14 & 2048(0x800, float:2.87E-42)
            if (r4 != 0) goto L_0x016b
            r4 = r72
            boolean r27 = r12.W(r4)
            if (r27 == 0) goto L_0x016d
            r23 = 32
            goto L_0x016f
        L_0x016b:
            r4 = r72
        L_0x016d:
            r23 = 16
        L_0x016f:
            r16 = r16 | r23
            goto L_0x0174
        L_0x0172:
            r4 = r72
        L_0x0174:
            r4 = r13 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x018e
            r4 = r14 & 4096(0x1000, float:5.74E-42)
            if (r4 != 0) goto L_0x0187
            r4 = r73
            boolean r23 = r12.W(r4)
            if (r23 == 0) goto L_0x0189
            r25 = 256(0x100, float:3.59E-43)
            goto L_0x018b
        L_0x0187:
            r4 = r73
        L_0x0189:
            r25 = 128(0x80, float:1.794E-43)
        L_0x018b:
            r16 = r16 | r25
            goto L_0x0190
        L_0x018e:
            r4 = r73
        L_0x0190:
            r4 = r13 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x01aa
            r4 = r14 & 8192(0x2000, float:1.14794E-41)
            if (r4 != 0) goto L_0x01a3
            r4 = r74
            boolean r23 = r12.W(r4)
            if (r23 == 0) goto L_0x01a5
            r17 = r18
            goto L_0x01a5
        L_0x01a3:
            r4 = r74
        L_0x01a5:
            r16 = r16 | r17
        L_0x01a7:
            r4 = r16
            goto L_0x01ad
        L_0x01aa:
            r4 = r74
            goto L_0x01a7
        L_0x01ad:
            r5 = r14 & 16384(0x4000, float:2.2959E-41)
            if (r5 == 0) goto L_0x01b4
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x01c3
        L_0x01b4:
            r5 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x01c3
            boolean r5 = r12.W(r0)
            if (r5 == 0) goto L_0x01bf
            goto L_0x01c1
        L_0x01bf:
            r19 = r20
        L_0x01c1:
            r4 = r4 | r19
        L_0x01c3:
            r5 = 306783379(0x12492493, float:6.34695E-28)
            r5 = r5 & r1
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            if (r5 != r7) goto L_0x01d5
            r5 = r4 & 9363(0x2493, float:1.312E-41)
            r7 = 9362(0x2492, float:1.3119E-41)
            if (r5 == r7) goto L_0x01d3
            goto L_0x01d5
        L_0x01d3:
            r5 = 0
            goto L_0x01d6
        L_0x01d5:
            r5 = 1
        L_0x01d6:
            r7 = r1 & 1
            boolean r5 = r12.E(r5, r7)
            if (r5 == 0) goto L_0x0383
            r12.p()
            r5 = r15 & 1
            if (r5 == 0) goto L_0x0218
            boolean r5 = r12.J()
            if (r5 == 0) goto L_0x01ec
            goto L_0x0218
        L_0x01ec:
            r12.B()
            r2 = r14 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x01f5
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x01f5:
            r2 = r14 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x01fb
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x01fb:
            r2 = r14 & 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x0201
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0201:
            r49 = r67
            r50 = r68
            r51 = r69
            r52 = r70
            r53 = r71
            r54 = r72
            r0 = r73
            r55 = r1
            r57 = r12
            r11 = r14
        L_0x0214:
            r1 = r74
            goto L_0x02e7
        L_0x0218:
            if (r22 == 0) goto L_0x021e
            r5 = 0
            r49 = r5
            goto L_0x0220
        L_0x021e:
            r49 = r67
        L_0x0220:
            r5 = 0
            if (r6 == 0) goto L_0x0226
            r50 = r5
            goto L_0x0228
        L_0x0226:
            r50 = r68
        L_0x0228:
            if (r8 == 0) goto L_0x022d
            r51 = r5
            goto L_0x022f
        L_0x022d:
            r51 = r69
        L_0x022f:
            if (r2 == 0) goto L_0x0234
            r52 = r5
            goto L_0x0236
        L_0x0234:
            r52 = r70
        L_0x0236:
            if (r3 == 0) goto L_0x023b
            r53 = r5
            goto L_0x023d
        L_0x023b:
            r53 = r71
        L_0x023d:
            r2 = r14 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x024f
            int r2 = r4 >> 12
            r2 = r2 & 14
            androidx.compose.ui.graphics.Shape r2 = r0.i(r12, r2)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
            r54 = r2
        L_0x024d:
            r7 = r4
            goto L_0x0252
        L_0x024f:
            r54 = r72
            goto L_0x024d
        L_0x0252:
            r2 = r14 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x02a3
            int r2 = r7 >> 9
            r46 = r2 & 112(0x70, float:1.57E-43)
            r47 = 2097151(0x1fffff, float:2.938734E-39)
            r2 = 0
            r8 = r1
            r1 = r2
            r3 = 0
            r5 = 0
            r16 = 0
            r56 = r7
            r55 = r8
            r7 = r16
            r9 = r16
            r57 = r12
            r11 = r16
            r13 = r16
            r15 = r16
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r39 = 0
            r41 = 0
            r44 = 0
            r45 = 0
            r0 = r60
            r43 = r57
            androidx.compose.material.TextFieldColors r0 = r0.o(r1, r3, r5, r7, r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r44, r45, r46, r47)
            r4 = r56
            r1 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            r4 = r1
            goto L_0x02aa
        L_0x02a3:
            r55 = r1
            r4 = r7
            r57 = r12
            r0 = r73
        L_0x02aa:
            r11 = r78
            r1 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0214
            if (r50 != 0) goto L_0x02cc
            r1 = 15
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r67 = r60
            r68 = r3
            r69 = r5
            r70 = r6
            r71 = r7
            r72 = r1
            r73 = r2
            androidx.compose.foundation.layout.PaddingValues r1 = s(r67, r68, r69, r70, r71, r72, r73)
            goto L_0x02e5
        L_0x02cc:
            r1 = 15
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r67 = r60
            r68 = r3
            r69 = r5
            r70 = r6
            r71 = r7
            r72 = r1
            r73 = r2
            androidx.compose.foundation.layout.PaddingValues r1 = q(r67, r68, r69, r70, r71, r72, r73)
        L_0x02e5:
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x02e7:
            r57.U()
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x02fb
            java.lang.String r2 = "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:565)"
            r5 = r55
            r3 = -1391531252(0xffffffffad0eeb0c, float:-8.123956E-12)
            androidx.compose.runtime.ComposerKt.Y(r3, r5, r4, r2)
            goto L_0x02fd
        L_0x02fb:
            r5 = r55
        L_0x02fd:
            androidx.compose.material.TextFieldType r12 = androidx.compose.material.TextFieldType.Filled
            int r2 = r5 << 3
            r3 = r2 & 112(0x70, float:1.57E-43)
            r3 = r3 | 6
            r2 = r2 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            int r3 = r5 >> 3
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            int r3 = r5 >> 9
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r3
            r2 = r2 | r6
            r6 = 458752(0x70000, float:6.42848E-40)
            r6 = r6 & r3
            r2 = r2 | r6
            r6 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r6
            r2 = r2 | r3
            int r3 = r4 << 21
            r6 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r6
            r2 = r2 | r3
            int r3 = r5 << 15
            r6 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r6
            r2 = r2 | r3
            int r3 = r5 << 21
            r6 = 1879048192(0x70000000, float:1.58456325E29)
            r3 = r3 & r6
            r29 = r2 | r3
            int r2 = r5 >> 18
            r2 = r2 & 14
            r2 = r2 | r48
            int r3 = r5 >> 12
            r3 = r3 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            int r3 = r4 >> 3
            r3 = r3 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            int r3 = r4 << 6
            r4 = r3 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r4
            r4 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r4
            r30 = r2 | r3
            r27 = 0
            r13 = r61
            r14 = r62
            r15 = r65
            r16 = r50
            r17 = r51
            r18 = r52
            r19 = r53
            r20 = r64
            r21 = r63
            r22 = r49
            r23 = r66
            r24 = r1
            r25 = r54
            r26 = r0
            r28 = r57
            androidx.compose.material.TextFieldImplKt.a(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0376
            androidx.compose.runtime.ComposerKt.X()
        L_0x0376:
            r14 = r0
            r15 = r1
            r8 = r49
            r9 = r50
            r10 = r51
            r12 = r53
            r13 = r54
            goto L_0x0399
        L_0x0383:
            r57 = r12
            r11 = r14
            r57.B()
            r8 = r67
            r9 = r68
            r10 = r69
            r52 = r70
            r12 = r71
            r13 = r72
            r14 = r73
            r15 = r74
        L_0x0399:
            androidx.compose.runtime.ScopeUpdateScope r7 = r57.x()
            if (r7 == 0) goto L_0x03c6
            androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1 r6 = new androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
            r0 = r6
            r1 = r60
            r2 = r61
            r3 = r62
            r4 = r63
            r5 = r64
            r58 = r6
            r6 = r65
            r59 = r7
            r7 = r66
            r11 = r52
            r16 = r76
            r17 = r77
            r18 = r78
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = r58
            r0 = r59
            r0.a(r1)
        L_0x03c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.e(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public final float f() {
        return f8731b;
    }

    public final float g() {
        return f8732c;
    }

    public final Shape h(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1899109048, i2, -1, "androidx.compose.material.TextFieldDefaults.<get-OutlinedTextFieldShape> (TextFieldDefaults.kt:227)");
        }
        CornerBasedShape c2 = MaterialTheme.f7937a.b(composer, 6).c();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return c2;
    }

    public final Shape i(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1117199624, i2, -1, "androidx.compose.material.TextFieldDefaults.<get-TextFieldShape> (TextFieldDefaults.kt:220)");
        }
        CornerBasedShape d2 = CornerBasedShape.d(MaterialTheme.f7937a.b(composer, 6).c(), (CornerSize) null, (CornerSize) null, CornerSizeKt.d(), CornerSizeKt.d(), 3, (Object) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return d2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: androidx.compose.material.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: androidx.compose.material.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.ui.Modifier j(androidx.compose.ui.Modifier r10, boolean r11, boolean r12, androidx.compose.foundation.interaction.InteractionSource r13, androidx.compose.material.TextFieldColors r14, float r15, float r16) {
        /*
            r9 = this;
            boolean r0 = androidx.compose.ui.platform.InspectableValueKt.b()
            if (r0 == 0) goto L_0x0014
            androidx.compose.material.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1 r0 = new androidx.compose.material.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1
            r1 = r0
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x0018
        L_0x0014:
            kotlin.jvm.functions.Function1 r0 = androidx.compose.ui.platform.InspectableValueKt.a()
        L_0x0018:
            androidx.compose.material.TextFieldDefaults$indicatorLine$2 r8 = new androidx.compose.material.TextFieldDefaults$indicatorLine$2
            r1 = r8
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r1 = r10
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.b(r10, r0, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.j(androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material.TextFieldColors, float, float):androidx.compose.ui.Modifier");
    }

    public final TextFieldColors l(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, Composer composer, int i2, int i3, int i4, int i5) {
        long j23;
        long j24;
        long j25;
        long j26;
        int i6;
        long j27;
        long j28;
        long j29;
        long j30;
        long j31;
        long j32;
        long j33;
        long j34;
        int i7;
        long j35;
        long j36;
        long j37;
        long j38;
        long j39;
        long j40;
        int i8;
        long j41;
        long j42;
        Composer composer2 = composer;
        int i9 = i5;
        long l2 = (i9 & 1) != 0 ? Color.l(((Color) composer2.C(ContentColorKt.a())).v(), ((Number) composer2.C(ContentAlphaKt.a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j2;
        long l3 = (i9 & 2) != 0 ? Color.l(l2, ContentAlpha.f7561a.b(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j3;
        long e2 = (i9 & 4) != 0 ? Color.f15975b.e() : j4;
        long j43 = (i9 & 8) != 0 ? MaterialTheme.f7937a.a(composer2, 6).j() : j5;
        long d2 = (i9 & 16) != 0 ? MaterialTheme.f7937a.a(composer2, 6).d() : j6;
        long l4 = (i9 & 32) != 0 ? Color.l(MaterialTheme.f7937a.a(composer2, 6).j(), ContentAlpha.f7561a.c(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j7;
        if ((i9 & 64) != 0) {
            j23 = e2;
            j24 = Color.l(MaterialTheme.f7937a.a(composer2, 6).i(), ContentAlpha.f7561a.b(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j23 = e2;
            j24 = j8;
        }
        long l5 = (i9 & 128) != 0 ? Color.l(j24, ContentAlpha.f7561a.b(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j9;
        if ((i9 & 256) != 0) {
            j26 = l5;
            i6 = 6;
            j25 = MaterialTheme.f7937a.a(composer2, 6).d();
        } else {
            j26 = l5;
            i6 = 6;
            j25 = j10;
        }
        long l6 = (i9 & 512) != 0 ? Color.l(MaterialTheme.f7937a.a(composer2, i6).i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j11;
        if ((i9 & 1024) != 0) {
            j27 = j24;
            j28 = Color.l(l6, ContentAlpha.f7561a.b(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j27 = j24;
            j28 = j12;
        }
        long j44 = (i9 & 2048) != 0 ? l6 : j13;
        if ((i9 & 4096) != 0) {
            j29 = j28;
            j30 = Color.l(MaterialTheme.f7937a.a(composer2, 6).i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j29 = j28;
            j30 = j14;
        }
        if ((i9 & 8192) != 0) {
            j31 = l6;
            j32 = Color.l(j30, ContentAlpha.f7561a.b(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j31 = l6;
            j32 = j15;
        }
        if ((i9 & 16384) != 0) {
            j33 = j32;
            i7 = 6;
            j34 = MaterialTheme.f7937a.a(composer2, 6).d();
        } else {
            j33 = j32;
            i7 = 6;
            j34 = j16;
        }
        long l7 = (32768 & i9) != 0 ? Color.l(MaterialTheme.f7937a.a(composer2, i7).j(), ContentAlpha.f7561a.c(composer2, i7), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j17;
        if ((65536 & i9) != 0) {
            j35 = l7;
            j36 = Color.l(MaterialTheme.f7937a.a(composer2, 6).i(), ContentAlpha.f7561a.d(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j35 = l7;
            j36 = j18;
        }
        if ((131072 & i9) != 0) {
            j37 = j30;
            j38 = Color.l(j36, ContentAlpha.f7561a.b(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j37 = j30;
            j38 = j19;
        }
        if ((262144 & i9) != 0) {
            j40 = j38;
            i8 = 6;
            j39 = MaterialTheme.f7937a.a(composer2, 6).d();
        } else {
            j40 = j38;
            i8 = 6;
            j39 = j20;
        }
        long l8 = (524288 & i9) != 0 ? Color.l(MaterialTheme.f7937a.a(composer2, i8).i(), ContentAlpha.f7561a.d(composer2, i8), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j21;
        long l9 = (i9 & 1048576) != 0 ? Color.l(l8, ContentAlpha.f7561a.b(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j22;
        if (ComposerKt.P()) {
            j41 = l9;
            j42 = l8;
            ComposerKt.Y(1762667317, i2, i3, "androidx.compose.material.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:462)");
        } else {
            j41 = l9;
            j42 = l8;
        }
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(l2, l3, j43, d2, l4, j27, j25, j26, j31, j29, j44, j37, j33, j34, j23, j35, j36, j40, j39, j42, j41, (DefaultConstructorMarker) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return defaultTextFieldColors;
    }

    public final PaddingValues m(float f2, float f3, float f4, float f5) {
        return PaddingKt.d(f2, f3, f4, f5);
    }

    public final TextFieldColors o(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, Composer composer, int i2, int i3, int i4, int i5) {
        long j23;
        long j24;
        long j25;
        long j26;
        int i6;
        long j27;
        long j28;
        long j29;
        long j30;
        long j31;
        long j32;
        long j33;
        long j34;
        int i7;
        long j35;
        long j36;
        long j37;
        long j38;
        long j39;
        long j40;
        int i8;
        long j41;
        long j42;
        Composer composer2 = composer;
        int i9 = i5;
        long l2 = (i9 & 1) != 0 ? Color.l(((Color) composer2.C(ContentColorKt.a())).v(), ((Number) composer2.C(ContentAlphaKt.a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j2;
        long l3 = (i9 & 2) != 0 ? Color.l(l2, ContentAlpha.f7561a.b(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j3;
        long l4 = (i9 & 4) != 0 ? Color.l(MaterialTheme.f7937a.a(composer2, 6).i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j4;
        long j43 = (i9 & 8) != 0 ? MaterialTheme.f7937a.a(composer2, 6).j() : j5;
        long d2 = (i9 & 16) != 0 ? MaterialTheme.f7937a.a(composer2, 6).d() : j6;
        long l5 = (i9 & 32) != 0 ? Color.l(MaterialTheme.f7937a.a(composer2, 6).j(), ContentAlpha.f7561a.c(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j7;
        long l6 = (i9 & 64) != 0 ? Color.l(MaterialTheme.f7937a.a(composer2, 6).i(), 0.42f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j8;
        if ((i9 & 128) != 0) {
            j23 = l4;
            j24 = Color.l(l6, ContentAlpha.f7561a.b(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j23 = l4;
            j24 = j9;
        }
        if ((i9 & 256) != 0) {
            j26 = j24;
            i6 = 6;
            j25 = MaterialTheme.f7937a.a(composer2, 6).d();
        } else {
            j26 = j24;
            i6 = 6;
            j25 = j10;
        }
        long l7 = (i9 & 512) != 0 ? Color.l(MaterialTheme.f7937a.a(composer2, i6).i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j11;
        if ((i9 & 1024) != 0) {
            j27 = l6;
            j28 = Color.l(l7, ContentAlpha.f7561a.b(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j27 = l6;
            j28 = j12;
        }
        long j44 = (i9 & 2048) != 0 ? l7 : j13;
        if ((i9 & 4096) != 0) {
            j29 = j28;
            j30 = Color.l(MaterialTheme.f7937a.a(composer2, 6).i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j29 = j28;
            j30 = j14;
        }
        if ((i9 & 8192) != 0) {
            j31 = l7;
            j32 = Color.l(j30, ContentAlpha.f7561a.b(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j31 = l7;
            j32 = j15;
        }
        if ((i9 & 16384) != 0) {
            j33 = j32;
            i7 = 6;
            j34 = MaterialTheme.f7937a.a(composer2, 6).d();
        } else {
            j33 = j32;
            i7 = 6;
            j34 = j16;
        }
        long l8 = (32768 & i9) != 0 ? Color.l(MaterialTheme.f7937a.a(composer2, i7).j(), ContentAlpha.f7561a.c(composer2, i7), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j17;
        if ((65536 & i9) != 0) {
            j35 = l8;
            j36 = Color.l(MaterialTheme.f7937a.a(composer2, 6).i(), ContentAlpha.f7561a.d(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j35 = l8;
            j36 = j18;
        }
        if ((131072 & i9) != 0) {
            j37 = j30;
            j38 = Color.l(j36, ContentAlpha.f7561a.b(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j37 = j30;
            j38 = j19;
        }
        if ((262144 & i9) != 0) {
            j40 = j38;
            i8 = 6;
            j39 = MaterialTheme.f7937a.a(composer2, 6).d();
        } else {
            j40 = j38;
            i8 = 6;
            j39 = j20;
        }
        long l9 = (524288 & i9) != 0 ? Color.l(MaterialTheme.f7937a.a(composer2, i8).i(), ContentAlpha.f7561a.d(composer2, i8), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j21;
        long l10 = (i9 & 1048576) != 0 ? Color.l(l9, ContentAlpha.f7561a.b(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j22;
        if (ComposerKt.P()) {
            j41 = l10;
            j42 = l9;
            ComposerKt.Y(231892599, i2, i3, "androidx.compose.material.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:408)");
        } else {
            j41 = l10;
            j42 = l9;
        }
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(l2, l3, j43, d2, l5, j27, j25, j26, j31, j29, j44, j37, j33, j34, j23, j35, j36, j40, j39, j42, j41, (DefaultConstructorMarker) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return defaultTextFieldColors;
    }

    public final PaddingValues p(float f2, float f3, float f4, float f5) {
        return PaddingKt.d(f2, f4, f3, f5);
    }

    public final PaddingValues r(float f2, float f3, float f4, float f5) {
        return PaddingKt.d(f2, f3, f4, f5);
    }
}

package androidx.compose.material;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;

@Metadata
public final class AppBarKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f7142a = Dp.m((float) 56);

    /* renamed from: b  reason: collision with root package name */
    public static final float f7143b;

    /* renamed from: c  reason: collision with root package name */
    public static final Modifier f7144c;

    /* renamed from: d  reason: collision with root package name */
    public static final Modifier f7145d;

    /* renamed from: e  reason: collision with root package name */
    public static final float f7146e = Dp.m((float) 8);

    /* renamed from: f  reason: collision with root package name */
    public static final float f7147f;

    /* renamed from: g  reason: collision with root package name */
    public static final WindowInsets f7148g = WindowInsetsKt.d(Dp.m((float) 0), 0.0f, 0.0f, 0.0f, 14, (Object) null);

    static {
        float f2 = (float) 4;
        float m2 = Dp.m(f2);
        f7143b = m2;
        Modifier.Companion companion = Modifier.f15489d;
        f7144c = SizeKt.y(companion, Dp.m(Dp.m((float) 16) - m2));
        f7145d = SizeKt.y(SizeKt.d(companion, 0.0f, 1, (Object) null), Dp.m(Dp.m((float) 72) - m2));
        f7147f = Dp.m(f2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0157  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(long r25, long r27, float r29, androidx.compose.foundation.layout.PaddingValues r30, androidx.compose.ui.graphics.Shape r31, androidx.compose.foundation.layout.WindowInsets r32, androidx.compose.ui.Modifier r33, kotlin.jvm.functions.Function3 r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            r6 = r30
            r8 = r32
            r10 = r34
            r11 = r36
            r12 = r37
            r0 = -712505634(0xffffffffd58806de, float:-1.86953845E13)
            r1 = r35
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r12 & 1
            if (r2 == 0) goto L_0x001d
            r2 = r11 | 6
            r4 = r2
            r2 = r25
            goto L_0x0031
        L_0x001d:
            r2 = r11 & 6
            if (r2 != 0) goto L_0x002e
            r2 = r25
            boolean r4 = r1.j(r2)
            if (r4 == 0) goto L_0x002b
            r4 = 4
            goto L_0x002c
        L_0x002b:
            r4 = 2
        L_0x002c:
            r4 = r4 | r11
            goto L_0x0031
        L_0x002e:
            r2 = r25
            r4 = r11
        L_0x0031:
            r5 = r12 & 2
            if (r5 == 0) goto L_0x003a
            r4 = r4 | 48
            r14 = r27
            goto L_0x004c
        L_0x003a:
            r5 = r11 & 48
            r14 = r27
            if (r5 != 0) goto L_0x004c
            boolean r5 = r1.j(r14)
            if (r5 == 0) goto L_0x0049
            r5 = 32
            goto L_0x004b
        L_0x0049:
            r5 = 16
        L_0x004b:
            r4 = r4 | r5
        L_0x004c:
            r5 = r12 & 4
            if (r5 == 0) goto L_0x0055
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x0052:
            r5 = r29
            goto L_0x0067
        L_0x0055:
            r5 = r11 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0052
            r5 = r29
            boolean r7 = r1.h(r5)
            if (r7 == 0) goto L_0x0064
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r4 = r4 | r7
        L_0x0067:
            r7 = r12 & 8
            if (r7 == 0) goto L_0x006e
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x007e
        L_0x006e:
            r7 = r11 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x007e
            boolean r7 = r1.W(r6)
            if (r7 == 0) goto L_0x007b
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r4 = r4 | r7
        L_0x007e:
            r7 = r12 & 16
            if (r7 == 0) goto L_0x0087
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0084:
            r7 = r31
            goto L_0x0099
        L_0x0087:
            r7 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L_0x0084
            r7 = r31
            boolean r9 = r1.W(r7)
            if (r9 == 0) goto L_0x0096
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0096:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r4 = r4 | r9
        L_0x0099:
            r9 = r12 & 32
            r13 = 196608(0x30000, float:2.75506E-40)
            if (r9 == 0) goto L_0x00a1
            r4 = r4 | r13
            goto L_0x00b1
        L_0x00a1:
            r9 = r11 & r13
            if (r9 != 0) goto L_0x00b1
            boolean r9 = r1.W(r8)
            if (r9 == 0) goto L_0x00ae
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b0
        L_0x00ae:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x00b0:
            r4 = r4 | r9
        L_0x00b1:
            r9 = r12 & 64
            r13 = 1572864(0x180000, float:2.204052E-39)
            if (r9 == 0) goto L_0x00bb
            r4 = r4 | r13
            r13 = r33
            goto L_0x00ce
        L_0x00bb:
            r16 = r11 & r13
            r13 = r33
            if (r16 != 0) goto L_0x00ce
            boolean r16 = r1.W(r13)
            if (r16 == 0) goto L_0x00ca
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cc
        L_0x00ca:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00cc:
            r4 = r4 | r16
        L_0x00ce:
            r0 = r12 & 128(0x80, float:1.794E-43)
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00d7
            r4 = r4 | r17
            goto L_0x00e7
        L_0x00d7:
            r0 = r11 & r17
            if (r0 != 0) goto L_0x00e7
            boolean r0 = r1.l(r10)
            if (r0 == 0) goto L_0x00e4
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e6
        L_0x00e4:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e6:
            r4 = r4 | r0
        L_0x00e7:
            r0 = 4793491(0x492493, float:6.717112E-39)
            r0 = r0 & r4
            r2 = 4793490(0x492492, float:6.71711E-39)
            r3 = 1
            if (r0 == r2) goto L_0x00f3
            r0 = r3
            goto L_0x00f4
        L_0x00f3:
            r0 = 0
        L_0x00f4:
            r2 = r4 & 1
            boolean r0 = r1.E(r0, r2)
            if (r0 == 0) goto L_0x0157
            if (r9 == 0) goto L_0x0101
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0102
        L_0x0101:
            r0 = r13
        L_0x0102:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0111
            r2 = -1
            java.lang.String r9 = "androidx.compose.material.AppBar (AppBar.kt:704)"
            r13 = -712505634(0xffffffffd58806de, float:-1.86953845E13)
            androidx.compose.runtime.ComposerKt.Y(r13, r4, r2, r9)
        L_0x0111:
            androidx.compose.material.AppBarKt$AppBar$1 r2 = new androidx.compose.material.AppBarKt$AppBar$1
            r2.<init>(r8, r6, r10)
            r9 = 54
            r13 = 213273114(0xcb64a1a, float:2.8086138E-31)
            androidx.compose.runtime.internal.ComposableLambda r21 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r13, r3, r2, r1, r9)
            int r2 = r4 >> 18
            r2 = r2 & 14
            r3 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 | r3
            int r3 = r4 >> 9
            r3 = r3 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            int r3 = r4 << 6
            r9 = r3 & 896(0x380, float:1.256E-42)
            r2 = r2 | r9
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            int r4 = r4 << 9
            r3 = r3 & r4
            r23 = r2 | r3
            r24 = 16
            r19 = 0
            r13 = r0
            r14 = r31
            r15 = r25
            r17 = r27
            r20 = r29
            r22 = r1
            androidx.compose.material.SurfaceKt.a(r13, r14, r15, r17, r19, r20, r21, r22, r23, r24)
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0155
            androidx.compose.runtime.ComposerKt.X()
        L_0x0155:
            r9 = r0
            goto L_0x015b
        L_0x0157:
            r1.B()
            r9 = r13
        L_0x015b:
            androidx.compose.runtime.ScopeUpdateScope r13 = r1.x()
            if (r13 == 0) goto L_0x017c
            androidx.compose.material.AppBarKt$AppBar$2 r14 = new androidx.compose.material.AppBarKt$AppBar$2
            r0 = r14
            r1 = r25
            r3 = r27
            r5 = r29
            r6 = r30
            r7 = r31
            r8 = r32
            r10 = r34
            r11 = r36
            r12 = r37
            r0.<init>(r1, r3, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x017c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.a(long, long, float, androidx.compose.foundation.layout.PaddingValues, androidx.compose.ui.graphics.Shape, androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:123:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0105  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(androidx.compose.foundation.layout.WindowInsets r29, androidx.compose.ui.Modifier r30, long r31, long r33, androidx.compose.ui.graphics.Shape r35, float r36, androidx.compose.foundation.layout.PaddingValues r37, kotlin.jvm.functions.Function3 r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            r11 = r40
            r12 = r41
            r0 = 382658343(0x16cee727, float:3.3426973E-25)
            r1 = r39
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r12 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r11 | 6
            r3 = r2
            r2 = r29
            goto L_0x002b
        L_0x0017:
            r2 = r11 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r29
            boolean r3 = r1.W(r2)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r11
            goto L_0x002b
        L_0x0028:
            r2 = r29
            r3 = r11
        L_0x002b:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 48
        L_0x0031:
            r5 = r30
            goto L_0x0046
        L_0x0034:
            r5 = r11 & 48
            if (r5 != 0) goto L_0x0031
            r5 = r30
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0043
            r6 = 32
            goto L_0x0045
        L_0x0043:
            r6 = 16
        L_0x0045:
            r3 = r3 | r6
        L_0x0046:
            r6 = r11 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x005f
            r6 = r12 & 4
            if (r6 != 0) goto L_0x0059
            r6 = r31
            boolean r8 = r1.j(r6)
            if (r8 == 0) goto L_0x005b
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x0059:
            r6 = r31
        L_0x005b:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r3 = r3 | r8
            goto L_0x0061
        L_0x005f:
            r6 = r31
        L_0x0061:
            r8 = r11 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x007a
            r8 = r12 & 8
            if (r8 != 0) goto L_0x0074
            r8 = r33
            boolean r10 = r1.j(r8)
            if (r10 == 0) goto L_0x0076
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0074:
            r8 = r33
        L_0x0076:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r3 = r3 | r10
            goto L_0x007c
        L_0x007a:
            r8 = r33
        L_0x007c:
            r10 = r12 & 16
            if (r10 == 0) goto L_0x0085
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r13 = r35
            goto L_0x0097
        L_0x0085:
            r13 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0082
            r13 = r35
            boolean r14 = r1.W(r13)
            if (r14 == 0) goto L_0x0094
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r3 = r3 | r14
        L_0x0097:
            r14 = r12 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r14 == 0) goto L_0x00a1
            r3 = r3 | r15
        L_0x009e:
            r15 = r36
            goto L_0x00b3
        L_0x00a1:
            r15 = r15 & r11
            if (r15 != 0) goto L_0x009e
            r15 = r36
            boolean r16 = r1.h(r15)
            if (r16 == 0) goto L_0x00af
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r3 = r3 | r16
        L_0x00b3:
            r16 = r12 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00be
            r3 = r3 | r17
            r0 = r37
            goto L_0x00d1
        L_0x00be:
            r17 = r11 & r17
            r0 = r37
            if (r17 != 0) goto L_0x00d1
            boolean r18 = r1.W(r0)
            if (r18 == 0) goto L_0x00cd
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cf
        L_0x00cd:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00cf:
            r3 = r3 | r18
        L_0x00d1:
            r0 = r12 & 128(0x80, float:1.794E-43)
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00dc
            r3 = r3 | r18
        L_0x00d9:
            r0 = r38
            goto L_0x00ef
        L_0x00dc:
            r0 = r11 & r18
            if (r0 != 0) goto L_0x00d9
            r0 = r38
            boolean r18 = r1.l(r0)
            if (r18 == 0) goto L_0x00eb
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ed
        L_0x00eb:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ed:
            r3 = r3 | r18
        L_0x00ef:
            r18 = 4793491(0x492493, float:6.717112E-39)
            r0 = r3 & r18
            r2 = 4793490(0x492492, float:6.71711E-39)
            r5 = 1
            if (r0 == r2) goto L_0x00fc
            r0 = r5
            goto L_0x00fd
        L_0x00fc:
            r0 = 0
        L_0x00fd:
            r2 = r3 & 1
            boolean r0 = r1.E(r0, r2)
            if (r0 == 0) goto L_0x01df
            r1.p()
            r0 = r11 & 1
            if (r0 == 0) goto L_0x012a
            boolean r0 = r1.J()
            if (r0 == 0) goto L_0x0113
            goto L_0x012a
        L_0x0113:
            r1.B()
            r0 = r12 & 4
            if (r0 == 0) goto L_0x011c
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x011c:
            r0 = r12 & 8
            if (r0 == 0) goto L_0x0122
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0122:
            r0 = r30
        L_0x0124:
            r4 = r37
        L_0x0126:
            r10 = r3
            r2 = r13
            r3 = r15
            goto L_0x0168
        L_0x012a:
            if (r4 == 0) goto L_0x012f
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0131
        L_0x012f:
            r0 = r30
        L_0x0131:
            r2 = r12 & 4
            if (r2 == 0) goto L_0x0142
            androidx.compose.material.MaterialTheme r2 = androidx.compose.material.MaterialTheme.f7937a
            r4 = 6
            androidx.compose.material.Colors r2 = r2.a(r1, r4)
            long r6 = androidx.compose.material.ColorsKt.d(r2)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0142:
            r2 = r12 & 8
            if (r2 == 0) goto L_0x0151
            int r2 = r3 >> 6
            r2 = r2 & 14
            long r8 = androidx.compose.material.ColorsKt.b(r6, r1, r2)
            r2 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            r3 = r2
        L_0x0151:
            if (r10 == 0) goto L_0x0155
            r2 = 0
            r13 = r2
        L_0x0155:
            if (r14 == 0) goto L_0x015e
            androidx.compose.material.AppBarDefaults r2 = androidx.compose.material.AppBarDefaults.f7138a
            float r2 = r2.a()
            r15 = r2
        L_0x015e:
            if (r16 == 0) goto L_0x0124
            androidx.compose.material.AppBarDefaults r2 = androidx.compose.material.AppBarDefaults.f7138a
            androidx.compose.foundation.layout.PaddingValues r2 = r2.b()
            r4 = r2
            goto L_0x0126
        L_0x0168:
            r1.U()
            boolean r13 = androidx.compose.runtime.ComposerKt.P()
            if (r13 == 0) goto L_0x017a
            r13 = -1
            java.lang.String r14 = "androidx.compose.material.BottomAppBar (AppBar.kt:341)"
            r15 = 382658343(0x16cee727, float:3.3426973E-25)
            androidx.compose.runtime.ComposerKt.Y(r15, r10, r13, r14)
        L_0x017a:
            androidx.compose.runtime.ProvidableCompositionLocal r13 = androidx.compose.material.ScaffoldKt.f()
            java.lang.Object r13 = r1.C(r13)
            androidx.compose.material.FabPlacement r13 = (androidx.compose.material.FabPlacement) r13
            if (r2 == 0) goto L_0x0196
            if (r13 == 0) goto L_0x0196
            boolean r14 = r13.d()
            if (r14 != r5) goto L_0x0196
            androidx.compose.material.BottomAppBarCutoutShape r5 = new androidx.compose.material.BottomAppBarCutoutShape
            r5.<init>(r2, r13)
        L_0x0193:
            r19 = r5
            goto L_0x019b
        L_0x0196:
            androidx.compose.ui.graphics.Shape r5 = androidx.compose.ui.graphics.RectangleShapeKt.a()
            goto L_0x0193
        L_0x019b:
            int r5 = r10 >> 6
            r5 = r5 & 126(0x7e, float:1.77E-43)
            int r13 = r10 >> 9
            r14 = r13 & 896(0x380, float:1.256E-42)
            r5 = r5 | r14
            r13 = r13 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 | r13
            int r13 = r10 << 15
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r13
            r5 = r5 | r14
            r14 = 3670016(0x380000, float:5.142788E-39)
            r13 = r13 & r14
            r5 = r5 | r13
            r13 = 29360128(0x1c00000, float:7.052966E-38)
            r10 = r10 & r13
            r24 = r5 | r10
            r25 = 0
            r13 = r6
            r15 = r8
            r17 = r3
            r18 = r4
            r20 = r29
            r21 = r0
            r22 = r38
            r23 = r1
            a(r13, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x01d2
            androidx.compose.runtime.ComposerKt.X()
        L_0x01d2:
            r26 = r2
            r2 = r0
            r27 = r6
            r7 = r26
            r5 = r8
            r8 = r3
            r9 = r4
            r3 = r27
            goto L_0x01ea
        L_0x01df:
            r1.B()
            r2 = r30
            r3 = r6
            r5 = r8
            r7 = r13
            r8 = r15
            r9 = r37
        L_0x01ea:
            androidx.compose.runtime.ScopeUpdateScope r13 = r1.x()
            if (r13 == 0) goto L_0x0201
            androidx.compose.material.AppBarKt$BottomAppBar$1 r14 = new androidx.compose.material.AppBarKt$BottomAppBar$1
            r0 = r14
            r1 = r29
            r10 = r38
            r11 = r40
            r12 = r41
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x0201:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.b(androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.graphics.Shape, float, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(androidx.compose.ui.Modifier r25, long r26, long r28, androidx.compose.ui.graphics.Shape r30, float r31, androidx.compose.foundation.layout.PaddingValues r32, kotlin.jvm.functions.Function3 r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            r10 = r35
            r0 = -1651948973(0xffffffff9d894253, float:-3.6332176E-21)
            r1 = r34
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r36 & 1
            if (r2 == 0) goto L_0x0015
            r3 = r10 | 6
            r4 = r3
            r3 = r25
            goto L_0x0029
        L_0x0015:
            r3 = r10 & 6
            if (r3 != 0) goto L_0x0026
            r3 = r25
            boolean r4 = r1.W(r3)
            if (r4 == 0) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r10
            goto L_0x0029
        L_0x0026:
            r3 = r25
            r4 = r10
        L_0x0029:
            r5 = r10 & 48
            if (r5 != 0) goto L_0x0042
            r5 = r36 & 2
            if (r5 != 0) goto L_0x003c
            r5 = r26
            boolean r7 = r1.j(r5)
            if (r7 == 0) goto L_0x003e
            r7 = 32
            goto L_0x0040
        L_0x003c:
            r5 = r26
        L_0x003e:
            r7 = 16
        L_0x0040:
            r4 = r4 | r7
            goto L_0x0044
        L_0x0042:
            r5 = r26
        L_0x0044:
            r7 = r10 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x005d
            r7 = r36 & 4
            if (r7 != 0) goto L_0x0057
            r7 = r28
            boolean r9 = r1.j(r7)
            if (r9 == 0) goto L_0x0059
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0057:
            r7 = r28
        L_0x0059:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r4 = r4 | r9
            goto L_0x005f
        L_0x005d:
            r7 = r28
        L_0x005f:
            r9 = r36 & 8
            if (r9 == 0) goto L_0x0068
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r11 = r30
            goto L_0x007a
        L_0x0068:
            r11 = r10 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0065
            r11 = r30
            boolean r12 = r1.W(r11)
            if (r12 == 0) goto L_0x0077
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r4 = r4 | r12
        L_0x007a:
            r12 = r36 & 16
            if (r12 == 0) goto L_0x0083
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r13 = r31
            goto L_0x0095
        L_0x0083:
            r13 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0080
            r13 = r31
            boolean r14 = r1.h(r13)
            if (r14 == 0) goto L_0x0092
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r4 = r4 | r14
        L_0x0095:
            r14 = r36 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r14 == 0) goto L_0x009f
            r4 = r4 | r15
            r15 = r32
            goto L_0x00b2
        L_0x009f:
            r16 = r10 & r15
            r15 = r32
            if (r16 != 0) goto L_0x00b2
            boolean r16 = r1.W(r15)
            if (r16 == 0) goto L_0x00ae
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b0
        L_0x00ae:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b0:
            r4 = r4 | r16
        L_0x00b2:
            r16 = r36 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00bd
            r4 = r4 | r17
            r0 = r33
            goto L_0x00d0
        L_0x00bd:
            r16 = r10 & r17
            r0 = r33
            if (r16 != 0) goto L_0x00d0
            boolean r17 = r1.l(r0)
            if (r17 == 0) goto L_0x00cc
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ce
        L_0x00cc:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00ce:
            r4 = r4 | r17
        L_0x00d0:
            r17 = 599187(0x92493, float:8.3964E-40)
            r0 = r4 & r17
            r3 = 599186(0x92492, float:8.39638E-40)
            r5 = 1
            if (r0 == r3) goto L_0x00dd
            r0 = r5
            goto L_0x00de
        L_0x00dd:
            r0 = 0
        L_0x00de:
            r3 = r4 & 1
            boolean r0 = r1.E(r0, r3)
            if (r0 == 0) goto L_0x01c5
            r1.p()
            r0 = r10 & 1
            if (r0 == 0) goto L_0x010d
            boolean r0 = r1.J()
            if (r0 == 0) goto L_0x00f4
            goto L_0x010d
        L_0x00f4:
            r1.B()
            r0 = r36 & 2
            if (r0 == 0) goto L_0x00fd
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00fd:
            r0 = r36 & 4
            if (r0 == 0) goto L_0x0103
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0103:
            r0 = r25
            r2 = r26
            r6 = r7
            r8 = r11
            r9 = r13
        L_0x010a:
            r11 = r4
            r4 = r15
            goto L_0x0154
        L_0x010d:
            if (r2 == 0) goto L_0x0112
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0114
        L_0x0112:
            r0 = r25
        L_0x0114:
            r2 = r36 & 2
            if (r2 == 0) goto L_0x0126
            androidx.compose.material.MaterialTheme r2 = androidx.compose.material.MaterialTheme.f7937a
            r3 = 6
            androidx.compose.material.Colors r2 = r2.a(r1, r3)
            long r2 = androidx.compose.material.ColorsKt.d(r2)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x0128
        L_0x0126:
            r2 = r26
        L_0x0128:
            r6 = r36 & 4
            if (r6 == 0) goto L_0x0137
            int r6 = r4 >> 3
            r6 = r6 & 14
            long r6 = androidx.compose.material.ColorsKt.b(r2, r1, r6)
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x0138
        L_0x0137:
            r6 = r7
        L_0x0138:
            if (r9 == 0) goto L_0x013c
            r8 = 0
            goto L_0x013d
        L_0x013c:
            r8 = r11
        L_0x013d:
            if (r12 == 0) goto L_0x0146
            androidx.compose.material.AppBarDefaults r9 = androidx.compose.material.AppBarDefaults.f7138a
            float r9 = r9.a()
            goto L_0x0147
        L_0x0146:
            r9 = r13
        L_0x0147:
            if (r14 == 0) goto L_0x010a
            androidx.compose.material.AppBarDefaults r11 = androidx.compose.material.AppBarDefaults.f7138a
            androidx.compose.foundation.layout.PaddingValues r11 = r11.b()
            r24 = r11
            r11 = r4
            r4 = r24
        L_0x0154:
            r1.U()
            boolean r12 = androidx.compose.runtime.ComposerKt.P()
            if (r12 == 0) goto L_0x0166
            r12 = -1
            java.lang.String r13 = "androidx.compose.material.BottomAppBar (AppBar.kt:411)"
            r14 = -1651948973(0xffffffff9d894253, float:-3.6332176E-21)
            androidx.compose.runtime.ComposerKt.Y(r14, r11, r12, r13)
        L_0x0166:
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.material.ScaffoldKt.f()
            java.lang.Object r12 = r1.C(r12)
            androidx.compose.material.FabPlacement r12 = (androidx.compose.material.FabPlacement) r12
            if (r8 == 0) goto L_0x0182
            if (r12 == 0) goto L_0x0182
            boolean r13 = r12.d()
            if (r13 != r5) goto L_0x0182
            androidx.compose.material.BottomAppBarCutoutShape r5 = new androidx.compose.material.BottomAppBarCutoutShape
            r5.<init>(r8, r12)
        L_0x017f:
            r17 = r5
            goto L_0x0187
        L_0x0182:
            androidx.compose.ui.graphics.Shape r5 = androidx.compose.ui.graphics.RectangleShapeKt.a()
            goto L_0x017f
        L_0x0187:
            androidx.compose.foundation.layout.WindowInsets r18 = f7148g
            int r5 = r11 >> 3
            r12 = r5 & 14
            r13 = 196608(0x30000, float:2.75506E-40)
            r12 = r12 | r13
            r5 = r5 & 112(0x70, float:1.57E-43)
            r5 = r5 | r12
            int r12 = r11 >> 6
            r13 = r12 & 896(0x380, float:1.256E-42)
            r5 = r5 | r13
            r12 = r12 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 | r12
            int r12 = r11 << 18
            r13 = 3670016(0x380000, float:5.142788E-39)
            r12 = r12 & r13
            r5 = r5 | r12
            r12 = 29360128(0x1c00000, float:7.052966E-38)
            int r11 = r11 << 3
            r11 = r11 & r12
            r22 = r5 | r11
            r23 = 0
            r11 = r2
            r13 = r6
            r15 = r9
            r16 = r4
            r19 = r0
            r20 = r33
            r21 = r1
            a(r11, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x01c1
            androidx.compose.runtime.ComposerKt.X()
        L_0x01c1:
            r15 = r4
            r3 = r2
            r2 = r0
            goto L_0x01cf
        L_0x01c5:
            r1.B()
            r2 = r25
            r3 = r26
            r6 = r7
            r8 = r11
            r9 = r13
        L_0x01cf:
            androidx.compose.runtime.ScopeUpdateScope r12 = r1.x()
            if (r12 == 0) goto L_0x01ea
            androidx.compose.material.AppBarKt$BottomAppBar$2 r13 = new androidx.compose.material.AppBarKt$BottomAppBar$2
            r0 = r13
            r1 = r2
            r2 = r3
            r4 = r6
            r6 = r8
            r7 = r9
            r8 = r15
            r9 = r33
            r10 = r35
            r11 = r36
            r0.<init>(r1, r2, r4, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x01ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.c(androidx.compose.ui.Modifier, long, long, androidx.compose.ui.graphics.Shape, float, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(androidx.compose.ui.Modifier r23, long r24, long r26, float r28, androidx.compose.foundation.layout.PaddingValues r29, kotlin.jvm.functions.Function3 r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            r9 = r32
            r0 = 1897058582(0x7112d116, float:7.270013E29)
            r1 = r31
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r33 & 1
            if (r2 == 0) goto L_0x0015
            r3 = r9 | 6
            r4 = r3
            r3 = r23
            goto L_0x0029
        L_0x0015:
            r3 = r9 & 6
            if (r3 != 0) goto L_0x0026
            r3 = r23
            boolean r4 = r1.W(r3)
            if (r4 == 0) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r9
            goto L_0x0029
        L_0x0026:
            r3 = r23
            r4 = r9
        L_0x0029:
            r5 = r9 & 48
            if (r5 != 0) goto L_0x0042
            r5 = r33 & 2
            if (r5 != 0) goto L_0x003c
            r5 = r24
            boolean r7 = r1.j(r5)
            if (r7 == 0) goto L_0x003e
            r7 = 32
            goto L_0x0040
        L_0x003c:
            r5 = r24
        L_0x003e:
            r7 = 16
        L_0x0040:
            r4 = r4 | r7
            goto L_0x0044
        L_0x0042:
            r5 = r24
        L_0x0044:
            r7 = r9 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x005d
            r7 = r33 & 4
            if (r7 != 0) goto L_0x0057
            r7 = r26
            boolean r10 = r1.j(r7)
            if (r10 == 0) goto L_0x0059
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0057:
            r7 = r26
        L_0x0059:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r4 = r4 | r10
            goto L_0x005f
        L_0x005d:
            r7 = r26
        L_0x005f:
            r10 = r33 & 8
            if (r10 == 0) goto L_0x0068
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r11 = r28
            goto L_0x007a
        L_0x0068:
            r11 = r9 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0065
            r11 = r28
            boolean r12 = r1.h(r11)
            if (r12 == 0) goto L_0x0077
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r4 = r4 | r12
        L_0x007a:
            r12 = r33 & 16
            if (r12 == 0) goto L_0x0083
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r13 = r29
            goto L_0x0095
        L_0x0083:
            r13 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0080
            r13 = r29
            boolean r14 = r1.W(r13)
            if (r14 == 0) goto L_0x0092
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r4 = r4 | r14
        L_0x0095:
            r14 = r33 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r14 == 0) goto L_0x009f
            r4 = r4 | r15
            r15 = r30
            goto L_0x00b1
        L_0x009f:
            r14 = r9 & r15
            r15 = r30
            if (r14 != 0) goto L_0x00b1
            boolean r14 = r1.l(r15)
            if (r14 == 0) goto L_0x00ae
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b0
        L_0x00ae:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00b0:
            r4 = r4 | r14
        L_0x00b1:
            r14 = 74899(0x12493, float:1.04956E-40)
            r14 = r14 & r4
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r14 == r0) goto L_0x00bc
            r0 = 1
            goto L_0x00bd
        L_0x00bc:
            r0 = 0
        L_0x00bd:
            r14 = r4 & 1
            boolean r0 = r1.E(r0, r14)
            if (r0 == 0) goto L_0x0171
            r1.p()
            r0 = r9 & 1
            r14 = 6
            if (r0 == 0) goto L_0x00e7
            boolean r0 = r1.J()
            if (r0 == 0) goto L_0x00d4
            goto L_0x00e7
        L_0x00d4:
            r1.B()
            r0 = r33 & 2
            if (r0 == 0) goto L_0x00dd
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00dd:
            r0 = r33 & 4
            if (r0 == 0) goto L_0x00e3
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00e3:
            r0 = r3
        L_0x00e4:
            r2 = r11
            r3 = r13
            goto L_0x0120
        L_0x00e7:
            if (r2 == 0) goto L_0x00ec
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00ed
        L_0x00ec:
            r0 = r3
        L_0x00ed:
            r2 = r33 & 2
            if (r2 == 0) goto L_0x00fe
            androidx.compose.material.MaterialTheme r2 = androidx.compose.material.MaterialTheme.f7937a
            androidx.compose.material.Colors r2 = r2.a(r1, r14)
            long r2 = androidx.compose.material.ColorsKt.d(r2)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
            r5 = r2
        L_0x00fe:
            r2 = r33 & 4
            if (r2 == 0) goto L_0x010d
            int r2 = r4 >> 3
            r2 = r2 & 14
            long r2 = androidx.compose.material.ColorsKt.b(r5, r1, r2)
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            r7 = r2
        L_0x010d:
            if (r10 == 0) goto L_0x0116
            androidx.compose.material.AppBarDefaults r2 = androidx.compose.material.AppBarDefaults.f7138a
            float r2 = r2.c()
            r11 = r2
        L_0x0116:
            if (r12 == 0) goto L_0x00e4
            androidx.compose.material.AppBarDefaults r2 = androidx.compose.material.AppBarDefaults.f7138a
            androidx.compose.foundation.layout.PaddingValues r2 = r2.b()
            r3 = r2
            r2 = r11
        L_0x0120:
            r1.U()
            boolean r10 = androidx.compose.runtime.ComposerKt.P()
            if (r10 == 0) goto L_0x0132
            r10 = -1
            java.lang.String r11 = "androidx.compose.material.TopAppBar (AppBar.kt:273)"
            r12 = 1897058582(0x7112d116, float:7.270013E29)
            androidx.compose.runtime.ComposerKt.Y(r12, r4, r10, r11)
        L_0x0132:
            androidx.compose.ui.graphics.Shape r16 = androidx.compose.ui.graphics.RectangleShapeKt.a()
            androidx.compose.foundation.layout.WindowInsets r17 = f7148g
            int r10 = r4 >> 3
            r11 = r10 & 14
            r12 = 221184(0x36000, float:3.09945E-40)
            r11 = r11 | r12
            r12 = r10 & 112(0x70, float:1.57E-43)
            r11 = r11 | r12
            r12 = r10 & 896(0x380, float:1.256E-42)
            r11 = r11 | r12
            r10 = r10 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 | r11
            int r11 = r4 << 18
            r12 = 3670016(0x380000, float:5.142788E-39)
            r11 = r11 & r12
            r10 = r10 | r11
            r11 = 29360128(0x1c00000, float:7.052966E-38)
            int r4 = r4 << r14
            r4 = r4 & r11
            r21 = r10 | r4
            r22 = 0
            r10 = r5
            r12 = r7
            r14 = r2
            r15 = r3
            r18 = r0
            r19 = r30
            r20 = r1
            a(r10, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x016d
            androidx.compose.runtime.ComposerKt.X()
        L_0x016d:
            r11 = r2
            r13 = r3
            r3 = r0
            goto L_0x0174
        L_0x0171:
            r1.B()
        L_0x0174:
            androidx.compose.runtime.ScopeUpdateScope r12 = r1.x()
            if (r12 == 0) goto L_0x018e
            androidx.compose.material.AppBarKt$TopAppBar$5 r14 = new androidx.compose.material.AppBarKt$TopAppBar$5
            r0 = r14
            r1 = r3
            r2 = r5
            r4 = r7
            r6 = r11
            r7 = r13
            r8 = r30
            r9 = r32
            r10 = r33
            r0.<init>(r1, r2, r4, r6, r7, r8, r9, r10)
            r12.a(r14)
        L_0x018e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.d(androidx.compose.ui.Modifier, long, long, float, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:122:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(kotlin.jvm.functions.Function2 r28, androidx.compose.foundation.layout.WindowInsets r29, androidx.compose.ui.Modifier r30, kotlin.jvm.functions.Function2 r31, kotlin.jvm.functions.Function3 r32, long r33, long r35, float r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            r1 = r28
            r11 = r39
            r12 = r40
            r0 = -763778507(0xffffffffd279aa35, float:-2.68075614E11)
            r2 = r38
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r3 = r12 & 1
            if (r3 == 0) goto L_0x0016
            r3 = r11 | 6
            goto L_0x0026
        L_0x0016:
            r3 = r11 & 6
            if (r3 != 0) goto L_0x0025
            boolean r3 = r2.l(r1)
            if (r3 == 0) goto L_0x0022
            r3 = 4
            goto L_0x0023
        L_0x0022:
            r3 = 2
        L_0x0023:
            r3 = r3 | r11
            goto L_0x0026
        L_0x0025:
            r3 = r11
        L_0x0026:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x002f
            r3 = r3 | 48
        L_0x002c:
            r4 = r29
            goto L_0x0041
        L_0x002f:
            r4 = r11 & 48
            if (r4 != 0) goto L_0x002c
            r4 = r29
            boolean r5 = r2.W(r4)
            if (r5 == 0) goto L_0x003e
            r5 = 32
            goto L_0x0040
        L_0x003e:
            r5 = 16
        L_0x0040:
            r3 = r3 | r5
        L_0x0041:
            r5 = r12 & 4
            if (r5 == 0) goto L_0x004a
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0047:
            r6 = r30
            goto L_0x005c
        L_0x004a:
            r6 = r11 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0047
            r6 = r30
            boolean r7 = r2.W(r6)
            if (r7 == 0) goto L_0x0059
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r3 = r3 | r7
        L_0x005c:
            r7 = r12 & 8
            if (r7 == 0) goto L_0x0065
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0062:
            r8 = r31
            goto L_0x0077
        L_0x0065:
            r8 = r11 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0062
            r8 = r31
            boolean r9 = r2.l(r8)
            if (r9 == 0) goto L_0x0074
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r3 = r3 | r9
        L_0x0077:
            r9 = r12 & 16
            if (r9 == 0) goto L_0x0080
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x007d:
            r10 = r32
            goto L_0x0092
        L_0x0080:
            r10 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x007d
            r10 = r32
            boolean r13 = r2.l(r10)
            if (r13 == 0) goto L_0x008f
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0091
        L_0x008f:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r3 = r3 | r13
        L_0x0092:
            r13 = 196608(0x30000, float:2.75506E-40)
            r13 = r13 & r11
            if (r13 != 0) goto L_0x00ac
            r13 = r12 & 32
            if (r13 != 0) goto L_0x00a6
            r13 = r33
            boolean r15 = r2.j(r13)
            if (r15 == 0) goto L_0x00a8
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00aa
        L_0x00a6:
            r13 = r33
        L_0x00a8:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00aa:
            r3 = r3 | r15
            goto L_0x00ae
        L_0x00ac:
            r13 = r33
        L_0x00ae:
            r15 = 1572864(0x180000, float:2.204052E-39)
            r15 = r15 & r11
            if (r15 != 0) goto L_0x00c7
            r15 = r12 & 64
            r0 = r35
            if (r15 != 0) goto L_0x00c2
            boolean r16 = r2.j(r0)
            if (r16 == 0) goto L_0x00c2
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c4
        L_0x00c2:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00c4:
            r3 = r3 | r16
            goto L_0x00c9
        L_0x00c7:
            r0 = r35
        L_0x00c9:
            r15 = r12 & 128(0x80, float:1.794E-43)
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            if (r15 == 0) goto L_0x00d4
            r3 = r3 | r16
            r0 = r37
            goto L_0x00e6
        L_0x00d4:
            r16 = r11 & r16
            r0 = r37
            if (r16 != 0) goto L_0x00e6
            boolean r1 = r2.h(r0)
            if (r1 == 0) goto L_0x00e3
            r1 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e5
        L_0x00e3:
            r1 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e5:
            r3 = r3 | r1
        L_0x00e6:
            r1 = 4793491(0x492493, float:6.717112E-39)
            r1 = r1 & r3
            r0 = 4793490(0x492492, float:6.71711E-39)
            r4 = 1
            if (r1 == r0) goto L_0x00f2
            r0 = r4
            goto L_0x00f3
        L_0x00f2:
            r0 = 0
        L_0x00f3:
            r1 = r3 & 1
            boolean r0 = r2.E(r0, r1)
            if (r0 == 0) goto L_0x01d0
            r2.p()
            r0 = r11 & 1
            r1 = -3670017(0xffffffffffc7ffff, float:NaN)
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r0 == 0) goto L_0x0124
            boolean r0 = r2.J()
            if (r0 == 0) goto L_0x010f
            goto L_0x0124
        L_0x010f:
            r2.B()
            r0 = r12 & 32
            if (r0 == 0) goto L_0x0118
            r3 = r3 & r16
        L_0x0118:
            r0 = r12 & 64
            if (r0 == 0) goto L_0x011d
            r3 = r3 & r1
        L_0x011d:
            r26 = r35
            r5 = r3
            r0 = r13
        L_0x0121:
            r3 = r37
            goto L_0x016c
        L_0x0124:
            if (r5 == 0) goto L_0x0129
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r6 = r0
        L_0x0129:
            if (r7 == 0) goto L_0x012d
            r0 = 0
            r8 = r0
        L_0x012d:
            if (r9 == 0) goto L_0x0136
            androidx.compose.material.ComposableSingletons$AppBarKt r0 = androidx.compose.material.ComposableSingletons$AppBarKt.f7521a
            kotlin.jvm.functions.Function3 r0 = r0.a()
            r10 = r0
        L_0x0136:
            r0 = r12 & 32
            if (r0 == 0) goto L_0x0147
            androidx.compose.material.MaterialTheme r0 = androidx.compose.material.MaterialTheme.f7937a
            r5 = 6
            androidx.compose.material.Colors r0 = r0.a(r2, r5)
            long r13 = androidx.compose.material.ColorsKt.d(r0)
            r3 = r3 & r16
        L_0x0147:
            r0 = r12 & 64
            if (r0 == 0) goto L_0x0157
            int r0 = r3 >> 15
            r0 = r0 & 14
            long r16 = androidx.compose.material.ColorsKt.b(r13, r2, r0)
            r0 = r3 & r1
            r3 = r0
            goto L_0x0159
        L_0x0157:
            r16 = r35
        L_0x0159:
            if (r15 == 0) goto L_0x0167
            androidx.compose.material.AppBarDefaults r0 = androidx.compose.material.AppBarDefaults.f7138a
            float r0 = r0.c()
            r5 = r3
            r26 = r16
            r3 = r0
            r0 = r13
            goto L_0x016c
        L_0x0167:
            r5 = r3
            r0 = r13
            r26 = r16
            goto L_0x0121
        L_0x016c:
            r2.U()
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x017e
            r7 = -1
            java.lang.String r9 = "androidx.compose.material.TopAppBar (AppBar.kt:93)"
            r13 = -763778507(0xffffffffd279aa35, float:-2.68075614E11)
            androidx.compose.runtime.ComposerKt.Y(r13, r5, r7, r9)
        L_0x017e:
            androidx.compose.material.AppBarDefaults r7 = androidx.compose.material.AppBarDefaults.f7138a
            androidx.compose.foundation.layout.PaddingValues r18 = r7.b()
            androidx.compose.ui.graphics.Shape r19 = androidx.compose.ui.graphics.RectangleShapeKt.a()
            androidx.compose.material.AppBarKt$TopAppBar$1 r7 = new androidx.compose.material.AppBarKt$TopAppBar$1
            r9 = r28
            r7.<init>(r8, r9, r10)
            r13 = 54
            r14 = 1849684359(0x6e3ff187, float:1.4850906E28)
            androidx.compose.runtime.internal.ComposableLambda r22 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r14, r4, r7, r2, r13)
            int r4 = r5 >> 15
            r7 = r4 & 14
            r13 = 12610560(0xc06c00, float:1.7671158E-38)
            r7 = r7 | r13
            r13 = r4 & 112(0x70, float:1.57E-43)
            r7 = r7 | r13
            r4 = r4 & 896(0x380, float:1.256E-42)
            r4 = r4 | r7
            int r5 = r5 << 12
            r7 = 458752(0x70000, float:6.42848E-40)
            r7 = r7 & r5
            r4 = r4 | r7
            r7 = 3670016(0x380000, float:5.142788E-39)
            r5 = r5 & r7
            r24 = r4 | r5
            r25 = 0
            r13 = r0
            r15 = r26
            r17 = r3
            r20 = r29
            r21 = r6
            r23 = r2
            a(r13, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x01ca
            androidx.compose.runtime.ComposerKt.X()
        L_0x01ca:
            r4 = r8
            r5 = r10
            r10 = r3
            r3 = r6
            r6 = r0
            goto L_0x01dd
        L_0x01d0:
            r9 = r28
            r2.B()
            r26 = r35
            r3 = r6
            r4 = r8
            r5 = r10
            r6 = r13
            r10 = r37
        L_0x01dd:
            androidx.compose.runtime.ScopeUpdateScope r13 = r2.x()
            if (r13 == 0) goto L_0x01f6
            androidx.compose.material.AppBarKt$TopAppBar$2 r14 = new androidx.compose.material.AppBarKt$TopAppBar$2
            r0 = r14
            r1 = r28
            r2 = r29
            r8 = r26
            r11 = r39
            r12 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12)
            r13.a(r14)
        L_0x01f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.e(kotlin.jvm.functions.Function2, androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, long, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(androidx.compose.foundation.layout.WindowInsets r26, androidx.compose.ui.Modifier r27, long r28, long r30, float r32, androidx.compose.foundation.layout.PaddingValues r33, kotlin.jvm.functions.Function3 r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            r10 = r36
            r0 = 883764366(0x34ad2c8e, float:3.225618E-7)
            r1 = r35
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r37 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r10 | 6
            r3 = r2
            r2 = r26
            goto L_0x0029
        L_0x0015:
            r2 = r10 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r26
            boolean r3 = r1.W(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r10
            goto L_0x0029
        L_0x0026:
            r2 = r26
            r3 = r10
        L_0x0029:
            r4 = r37 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
        L_0x002f:
            r5 = r27
            goto L_0x0044
        L_0x0032:
            r5 = r10 & 48
            if (r5 != 0) goto L_0x002f
            r5 = r27
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0041
            r6 = 32
            goto L_0x0043
        L_0x0041:
            r6 = 16
        L_0x0043:
            r3 = r3 | r6
        L_0x0044:
            r6 = r10 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x005d
            r6 = r37 & 4
            if (r6 != 0) goto L_0x0057
            r6 = r28
            boolean r8 = r1.j(r6)
            if (r8 == 0) goto L_0x0059
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0057:
            r6 = r28
        L_0x0059:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r3 = r3 | r8
            goto L_0x005f
        L_0x005d:
            r6 = r28
        L_0x005f:
            r8 = r10 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0078
            r8 = r37 & 8
            if (r8 != 0) goto L_0x0072
            r8 = r30
            boolean r11 = r1.j(r8)
            if (r11 == 0) goto L_0x0074
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0072:
            r8 = r30
        L_0x0074:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r3 = r3 | r11
            goto L_0x007a
        L_0x0078:
            r8 = r30
        L_0x007a:
            r11 = r37 & 16
            if (r11 == 0) goto L_0x0083
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r12 = r32
            goto L_0x0095
        L_0x0083:
            r12 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0080
            r12 = r32
            boolean r13 = r1.h(r12)
            if (r13 == 0) goto L_0x0092
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r3 = r3 | r13
        L_0x0095:
            r13 = r37 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x009f
            r3 = r3 | r14
        L_0x009c:
            r14 = r33
            goto L_0x00b0
        L_0x009f:
            r14 = r14 & r10
            if (r14 != 0) goto L_0x009c
            r14 = r33
            boolean r15 = r1.W(r14)
            if (r15 == 0) goto L_0x00ad
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00ad:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00af:
            r3 = r3 | r15
        L_0x00b0:
            r15 = r37 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r15 == 0) goto L_0x00bb
            r3 = r3 | r16
        L_0x00b8:
            r15 = r34
            goto L_0x00ce
        L_0x00bb:
            r15 = r10 & r16
            if (r15 != 0) goto L_0x00b8
            r15 = r34
            boolean r16 = r1.l(r15)
            if (r16 == 0) goto L_0x00ca
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cc
        L_0x00ca:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00cc:
            r3 = r3 | r16
        L_0x00ce:
            r16 = 599187(0x92493, float:8.3964E-40)
            r0 = r3 & r16
            r2 = 599186(0x92492, float:8.39638E-40)
            if (r0 == r2) goto L_0x00da
            r0 = 1
            goto L_0x00db
        L_0x00da:
            r0 = 0
        L_0x00db:
            r2 = r3 & 1
            boolean r0 = r1.E(r0, r2)
            if (r0 == 0) goto L_0x0195
            r1.p()
            r0 = r10 & 1
            if (r0 == 0) goto L_0x0103
            boolean r0 = r1.J()
            if (r0 == 0) goto L_0x00f1
            goto L_0x0103
        L_0x00f1:
            r1.B()
            r0 = r37 & 4
            if (r0 == 0) goto L_0x00fa
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00fa:
            r0 = r37 & 8
            if (r0 == 0) goto L_0x0100
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0100:
            r0 = r12
            r2 = r14
            goto L_0x013b
        L_0x0103:
            if (r4 == 0) goto L_0x0108
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r5 = r0
        L_0x0108:
            r0 = r37 & 4
            if (r0 == 0) goto L_0x0119
            androidx.compose.material.MaterialTheme r0 = androidx.compose.material.MaterialTheme.f7937a
            r2 = 6
            androidx.compose.material.Colors r0 = r0.a(r1, r2)
            long r6 = androidx.compose.material.ColorsKt.d(r0)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0119:
            r0 = r37 & 8
            if (r0 == 0) goto L_0x0128
            int r0 = r3 >> 6
            r0 = r0 & 14
            long r8 = androidx.compose.material.ColorsKt.b(r6, r1, r0)
            r0 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            r3 = r0
        L_0x0128:
            if (r11 == 0) goto L_0x0131
            androidx.compose.material.AppBarDefaults r0 = androidx.compose.material.AppBarDefaults.f7138a
            float r0 = r0.c()
            r12 = r0
        L_0x0131:
            if (r13 == 0) goto L_0x0100
            androidx.compose.material.AppBarDefaults r0 = androidx.compose.material.AppBarDefaults.f7138a
            androidx.compose.foundation.layout.PaddingValues r0 = r0.b()
            r2 = r0
            r0 = r12
        L_0x013b:
            r1.U()
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x014d
            r4 = -1
            java.lang.String r11 = "androidx.compose.material.TopAppBar (AppBar.kt:224)"
            r12 = 883764366(0x34ad2c8e, float:3.225618E-7)
            androidx.compose.runtime.ComposerKt.Y(r12, r3, r4, r11)
        L_0x014d:
            androidx.compose.ui.graphics.Shape r17 = androidx.compose.ui.graphics.RectangleShapeKt.a()
            int r4 = r3 >> 6
            r11 = r4 & 14
            r11 = r11 | 24576(0x6000, float:3.4438E-41)
            r12 = r4 & 112(0x70, float:1.57E-43)
            r11 = r11 | r12
            r12 = r4 & 896(0x380, float:1.256E-42)
            r11 = r11 | r12
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r11
            int r11 = r3 << 15
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r11
            r4 = r4 | r12
            r12 = 3670016(0x380000, float:5.142788E-39)
            r11 = r11 & r12
            r4 = r4 | r11
            int r3 = r3 << 3
            r11 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r11
            r22 = r4 | r3
            r23 = 0
            r11 = r6
            r13 = r8
            r15 = r0
            r16 = r2
            r18 = r26
            r19 = r5
            r20 = r34
            r21 = r1
            a(r11, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x018c
            androidx.compose.runtime.ComposerKt.X()
        L_0x018c:
            r3 = r6
            r7 = r0
            r24 = r8
            r8 = r2
            r2 = r5
            r5 = r24
            goto L_0x019d
        L_0x0195:
            r1.B()
            r2 = r5
            r3 = r6
            r5 = r8
            r7 = r12
            r8 = r14
        L_0x019d:
            androidx.compose.runtime.ScopeUpdateScope r12 = r1.x()
            if (r12 == 0) goto L_0x01b4
            androidx.compose.material.AppBarKt$TopAppBar$4 r13 = new androidx.compose.material.AppBarKt$TopAppBar$4
            r0 = r13
            r1 = r26
            r9 = r34
            r10 = r36
            r11 = r37
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x01b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.f(androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.Modifier, long, long, float, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(kotlin.jvm.functions.Function2 r28, androidx.compose.ui.Modifier r29, kotlin.jvm.functions.Function2 r30, kotlin.jvm.functions.Function3 r31, long r32, long r34, float r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            r10 = r38
            r0 = -2087748139(0xffffffff838f7dd5, float:-8.433674E-37)
            r1 = r37
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r39 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r10 | 6
            r3 = r2
            r2 = r28
            goto L_0x0029
        L_0x0015:
            r2 = r10 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r28
            boolean r3 = r1.l(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r10
            goto L_0x0029
        L_0x0026:
            r2 = r28
            r3 = r10
        L_0x0029:
            r4 = r39 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
        L_0x002f:
            r5 = r29
            goto L_0x0044
        L_0x0032:
            r5 = r10 & 48
            if (r5 != 0) goto L_0x002f
            r5 = r29
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0041
            r6 = 32
            goto L_0x0043
        L_0x0041:
            r6 = 16
        L_0x0043:
            r3 = r3 | r6
        L_0x0044:
            r6 = r39 & 4
            if (r6 == 0) goto L_0x004d
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r7 = r30
            goto L_0x005f
        L_0x004d:
            r7 = r10 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004a
            r7 = r30
            boolean r8 = r1.l(r7)
            if (r8 == 0) goto L_0x005c
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r8
        L_0x005f:
            r8 = r39 & 8
            if (r8 == 0) goto L_0x0068
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r9 = r31
            goto L_0x007a
        L_0x0068:
            r9 = r10 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0065
            r9 = r31
            boolean r11 = r1.l(r9)
            if (r11 == 0) goto L_0x0077
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r3 = r3 | r11
        L_0x007a:
            r11 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x0093
            r11 = r39 & 16
            if (r11 != 0) goto L_0x008d
            r11 = r32
            boolean r13 = r1.j(r11)
            if (r13 == 0) goto L_0x008f
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0091
        L_0x008d:
            r11 = r32
        L_0x008f:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r3 = r3 | r13
            goto L_0x0095
        L_0x0093:
            r11 = r32
        L_0x0095:
            r13 = 196608(0x30000, float:2.75506E-40)
            r13 = r13 & r10
            if (r13 != 0) goto L_0x00af
            r13 = r39 & 32
            if (r13 != 0) goto L_0x00a9
            r13 = r34
            boolean r15 = r1.j(r13)
            if (r15 == 0) goto L_0x00ab
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ad
        L_0x00a9:
            r13 = r34
        L_0x00ab:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00ad:
            r3 = r3 | r15
            goto L_0x00b1
        L_0x00af:
            r13 = r34
        L_0x00b1:
            r15 = r39 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r15 == 0) goto L_0x00bc
            r3 = r3 | r16
            r0 = r36
            goto L_0x00cf
        L_0x00bc:
            r16 = r10 & r16
            r0 = r36
            if (r16 != 0) goto L_0x00cf
            boolean r17 = r1.h(r0)
            if (r17 == 0) goto L_0x00cb
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cd
        L_0x00cb:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00cd:
            r3 = r3 | r17
        L_0x00cf:
            r17 = 599187(0x92493, float:8.3964E-40)
            r0 = r3 & r17
            r2 = 599186(0x92492, float:8.39638E-40)
            if (r0 == r2) goto L_0x00db
            r0 = 1
            goto L_0x00dc
        L_0x00db:
            r0 = 0
        L_0x00dc:
            r2 = r3 & 1
            boolean r0 = r1.E(r0, r2)
            if (r0 == 0) goto L_0x01a0
            r1.p()
            r0 = r10 & 1
            r2 = -458753(0xfffffffffff8ffff, float:NaN)
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x010d
            boolean r0 = r1.J()
            if (r0 == 0) goto L_0x00f8
            goto L_0x010d
        L_0x00f8:
            r1.B()
            r0 = r39 & 16
            if (r0 == 0) goto L_0x0101
            r3 = r3 & r17
        L_0x0101:
            r0 = r39 & 32
            if (r0 == 0) goto L_0x0106
            r3 = r3 & r2
        L_0x0106:
            r0 = r36
        L_0x0108:
            r4 = r3
            r2 = r11
            r24 = r13
            goto L_0x0148
        L_0x010d:
            if (r4 == 0) goto L_0x0112
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r5 = r0
        L_0x0112:
            if (r6 == 0) goto L_0x0116
            r0 = 0
            r7 = r0
        L_0x0116:
            if (r8 == 0) goto L_0x011f
            androidx.compose.material.ComposableSingletons$AppBarKt r0 = androidx.compose.material.ComposableSingletons$AppBarKt.f7521a
            kotlin.jvm.functions.Function3 r0 = r0.b()
            r9 = r0
        L_0x011f:
            r0 = r39 & 16
            if (r0 == 0) goto L_0x0130
            androidx.compose.material.MaterialTheme r0 = androidx.compose.material.MaterialTheme.f7937a
            r4 = 6
            androidx.compose.material.Colors r0 = r0.a(r1, r4)
            long r11 = androidx.compose.material.ColorsKt.d(r0)
            r3 = r3 & r17
        L_0x0130:
            r0 = r39 & 32
            if (r0 == 0) goto L_0x013f
            int r0 = r3 >> 12
            r0 = r0 & 14
            long r13 = androidx.compose.material.ColorsKt.b(r11, r1, r0)
            r0 = r3 & r2
            r3 = r0
        L_0x013f:
            if (r15 == 0) goto L_0x0106
            androidx.compose.material.AppBarDefaults r0 = androidx.compose.material.AppBarDefaults.f7138a
            float r0 = r0.c()
            goto L_0x0108
        L_0x0148:
            r1.U()
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x015a
            r6 = -1
            java.lang.String r8 = "androidx.compose.material.TopAppBar (AppBar.kt:170)"
            r11 = -2087748139(0xffffffff838f7dd5, float:-8.433674E-37)
            androidx.compose.runtime.ComposerKt.Y(r11, r4, r6, r8)
        L_0x015a:
            androidx.compose.foundation.layout.WindowInsets r12 = f7148g
            r6 = r4 & 14
            r6 = r6 | 48
            int r4 = r4 << 3
            r8 = r4 & 896(0x380, float:1.256E-42)
            r6 = r6 | r8
            r8 = r4 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | r8
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r4
            r6 = r6 | r8
            r8 = 458752(0x70000, float:6.42848E-40)
            r8 = r8 & r4
            r6 = r6 | r8
            r8 = 3670016(0x380000, float:5.142788E-39)
            r8 = r8 & r4
            r6 = r6 | r8
            r8 = 29360128(0x1c00000, float:7.052966E-38)
            r4 = r4 & r8
            r22 = r6 | r4
            r23 = 0
            r11 = r28
            r13 = r5
            r14 = r7
            r15 = r9
            r16 = r2
            r18 = r24
            r20 = r0
            r21 = r1
            e(r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23)
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x0195
            androidx.compose.runtime.ComposerKt.X()
        L_0x0195:
            r4 = r9
            r9 = r0
            r26 = r2
            r2 = r5
            r5 = r26
            r3 = r7
            r7 = r24
            goto L_0x01aa
        L_0x01a0:
            r1.B()
            r2 = r5
            r3 = r7
            r4 = r9
            r5 = r11
            r7 = r13
            r9 = r36
        L_0x01aa:
            androidx.compose.runtime.ScopeUpdateScope r12 = r1.x()
            if (r12 == 0) goto L_0x01bf
            androidx.compose.material.AppBarKt$TopAppBar$3 r13 = new androidx.compose.material.AppBarKt$TopAppBar$3
            r0 = r13
            r1 = r28
            r10 = r38
            r11 = r39
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11)
            r12.a(r13)
        L_0x01bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.g(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, long, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Pair o(float f2, float f3, float f4) {
        Pair pair;
        Float valueOf;
        Float valueOf2;
        Float valueOf3;
        Float valueOf4;
        float f5 = f3 * f3;
        float f6 = f4 * f4;
        float f7 = (f2 * f2) + f5;
        float f8 = f5 * f6 * (f7 - f6);
        float f9 = f2 * f6;
        double d2 = (double) f8;
        float sqrt = (f9 - ((float) Math.sqrt(d2))) / f7;
        float sqrt2 = (f9 + ((float) Math.sqrt(d2))) / f7;
        float sqrt3 = (float) Math.sqrt((double) (f6 - (sqrt * sqrt)));
        float sqrt4 = (float) Math.sqrt((double) (f6 - (sqrt2 * sqrt2)));
        if (f3 > 0.0f) {
            if (sqrt3 > sqrt4) {
                valueOf3 = Float.valueOf(sqrt);
                valueOf4 = Float.valueOf(sqrt3);
            } else {
                valueOf3 = Float.valueOf(sqrt2);
                valueOf4 = Float.valueOf(sqrt4);
            }
            pair = TuplesKt.a(valueOf3, valueOf4);
        } else {
            if (sqrt3 < sqrt4) {
                valueOf = Float.valueOf(sqrt);
                valueOf2 = Float.valueOf(sqrt3);
            } else {
                valueOf = Float.valueOf(sqrt2);
                valueOf2 = Float.valueOf(sqrt4);
            }
            pair = TuplesKt.a(valueOf, valueOf2);
        }
        float floatValue = ((Number) pair.a()).floatValue();
        float floatValue2 = ((Number) pair.b()).floatValue();
        if (floatValue < f2) {
            floatValue2 = -floatValue2;
        }
        return TuplesKt.a(Float.valueOf(floatValue), Float.valueOf(floatValue2));
    }
}

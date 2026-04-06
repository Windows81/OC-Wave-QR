package com.hansecom.abt.ui.components.notificationBox;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata
public final class AbtNotificationBoxKt {

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f38565a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                com.hansecom.abt.ui.components.notificationBox.AbtNotificationBoxType[] r0 = com.hansecom.abt.ui.components.notificationBox.AbtNotificationBoxType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.hansecom.abt.ui.components.notificationBox.AbtNotificationBoxType r1 = com.hansecom.abt.ui.components.notificationBox.AbtNotificationBoxType.POSITIVE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.hansecom.abt.ui.components.notificationBox.AbtNotificationBoxType r1 = com.hansecom.abt.ui.components.notificationBox.AbtNotificationBoxType.WARNING     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.hansecom.abt.ui.components.notificationBox.AbtNotificationBoxType r1 = com.hansecom.abt.ui.components.notificationBox.AbtNotificationBoxType.ERROR     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.hansecom.abt.ui.components.notificationBox.AbtNotificationBoxType r1 = com.hansecom.abt.ui.components.notificationBox.AbtNotificationBoxType.INFO     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f38565a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.notificationBox.AbtNotificationBoxKt.WhenMappings.<clinit>():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(com.hansecom.abt.ui.components.notificationBox.AbtNotificationBoxType r21, androidx.compose.ui.graphics.painter.Painter r22, java.lang.CharSequence r23, androidx.compose.ui.Modifier r24, java.lang.String r25, kotlin.jvm.functions.Function0 r26, androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            r1 = r21
            r14 = r22
            r15 = r23
            r0 = r28
            java.lang.String r2 = "type"
            kotlin.jvm.internal.Intrinsics.i(r1, r2)
            java.lang.String r2 = "icon"
            kotlin.jvm.internal.Intrinsics.i(r14, r2)
            java.lang.String r2 = "label"
            kotlin.jvm.internal.Intrinsics.i(r15, r2)
            r2 = 1637801359(0x619edd8f, float:3.6631882E20)
            r3 = r27
            androidx.compose.runtime.Composer r13 = r3.q(r2)
            r3 = r29 & 1
            r4 = 2
            if (r3 == 0) goto L_0x0028
            r3 = r0 | 6
            goto L_0x0038
        L_0x0028:
            r3 = r0 & 6
            if (r3 != 0) goto L_0x0037
            boolean r3 = r13.W(r1)
            if (r3 == 0) goto L_0x0034
            r3 = 4
            goto L_0x0035
        L_0x0034:
            r3 = r4
        L_0x0035:
            r3 = r3 | r0
            goto L_0x0038
        L_0x0037:
            r3 = r0
        L_0x0038:
            r6 = r29 & 2
            if (r6 == 0) goto L_0x003f
            r3 = r3 | 48
            goto L_0x004f
        L_0x003f:
            r6 = r0 & 48
            if (r6 != 0) goto L_0x004f
            boolean r6 = r13.l(r14)
            if (r6 == 0) goto L_0x004c
            r6 = 32
            goto L_0x004e
        L_0x004c:
            r6 = 16
        L_0x004e:
            r3 = r3 | r6
        L_0x004f:
            r6 = r29 & 4
            if (r6 == 0) goto L_0x0056
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0056:
            r6 = r0 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0066
            boolean r6 = r13.l(r15)
            if (r6 == 0) goto L_0x0063
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r3 = r3 | r6
        L_0x0066:
            r6 = r29 & 8
            if (r6 == 0) goto L_0x006f
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x006c:
            r7 = r24
            goto L_0x0081
        L_0x006f:
            r7 = r0 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x006c
            r7 = r24
            boolean r8 = r13.W(r7)
            if (r8 == 0) goto L_0x007e
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r3 = r3 | r8
        L_0x0081:
            r8 = r29 & 16
            if (r8 == 0) goto L_0x008a
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0087:
            r9 = r25
            goto L_0x009c
        L_0x008a:
            r9 = r0 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x0087
            r9 = r25
            boolean r10 = r13.W(r9)
            if (r10 == 0) goto L_0x0099
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009b
        L_0x0099:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009b:
            r3 = r3 | r10
        L_0x009c:
            r10 = r29 & 32
            r11 = 196608(0x30000, float:2.75506E-40)
            if (r10 == 0) goto L_0x00a6
            r3 = r3 | r11
        L_0x00a3:
            r11 = r26
            goto L_0x00b7
        L_0x00a6:
            r11 = r11 & r0
            if (r11 != 0) goto L_0x00a3
            r11 = r26
            boolean r12 = r13.l(r11)
            if (r12 == 0) goto L_0x00b4
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b6
        L_0x00b4:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00b6:
            r3 = r3 | r12
        L_0x00b7:
            r12 = 74899(0x12493, float:1.04956E-40)
            r12 = r12 & r3
            r5 = 74898(0x12492, float:1.04954E-40)
            if (r12 != r5) goto L_0x00d1
            boolean r5 = r13.t()
            if (r5 != 0) goto L_0x00c7
            goto L_0x00d1
        L_0x00c7:
            r13.B()
            r4 = r7
            r5 = r9
            r6 = r11
            r19 = r13
            goto L_0x022e
        L_0x00d1:
            if (r6 == 0) goto L_0x00d8
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.f15489d
            r16 = r5
            goto L_0x00da
        L_0x00d8:
            r16 = r7
        L_0x00da:
            r5 = 0
            if (r8 == 0) goto L_0x00e0
            r17 = r5
            goto L_0x00e2
        L_0x00e0:
            r17 = r9
        L_0x00e2:
            if (r10 == 0) goto L_0x00e7
            r18 = r5
            goto L_0x00e9
        L_0x00e7:
            r18 = r11
        L_0x00e9:
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x00f5
            r5 = -1
            java.lang.String r6 = "com.hansecom.abt.ui.components.notificationBox.AbtNotificationBox (AbtNotificationBox.kt:43)"
            androidx.compose.runtime.ComposerKt.Y(r2, r3, r5, r6)
        L_0x00f5:
            int[] r2 = com.hansecom.abt.ui.components.notificationBox.AbtNotificationBoxKt.WhenMappings.f38565a
            int r5 = r21.ordinal()
            r2 = r2[r5]
            r5 = 3670016(0x380000, float:5.142788E-39)
            r6 = 458752(0x70000, float:6.42848E-40)
            r7 = 3
            r8 = 6
            r9 = 1
            if (r2 == r9) goto L_0x01df
            if (r2 == r4) goto L_0x019f
            if (r2 == r7) goto L_0x0160
            r4 = 4
            if (r2 != r4) goto L_0x014f
            r2 = -938040917(0xffffffffc816a1ab, float:-154246.67)
            r13.X(r2)
            com.hansecom.abt.ui.theme.AbtTheme r2 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r4 = r2.b(r13, r8)
            long r9 = r4.e()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r2 = r2.b(r13, r8)
            long r11 = r2.k()
            int r2 = r3 >> 3
            r2 = r2 & 1022(0x3fe, float:1.432E-42)
            int r3 = r3 << r7
            r4 = r3 & r6
            r2 = r2 | r4
            r3 = r3 & r5
            r19 = r2 | r3
            r20 = 0
            r2 = r22
            r3 = r23
            r4 = r16
            r5 = r9
            r7 = r11
            r9 = r17
            r10 = r18
            r11 = r13
            r12 = r19
            r24 = r13
            r13 = r20
            e(r2, r3, r4, r5, r7, r9, r10, r11, r12, r13)
            r24.M()
        L_0x014b:
            r19 = r24
            goto L_0x021f
        L_0x014f:
            r24 = r13
            r0 = -584484295(0xffffffffdd297a39, float:-7.632585E17)
            r13.X(r0)
            r13.M()
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0160:
            r2 = -938396983(0xffffffffc81132c9, float:-148683.14)
            r13.X(r2)
            com.hansecom.abt.ui.theme.AbtTheme r2 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r4 = r2.b(r13, r8)
            long r9 = r4.c()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r2 = r2.b(r13, r8)
            long r11 = r2.i()
            int r2 = r3 >> 3
            r2 = r2 & 1022(0x3fe, float:1.432E-42)
            int r3 = r3 << r7
            r4 = r3 & r6
            r2 = r2 | r4
            r3 = r3 & r5
            r19 = r2 | r3
            r20 = 0
            r2 = r22
            r3 = r23
            r4 = r16
            r5 = r9
            r7 = r11
            r9 = r17
            r10 = r18
            r11 = r13
            r12 = r19
            r24 = r13
            r13 = r20
            e(r2, r3, r4, r5, r7, r9, r10, r11, r12, r13)
            r24.M()
            goto L_0x014b
        L_0x019f:
            r24 = r13
            r2 = -938757947(0xffffffffc80bb0c5, float:-143043.08)
            r13.X(r2)
            com.hansecom.abt.ui.theme.AbtTheme r2 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r4 = r2.b(r13, r8)
            long r9 = r4.C()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r2 = r2.b(r13, r8)
            long r11 = r2.t()
            int r2 = r3 >> 3
            r2 = r2 & 1022(0x3fe, float:1.432E-42)
            int r3 = r3 << r7
            r4 = r3 & r6
            r2 = r2 | r4
            r3 = r3 & r5
            r19 = r2 | r3
            r20 = 0
            r2 = r22
            r3 = r23
            r4 = r16
            r5 = r9
            r7 = r11
            r9 = r17
            r10 = r18
            r11 = r13
            r12 = r19
            r13 = r20
            e(r2, r3, r4, r5, r7, r9, r10, r11, r12, r13)
            r24.M()
            goto L_0x014b
        L_0x01df:
            r24 = r13
            r2 = -939122941(0xffffffffc8061f03, float:-137340.05)
            r13.X(r2)
            com.hansecom.abt.ui.theme.AbtTheme r2 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r4 = r2.b(r13, r8)
            long r9 = r4.w()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r2 = r2.b(r13, r8)
            long r11 = r2.n()
            int r2 = r3 >> 3
            r2 = r2 & 1022(0x3fe, float:1.432E-42)
            int r3 = r3 << r7
            r4 = r3 & r6
            r2 = r2 | r4
            r3 = r3 & r5
            r19 = r2 | r3
            r20 = 0
            r2 = r22
            r3 = r23
            r4 = r16
            r5 = r9
            r7 = r11
            r9 = r17
            r10 = r18
            r11 = r13
            r12 = r19
            r19 = r13
            r13 = r20
            e(r2, r3, r4, r5, r7, r9, r10, r11, r12, r13)
            r19.M()
        L_0x021f:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0228
            androidx.compose.runtime.ComposerKt.X()
        L_0x0228:
            r4 = r16
            r5 = r17
            r6 = r18
        L_0x022e:
            androidx.compose.runtime.ScopeUpdateScope r9 = r19.x()
            if (r9 == 0) goto L_0x0247
            com.hansecom.abt.ui.components.notificationBox.a r10 = new com.hansecom.abt.ui.components.notificationBox.a
            r0 = r10
            r1 = r21
            r2 = r22
            r3 = r23
            r7 = r28
            r8 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x0247:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.notificationBox.AbtNotificationBoxKt.c(com.hansecom.abt.ui.components.notificationBox.AbtNotificationBoxType, androidx.compose.ui.graphics.painter.Painter, java.lang.CharSequence, androidx.compose.ui.Modifier, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit d(AbtNotificationBoxType abtNotificationBoxType, Painter painter, CharSequence charSequence, Modifier modifier, String str, Function0 function0, int i2, int i3, Composer composer, int i4) {
        c(abtNotificationBoxType, painter, charSequence, modifier, str, function0, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(androidx.compose.ui.graphics.painter.Painter r37, java.lang.CharSequence r38, androidx.compose.ui.Modifier r39, long r40, long r42, java.lang.String r44, kotlin.jvm.functions.Function0 r45, androidx.compose.runtime.Composer r46, int r47, int r48) {
        /*
            r1 = r37
            r0 = r38
            r4 = r47
            java.lang.String r2 = "icon"
            kotlin.jvm.internal.Intrinsics.i(r1, r2)
            java.lang.String r2 = "label"
            kotlin.jvm.internal.Intrinsics.i(r0, r2)
            r2 = 1913387208(0x720bf8c8, float:2.7724272E30)
            r3 = r46
            androidx.compose.runtime.Composer r5 = r3.q(r2)
            r3 = r48 & 1
            if (r3 == 0) goto L_0x0020
            r3 = r4 | 6
            goto L_0x0030
        L_0x0020:
            r3 = r4 & 6
            if (r3 != 0) goto L_0x002f
            boolean r3 = r5.l(r1)
            if (r3 == 0) goto L_0x002c
            r3 = 4
            goto L_0x002d
        L_0x002c:
            r3 = 2
        L_0x002d:
            r3 = r3 | r4
            goto L_0x0030
        L_0x002f:
            r3 = r4
        L_0x0030:
            r6 = r48 & 2
            if (r6 == 0) goto L_0x0037
            r3 = r3 | 48
            goto L_0x0047
        L_0x0037:
            r6 = r4 & 48
            if (r6 != 0) goto L_0x0047
            boolean r6 = r5.l(r0)
            if (r6 == 0) goto L_0x0044
            r6 = 32
            goto L_0x0046
        L_0x0044:
            r6 = 16
        L_0x0046:
            r3 = r3 | r6
        L_0x0047:
            r6 = r48 & 4
            if (r6 == 0) goto L_0x0050
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004d:
            r8 = r39
            goto L_0x0062
        L_0x0050:
            r8 = r4 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004d
            r8 = r39
            boolean r9 = r5.W(r8)
            if (r9 == 0) goto L_0x005f
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r3 = r3 | r9
        L_0x0062:
            r9 = r4 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x007b
            r9 = r48 & 8
            if (r9 != 0) goto L_0x0075
            r9 = r40
            boolean r11 = r5.j(r9)
            if (r11 == 0) goto L_0x0077
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0075:
            r9 = r40
        L_0x0077:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r3 = r3 | r11
            goto L_0x007d
        L_0x007b:
            r9 = r40
        L_0x007d:
            r11 = r4 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x0096
            r11 = r48 & 16
            if (r11 != 0) goto L_0x0090
            r11 = r42
            boolean r13 = r5.j(r11)
            if (r13 == 0) goto L_0x0092
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0090:
            r11 = r42
        L_0x0092:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r3 = r3 | r13
            goto L_0x0098
        L_0x0096:
            r11 = r42
        L_0x0098:
            r13 = r48 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x00a2
            r3 = r3 | r14
        L_0x009f:
            r14 = r44
            goto L_0x00b3
        L_0x00a2:
            r14 = r14 & r4
            if (r14 != 0) goto L_0x009f
            r14 = r44
            boolean r15 = r5.W(r14)
            if (r15 == 0) goto L_0x00b0
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b2
        L_0x00b0:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b2:
            r3 = r3 | r15
        L_0x00b3:
            r15 = r48 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r15 == 0) goto L_0x00be
            r3 = r3 | r16
            r7 = r45
            goto L_0x00d1
        L_0x00be:
            r16 = r4 & r16
            r7 = r45
            if (r16 != 0) goto L_0x00d1
            boolean r16 = r5.l(r7)
            if (r16 == 0) goto L_0x00cd
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cf
        L_0x00cd:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00cf:
            r3 = r3 | r16
        L_0x00d1:
            r16 = 599187(0x92493, float:8.3964E-40)
            r2 = r3 & r16
            r0 = 599186(0x92492, float:8.39638E-40)
            if (r2 != r0) goto L_0x00ed
            boolean r0 = r5.t()
            if (r0 != 0) goto L_0x00e2
            goto L_0x00ed
        L_0x00e2:
            r5.B()
            r2 = r5
            r3 = r8
            r4 = r9
            r8 = r14
            r9 = r7
            r6 = r11
            goto L_0x02fc
        L_0x00ed:
            r5.p()
            r0 = r4 & 1
            r2 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0117
            boolean r0 = r5.J()
            if (r0 == 0) goto L_0x00fe
            goto L_0x0117
        L_0x00fe:
            r5.B()
            r0 = r48 & 8
            if (r0 == 0) goto L_0x0107
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0107:
            r0 = r48 & 16
            if (r0 == 0) goto L_0x010c
            r3 = r3 & r2
        L_0x010c:
            r2 = r3
            r34 = r7
        L_0x010f:
            r0 = r8
            r29 = r9
            r31 = r11
            r33 = r14
            goto L_0x0143
        L_0x0117:
            if (r6 == 0) goto L_0x011c
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r8 = r0
        L_0x011c:
            r0 = r48 & 8
            if (r0 == 0) goto L_0x012a
            androidx.compose.material3.SnackbarDefaults r0 = androidx.compose.material3.SnackbarDefaults.f11157a
            int r6 = androidx.compose.material3.SnackbarDefaults.f11158b
            long r9 = r0.c(r5, r6)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x012a:
            r0 = r48 & 16
            if (r0 == 0) goto L_0x0139
            androidx.compose.material3.SnackbarDefaults r0 = androidx.compose.material3.SnackbarDefaults.f11157a
            int r6 = androidx.compose.material3.SnackbarDefaults.f11158b
            long r11 = r0.d(r5, r6)
            r0 = r3 & r2
            r3 = r0
        L_0x0139:
            r0 = 0
            if (r13 == 0) goto L_0x013d
            r14 = r0
        L_0x013d:
            if (r15 == 0) goto L_0x010c
            r34 = r0
            r2 = r3
            goto L_0x010f
        L_0x0143:
            r5.U()
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0155
            r3 = -1
            java.lang.String r6 = "com.hansecom.abt.ui.components.notificationBox.AbtNotificationBox (AbtNotificationBox.kt:96)"
            r7 = 1913387208(0x720bf8c8, float:2.7724272E30)
            androidx.compose.runtime.ComposerKt.Y(r7, r2, r3, r6)
        L_0x0155:
            r3 = 8
            float r3 = (float) r3
            float r3 = androidx.compose.ui.unit.Dp.m(r3)
            androidx.compose.foundation.shape.RoundedCornerShape r3 = androidx.compose.foundation.shape.RoundedCornerShapeKt.d(r3)
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.draw.ClipKt.a(r0, r3)
            r6 = 2
            r7 = 0
            r8 = 0
            r39 = r3
            r40 = r29
            r42 = r8
            r43 = r6
            r44 = r7
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.BackgroundKt.b(r39, r40, r42, r43, r44)
            r6 = 16
            float r6 = (float) r6
            float r7 = androidx.compose.ui.unit.Dp.m(r6)
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.PaddingKt.i(r3, r7)
            androidx.compose.foundation.layout.Arrangement r7 = androidx.compose.foundation.layout.Arrangement.f3739a
            float r6 = androidx.compose.ui.unit.Dp.m(r6)
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r6 = r7.n(r6)
            androidx.compose.ui.Alignment$Companion r7 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Vertical r7 = r7.i()
            r8 = 54
            androidx.compose.ui.layout.MeasurePolicy r6 = androidx.compose.foundation.layout.RowKt.b(r6, r7, r5, r8)
            r7 = 0
            int r7 = androidx.compose.runtime.ComposablesKt.a(r5, r7)
            androidx.compose.runtime.CompositionLocalMap r8 = r5.I()
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.ComposedModifierKt.e(r5, r3)
            androidx.compose.ui.node.ComposeUiNode$Companion r9 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r10 = r9.a()
            androidx.compose.runtime.Applier r11 = r5.v()
            if (r11 != 0) goto L_0x01b2
            androidx.compose.runtime.ComposablesKt.d()
        L_0x01b2:
            r5.s()
            boolean r11 = r5.n()
            if (r11 == 0) goto L_0x01bf
            r5.y(r10)
            goto L_0x01c2
        L_0x01bf:
            r5.K()
        L_0x01c2:
            androidx.compose.runtime.Composer r10 = androidx.compose.runtime.Updater.b(r5)
            kotlin.jvm.functions.Function2 r11 = r9.c()
            androidx.compose.runtime.Updater.g(r10, r6, r11)
            kotlin.jvm.functions.Function2 r6 = r9.e()
            androidx.compose.runtime.Updater.g(r10, r8, r6)
            kotlin.jvm.functions.Function2 r6 = r9.b()
            boolean r8 = r10.n()
            if (r8 != 0) goto L_0x01ec
            java.lang.Object r8 = r10.g()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r8, r11)
            if (r8 != 0) goto L_0x01fa
        L_0x01ec:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r10.N(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10.A(r7, r6)
        L_0x01fa:
            kotlin.jvm.functions.Function2 r6 = r9.d()
            androidx.compose.runtime.Updater.g(r10, r3, r6)
            androidx.compose.foundation.layout.RowScopeInstance r3 = androidx.compose.foundation.layout.RowScopeInstance.f4150a
            androidx.compose.ui.Modifier$Companion r15 = androidx.compose.ui.Modifier.f15489d
            r6 = 24
            float r6 = (float) r6
            float r6 = androidx.compose.ui.unit.Dp.m(r6)
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.SizeKt.t(r15, r6)
            r7 = r2 & 14
            r7 = r7 | 432(0x1b0, float:6.05E-43)
            int r8 = r2 >> 3
            r9 = r8 & 7168(0x1c00, float:1.0045E-41)
            r7 = r7 | r9
            r9 = 0
            r10 = 0
            r39 = r37
            r40 = r10
            r41 = r6
            r42 = r31
            r44 = r5
            r45 = r7
            r46 = r9
            androidx.compose.material3.IconKt.d(r39, r40, r41, r42, r44, r45, r46)
            com.hansecom.abt.ui.theme.AbtTheme r14 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r13 = 6
            com.hansecom.abt.ui.theme.typography.AbtTypography r6 = r14.d(r5, r13)
            androidx.compose.ui.text.TextStyle r22 = r6.d()
            r6 = 2
            r7 = 0
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            r39 = r3
            r40 = r15
            r41 = r9
            r42 = r10
            r43 = r6
            r44 = r7
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.RowScope.c(r39, r40, r41, r42, r43, r44)
            r6 = r8 & 14
            int r7 = r2 >> 6
            r11 = r7 & 896(0x380, float:1.256E-42)
            r24 = r6 | r11
            r25 = 0
            r26 = 65528(0xfff8, float:9.1824E-41)
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r16 = 0
            r27 = r11
            r11 = r16
            r16 = 0
            r13 = r16
            r35 = r14
            r14 = r16
            r16 = 0
            r28 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r36 = r2
            r2 = r38
            r46 = r5
            r4 = r31
            r23 = r46
            com.hansecom.abt.ui.components.AbtTextKt.c(r2, r3, r4, r6, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r2 = -1832844399(0xffffffff92c10391, float:-1.2180892E-27)
            r5 = r46
            r5.X(r2)
            if (r33 == 0) goto L_0x02e3
            if (r34 == 0) goto L_0x02e3
            r2 = r35
            r3 = 6
            com.hansecom.abt.ui.theme.typography.AbtTypography r2 = r2.d(r5, r3)
            androidx.compose.ui.text.TextStyle r24 = r2.g()
            r2 = 7
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r39 = r28
            r40 = r4
            r41 = r6
            r42 = r7
            r43 = r34
            r44 = r2
            r45 = r3
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.ClickableKt.f(r39, r40, r41, r42, r43, r44, r45)
            int r2 = r36 >> 15
            r2 = r2 & 14
            r26 = r2 | r27
            r27 = 0
            r28 = 131064(0x1fff8, float:1.8366E-40)
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r3 = r33
            r2 = r5
            r5 = r31
            r25 = r2
            androidx.compose.material3.TextKt.j(r3, r4, r5, r7, r8, r10, r11, r12, r13, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x02e4
        L_0x02e3:
            r2 = r5
        L_0x02e4:
            r2.M()
            r2.T()
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x02f3
            androidx.compose.runtime.ComposerKt.X()
        L_0x02f3:
            r3 = r0
            r4 = r29
            r6 = r31
            r8 = r33
            r9 = r34
        L_0x02fc:
            androidx.compose.runtime.ScopeUpdateScope r12 = r2.x()
            if (r12 == 0) goto L_0x0313
            com.hansecom.abt.ui.components.notificationBox.b r13 = new com.hansecom.abt.ui.components.notificationBox.b
            r0 = r13
            r1 = r37
            r2 = r38
            r10 = r47
            r11 = r48
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11)
            r12.a(r13)
        L_0x0313:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.notificationBox.AbtNotificationBoxKt.e(androidx.compose.ui.graphics.painter.Painter, java.lang.CharSequence, androidx.compose.ui.Modifier, long, long, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit f(Painter painter, CharSequence charSequence, Modifier modifier, long j2, long j3, String str, Function0 function0, int i2, int i3, Composer composer, int i4) {
        e(painter, charSequence, modifier, j2, j3, str, function0, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}

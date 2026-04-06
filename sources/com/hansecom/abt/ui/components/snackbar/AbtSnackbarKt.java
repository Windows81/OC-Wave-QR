package com.hansecom.abt.ui.components.snackbar;

import androidx.compose.material3.SnackbarData;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata
public final class AbtSnackbarKt {

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f38793a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.hansecom.abt.ui.components.snackbar.SnackbarType[] r0 = com.hansecom.abt.ui.components.snackbar.SnackbarType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.hansecom.abt.ui.components.snackbar.SnackbarType r1 = com.hansecom.abt.ui.components.snackbar.SnackbarType.POSITIVE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.hansecom.abt.ui.components.snackbar.SnackbarType r1 = com.hansecom.abt.ui.components.snackbar.SnackbarType.WARNING     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.hansecom.abt.ui.components.snackbar.SnackbarType r1 = com.hansecom.abt.ui.components.snackbar.SnackbarType.ERROR     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.hansecom.abt.ui.components.snackbar.SnackbarType r1 = com.hansecom.abt.ui.components.snackbar.SnackbarType.INFO     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.hansecom.abt.ui.components.snackbar.SnackbarType r1 = com.hansecom.abt.ui.components.snackbar.SnackbarType.NEUTRAL     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f38793a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.snackbar.AbtSnackbarKt.WhenMappings.<clinit>():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0159  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(androidx.compose.material3.SnackbarData r11, androidx.compose.runtime.Composer r12, int r13) {
        /*
            java.lang.String r0 = "snackbarData"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            r0 = -659313258(0xffffffffd8b3ad96, float:-1.58046502E15)
            androidx.compose.runtime.Composer r12 = r12.q(r0)
            r1 = r13 & 6
            r2 = 4
            r3 = 2
            if (r1 != 0) goto L_0x001d
            boolean r1 = r12.W(r11)
            if (r1 == 0) goto L_0x001a
            r1 = r2
            goto L_0x001b
        L_0x001a:
            r1 = r3
        L_0x001b:
            r1 = r1 | r13
            goto L_0x001e
        L_0x001d:
            r1 = r13
        L_0x001e:
            r4 = r1 & 3
            if (r4 != r3) goto L_0x002e
            boolean r4 = r12.t()
            if (r4 != 0) goto L_0x0029
            goto L_0x002e
        L_0x0029:
            r12.B()
            goto L_0x015c
        L_0x002e:
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            r5 = -1
            if (r4 == 0) goto L_0x003a
            java.lang.String r4 = "com.hansecom.abt.ui.components.snackbar.AbtSnackbar (AbtSnackbar.kt:52)"
            androidx.compose.runtime.ComposerKt.Y(r0, r1, r5, r4)
        L_0x003a:
            androidx.compose.material3.SnackbarVisuals r0 = r11.a()
            boolean r4 = r0 instanceof com.hansecom.abt.ui.components.snackbar.AbtSnackbarVisuals
            r6 = 0
            if (r4 == 0) goto L_0x0046
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarVisuals r0 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarVisuals) r0
            goto L_0x0047
        L_0x0046:
            r0 = r6
        L_0x0047:
            if (r0 == 0) goto L_0x004d
            com.hansecom.abt.ui.components.snackbar.SnackbarType r6 = r0.f()
        L_0x004d:
            if (r6 != 0) goto L_0x0051
            r0 = r5
            goto L_0x0059
        L_0x0051:
            int[] r0 = com.hansecom.abt.ui.components.snackbar.AbtSnackbarKt.WhenMappings.f38793a
            int r4 = r6.ordinal()
            r0 = r0[r4]
        L_0x0059:
            r4 = 0
            r6 = 6
            if (r0 == r5) goto L_0x0129
            r5 = 1
            if (r0 == r5) goto L_0x00fe
            if (r0 == r3) goto L_0x00d3
            r3 = 3
            if (r0 == r3) goto L_0x00a7
            if (r0 == r2) goto L_0x007b
            r2 = 5
            if (r0 != r2) goto L_0x006c
            goto L_0x0129
        L_0x006c:
            r11 = 451504584(0x1ae969c8, float:9.653744E-23)
            r12.X(r11)
            r12.M()
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L_0x007b:
            r0 = 451533199(0x1ae9d98f, float:9.6718026E-23)
            r12.X(r0)
            int r0 = com.hansecom.abt.R.drawable.I
            androidx.compose.ui.graphics.painter.Painter r3 = androidx.compose.ui.res.PainterResources_androidKt.c(r0, r12, r4)
            com.hansecom.abt.ui.theme.AbtTheme r0 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r2 = r0.b(r12, r6)
            long r4 = r2.e()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r0 = r0.b(r12, r6)
            long r6 = r0.k()
            r9 = r1 & 14
            r10 = 2
            r2 = 0
            r1 = r11
            r8 = r12
            h(r1, r2, r3, r4, r6, r8, r9, r10)
            r12.M()
            goto L_0x0153
        L_0x00a7:
            r0 = 451524139(0x1ae9b62b, float:9.666085E-23)
            r12.X(r0)
            int r0 = com.hansecom.abt.R.drawable.f33016r
            androidx.compose.ui.graphics.painter.Painter r3 = androidx.compose.ui.res.PainterResources_androidKt.c(r0, r12, r4)
            com.hansecom.abt.ui.theme.AbtTheme r0 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r2 = r0.b(r12, r6)
            long r4 = r2.c()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r0 = r0.b(r12, r6)
            long r6 = r0.i()
            r9 = r1 & 14
            r10 = 2
            r2 = 0
            r1 = r11
            r8 = r12
            h(r1, r2, r3, r4, r6, r8, r9, r10)
            r12.M()
            goto L_0x0153
        L_0x00d3:
            r0 = 451514710(0x1ae99156, float:9.6601344E-23)
            r12.X(r0)
            int r0 = com.hansecom.abt.R.drawable.f33007i
            androidx.compose.ui.graphics.painter.Painter r3 = androidx.compose.ui.res.PainterResources_androidKt.c(r0, r12, r4)
            com.hansecom.abt.ui.theme.AbtTheme r0 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r2 = r0.b(r12, r6)
            long r4 = r2.C()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r0 = r0.b(r12, r6)
            long r6 = r0.t()
            r9 = r1 & 14
            r10 = 2
            r2 = 0
            r1 = r11
            r8 = r12
            h(r1, r2, r3, r4, r6, r8, r9, r10)
            r12.M()
            goto L_0x0153
        L_0x00fe:
            r0 = 451505144(0x1ae96bf8, float:9.6540974E-23)
            r12.X(r0)
            int r0 = com.hansecom.abt.R.drawable.f33011m
            androidx.compose.ui.graphics.painter.Painter r3 = androidx.compose.ui.res.PainterResources_androidKt.c(r0, r12, r4)
            com.hansecom.abt.ui.theme.AbtTheme r0 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r2 = r0.b(r12, r6)
            long r4 = r2.w()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r0 = r0.b(r12, r6)
            long r6 = r0.n()
            r9 = r1 & 14
            r10 = 2
            r2 = 0
            r1 = r11
            r8 = r12
            h(r1, r2, r3, r4, r6, r8, r9, r10)
            r12.M()
            goto L_0x0153
        L_0x0129:
            r0 = 451542677(0x1ae9fe95, float:9.677784E-23)
            r12.X(r0)
            int r0 = com.hansecom.abt.R.drawable.I
            androidx.compose.ui.graphics.painter.Painter r3 = androidx.compose.ui.res.PainterResources_androidKt.c(r0, r12, r4)
            com.hansecom.abt.ui.theme.AbtTheme r0 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r2 = r0.b(r12, r6)
            long r4 = r2.f()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r0 = r0.b(r12, r6)
            long r6 = r0.l()
            r9 = r1 & 14
            r10 = 2
            r2 = 0
            r1 = r11
            r8 = r12
            h(r1, r2, r3, r4, r6, r8, r9, r10)
            r12.M()
        L_0x0153:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x015c
            androidx.compose.runtime.ComposerKt.X()
        L_0x015c:
            androidx.compose.runtime.ScopeUpdateScope r12 = r12.x()
            if (r12 == 0) goto L_0x016a
            com.hansecom.abt.ui.components.snackbar.c r0 = new com.hansecom.abt.ui.components.snackbar.c
            r0.<init>(r11, r13)
            r12.a(r0)
        L_0x016a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.snackbar.AbtSnackbarKt.d(androidx.compose.material3.SnackbarData, androidx.compose.runtime.Composer, int):void");
    }

    public static final void e(AbtSnackbarVisuals abtSnackbarVisuals, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-383951254);
        if ((i2 & 6) == 0) {
            i3 = (q2.W(abtSnackbarVisuals) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-383951254, i3, -1, "com.hansecom.abt.ui.components.snackbar.AbtSnackbar (AbtSnackbar.kt:165)");
            }
            d(new AbtSnackbarKt$AbtSnackbar$4(abtSnackbarVisuals), q2, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new b(abtSnackbarVisuals, i2));
        }
    }

    public static final Unit f(SnackbarData snackbarData, int i2, Composer composer, int i3) {
        d(snackbarData, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final Unit g(AbtSnackbarVisuals abtSnackbarVisuals, int i2, Composer composer, int i3) {
        e(abtSnackbarVisuals, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(androidx.compose.material3.SnackbarData r28, androidx.compose.ui.Modifier r29, androidx.compose.ui.graphics.painter.Painter r30, long r31, long r33, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            r1 = r28
            r8 = r36
            r0 = 1589888704(0x5ec3c6c0, float:7.053587E18)
            r2 = r35
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r3 = r37 & 1
            if (r3 == 0) goto L_0x0014
            r3 = r8 | 6
            goto L_0x0024
        L_0x0014:
            r3 = r8 & 6
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.W(r1)
            if (r3 == 0) goto L_0x0020
            r3 = 4
            goto L_0x0021
        L_0x0020:
            r3 = 2
        L_0x0021:
            r3 = r3 | r8
            goto L_0x0024
        L_0x0023:
            r3 = r8
        L_0x0024:
            r4 = r37 & 2
            if (r4 == 0) goto L_0x002d
            r3 = r3 | 48
        L_0x002a:
            r5 = r29
            goto L_0x003f
        L_0x002d:
            r5 = r8 & 48
            if (r5 != 0) goto L_0x002a
            r5 = r29
            boolean r6 = r2.W(r5)
            if (r6 == 0) goto L_0x003c
            r6 = 32
            goto L_0x003e
        L_0x003c:
            r6 = 16
        L_0x003e:
            r3 = r3 | r6
        L_0x003f:
            r6 = r37 & 4
            if (r6 == 0) goto L_0x0048
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0045:
            r7 = r30
            goto L_0x005a
        L_0x0048:
            r7 = r8 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0045
            r7 = r30
            boolean r9 = r2.l(r7)
            if (r9 == 0) goto L_0x0057
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0059
        L_0x0057:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0059:
            r3 = r3 | r9
        L_0x005a:
            r9 = r8 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0073
            r9 = r37 & 8
            if (r9 != 0) goto L_0x006d
            r9 = r31
            boolean r11 = r2.j(r9)
            if (r11 == 0) goto L_0x006f
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0071
        L_0x006d:
            r9 = r31
        L_0x006f:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0071:
            r3 = r3 | r11
            goto L_0x0075
        L_0x0073:
            r9 = r31
        L_0x0075:
            r11 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x008e
            r11 = r37 & 16
            if (r11 != 0) goto L_0x0088
            r11 = r33
            boolean r13 = r2.j(r11)
            if (r13 == 0) goto L_0x008a
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008c
        L_0x0088:
            r11 = r33
        L_0x008a:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x008c:
            r3 = r3 | r13
            goto L_0x0090
        L_0x008e:
            r11 = r33
        L_0x0090:
            r13 = r3 & 9363(0x2493, float:1.312E-41)
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r14) goto L_0x00a5
            boolean r13 = r2.t()
            if (r13 != 0) goto L_0x009d
            goto L_0x00a5
        L_0x009d:
            r2.B()
            r4 = r5
            r3 = r7
            r6 = r11
            goto L_0x01a7
        L_0x00a5:
            r2.p()
            r13 = r8 & 1
            r14 = -57345(0xffffffffffff1fff, float:NaN)
            r15 = 0
            if (r13 == 0) goto L_0x00c9
            boolean r13 = r2.J()
            if (r13 == 0) goto L_0x00b7
            goto L_0x00c9
        L_0x00b7:
            r2.B()
            r4 = r37 & 8
            if (r4 == 0) goto L_0x00c0
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00c0:
            r4 = r37 & 16
            if (r4 == 0) goto L_0x00c5
            r3 = r3 & r14
        L_0x00c5:
            r4 = r5
        L_0x00c6:
            r5 = r9
            r10 = r11
            goto L_0x00f3
        L_0x00c9:
            if (r4 == 0) goto L_0x00ce
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00cf
        L_0x00ce:
            r4 = r5
        L_0x00cf:
            if (r6 == 0) goto L_0x00d2
            r7 = r15
        L_0x00d2:
            r5 = r37 & 8
            if (r5 == 0) goto L_0x00e1
            androidx.compose.material3.SnackbarDefaults r5 = androidx.compose.material3.SnackbarDefaults.f11157a
            int r6 = androidx.compose.material3.SnackbarDefaults.f11158b
            long r5 = r5.c(r2, r6)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            r9 = r5
        L_0x00e1:
            r5 = r37 & 16
            if (r5 == 0) goto L_0x00c6
            androidx.compose.material3.SnackbarDefaults r5 = androidx.compose.material3.SnackbarDefaults.f11157a
            int r6 = androidx.compose.material3.SnackbarDefaults.f11158b
            long r5 = r5.d(r2, r6)
            r3 = r3 & r14
            r26 = r5
            r5 = r9
            r10 = r26
        L_0x00f3:
            r2.U()
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x0102
            r9 = -1
            java.lang.String r12 = "com.hansecom.abt.ui.components.snackbar.AbtSnackbar (AbtSnackbar.kt:100)"
            androidx.compose.runtime.ComposerKt.Y(r0, r3, r9, r12)
        L_0x0102:
            androidx.compose.material3.SnackbarVisuals r0 = r28.a()
            androidx.compose.material3.SnackbarVisuals r9 = r28.a()
            java.lang.String r9 = r9.c()
            r12 = 451564247(0x1aea52d7, float:9.6913967E-23)
            r2.X(r12)
            r12 = 54
            r14 = 1
            if (r9 == 0) goto L_0x0128
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarKt$AbtSnackbar$actionComposable$1 r13 = new com.hansecom.abt.ui.components.snackbar.AbtSnackbarKt$AbtSnackbar$actionComposable$1
            r13.<init>(r1, r9)
            r9 = -1816814818(0xffffffff93b59b1e, float:-4.584378E-27)
            androidx.compose.runtime.internal.ComposableLambda r9 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r9, r14, r13, r2, r12)
            r16 = r9
            goto L_0x012a
        L_0x0128:
            r16 = r15
        L_0x012a:
            r2.M()
            r9 = 451577126(0x1aea8526, float:9.6995245E-23)
            r2.X(r9)
            boolean r9 = r0.b()
            if (r9 == 0) goto L_0x0146
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarKt$AbtSnackbar$dismissActionComposable$1 r9 = new com.hansecom.abt.ui.components.snackbar.AbtSnackbarKt$AbtSnackbar$dismissActionComposable$1
            r9.<init>(r1)
            r13 = 1313047952(0x4e438590, float:8.2007757E8)
            androidx.compose.runtime.internal.ComposableLambda r9 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r13, r14, r9, r2, r12)
            r15 = r9
        L_0x0146:
            r2.M()
            r13 = 12
            float r9 = (float) r13
            float r9 = androidx.compose.ui.unit.Dp.m(r9)
            androidx.compose.ui.Modifier r9 = androidx.compose.foundation.layout.PaddingKt.i(r4, r9)
            r13 = 8
            float r13 = (float) r13
            float r13 = androidx.compose.ui.unit.Dp.m(r13)
            androidx.compose.foundation.shape.RoundedCornerShape r13 = androidx.compose.foundation.shape.RoundedCornerShapeKt.d(r13)
            r17 = 12
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarKt$AbtSnackbar$2 r12 = new com.hansecom.abt.ui.components.snackbar.AbtSnackbarKt$AbtSnackbar$2
            r12.<init>(r7, r0, r10)
            r0 = -1353396603(0xffffffffaf54ce85, float:-1.9354658E-10)
            r1 = 54
            androidx.compose.runtime.internal.ComposableLambda r22 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r0, r14, r12, r2, r1)
            int r0 = r3 << 6
            r1 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r0
            r12 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r12
            r12 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r12
            r0 = r0 | r1
            int r1 = r3 << 9
            r12 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r1 & r12
            r0 = r0 | r1
            r1 = 234881024(0xe000000, float:1.5777218E-30)
            int r3 = r3 << 12
            r1 = r1 & r3
            r24 = r0 | r1
            r25 = 8
            r12 = 0
            r0 = r10
            r10 = r16
            r11 = r15
            r14 = r5
            r16 = r0
            r18 = r0
            r20 = r0
            r23 = r2
            androidx.compose.material3.SnackbarKt.i(r9, r10, r11, r12, r13, r14, r16, r18, r20, r22, r23, r24, r25)
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x01a4
            androidx.compose.runtime.ComposerKt.X()
        L_0x01a4:
            r9 = r5
            r3 = r7
            r6 = r0
        L_0x01a7:
            androidx.compose.runtime.ScopeUpdateScope r11 = r2.x()
            if (r11 == 0) goto L_0x01be
            com.hansecom.abt.ui.components.snackbar.d r12 = new com.hansecom.abt.ui.components.snackbar.d
            r0 = r12
            r1 = r28
            r2 = r4
            r4 = r9
            r8 = r36
            r9 = r37
            r0.<init>(r1, r2, r3, r4, r6, r8, r9)
            r11.a(r12)
        L_0x01be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.snackbar.AbtSnackbarKt.h(androidx.compose.material3.SnackbarData, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.painter.Painter, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit i(SnackbarData snackbarData, Modifier modifier, Painter painter, long j2, long j3, int i2, int i3, Composer composer, int i4) {
        h(snackbarData, modifier, painter, j2, j3, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}

package com.hansecom.abt.ui.theme.typography;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.text.TextStyle;
import com.hansecom.abt.ui.theme.AbtTheme;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AbtTypographyKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f38960a = CompositionLocalKt.j(new a());

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f38961a;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|(2:25|26)|27|29) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|29) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.hansecom.abt.ui.theme.typography.AbtTypographyKeyTokens[] r0 = com.hansecom.abt.ui.theme.typography.AbtTypographyKeyTokens.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.hansecom.abt.ui.theme.typography.AbtTypographyKeyTokens r1 = com.hansecom.abt.ui.theme.typography.AbtTypographyKeyTokens.SuperLargeTitle     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.hansecom.abt.ui.theme.typography.AbtTypographyKeyTokens r1 = com.hansecom.abt.ui.theme.typography.AbtTypographyKeyTokens.LargeTitle     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.hansecom.abt.ui.theme.typography.AbtTypographyKeyTokens r1 = com.hansecom.abt.ui.theme.typography.AbtTypographyKeyTokens.InputFieldBig     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.hansecom.abt.ui.theme.typography.AbtTypographyKeyTokens r1 = com.hansecom.abt.ui.theme.typography.AbtTypographyKeyTokens.Title1     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.hansecom.abt.ui.theme.typography.AbtTypographyKeyTokens r1 = com.hansecom.abt.ui.theme.typography.AbtTypographyKeyTokens.Title2     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.hansecom.abt.ui.theme.typography.AbtTypographyKeyTokens r1 = com.hansecom.abt.ui.theme.typography.AbtTypographyKeyTokens.Title3     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                com.hansecom.abt.ui.theme.typography.AbtTypographyKeyTokens r1 = com.hansecom.abt.ui.theme.typography.AbtTypographyKeyTokens.Headline     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                com.hansecom.abt.ui.theme.typography.AbtTypographyKeyTokens r1 = com.hansecom.abt.ui.theme.typography.AbtTypographyKeyTokens.BodyEmphasized     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                com.hansecom.abt.ui.theme.typography.AbtTypographyKeyTokens r1 = com.hansecom.abt.ui.theme.typography.AbtTypographyKeyTokens.Body     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                com.hansecom.abt.ui.theme.typography.AbtTypographyKeyTokens r1 = com.hansecom.abt.ui.theme.typography.AbtTypographyKeyTokens.Action     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                com.hansecom.abt.ui.theme.typography.AbtTypographyKeyTokens r1 = com.hansecom.abt.ui.theme.typography.AbtTypographyKeyTokens.Hint     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                com.hansecom.abt.ui.theme.typography.AbtTypographyKeyTokens r1 = com.hansecom.abt.ui.theme.typography.AbtTypographyKeyTokens.Caption1     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                com.hansecom.abt.ui.theme.typography.AbtTypographyKeyTokens r1 = com.hansecom.abt.ui.theme.typography.AbtTypographyKeyTokens.Caption2     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                f38961a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.theme.typography.AbtTypographyKt.WhenMappings.<clinit>():void");
        }
    }

    public static final AbtTypography b() {
        throw new IllegalStateException("CompositionLocal AbtTypography not present");
    }

    public static final TextStyle c(AbtTypography abtTypography, AbtTypographyKeyTokens abtTypographyKeyTokens) {
        switch (WhenMappings.f38961a[abtTypographyKeyTokens.ordinal()]) {
            case 1:
                return abtTypography.j();
            case 2:
                return abtTypography.i();
            case 3:
                return abtTypography.h();
            case 4:
                return abtTypography.k();
            case 5:
                return abtTypography.l();
            case 6:
                return abtTypography.m();
            case 7:
                return abtTypography.f();
            case 8:
                return abtTypography.c();
            case 9:
                return abtTypography.b();
            case 10:
                return abtTypography.a();
            case 11:
                return abtTypography.g();
            case 12:
                return abtTypography.d();
            case 13:
                return abtTypography.e();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final ProvidableCompositionLocal d() {
        return f38960a;
    }

    public static final TextStyle e(AbtTypographyKeyTokens abtTypographyKeyTokens, Composer composer, int i2) {
        Intrinsics.i(abtTypographyKeyTokens, "<this>");
        if (ComposerKt.P()) {
            ComposerKt.Y(1759288856, i2, -1, "com.hansecom.abt.ui.theme.typography.<get-value> (AbtTypography.kt:45)");
        }
        TextStyle c2 = c(AbtTheme.f38851a.d(composer, 6), abtTypographyKeyTokens);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return c2;
    }
}

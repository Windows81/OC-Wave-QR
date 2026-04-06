package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata
public final class MotionSchemeKt {

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10380a;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                androidx.compose.material3.tokens.MotionSchemeKeyTokens[] r0 = androidx.compose.material3.tokens.MotionSchemeKeyTokens.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material3.tokens.MotionSchemeKeyTokens r1 = androidx.compose.material3.tokens.MotionSchemeKeyTokens.DefaultSpatial     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material3.tokens.MotionSchemeKeyTokens r1 = androidx.compose.material3.tokens.MotionSchemeKeyTokens.FastSpatial     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.material3.tokens.MotionSchemeKeyTokens r1 = androidx.compose.material3.tokens.MotionSchemeKeyTokens.SlowSpatial     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.material3.tokens.MotionSchemeKeyTokens r1 = androidx.compose.material3.tokens.MotionSchemeKeyTokens.DefaultEffects     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.compose.material3.tokens.MotionSchemeKeyTokens r1 = androidx.compose.material3.tokens.MotionSchemeKeyTokens.FastEffects     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                androidx.compose.material3.tokens.MotionSchemeKeyTokens r1 = androidx.compose.material3.tokens.MotionSchemeKeyTokens.SlowEffects     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f10380a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MotionSchemeKt.WhenMappings.<clinit>():void");
        }
    }

    public static final FiniteAnimationSpec a(MotionScheme motionScheme, MotionSchemeKeyTokens motionSchemeKeyTokens) {
        switch (WhenMappings.f10380a[motionSchemeKeyTokens.ordinal()]) {
            case 1:
                return motionScheme.f();
            case 2:
                return motionScheme.c();
            case 3:
                return motionScheme.e();
            case 4:
                return motionScheme.d();
            case 5:
                return motionScheme.b();
            case 6:
                return motionScheme.a();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final FiniteAnimationSpec b(MotionSchemeKeyTokens motionSchemeKeyTokens, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-19828261, i2, -1, "androidx.compose.material3.value (MotionScheme.kt:288)");
        }
        FiniteAnimationSpec a2 = a(MaterialTheme.f10273a.c(composer, 6), motionSchemeKeyTokens);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return a2;
    }
}

package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2 extends Lambda implements Function1<EnterExitState, Float> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ExitTransition f2222A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ EnterTransition f2223z;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2224a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.animation.EnterExitState[] r0 = androidx.compose.animation.EnterExitState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.animation.EnterExitState r1 = androidx.compose.animation.EnterExitState.Visible     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.animation.EnterExitState r1 = androidx.compose.animation.EnterExitState.PreEnter     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.animation.EnterExitState r1 = androidx.compose.animation.EnterExitState.PostExit     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f2224a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2.WhenMappings.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2(EnterTransition enterTransition, ExitTransition exitTransition) {
        super(1);
        this.f2223z = enterTransition;
        this.f2222A = exitTransition;
    }

    /* renamed from: b */
    public final Float invoke(EnterExitState enterExitState) {
        int i2 = WhenMappings.f2224a[enterExitState.ordinal()];
        float f2 = 1.0f;
        if (i2 != 1) {
            if (i2 == 2) {
                Fade c2 = this.f2223z.b().c();
                if (c2 != null) {
                    f2 = c2.a();
                }
            } else if (i2 == 3) {
                Fade c3 = this.f2222A.b().c();
                if (c3 != null) {
                    f2 = c3.a();
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Float.valueOf(f2);
    }
}

package androidx.compose.animation;

import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2 extends Lambda implements Function1<EnterExitState, TransformOrigin> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ EnterTransition f2234A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ExitTransition f2235B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TransformOrigin f2236z;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2237a;

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
                f2237a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2.WhenMappings.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2(TransformOrigin transformOrigin, EnterTransition enterTransition, ExitTransition exitTransition) {
        super(1);
        this.f2236z = transformOrigin;
        this.f2234A = enterTransition;
        this.f2235B = exitTransition;
    }

    public final long b(EnterExitState enterExitState) {
        TransformOrigin transformOrigin;
        int i2 = WhenMappings.f2237a[enterExitState.ordinal()];
        if (i2 != 1) {
            transformOrigin = null;
            if (i2 == 2) {
                Scale e2 = this.f2234A.b().e();
                if (!(e2 == null && (e2 = this.f2235B.b().e()) == null)) {
                    transformOrigin = TransformOrigin.b(e2.c());
                }
            } else if (i2 == 3) {
                Scale e3 = this.f2235B.b().e();
                if (!(e3 == null && (e3 = this.f2234A.b().e()) == null)) {
                    transformOrigin = TransformOrigin.b(e3.c());
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            transformOrigin = this.f2236z;
        }
        return transformOrigin != null ? transformOrigin.j() : TransformOrigin.f16150b.a();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return TransformOrigin.b(b((EnterExitState) obj));
    }
}

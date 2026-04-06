package androidx.compose.material.pullrefresh;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PullRefreshIndicatorKt$CircularArrowIndicator$targetAlpha$2$1 extends Lambda implements Function0<Float> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PullRefreshState f9021z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PullRefreshIndicatorKt$CircularArrowIndicator$targetAlpha$2$1(PullRefreshState pullRefreshState) {
        super(0);
        this.f9021z = pullRefreshState;
    }

    /* renamed from: b */
    public final Float invoke() {
        float f2 = 1.0f;
        if (this.f9021z.j() < 1.0f) {
            f2 = 0.3f;
        }
        return Float.valueOf(f2);
    }
}

package androidx.compose.material.pullrefresh;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PullRefreshIndicatorKt$PullRefreshIndicator$showElevation$2$1 extends Lambda implements Function0<Boolean> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PullRefreshState f9027A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f9028z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PullRefreshIndicatorKt$PullRefreshIndicator$showElevation$2$1(boolean z2, PullRefreshState pullRefreshState) {
        super(0);
        this.f9028z = z2;
        this.f9027A = pullRefreshState;
    }

    /* renamed from: b */
    public final Boolean invoke() {
        return Boolean.valueOf(this.f9028z || this.f9027A.i() > 0.5f);
    }
}

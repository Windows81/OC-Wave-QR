package androidx.compose.material.pullrefresh;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PullRefreshIndicatorKt$CircularArrowIndicator$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f9018A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f9019B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PullRefreshState f9020z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PullRefreshIndicatorKt$CircularArrowIndicator$3(PullRefreshState pullRefreshState, long j2, Modifier modifier, int i2) {
        super(2);
        this.f9020z = pullRefreshState;
        this.f9018A = j2;
        this.f9019B = modifier;
        this.C = i2;
    }

    public final void b(Composer composer, int i2) {
        PullRefreshIndicatorKt.b(this.f9020z, this.f9018A, this.f9019B, composer, RecomposeScopeImplKt.a(this.C | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}

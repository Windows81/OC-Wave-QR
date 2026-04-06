package androidx.compose.material.pullrefresh;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PullRefreshIndicatorKt$PullRefreshIndicator$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PullRefreshState f9024A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f9025B;
    public final /* synthetic */ long C;
    public final /* synthetic */ long D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f9026z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PullRefreshIndicatorKt$PullRefreshIndicator$2(boolean z2, PullRefreshState pullRefreshState, Modifier modifier, long j2, long j3, boolean z3, int i2, int i3) {
        super(2);
        this.f9026z = z2;
        this.f9024A = pullRefreshState;
        this.f9025B = modifier;
        this.C = j2;
        this.D = j3;
        this.E = z3;
        this.F = i2;
        this.G = i3;
    }

    public final void b(Composer composer, int i2) {
        PullRefreshIndicatorKt.d(this.f9026z, this.f9024A, this.f9025B, this.C, this.D, this.E, composer, RecomposeScopeImplKt.a(this.F | 1), this.G);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}

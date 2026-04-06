package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ProgressIndicatorKt$LinearProgressIndicator$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f8195A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f8196B;
    public final /* synthetic */ long C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f8197z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$LinearProgressIndicator$2(float f2, Modifier modifier, long j2, long j3, int i2, int i3, int i4) {
        super(2);
        this.f8197z = f2;
        this.f8195A = modifier;
        this.f8196B = j2;
        this.C = j3;
        this.D = i2;
        this.E = i3;
        this.F = i4;
    }

    public final void b(Composer composer, int i2) {
        ProgressIndicatorKt.k(this.f8197z, this.f8195A, this.f8196B, this.C, this.D, composer, RecomposeScopeImplKt.a(this.E | 1), this.F);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}

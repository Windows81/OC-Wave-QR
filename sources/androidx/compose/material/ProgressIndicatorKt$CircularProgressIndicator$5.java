package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ProgressIndicatorKt$CircularProgressIndicator$5 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f8184A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f8185B;
    public final /* synthetic */ float C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f8186z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$CircularProgressIndicator$5(float f2, Modifier modifier, long j2, float f3, int i2, int i3) {
        super(2);
        this.f8186z = f2;
        this.f8184A = modifier;
        this.f8185B = j2;
        this.C = f3;
        this.D = i2;
        this.E = i3;
    }

    public final void b(Composer composer, int i2) {
        ProgressIndicatorKt.c(this.f8186z, this.f8184A, this.f8185B, this.C, composer, RecomposeScopeImplKt.a(this.D | 1), this.E);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}

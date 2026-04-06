package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ProgressIndicatorKt$CircularProgressIndicator$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f8175A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f8176B;
    public final /* synthetic */ float C;
    public final /* synthetic */ long D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f8177z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$CircularProgressIndicator$2(float f2, Modifier modifier, long j2, float f3, long j3, int i2, int i3, int i4) {
        super(2);
        this.f8177z = f2;
        this.f8175A = modifier;
        this.f8176B = j2;
        this.C = f3;
        this.D = j3;
        this.E = i2;
        this.F = i3;
        this.G = i4;
    }

    public final void b(Composer composer, int i2) {
        ProgressIndicatorKt.a(this.f8177z, this.f8175A, this.f8176B, this.C, this.D, this.E, composer, RecomposeScopeImplKt.a(this.F | 1), this.G);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}

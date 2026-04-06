package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ProgressIndicatorKt$LinearProgressIndicator$5 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f8204A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f8205B;
    public final /* synthetic */ long C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f8206z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$LinearProgressIndicator$5(float f2, Modifier modifier, long j2, long j3, int i2, int i3) {
        super(2);
        this.f8206z = f2;
        this.f8204A = modifier;
        this.f8205B = j2;
        this.C = j3;
        this.D = i2;
        this.E = i3;
    }

    public final void b(Composer composer, int i2) {
        ProgressIndicatorKt.l(this.f8206z, this.f8204A, this.f8205B, this.C, composer, RecomposeScopeImplKt.a(this.D | 1), this.E);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}

package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ProgressIndicatorKt$LinearProgressIndicator$4 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f8201A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f8202B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f8203z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$LinearProgressIndicator$4(Modifier modifier, long j2, long j3, int i2, int i3, int i4) {
        super(2);
        this.f8203z = modifier;
        this.f8201A = j2;
        this.f8202B = j3;
        this.C = i2;
        this.D = i3;
        this.E = i4;
    }

    public final void b(Composer composer, int i2) {
        ProgressIndicatorKt.i(this.f8203z, this.f8201A, this.f8202B, this.C, composer, RecomposeScopeImplKt.a(this.D | 1), this.E);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}

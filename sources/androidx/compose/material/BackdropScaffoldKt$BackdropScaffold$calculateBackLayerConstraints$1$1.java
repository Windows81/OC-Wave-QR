package androidx.compose.material;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;

@Metadata
public final class BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1 extends Lambda implements Function1<Constraints, Constraints> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f7239z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1(float f2) {
        super(1);
        this.f7239z = f2;
    }

    public final long b(long j2) {
        return ConstraintsKt.j(Constraints.d(j2, 0, 0, 0, 0, 10, (Object) null), 0, -MathKt.d(this.f7239z), 1, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Constraints.a(b(((Constraints) obj).r()));
    }
}

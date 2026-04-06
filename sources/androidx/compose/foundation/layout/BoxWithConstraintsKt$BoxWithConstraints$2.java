package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BoxWithConstraintsKt$BoxWithConstraints$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Alignment f3803A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f3804B;
    public final /* synthetic */ Function3 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f3805z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BoxWithConstraintsKt$BoxWithConstraints$2(Modifier modifier, Alignment alignment, boolean z2, Function3 function3, int i2, int i3) {
        super(2);
        this.f3805z = modifier;
        this.f3803A = alignment;
        this.f3804B = z2;
        this.C = function3;
        this.D = i2;
        this.E = i3;
    }

    public final void b(Composer composer, int i2) {
        BoxWithConstraintsKt.a(this.f3805z, this.f3803A, this.f3804B, this.C, composer, RecomposeScopeImplKt.a(this.D | 1), this.E);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}

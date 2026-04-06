package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;

@Metadata
public final class SliderKt$CorrectValueSideEffect$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange f8354A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange f8355B;
    public final /* synthetic */ MutableState C;
    public final /* synthetic */ float D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f8356z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$CorrectValueSideEffect$2(Function1 function1, ClosedFloatingPointRange closedFloatingPointRange, ClosedFloatingPointRange closedFloatingPointRange2, MutableState mutableState, float f2, int i2) {
        super(2);
        this.f8356z = function1;
        this.f8354A = closedFloatingPointRange;
        this.f8355B = closedFloatingPointRange2;
        this.C = mutableState;
        this.D = f2;
        this.E = i2;
    }

    public final void b(Composer composer, int i2) {
        SliderKt.a(this.f8356z, this.f8354A, this.f8355B, this.C, this.D, composer, RecomposeScopeImplKt.a(this.E | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}

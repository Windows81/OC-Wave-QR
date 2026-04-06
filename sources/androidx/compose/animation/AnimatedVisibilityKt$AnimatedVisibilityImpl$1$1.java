package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1 extends Lambda implements Function3<MeasureScope, Measurable, Constraints, MeasureResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Transition f2135A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f2136z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1(Function1 function1, Transition transition) {
        super(3);
        this.f2136z = function1;
        this.f2135A = transition;
    }

    public final MeasureResult b(MeasureScope measureScope, Measurable measurable, long j2) {
        long j3;
        final Placeable c0 = measurable.c0(j2);
        if (!measureScope.w1() || ((Boolean) this.f2136z.invoke(this.f2135A.q())).booleanValue()) {
            j3 = IntSize.c((((long) c0.L0()) << 32) | (((long) c0.C0()) & 4294967295L));
        } else {
            j3 = IntSize.f19170b.a();
        }
        return MeasureScope.R1(measureScope, (int) (j3 >> 32), (int) (j3 & 4294967295L), (Map) null, new Function1<Placeable.PlacementScope, Unit>() {
            public final void b(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.j(placementScope, c0, 0, 0, 0.0f, 4, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Placeable.PlacementScope) obj);
                return Unit.f40552a;
            }
        }, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((MeasureScope) obj, (Measurable) obj2, ((Constraints) obj3).r());
    }
}

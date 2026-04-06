package androidx.compose.animation;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SharedTransitionScopeKt$SharedTransitionScope$1$1$1 extends Lambda implements Function3<MeasureScope, Measurable, Constraints, MeasureResult> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SharedTransitionScopeImpl f2376z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeKt$SharedTransitionScope$1$1$1(SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        super(3);
        this.f2376z = sharedTransitionScopeImpl;
    }

    public final MeasureResult b(final MeasureScope measureScope, Measurable measurable, long j2) {
        final Placeable c0 = measurable.c0(j2);
        int L0 = c0.L0();
        int C0 = c0.C0();
        final SharedTransitionScopeImpl sharedTransitionScopeImpl = this.f2376z;
        return MeasureScope.R1(measureScope, L0, C0, (Map) null, new Function1<Placeable.PlacementScope, Unit>() {
            public final void b(Placeable.PlacementScope placementScope) {
                LayoutCoordinates e2 = placementScope.e();
                if (e2 != null) {
                    if (!measureScope.w1()) {
                        sharedTransitionScopeImpl.x(e2);
                    } else {
                        sharedTransitionScopeImpl.w(e2);
                    }
                }
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

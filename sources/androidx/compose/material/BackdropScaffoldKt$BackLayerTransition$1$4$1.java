package androidx.compose.material;

import androidx.compose.runtime.State;
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
public final class BackdropScaffoldKt$BackLayerTransition$1$4$1 extends Lambda implements Function3<MeasureScope, Measurable, Constraints, MeasureResult> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f7198z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackLayerTransition$1$4$1(State state) {
        super(3);
        this.f7198z = state;
    }

    public final MeasureResult b(MeasureScope measureScope, Measurable measurable, long j2) {
        final float j3 = ((float) 1) - BackdropScaffoldKt.b(this.f7198z);
        if (j3 < 0.0f) {
            j3 = 0.0f;
        }
        if (j3 > 1.0f) {
            j3 = 1.0f;
        }
        final Placeable c0 = measurable.c0(j2);
        return MeasureScope.R1(measureScope, c0.L0(), c0.C0(), (Map) null, new Function1<Placeable.PlacementScope, Unit>() {
            public final void b(Placeable.PlacementScope placementScope) {
                placementScope.i(c0, 0, 0, j3);
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

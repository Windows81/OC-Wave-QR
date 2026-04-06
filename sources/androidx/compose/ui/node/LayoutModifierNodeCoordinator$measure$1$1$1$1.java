package androidx.compose.ui.node;

import androidx.compose.ui.layout.MeasureResult;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LayoutModifierNodeCoordinator$measure$1$1$1$1 implements MeasureResult {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MeasureResult f17280a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17281b;

    /* renamed from: c  reason: collision with root package name */
    public final int f17282c;

    public LayoutModifierNodeCoordinator$measure$1$1$1$1(MeasureResult measureResult, LayoutModifierNodeCoordinator layoutModifierNodeCoordinator) {
        this.f17280a = measureResult;
        LookaheadDelegate Q2 = layoutModifierNodeCoordinator.Q2();
        Intrinsics.f(Q2);
        this.f17281b = Q2.L0();
        LookaheadDelegate Q22 = layoutModifierNodeCoordinator.Q2();
        Intrinsics.f(Q22);
        this.f17282c = Q22.C0();
    }

    public int a() {
        return this.f17282c;
    }

    public int b() {
        return this.f17281b;
    }

    public Map q() {
        return this.f17280a.q();
    }

    public void r() {
        this.f17280a.r();
    }

    public Function1 s() {
        return this.f17280a.s();
    }
}

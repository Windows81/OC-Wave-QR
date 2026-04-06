package androidx.compose.ui.layout;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
/* renamed from: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$2  reason: invalid class name */
public final class LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure3p2s80s$$inlined$createMeasureResult$2 implements MeasureResult {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MeasureResult f17068a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LayoutNodeSubcompositionsState f17069b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17070c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ MeasureResult f17071d;

    public LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure3p2s80s$$inlined$createMeasureResult$2(MeasureResult measureResult, LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, int i2, MeasureResult measureResult2) {
        this.f17069b = layoutNodeSubcompositionsState;
        this.f17070c = i2;
        this.f17071d = measureResult2;
        this.f17068a = measureResult;
    }

    public int a() {
        return this.f17068a.a();
    }

    public int b() {
        return this.f17068a.b();
    }

    public Map q() {
        return this.f17068a.q();
    }

    public void r() {
        this.f17069b.C = this.f17070c;
        this.f17071d.r();
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.f17069b;
        layoutNodeSubcompositionsState.x(layoutNodeSubcompositionsState.C);
    }

    public Function1 s() {
        return this.f17068a.s();
    }
}

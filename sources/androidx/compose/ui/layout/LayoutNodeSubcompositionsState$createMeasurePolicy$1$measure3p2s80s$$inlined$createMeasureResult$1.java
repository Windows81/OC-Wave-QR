package androidx.compose.ui.layout;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
/* renamed from: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$1  reason: invalid class name */
public final class LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure3p2s80s$$inlined$createMeasureResult$1 implements MeasureResult {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MeasureResult f17064a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LayoutNodeSubcompositionsState f17065b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17066c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ MeasureResult f17067d;

    public LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure3p2s80s$$inlined$createMeasureResult$1(MeasureResult measureResult, LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, int i2, MeasureResult measureResult2) {
        this.f17065b = layoutNodeSubcompositionsState;
        this.f17066c = i2;
        this.f17067d = measureResult2;
        this.f17064a = measureResult;
    }

    public int a() {
        return this.f17064a.a();
    }

    public int b() {
        return this.f17064a.b();
    }

    public Map q() {
        return this.f17064a.q();
    }

    public void r() {
        this.f17065b.D = this.f17066c;
        this.f17067d.r();
        this.f17065b.y();
    }

    public Function1 s() {
        return this.f17064a.s();
    }
}

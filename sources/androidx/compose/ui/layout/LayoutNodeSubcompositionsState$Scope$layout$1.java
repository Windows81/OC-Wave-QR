package androidx.compose.ui.layout;

import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.node.LookaheadDelegate;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class LayoutNodeSubcompositionsState$Scope$layout$1 implements MeasureResult {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17083a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f17084b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Map f17085c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Function1 f17086d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LayoutNodeSubcompositionsState.Scope f17087e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ LayoutNodeSubcompositionsState f17088f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Function1 f17089g;

    public LayoutNodeSubcompositionsState$Scope$layout$1(int i2, int i3, Map map, Function1 function1, LayoutNodeSubcompositionsState.Scope scope, LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, Function1 function12) {
        this.f17083a = i2;
        this.f17084b = i3;
        this.f17085c = map;
        this.f17086d = function1;
        this.f17087e = scope;
        this.f17088f = layoutNodeSubcompositionsState;
        this.f17089g = function12;
    }

    public int a() {
        return this.f17084b;
    }

    public int b() {
        return this.f17083a;
    }

    public Map q() {
        return this.f17085c;
    }

    public void r() {
        LookaheadDelegate Q2;
        if (!this.f17087e.w1() || (Q2 = this.f17088f.f17063z.V().Q2()) == null) {
            this.f17089g.invoke(this.f17088f.f17063z.V().i1());
        } else {
            this.f17089g.invoke(Q2.i1());
        }
    }

    public Function1 s() {
        return this.f17086d;
    }
}

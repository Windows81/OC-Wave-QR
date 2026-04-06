package androidx.compose.ui.node;

import androidx.compose.ui.layout.MeasureResult;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class LookaheadCapablePlaceable$layout$1 implements MeasureResult {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17327a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f17328b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Map f17329c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Function1 f17330d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Function1 f17331e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ LookaheadCapablePlaceable f17332f;

    public LookaheadCapablePlaceable$layout$1(int i2, int i3, Map map, Function1 function1, Function1 function12, LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        this.f17327a = i2;
        this.f17328b = i3;
        this.f17329c = map;
        this.f17330d = function1;
        this.f17331e = function12;
        this.f17332f = lookaheadCapablePlaceable;
    }

    public int a() {
        return this.f17328b;
    }

    public int b() {
        return this.f17327a;
    }

    public Map q() {
        return this.f17329c;
    }

    public void r() {
        this.f17331e.invoke(this.f17332f.i1());
    }

    public Function1 s() {
        return this.f17330d;
    }
}

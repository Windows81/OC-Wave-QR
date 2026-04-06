package androidx.compose.ui.layout;

import androidx.compose.ui.node.LookaheadCapablePlaceable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class MeasureScope$layout$1 implements MeasureResult {

    /* renamed from: a  reason: collision with root package name */
    public final int f17109a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17110b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f17111c;

    /* renamed from: d  reason: collision with root package name */
    public final Function1 f17112d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f17113e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ MeasureScope f17114f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Function1 f17115g;

    public MeasureScope$layout$1(int i2, int i3, Map map, Function1 function1, MeasureScope measureScope, Function1 function12) {
        this.f17113e = i2;
        this.f17114f = measureScope;
        this.f17115g = function12;
        this.f17109a = i2;
        this.f17110b = i3;
        this.f17111c = map;
        this.f17112d = function1;
    }

    public int a() {
        return this.f17110b;
    }

    public int b() {
        return this.f17109a;
    }

    public Map q() {
        return this.f17111c;
    }

    public void r() {
        MeasureScope measureScope = this.f17114f;
        if (measureScope instanceof LookaheadCapablePlaceable) {
            this.f17115g.invoke(((LookaheadCapablePlaceable) measureScope).i1());
        } else {
            this.f17115g.invoke(new SimplePlacementScope(this.f17113e, this.f17114f.getLayoutDirection()));
        }
    }

    public Function1 s() {
        return this.f17112d;
    }
}

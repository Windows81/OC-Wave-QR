package androidx.compose.ui.layout;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ApproachMeasureScopeImpl$layout$1 implements MeasureResult {

    /* renamed from: a  reason: collision with root package name */
    public final int f17007a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17008b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f17009c;

    /* renamed from: d  reason: collision with root package name */
    public final Function1 f17010d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Function1 f17011e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ApproachMeasureScopeImpl f17012f;

    public ApproachMeasureScopeImpl$layout$1(int i2, int i3, Map map, Function1 function1, Function1 function12, ApproachMeasureScopeImpl approachMeasureScopeImpl) {
        this.f17011e = function12;
        this.f17012f = approachMeasureScopeImpl;
        this.f17007a = i2;
        this.f17008b = i3;
        this.f17009c = map;
        this.f17010d = function1;
    }

    public int a() {
        return this.f17008b;
    }

    public int b() {
        return this.f17007a;
    }

    public Map q() {
        return this.f17009c;
    }

    public void r() {
        this.f17011e.invoke(this.f17012f.F().i1());
    }

    public Function1 s() {
        return this.f17010d;
    }
}

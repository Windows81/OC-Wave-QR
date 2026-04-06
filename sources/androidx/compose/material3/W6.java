package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class W6 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f11729A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ SubcomposeMeasureScope f11730B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ ScrollableTabData D;
    public final /* synthetic */ int E;
    public final /* synthetic */ List F;
    public final /* synthetic */ Constraints G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;
    public final /* synthetic */ Function3 J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f11731z;

    public /* synthetic */ W6(int i2, List list, SubcomposeMeasureScope subcomposeMeasureScope, Function2 function2, ScrollableTabData scrollableTabData, int i3, List list2, Constraints constraints, int i4, int i5, Function3 function3) {
        this.f11731z = i2;
        this.f11729A = list;
        this.f11730B = subcomposeMeasureScope;
        this.C = function2;
        this.D = scrollableTabData;
        this.E = i3;
        this.F = list2;
        this.G = constraints;
        this.H = i4;
        this.I = i5;
        this.J = function3;
    }

    public final Object invoke(Object obj) {
        return TabRowKt$ScrollableTabRowWithSubcomposeImpl$1.g(this.f11731z, this.f11729A, this.f11730B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, (Placeable.PlacementScope) obj);
    }
}

package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;

public final /* synthetic */ class Z6 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SubcomposeMeasureScope f11840A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f11841B;
    public final /* synthetic */ Ref.IntRef C;
    public final /* synthetic */ Constraints D;
    public final /* synthetic */ int E;
    public final /* synthetic */ Function3 F;
    public final /* synthetic */ List G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f11842z;

    public /* synthetic */ Z6(List list, SubcomposeMeasureScope subcomposeMeasureScope, Function2 function2, Ref.IntRef intRef, Constraints constraints, int i2, Function3 function3, List list2, int i3) {
        this.f11842z = list;
        this.f11840A = subcomposeMeasureScope;
        this.f11841B = function2;
        this.C = intRef;
        this.D = constraints;
        this.E = i2;
        this.F = function3;
        this.G = list2;
        this.H = i3;
    }

    public final Object invoke(Object obj) {
        return TabRowKt$TabRowWithSubcomposeImpl$1.g(this.f11842z, this.f11840A, this.f11841B, this.C, this.D, this.E, this.F, this.G, this.H, (Placeable.PlacementScope) obj);
    }
}

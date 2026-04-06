package androidx.compose.material3;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class O6 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MeasureScope f10528A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f10529B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Placeable f10530z;

    public /* synthetic */ O6(Placeable placeable, MeasureScope measureScope, float f2) {
        this.f10530z = placeable;
        this.f10528A = measureScope;
        this.f10529B = f2;
    }

    public final Object invoke(Object obj) {
        return TabIndicatorOffsetNode.d3(this.f10530z, this.f10528A, this.f10529B, (Placeable.PlacementScope) obj);
    }
}

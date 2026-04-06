package androidx.compose.material3;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class J5 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MeasureScope f10168A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ SegmentedButtonContentMeasurePolicy f10169B;
    public final /* synthetic */ int C;
    public final /* synthetic */ List D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f10170z;

    public /* synthetic */ J5(List list, MeasureScope measureScope, SegmentedButtonContentMeasurePolicy segmentedButtonContentMeasurePolicy, int i2, List list2, int i3) {
        this.f10170z = list;
        this.f10168A = measureScope;
        this.f10169B = segmentedButtonContentMeasurePolicy;
        this.C = i2;
        this.D = list2;
        this.E = i3;
    }

    public final Object invoke(Object obj) {
        return SegmentedButtonContentMeasurePolicy.e(this.f10170z, this.f10168A, this.f10169B, this.C, this.D, this.E, (Placeable.PlacementScope) obj);
    }
}

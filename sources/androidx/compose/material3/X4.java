package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class X4 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f11798A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f11799z;

    public /* synthetic */ X4(List list, List list2) {
        this.f11799z = list;
        this.f11798A = list2;
    }

    public final Object invoke(Object obj) {
        return OverflowMeasurePolicy.e(this.f11799z, this.f11798A, (Placeable.PlacementScope) obj);
    }
}

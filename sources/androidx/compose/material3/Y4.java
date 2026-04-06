package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class Y4 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f11817A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f11818z;

    public /* synthetic */ Y4(List list, List list2) {
        this.f11818z = list;
        this.f11817A = list2;
    }

    public final Object invoke(Object obj) {
        return OverflowMeasurePolicy.g(this.f11818z, this.f11817A, (Placeable.PlacementScope) obj);
    }
}

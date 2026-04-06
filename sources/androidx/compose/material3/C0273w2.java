package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.material3.w2  reason: case insensitive filesystem */
public final /* synthetic */ class C0273w2 implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f14448z;

    public /* synthetic */ C0273w2(List list) {
        this.f14448z = list;
    }

    public final Object invoke(Object obj) {
        return EqualWeightContentMeasurePolicy.g(this.f14448z, (Placeable.PlacementScope) obj);
    }
}

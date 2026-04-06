package androidx.compose.foundation.lazy;

import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import kotlin.Metadata;

@Metadata
public final class LazyListState$remeasurementModifier$1 implements RemeasurementModifier {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazyListState f4495z;

    public LazyListState$remeasurementModifier$1(LazyListState lazyListState) {
        this.f4495z = lazyListState;
    }

    public void g2(Remeasurement remeasurement) {
        this.f4495z.f4475k = remeasurement;
    }
}

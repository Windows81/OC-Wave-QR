package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class R2 implements Function3 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ State f10683A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f10684z;

    public /* synthetic */ R2(float f2, State state) {
        this.f10684z = f2;
        this.f10683A = state;
    }

    public final Object d(Object obj, Object obj2, Object obj3) {
        return FloatingActionButtonKt$ExtendedFloatingActionButton$5.q(this.f10684z, this.f10683A, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
    }
}

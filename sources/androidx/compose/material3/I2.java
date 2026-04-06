package androidx.compose.material3;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class I2 implements Function3 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableIntState f10105A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableIntState f10106B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f10107z;

    public /* synthetic */ I2(boolean z2, MutableIntState mutableIntState, MutableIntState mutableIntState2) {
        this.f10107z = z2;
        this.f10105A = mutableIntState;
        this.f10106B = mutableIntState2;
    }

    public final Object d(Object obj, Object obj2, Object obj3) {
        return ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1.q(this.f10107z, this.f10105A, this.f10106B, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
    }
}

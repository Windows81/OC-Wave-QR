package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function0;

public final /* synthetic */ class I7 implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Density f10114A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableState f10115B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AnalogTimePickerState f10116z;

    public /* synthetic */ I7(AnalogTimePickerState analogTimePickerState, Density density, MutableState mutableState) {
        this.f10116z = analogTimePickerState;
        this.f10114A = density;
        this.f10115B = mutableState;
    }

    public final Object invoke() {
        return Boolean.valueOf(TimePickerKt.y(this.f10116z, this.f10114A, this.f10115B));
    }
}

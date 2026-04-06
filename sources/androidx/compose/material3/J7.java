package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class J7 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableState f10171A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableState f10172B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableState f10173z;

    public /* synthetic */ J7(MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        this.f10173z = mutableState;
        this.f10171A = mutableState2;
        this.f10172B = mutableState3;
    }

    public final Object invoke(Object obj) {
        return TimePickerKt.A(this.f10173z, this.f10171A, this.f10172B, (LayoutCoordinates) obj);
    }
}

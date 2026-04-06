package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

public final /* synthetic */ class A7 implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AnalogTimePickerState f9119A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f9120B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ MutableState D;
    public final /* synthetic */ MutableState E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f9121z;

    public /* synthetic */ A7(CoroutineScope coroutineScope, AnalogTimePickerState analogTimePickerState, float f2, boolean z2, MutableState mutableState, MutableState mutableState2) {
        this.f9121z = coroutineScope;
        this.f9119A = analogTimePickerState;
        this.f9120B = f2;
        this.C = z2;
        this.D = mutableState;
        this.E = mutableState2;
    }

    public final Object invoke() {
        return Boolean.valueOf(TimePickerKt.C(this.f9121z, this.f9119A, this.f9120B, this.C, this.D, this.E));
    }
}

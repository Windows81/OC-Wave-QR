package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: androidx.compose.material3.w7  reason: case insensitive filesystem */
public final /* synthetic */ class C0278w7 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AnalogTimePickerState f14456A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f14457B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ MutableState D;
    public final /* synthetic */ MutableState E;
    public final /* synthetic */ State F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f14458z;

    public /* synthetic */ C0278w7(CoroutineScope coroutineScope, AnalogTimePickerState analogTimePickerState, float f2, boolean z2, MutableState mutableState, MutableState mutableState2, State state) {
        this.f14458z = coroutineScope;
        this.f14456A = analogTimePickerState;
        this.f14457B = f2;
        this.C = z2;
        this.D = mutableState;
        this.E = mutableState2;
        this.F = state;
    }

    public final Object invoke(Object obj) {
        return TimePickerKt.B(this.f14458z, this.f14456A, this.f14457B, this.C, this.D, this.E, this.F, (SemanticsPropertyReceiver) obj);
    }
}

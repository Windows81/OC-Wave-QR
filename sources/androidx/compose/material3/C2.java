package androidx.compose.material3;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;

public final /* synthetic */ class C2 implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f9335A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableState f9336B;
    public final /* synthetic */ MutableIntState C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ WindowBoundsCalculator f9337z;

    public /* synthetic */ C2(WindowBoundsCalculator windowBoundsCalculator, int i2, MutableState mutableState, MutableIntState mutableIntState) {
        this.f9337z = windowBoundsCalculator;
        this.f9335A = i2;
        this.f9336B = mutableState;
        this.C = mutableIntState;
    }

    public final Object invoke() {
        return ExposedDropdownMenuKt.j(this.f9337z, this.f9335A, this.f9336B, this.C);
    }
}

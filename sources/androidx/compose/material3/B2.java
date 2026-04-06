package androidx.compose.material3;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class B2 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f9225A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableState f9226B;
    public final /* synthetic */ MutableIntState C;
    public final /* synthetic */ MutableIntState D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ WindowBoundsCalculator f9227z;

    public /* synthetic */ B2(WindowBoundsCalculator windowBoundsCalculator, int i2, MutableState mutableState, MutableIntState mutableIntState, MutableIntState mutableIntState2) {
        this.f9227z = windowBoundsCalculator;
        this.f9225A = i2;
        this.f9226B = mutableState;
        this.C = mutableIntState;
        this.D = mutableIntState2;
    }

    public final Object invoke(Object obj) {
        return ExposedDropdownMenuKt.i(this.f9227z, this.f9225A, this.f9226B, this.C, this.D, (LayoutCoordinates) obj);
    }
}

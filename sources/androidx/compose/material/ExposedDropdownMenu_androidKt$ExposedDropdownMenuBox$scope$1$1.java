package androidx.compose.material;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

@Metadata
public final class ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1 extends ExposedDropdownMenuBoxScope {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Density f7841a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MutableIntState f7842b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MutableIntState f7843c;

    public ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1(Density density, MutableIntState mutableIntState, MutableIntState mutableIntState2) {
        this.f7841a = density;
        this.f7842b = mutableIntState;
        this.f7843c = mutableIntState2;
    }

    public Modifier b(Modifier modifier, boolean z2) {
        Density density = this.f7841a;
        MutableIntState mutableIntState = this.f7842b;
        MutableIntState mutableIntState2 = this.f7843c;
        Modifier k2 = SizeKt.k(modifier, 0.0f, density.D(ExposedDropdownMenu_androidKt.d(mutableIntState)), 1, (Object) null);
        return z2 ? SizeKt.y(k2, density.D(ExposedDropdownMenu_androidKt.b(mutableIntState2))) : k2;
    }
}

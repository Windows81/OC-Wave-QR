package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class Z7 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f11843A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ToggleableAppBarItem f11844z;

    public /* synthetic */ Z7(ToggleableAppBarItem toggleableAppBarItem, int i2) {
        this.f11844z = toggleableAppBarItem;
        this.f11843A = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return ToggleableAppBarItem.f(this.f11844z, this.f11843A, (Composer) obj, ((Integer) obj2).intValue());
    }
}

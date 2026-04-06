package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class F2 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f9987A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f9988B;
    public final /* synthetic */ Function3 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f9989z;

    public /* synthetic */ F2(boolean z2, Function1 function1, Modifier modifier, Function3 function3, int i2, int i3) {
        this.f9989z = z2;
        this.f9987A = function1;
        this.f9988B = modifier;
        this.C = function3;
        this.D = i2;
        this.E = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return ExposedDropdownMenuKt.n(this.f9989z, this.f9987A, this.f9988B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}

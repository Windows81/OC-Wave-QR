package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class Z0 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f11830A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f11831B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f11832z;

    public /* synthetic */ Z0(Function0 function0, boolean z2, Modifier modifier, Function2 function2, int i2, int i3) {
        this.f11832z = function0;
        this.f11830A = z2;
        this.f11831B = modifier;
        this.C = function2;
        this.D = i2;
        this.E = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return DatePickerKt.s0(this.f11832z, this.f11830A, this.f11831B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}

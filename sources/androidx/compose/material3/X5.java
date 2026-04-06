package androidx.compose.material3;

import androidx.compose.material3.SheetState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class X5 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f11800A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f11801B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ boolean D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f11802z;

    public /* synthetic */ X5(boolean z2, Function0 function0, Function0 function02, Function1 function1, boolean z3) {
        this.f11802z = z2;
        this.f11800A = function0;
        this.f11801B = function02;
        this.C = function1;
        this.D = z3;
    }

    public final Object invoke(Object obj) {
        return SheetState.Companion.e(this.f11802z, this.f11800A, this.f11801B, this.C, this.D, (SheetValue) obj);
    }
}

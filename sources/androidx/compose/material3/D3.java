package androidx.compose.material3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class D3 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f9630A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SheetState f9631z;

    public /* synthetic */ D3(SheetState sheetState, Function0 function0) {
        this.f9631z = sheetState;
        this.f9630A = function0;
    }

    public final Object invoke(Object obj) {
        return ModalBottomSheetKt.G(this.f9631z, this.f9630A, (Throwable) obj);
    }
}

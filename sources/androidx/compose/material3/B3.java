package androidx.compose.material3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class B3 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f9228A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SheetState f9229z;

    public /* synthetic */ B3(SheetState sheetState, Function0 function0) {
        this.f9229z = sheetState;
        this.f9228A = function0;
    }

    public final Object invoke(Object obj) {
        return ModalBottomSheetKt.E(this.f9229z, this.f9228A, (Throwable) obj);
    }
}

package androidx.compose.material3;

import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: androidx.compose.material3.x3  reason: case insensitive filesystem */
public final /* synthetic */ class C0283x3 implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f14467A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f14468B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SheetState f14469z;

    public /* synthetic */ C0283x3(SheetState sheetState, CoroutineScope coroutineScope, Function0 function0) {
        this.f14469z = sheetState;
        this.f14467A = coroutineScope;
        this.f14468B = function0;
    }

    public final Object invoke() {
        return ModalBottomSheetKt.D(this.f14469z, this.f14467A, this.f14468B);
    }
}

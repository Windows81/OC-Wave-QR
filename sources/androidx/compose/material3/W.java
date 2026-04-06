package androidx.compose.material3;

import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

public final /* synthetic */ class W implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SheetState f11721A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f11722z;

    public /* synthetic */ W(CoroutineScope coroutineScope, SheetState sheetState) {
        this.f11722z = coroutineScope;
        this.f11721A = sheetState;
    }

    public final Object invoke() {
        return Boolean.valueOf(BottomSheetScaffoldKt$StandardBottomSheet$3$1$1.q(this.f11722z, this.f11721A));
    }
}

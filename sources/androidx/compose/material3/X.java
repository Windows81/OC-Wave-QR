package androidx.compose.material3;

import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

public final /* synthetic */ class X implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SheetState f11784A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f11785z;

    public /* synthetic */ X(CoroutineScope coroutineScope, SheetState sheetState) {
        this.f11785z = coroutineScope;
        this.f11784A = sheetState;
    }

    public final Object invoke() {
        return Boolean.valueOf(BottomSheetScaffoldKt$StandardBottomSheet$3$1$1.s(this.f11785z, this.f11784A));
    }
}

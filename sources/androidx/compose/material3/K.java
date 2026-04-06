package androidx.compose.material3;

import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

public final /* synthetic */ class K implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SheetState f10174A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f10175z;

    public /* synthetic */ K(CoroutineScope coroutineScope, SheetState sheetState) {
        this.f10175z = coroutineScope;
        this.f10174A = sheetState;
    }

    public final Object invoke(Object obj) {
        return BottomSheetScaffoldKt.l(this.f10175z, this.f10174A, ((Float) obj).floatValue());
    }
}

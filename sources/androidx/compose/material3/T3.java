package androidx.compose.material3;

import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

public final /* synthetic */ class T3 implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f11264A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SheetState f11265z;

    public /* synthetic */ T3(SheetState sheetState, CoroutineScope coroutineScope) {
        this.f11265z = sheetState;
        this.f11264A = coroutineScope;
    }

    public final Object invoke() {
        return Boolean.valueOf(ModalBottomSheetKt$ModalBottomSheetContent$7$2$1.s(this.f11265z, this.f11264A));
    }
}

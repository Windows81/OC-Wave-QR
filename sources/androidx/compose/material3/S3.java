package androidx.compose.material3;

import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

public final /* synthetic */ class S3 implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f10754A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ SheetState f10755B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SheetState f10756z;

    public /* synthetic */ S3(SheetState sheetState, CoroutineScope coroutineScope, SheetState sheetState2) {
        this.f10756z = sheetState;
        this.f10754A = coroutineScope;
        this.f10755B = sheetState2;
    }

    public final Object invoke() {
        return Boolean.valueOf(ModalBottomSheetKt$ModalBottomSheetContent$7$2$1.q(this.f10756z, this.f10754A, this.f10755B));
    }
}

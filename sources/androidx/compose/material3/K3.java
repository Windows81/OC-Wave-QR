package androidx.compose.material3;

import androidx.compose.material3.internal.DraggableAnchorsConfig;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class K3 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ IntSize f10183A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ SheetState f10184B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f10185z;

    public /* synthetic */ K3(float f2, IntSize intSize, SheetState sheetState) {
        this.f10185z = f2;
        this.f10183A = intSize;
        this.f10184B = sheetState;
    }

    public final Object invoke(Object obj) {
        return ModalBottomSheetKt.v(this.f10185z, this.f10183A, this.f10184B, (DraggableAnchorsConfig) obj);
    }
}

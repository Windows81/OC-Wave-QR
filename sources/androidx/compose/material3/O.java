package androidx.compose.material3;

import androidx.compose.material3.internal.DraggableAnchorsConfig;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class O implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f10512A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f10513B;
    public final /* synthetic */ float C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SheetState f10514z;

    public /* synthetic */ O(SheetState sheetState, float f2, float f3, float f4) {
        this.f10514z = sheetState;
        this.f10512A = f2;
        this.f10513B = f3;
        this.C = f4;
    }

    public final Object invoke(Object obj) {
        return BottomSheetScaffoldKt.n(this.f10514z, this.f10512A, this.f10513B, this.C, (DraggableAnchorsConfig) obj);
    }
}

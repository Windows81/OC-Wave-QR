package androidx.compose.material3;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class L implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f10194A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SheetState f10195z;

    public /* synthetic */ L(SheetState sheetState, float f2) {
        this.f10195z = sheetState;
        this.f10194A = f2;
    }

    public final Object m(Object obj, Object obj2) {
        return BottomSheetScaffoldKt.m(this.f10195z, this.f10194A, (IntSize) obj, (Constraints) obj2);
    }
}

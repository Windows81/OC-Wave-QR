package androidx.compose.material3;

import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class K0 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f10176A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SelectedRangeInfo f10177z;

    public /* synthetic */ K0(SelectedRangeInfo selectedRangeInfo, DatePickerColors datePickerColors) {
        this.f10177z = selectedRangeInfo;
        this.f10176A = datePickerColors;
    }

    public final Object invoke(Object obj) {
        return DatePickerKt.V(this.f10177z, this.f10176A, (ContentDrawScope) obj);
    }
}

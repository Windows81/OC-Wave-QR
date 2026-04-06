package androidx.compose.material.internal;

import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata
public final class ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$6$1 implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PopupLayout f8976a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LayoutDirection f8977b;

    public ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$6$1(PopupLayout popupLayout, LayoutDirection layoutDirection) {
        this.f8976a = popupLayout;
        this.f8977b = layoutDirection;
    }

    public final MeasureResult b(MeasureScope measureScope, List list, long j2) {
        this.f8976a.setParentLayoutDirection(this.f8977b);
        return MeasureScope.R1(measureScope, 0, 0, (Map) null, AnonymousClass1.f8978z, 4, (Object) null);
    }
}

package androidx.compose.ui.window;

import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata
public final class AndroidPopup_androidKt$Popup$8$1 implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PopupLayout f19293a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LayoutDirection f19294b;

    public AndroidPopup_androidKt$Popup$8$1(PopupLayout popupLayout, LayoutDirection layoutDirection) {
        this.f19293a = popupLayout;
        this.f19294b = layoutDirection;
    }

    public final MeasureResult b(MeasureScope measureScope, List list, long j2) {
        this.f19293a.setParentLayoutDirection(this.f19294b);
        return MeasureScope.R1(measureScope, 0, 0, (Map) null, AnonymousClass1.f19295z, 4, (Object) null);
    }
}

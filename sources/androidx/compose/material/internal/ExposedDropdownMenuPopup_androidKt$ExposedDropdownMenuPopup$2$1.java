package androidx.compose.material.internal;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$2$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f8970A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f8971B;
    public final /* synthetic */ LayoutDirection C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PopupLayout f8972z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$2$1(PopupLayout popupLayout, Function0 function0, String str, LayoutDirection layoutDirection) {
        super(0);
        this.f8972z = popupLayout;
        this.f8970A = function0;
        this.f8971B = str;
        this.C = layoutDirection;
    }

    public final void invoke() {
        this.f8972z.t(this.f8970A, this.f8971B, this.C);
    }
}

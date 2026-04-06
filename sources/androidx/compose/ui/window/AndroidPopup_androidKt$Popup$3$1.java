package androidx.compose.ui.window;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidPopup_androidKt$Popup$3$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f19286A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ PopupProperties f19287B;
    public final /* synthetic */ String C;
    public final /* synthetic */ LayoutDirection D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PopupLayout f19288z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$3$1(PopupLayout popupLayout, Function0 function0, PopupProperties popupProperties, String str, LayoutDirection layoutDirection) {
        super(0);
        this.f19288z = popupLayout;
        this.f19286A = function0;
        this.f19287B = popupProperties;
        this.C = str;
        this.D = layoutDirection;
    }

    public final void invoke() {
        this.f19288z.u(this.f19286A, this.f19287B, this.C, this.D);
    }
}

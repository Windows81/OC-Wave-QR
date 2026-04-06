package androidx.compose.ui.window;

import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PopupLayout$canCalculatePosition$2 extends Lambda implements Function0<Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PopupLayout f19328z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PopupLayout$canCalculatePosition$2(PopupLayout popupLayout) {
        super(0);
        this.f19328z = popupLayout;
    }

    /* renamed from: b */
    public final Boolean invoke() {
        LayoutCoordinates l2 = this.f19328z.getParentLayoutCoordinates();
        if (l2 == null || !l2.b()) {
            l2 = null;
        }
        return Boolean.valueOf((l2 == null || this.f19328z.m12getPopupContentSizebOM6tXw() == null) ? false : true);
    }
}

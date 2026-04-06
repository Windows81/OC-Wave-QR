package androidx.compose.ui.window;

import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidPopup_androidKt$Popup$7$1 extends Lambda implements Function1<LayoutCoordinates, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PopupLayout f19292z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$7$1(PopupLayout popupLayout) {
        super(1);
        this.f19292z = popupLayout;
    }

    public final void b(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates g0 = layoutCoordinates.g0();
        Intrinsics.f(g0);
        this.f19292z.w(g0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((LayoutCoordinates) obj);
        return Unit.f40552a;
    }
}

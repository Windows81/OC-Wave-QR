package androidx.compose.ui.window;

import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidPopup_androidKt$Popup$popupLayout$1$1$1$2$1 extends Lambda implements Function1<IntSize, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PopupLayout f19303z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$popupLayout$1$1$1$2$1(PopupLayout popupLayout) {
        super(1);
        this.f19303z = popupLayout;
    }

    public final void b(long j2) {
        this.f19303z.m13setPopupContentSizefhxjrPA(IntSize.b(j2));
        this.f19303z.y();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((IntSize) obj).j());
        return Unit.f40552a;
    }
}

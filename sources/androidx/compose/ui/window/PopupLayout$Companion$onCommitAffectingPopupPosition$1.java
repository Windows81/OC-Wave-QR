package androidx.compose.ui.window;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PopupLayout$Companion$onCommitAffectingPopupPosition$1 extends Lambda implements Function1<PopupLayout, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final PopupLayout$Companion$onCommitAffectingPopupPosition$1 f19326z = new PopupLayout$Companion$onCommitAffectingPopupPosition$1();

    public PopupLayout$Companion$onCommitAffectingPopupPosition$1() {
        super(1);
    }

    public final void b(PopupLayout popupLayout) {
        if (popupLayout.isAttachedToWindow()) {
            popupLayout.y();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((PopupLayout) obj);
        return Unit.f40552a;
    }
}

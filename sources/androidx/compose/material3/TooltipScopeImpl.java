package androidx.compose.material3;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
public final class TooltipScopeImpl implements TooltipScope {

    /* renamed from: a  reason: collision with root package name */
    public final Function0 f11619a;

    /* renamed from: b  reason: collision with root package name */
    public final PopupPositionProvider f11620b;

    public TooltipScopeImpl(Function0 function0, PopupPositionProvider popupPositionProvider) {
        this.f11619a = function0;
        this.f11620b = popupPositionProvider;
    }

    public PopupPositionProvider a() {
        return this.f11620b;
    }

    public LayoutCoordinates b(MeasureScope measureScope) {
        return (LayoutCoordinates) this.f11619a.invoke();
    }
}

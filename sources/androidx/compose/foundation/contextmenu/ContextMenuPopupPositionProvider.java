package androidx.compose.foundation.contextmenu;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ContextMenuPopupPositionProvider implements PopupPositionProvider {

    /* renamed from: a  reason: collision with root package name */
    public final long f3244a;

    public /* synthetic */ ContextMenuPopupPositionProvider(long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2);
    }

    public long a(IntRect intRect, long j2, LayoutDirection layoutDirection, long j3) {
        return IntOffset.f((((long) ContextMenuPopupPositionProvider_androidKt.b(intRect.g() + IntOffset.k(this.f3244a), (int) (j3 >> 32), (int) (j2 >> 32), layoutDirection == LayoutDirection.Ltr)) << 32) | (((long) ContextMenuPopupPositionProvider_androidKt.c(intRect.j() + IntOffset.l(this.f3244a), (int) (j3 & 4294967295L), (int) (j2 & 4294967295L), false, 8, (Object) null)) & 4294967295L));
    }

    public ContextMenuPopupPositionProvider(long j2) {
        this.f3244a = j2;
    }
}

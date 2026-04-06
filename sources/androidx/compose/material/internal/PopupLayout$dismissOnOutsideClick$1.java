package androidx.compose.material.internal;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntRect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PopupLayout$dismissOnOutsideClick$1 extends Lambda implements Function2<Offset, IntRect, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public static final PopupLayout$dismissOnOutsideClick$1 f8998z = new PopupLayout$dismissOnOutsideClick$1();

    public PopupLayout$dismissOnOutsideClick$1() {
        super(2);
    }

    /* renamed from: b */
    public final Boolean m(Offset offset, IntRect intRect) {
        boolean z2 = false;
        if (offset != null && (Offset.m(offset.t()) < ((float) intRect.g()) || Offset.m(offset.t()) > ((float) intRect.h()) || Offset.n(offset.t()) < ((float) intRect.j()) || Offset.n(offset.t()) > ((float) intRect.d()))) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}

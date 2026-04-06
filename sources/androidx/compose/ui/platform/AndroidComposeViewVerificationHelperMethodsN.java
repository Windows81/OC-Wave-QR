package androidx.compose.ui.platform;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.input.pointer.AndroidPointerIcon;
import androidx.compose.ui.input.pointer.AndroidPointerIconType;
import androidx.compose.ui.input.pointer.PointerIcon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class AndroidComposeViewVerificationHelperMethodsN {

    /* renamed from: a  reason: collision with root package name */
    public static final AndroidComposeViewVerificationHelperMethodsN f17588a = new AndroidComposeViewVerificationHelperMethodsN();

    public final void a(View view, PointerIcon pointerIcon) {
        android.view.PointerIcon b2 = b(view.getContext(), pointerIcon);
        if (!Intrinsics.d(view.getPointerIcon(), b2)) {
            view.setPointerIcon(b2);
        }
    }

    public final android.view.PointerIcon b(Context context, PointerIcon pointerIcon) {
        return pointerIcon instanceof AndroidPointerIcon ? ((AndroidPointerIcon) pointerIcon).a() : pointerIcon instanceof AndroidPointerIconType ? android.view.PointerIcon.getSystemIcon(context, ((AndroidPointerIconType) pointerIcon).a()) : android.view.PointerIcon.getSystemIcon(context, 1000);
    }
}

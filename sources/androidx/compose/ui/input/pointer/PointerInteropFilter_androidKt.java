package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import kotlin.Metadata;

@Metadata
public final class PointerInteropFilter_androidKt {
    public static final Modifier a(Modifier modifier, AndroidViewHolder androidViewHolder) {
        PointerInteropFilter pointerInteropFilter = new PointerInteropFilter();
        pointerInteropFilter.d(new PointerInteropFilter_androidKt$pointerInteropFilter$3(androidViewHolder));
        RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent = new RequestDisallowInterceptTouchEvent();
        pointerInteropFilter.e(requestDisallowInterceptTouchEvent);
        androidViewHolder.setOnRequestDisallowInterceptTouchEvent$ui_release(requestDisallowInterceptTouchEvent);
        return modifier.o0(pointerInteropFilter);
    }
}

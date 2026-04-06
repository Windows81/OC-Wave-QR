package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PointerInteropFilter_androidKt$pointerInteropFilter$3 extends Lambda implements Function1<MotionEvent, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidViewHolder f16931z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter_androidKt$pointerInteropFilter$3(AndroidViewHolder androidViewHolder) {
        super(1);
        this.f16931z = androidViewHolder;
    }

    /* renamed from: b */
    public final Boolean invoke(MotionEvent motionEvent) {
        boolean z2;
        switch (motionEvent.getActionMasked()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                z2 = this.f16931z.dispatchTouchEvent(motionEvent);
                break;
            default:
                z2 = this.f16931z.dispatchGenericMotionEvent(motionEvent);
                break;
        }
        return Boolean.valueOf(z2);
    }
}

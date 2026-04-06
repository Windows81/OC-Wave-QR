package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LongPressTextDragObserverKt$detectDragGesturesWithObserver$4 extends Lambda implements Function0<Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextDragObserver f5827z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LongPressTextDragObserverKt$detectDragGesturesWithObserver$4(TextDragObserver textDragObserver) {
        super(0);
        this.f5827z = textDragObserver;
    }

    public final void invoke() {
        this.f5827z.onCancel();
    }
}

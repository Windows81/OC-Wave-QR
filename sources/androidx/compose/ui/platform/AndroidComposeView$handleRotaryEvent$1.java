package androidx.compose.ui.platform;

import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidComposeView$handleRotaryEvent$1 extends Lambda implements Function0<Boolean> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MotionEvent f17509A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f17510z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$handleRotaryEvent$1(AndroidComposeView androidComposeView, MotionEvent motionEvent) {
        super(0);
        this.f17510z = androidComposeView;
        this.f17509A = motionEvent;
    }

    /* renamed from: b */
    public final Boolean invoke() {
        return Boolean.valueOf(AndroidComposeView$handleRotaryEvent$1.super.dispatchGenericMotionEvent(this.f17509A));
    }
}

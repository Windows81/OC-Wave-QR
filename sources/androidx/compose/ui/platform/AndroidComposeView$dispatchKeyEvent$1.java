package androidx.compose.ui.platform;

import android.view.KeyEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidComposeView$dispatchKeyEvent$1 extends Lambda implements Function0<Boolean> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ KeyEvent f17505A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f17506z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$dispatchKeyEvent$1(AndroidComposeView androidComposeView, KeyEvent keyEvent) {
        super(0);
        this.f17506z = androidComposeView;
        this.f17505A = keyEvent;
    }

    /* renamed from: b */
    public final Boolean invoke() {
        return Boolean.valueOf(AndroidComposeView$dispatchKeyEvent$1.super.dispatchKeyEvent(this.f17505A));
    }
}

package androidx.activity.compose;

import androidx.activity.OnBackPressedCallback;
import androidx.compose.runtime.State;
import kotlin.Metadata;

@Metadata
public final class BackHandlerKt$BackHandler$backCallback$1$1 extends OnBackPressedCallback {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ State f144d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackHandlerKt$BackHandler$backCallback$1$1(boolean z2, State state) {
        super(z2);
        this.f144d = state;
    }

    public void d() {
        BackHandlerKt.b(this.f144d).invoke();
    }
}

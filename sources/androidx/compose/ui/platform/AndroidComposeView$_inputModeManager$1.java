package androidx.compose.ui.platform;

import androidx.compose.ui.input.InputMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidComposeView$_inputModeManager$1 extends Lambda implements Function1<InputMode, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f17499z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$_inputModeManager$1(AndroidComposeView androidComposeView) {
        super(1);
        this.f17499z = androidComposeView;
    }

    public final Boolean b(int i2) {
        InputMode.Companion companion = InputMode.f16742b;
        return Boolean.valueOf(InputMode.f(i2, companion.b()) ? this.f17499z.isInTouchMode() : InputMode.f(i2, companion.a()) ? this.f17499z.isInTouchMode() ? this.f17499z.requestFocusFromTouch() : true : false);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((InputMode) obj).i());
    }
}

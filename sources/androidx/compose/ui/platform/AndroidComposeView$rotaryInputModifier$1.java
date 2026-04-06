package androidx.compose.ui.platform;

import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidComposeView$rotaryInputModifier$1 extends Lambda implements Function1<RotaryScrollEvent, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public static final AndroidComposeView$rotaryInputModifier$1 f17526z = new AndroidComposeView$rotaryInputModifier$1();

    public AndroidComposeView$rotaryInputModifier$1() {
        super(1);
    }

    /* renamed from: b */
    public final Boolean invoke(RotaryScrollEvent rotaryScrollEvent) {
        return Boolean.FALSE;
    }
}

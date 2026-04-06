package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.ui.platform.PlatformTextInputSession;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.input.ImeOptions;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.MutableSharedFlow;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt", f = "AndroidTextInputSession.android.kt", l = {84}, m = "platformSpecificTextInputSession")
public final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public int D;

    public AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.D |= Integer.MIN_VALUE;
        return AndroidTextInputSession_androidKt.d((PlatformTextInputSession) null, (TransformedTextFieldState) null, (TextLayoutState) null, (ImeOptions) null, (ReceiveContentConfiguration) null, (Function1) null, (Function0) null, (ComposeInputMethodManager) null, (MutableSharedFlow) null, (ViewConfiguration) null, this);
    }
}

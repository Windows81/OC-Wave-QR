package androidx.compose.ui.text.input;

import android.os.Build;
import android.view.inputmethod.InputConnection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class NullableInputConnectionWrapper_androidKt {
    public static final NullableInputConnectionWrapper a(InputConnection inputConnection, Function1 function1) {
        return Build.VERSION.SDK_INT >= 34 ? new NullableInputConnectionWrapperApi34(inputConnection, function1) : new NullableInputConnectionWrapperApi25(inputConnection, function1);
    }
}

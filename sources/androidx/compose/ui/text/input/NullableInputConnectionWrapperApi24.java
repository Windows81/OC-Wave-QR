package androidx.compose.ui.text.input;

import android.os.Handler;
import android.view.inputmethod.InputConnection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
class NullableInputConnectionWrapperApi24 extends NullableInputConnectionWrapperApi21 {
    public NullableInputConnectionWrapperApi24(InputConnection inputConnection, Function1 function1) {
        super(inputConnection, function1);
    }

    public final void b(InputConnection inputConnection) {
        inputConnection.closeConnection();
    }

    public final boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        InputConnection c2 = c();
        if (c2 != null) {
            return c2.deleteSurroundingTextInCodePoints(i2, i3);
        }
        return false;
    }

    public final Handler getHandler() {
        InputConnection c2 = c();
        if (c2 != null) {
            return c2.getHandler();
        }
        return null;
    }
}

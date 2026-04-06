package androidx.compose.ui.text.input;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
class NullableInputConnectionWrapperApi25 extends NullableInputConnectionWrapperApi24 {
    public NullableInputConnectionWrapperApi25(InputConnection inputConnection, Function1 function1) {
        super(inputConnection, function1);
    }

    public final boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        InputConnection c2 = c();
        if (c2 != null) {
            return c2.commitContent(inputContentInfo, i2, bundle);
        }
        return false;
    }
}

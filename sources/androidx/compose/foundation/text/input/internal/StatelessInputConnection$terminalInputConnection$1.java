package androidx.compose.foundation.text.input.internal;

import android.os.Bundle;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import kotlin.Metadata;

@Metadata
public final class StatelessInputConnection$terminalInputConnection$1 extends InputConnectionWrapper {
    public StatelessInputConnection$terminalInputConnection$1(StatelessInputConnection statelessInputConnection) {
        super(statelessInputConnection, false);
    }

    public boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        return false;
    }

    public boolean performPrivateCommand(String str, Bundle bundle) {
        return true;
    }
}

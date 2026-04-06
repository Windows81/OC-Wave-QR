package androidx.compose.ui.text.input;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
class NullableInputConnectionWrapperApi21 implements NullableInputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final Function1 f18865a;

    /* renamed from: b  reason: collision with root package name */
    public InputConnection f18866b;

    public NullableInputConnectionWrapperApi21(InputConnection inputConnection, Function1 function1) {
        this.f18865a = function1;
        this.f18866b = inputConnection;
    }

    public final void a() {
        InputConnection inputConnection = this.f18866b;
        if (inputConnection != null) {
            b(inputConnection);
            this.f18866b = null;
        }
    }

    public void b(InputConnection inputConnection) {
    }

    public boolean beginBatchEdit() {
        InputConnection inputConnection = this.f18866b;
        if (inputConnection != null) {
            return inputConnection.beginBatchEdit();
        }
        return false;
    }

    public final InputConnection c() {
        return this.f18866b;
    }

    public boolean clearMetaKeyStates(int i2) {
        InputConnection inputConnection = this.f18866b;
        if (inputConnection != null) {
            return inputConnection.clearMetaKeyStates(i2);
        }
        return false;
    }

    public final void closeConnection() {
        if (this.f18866b != null) {
            a();
            this.f18865a.invoke(this);
        }
    }

    public boolean commitCompletion(CompletionInfo completionInfo) {
        InputConnection inputConnection = this.f18866b;
        if (inputConnection != null) {
            return inputConnection.commitCompletion(completionInfo);
        }
        return false;
    }

    public boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        return false;
    }

    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        InputConnection inputConnection = this.f18866b;
        if (inputConnection != null) {
            return inputConnection.commitCorrection(correctionInfo);
        }
        return false;
    }

    public boolean commitText(CharSequence charSequence, int i2) {
        InputConnection inputConnection = this.f18866b;
        if (inputConnection != null) {
            return inputConnection.commitText(charSequence, i2);
        }
        return false;
    }

    public boolean deleteSurroundingText(int i2, int i3) {
        InputConnection inputConnection = this.f18866b;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingText(i2, i3);
        }
        return false;
    }

    public boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        return false;
    }

    public boolean endBatchEdit() {
        InputConnection inputConnection = this.f18866b;
        if (inputConnection != null) {
            return inputConnection.endBatchEdit();
        }
        return false;
    }

    public boolean finishComposingText() {
        InputConnection inputConnection = this.f18866b;
        if (inputConnection != null) {
            return inputConnection.finishComposingText();
        }
        return false;
    }

    public int getCursorCapsMode(int i2) {
        InputConnection inputConnection = this.f18866b;
        if (inputConnection != null) {
            return inputConnection.getCursorCapsMode(i2);
        }
        return 0;
    }

    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i2) {
        InputConnection inputConnection = this.f18866b;
        if (inputConnection != null) {
            return inputConnection.getExtractedText(extractedTextRequest, i2);
        }
        return null;
    }

    public Handler getHandler() {
        return null;
    }

    public CharSequence getSelectedText(int i2) {
        InputConnection inputConnection = this.f18866b;
        if (inputConnection != null) {
            return inputConnection.getSelectedText(i2);
        }
        return null;
    }

    public CharSequence getTextAfterCursor(int i2, int i3) {
        InputConnection inputConnection = this.f18866b;
        if (inputConnection != null) {
            return inputConnection.getTextAfterCursor(i2, i3);
        }
        return null;
    }

    public CharSequence getTextBeforeCursor(int i2, int i3) {
        InputConnection inputConnection = this.f18866b;
        if (inputConnection != null) {
            return inputConnection.getTextBeforeCursor(i2, i3);
        }
        return null;
    }

    public boolean performContextMenuAction(int i2) {
        InputConnection inputConnection = this.f18866b;
        if (inputConnection != null) {
            return inputConnection.performContextMenuAction(i2);
        }
        return false;
    }

    public boolean performEditorAction(int i2) {
        InputConnection inputConnection = this.f18866b;
        if (inputConnection != null) {
            return inputConnection.performEditorAction(i2);
        }
        return false;
    }

    public boolean performPrivateCommand(String str, Bundle bundle) {
        InputConnection inputConnection = this.f18866b;
        if (inputConnection != null) {
            return inputConnection.performPrivateCommand(str, bundle);
        }
        return false;
    }

    public boolean reportFullscreenMode(boolean z2) {
        InputConnection inputConnection = this.f18866b;
        if (inputConnection != null) {
            return inputConnection.reportFullscreenMode(z2);
        }
        return false;
    }

    public boolean requestCursorUpdates(int i2) {
        InputConnection inputConnection = this.f18866b;
        if (inputConnection != null) {
            return inputConnection.requestCursorUpdates(i2);
        }
        return false;
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        InputConnection inputConnection = this.f18866b;
        if (inputConnection != null) {
            return inputConnection.sendKeyEvent(keyEvent);
        }
        return false;
    }

    public boolean setComposingRegion(int i2, int i3) {
        InputConnection inputConnection = this.f18866b;
        if (inputConnection != null) {
            return inputConnection.setComposingRegion(i2, i3);
        }
        return false;
    }

    public boolean setComposingText(CharSequence charSequence, int i2) {
        InputConnection inputConnection = this.f18866b;
        if (inputConnection != null) {
            return inputConnection.setComposingText(charSequence, i2);
        }
        return false;
    }

    public boolean setSelection(int i2, int i3) {
        InputConnection inputConnection = this.f18866b;
        if (inputConnection != null) {
            return inputConnection.setSelection(i2, i3);
        }
        return false;
    }
}

package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldCharSequenceKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.core.view.inputmethod.InputConnectionCompat;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class StatelessInputConnection implements InputConnection {

    /* renamed from: a  reason: collision with root package name */
    public final TextInputSession f6280a;

    /* renamed from: b  reason: collision with root package name */
    public int f6281b;

    /* renamed from: c  reason: collision with root package name */
    public final MutableVector f6282c = new MutableVector(new Function1[16], 0);

    /* renamed from: d  reason: collision with root package name */
    public final StatelessInputConnection$terminalInputConnection$1 f6283d;

    /* renamed from: e  reason: collision with root package name */
    public final InputConnection f6284e;

    public StatelessInputConnection(TextInputSession textInputSession, EditorInfo editorInfo) {
        this.f6280a = textInputSession;
        StatelessInputConnection$terminalInputConnection$1 statelessInputConnection$terminalInputConnection$1 = new StatelessInputConnection$terminalInputConnection$1(this);
        this.f6283d = statelessInputConnection$terminalInputConnection$1;
        this.f6284e = InputConnectionCompat.d(statelessInputConnection$terminalInputConnection$1, editorInfo, new StatelessInputConnection$commitContentDelegateInputConnection$1(this));
    }

    public boolean beginBatchEdit() {
        g("beginBatchEdit()");
        return d();
    }

    public boolean clearMetaKeyStates(int i2) {
        g("clearMetaKeyStates(" + i2 + ')');
        return false;
    }

    public void closeConnection() {
        g("closeConnection()");
        this.f6282c.l();
        this.f6281b = 0;
    }

    public boolean commitCompletion(CompletionInfo completionInfo) {
        StringBuilder sb = new StringBuilder();
        sb.append("commitCompletion(");
        sb.append(completionInfo != null ? completionInfo.getText() : null);
        sb.append(')');
        g(sb.toString());
        return false;
    }

    public boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        g("commitContent(" + inputContentInfo + ", " + i2 + ", " + bundle + ')');
        return Api25CommitContentImpl.f6123a.a(this.f6284e, inputContentInfo, i2, bundle);
    }

    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        return true;
    }

    public boolean commitText(CharSequence charSequence, int i2) {
        g("commitText(\"" + charSequence + "\", " + i2 + ')');
        if (charSequence == null) {
            return true;
        }
        ImeEditCommand_androidKt.b(this.f6280a, charSequence.toString(), i2);
        return true;
    }

    public final boolean d() {
        return this.f6280a.beginBatchEdit();
    }

    public boolean deleteSurroundingText(int i2, int i3) {
        g("deleteSurroundingText(" + i2 + ", " + i3 + ')');
        ImeEditCommand_androidKt.c(this.f6280a, i2, i3);
        return true;
    }

    public boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        g("deleteSurroundingTextInCodePoints(" + i2 + ", " + i3 + ')');
        ImeEditCommand_androidKt.d(this.f6280a, i2, i3);
        return true;
    }

    public final boolean e() {
        return this.f6280a.endBatchEdit();
    }

    public boolean endBatchEdit() {
        g("endBatchEdit()");
        return e();
    }

    public final TextFieldCharSequence f() {
        return this.f6280a.b();
    }

    public boolean finishComposingText() {
        g("finishComposingText()");
        ImeEditCommand_androidKt.e(this.f6280a);
        return true;
    }

    public final void g(String str) {
    }

    public int getCursorCapsMode(int i2) {
        g("getCursorCapsMode(" + i2 + ')');
        return TextUtils.getCapsMode(f(), TextRange.l(f().g()), i2);
    }

    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i2) {
        g("getExtractedText(" + extractedTextRequest + ", " + i2 + ')');
        return StatelessInputConnection_androidKt.e(f());
    }

    public Handler getHandler() {
        g("getHandler()");
        return null;
    }

    public CharSequence getSelectedText(int i2) {
        String obj = TextRange.h(f().g()) ? null : TextFieldCharSequenceKt.a(f()).toString();
        g("getSelectedText(" + i2 + "): " + obj);
        return obj;
    }

    public CharSequence getTextAfterCursor(int i2, int i3) {
        String obj = TextFieldCharSequenceKt.b(f(), i2).toString();
        g("getTextAfterCursor(" + i2 + ", " + i3 + "): " + obj);
        return obj;
    }

    public CharSequence getTextBeforeCursor(int i2, int i3) {
        String obj = TextFieldCharSequenceKt.c(f(), i2).toString();
        g("getTextBeforeCursor(" + i2 + ", " + i3 + "): " + obj);
        return obj;
    }

    public final void h(int i2) {
        sendKeyEvent(new KeyEvent(0, i2));
        sendKeyEvent(new KeyEvent(1, i2));
    }

    public boolean performContextMenuAction(int i2) {
        g("performContextMenuAction(" + i2 + ')');
        switch (i2) {
            case 16908319:
                ImeEditCommand_androidKt.k(this.f6280a, 0, f().length());
                break;
            case 16908320:
                h(277);
                break;
            case 16908321:
                h(278);
                break;
            case 16908322:
                h(279);
                break;
        }
        return false;
    }

    public boolean performEditorAction(int i2) {
        int i3;
        g("performEditorAction(" + i2 + ')');
        if (i2 != 0) {
            switch (i2) {
                case 2:
                    i3 = ImeAction.f18821b.c();
                    break;
                case 3:
                    i3 = ImeAction.f18821b.g();
                    break;
                case 4:
                    i3 = ImeAction.f18821b.h();
                    break;
                case 5:
                    i3 = ImeAction.f18821b.d();
                    break;
                case 6:
                    i3 = ImeAction.f18821b.b();
                    break;
                case 7:
                    i3 = ImeAction.f18821b.f();
                    break;
                default:
                    g("IME sent an unrecognized editor action: " + i2);
                    i3 = ImeAction.f18821b.a();
                    break;
            }
        } else {
            i3 = ImeAction.f18821b.a();
        }
        this.f6280a.a(i3);
        return true;
    }

    public void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        g("performHandwritingGesture(" + handwritingGesture + ", " + executor + ", " + intConsumer + ')');
        if (Build.VERSION.SDK_INT >= 34) {
            Api34PerformHandwritingGestureImpl.f6125a.b(this.f6280a, handwritingGesture, executor, intConsumer);
        }
    }

    public boolean performPrivateCommand(String str, Bundle bundle) {
        g("performPrivateCommand(" + str + ", " + bundle + ')');
        return this.f6284e.performPrivateCommand(str, bundle);
    }

    public boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        g("previewHandwritingGesture(" + previewableHandwritingGesture + ", " + cancellationSignal + ')');
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        return Api34PerformHandwritingGestureImpl.f6125a.d(this.f6280a, previewableHandwritingGesture, cancellationSignal);
    }

    public boolean reportFullscreenMode(boolean z2) {
        g("reportFullscreenMode(" + z2 + ')');
        return false;
    }

    public boolean requestCursorUpdates(int i2) {
        g("requestCursorUpdates(" + i2 + ')');
        this.f6280a.requestCursorUpdates(i2);
        return true;
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        g("sendKeyEvent(" + keyEvent + ')');
        this.f6280a.sendKeyEvent(keyEvent);
        return true;
    }

    public boolean setComposingRegion(int i2, int i3) {
        g("setComposingRegion(" + i2 + ", " + i3 + ')');
        ImeEditCommand_androidKt.i(this.f6280a, i2, i3);
        return true;
    }

    public boolean setComposingText(CharSequence charSequence, int i2) {
        g("setComposingText(\"" + charSequence + "\", " + i2 + ')');
        if (charSequence == null) {
            return true;
        }
        TextInputSession textInputSession = this.f6280a;
        String obj = charSequence.toString();
        List list = null;
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (spanned != null) {
            list = StatelessInputConnection_androidKt.d(spanned);
        }
        ImeEditCommand_androidKt.j(textInputSession, obj, i2, list);
        return true;
    }

    public boolean setSelection(int i2, int i3) {
        g("setSelection(" + i2 + ", " + i3 + ')');
        ImeEditCommand_androidKt.k(this.f6280a, i2, i3);
        return true;
    }
}

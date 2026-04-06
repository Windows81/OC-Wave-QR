package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextInCodePointsCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.SetComposingRegionCommand;
import androidx.compose.ui.text.input.SetComposingTextCommand;
import androidx.compose.ui.text.input.SetSelectionCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextFieldValueKt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata
public final class RecordingInputConnection implements InputConnection {

    /* renamed from: a  reason: collision with root package name */
    public final InputEventCallback2 f6265a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6266b;

    /* renamed from: c  reason: collision with root package name */
    public final LegacyTextFieldState f6267c;

    /* renamed from: d  reason: collision with root package name */
    public final TextFieldSelectionManager f6268d;

    /* renamed from: e  reason: collision with root package name */
    public final ViewConfiguration f6269e;

    /* renamed from: f  reason: collision with root package name */
    public int f6270f;

    /* renamed from: g  reason: collision with root package name */
    public TextFieldValue f6271g;

    /* renamed from: h  reason: collision with root package name */
    public int f6272h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6273i;

    /* renamed from: j  reason: collision with root package name */
    public final List f6274j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public boolean f6275k = true;

    public RecordingInputConnection(TextFieldValue textFieldValue, InputEventCallback2 inputEventCallback2, boolean z2, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, ViewConfiguration viewConfiguration) {
        this.f6265a = inputEventCallback2;
        this.f6266b = z2;
        this.f6267c = legacyTextFieldState;
        this.f6268d = textFieldSelectionManager;
        this.f6269e = viewConfiguration;
        this.f6271g = textFieldValue;
    }

    public boolean beginBatchEdit() {
        boolean z2 = this.f6275k;
        return z2 ? d() : z2;
    }

    public final void c(EditCommand editCommand) {
        d();
        try {
            this.f6274j.add(editCommand);
        } finally {
            e();
        }
    }

    public boolean clearMetaKeyStates(int i2) {
        boolean z2 = this.f6275k;
        if (z2) {
            return false;
        }
        return z2;
    }

    public void closeConnection() {
        this.f6274j.clear();
        this.f6270f = 0;
        this.f6275k = false;
        this.f6265a.e(this);
    }

    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z2 = this.f6275k;
        if (z2) {
            return false;
        }
        return z2;
    }

    public boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        boolean z2 = this.f6275k;
        if (z2) {
            return false;
        }
        return z2;
    }

    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z2 = this.f6275k;
        return z2 ? this.f6266b : z2;
    }

    public boolean commitText(CharSequence charSequence, int i2) {
        boolean z2 = this.f6275k;
        if (z2) {
            c(new CommitTextCommand(String.valueOf(charSequence), i2));
        }
        return z2;
    }

    public final boolean d() {
        this.f6270f++;
        return true;
    }

    public boolean deleteSurroundingText(int i2, int i3) {
        boolean z2 = this.f6275k;
        if (!z2) {
            return z2;
        }
        c(new DeleteSurroundingTextCommand(i2, i3));
        return true;
    }

    public boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        boolean z2 = this.f6275k;
        if (!z2) {
            return z2;
        }
        c(new DeleteSurroundingTextInCodePointsCommand(i2, i3));
        return true;
    }

    public final boolean e() {
        int i2 = this.f6270f - 1;
        this.f6270f = i2;
        if (i2 == 0 && !this.f6274j.isEmpty()) {
            this.f6265a.d(CollectionsKt.P0(this.f6274j));
            this.f6274j.clear();
        }
        return this.f6270f > 0;
    }

    public boolean endBatchEdit() {
        return e();
    }

    public final void f(int i2) {
        sendKeyEvent(new KeyEvent(0, i2));
        sendKeyEvent(new KeyEvent(1, i2));
    }

    public boolean finishComposingText() {
        boolean z2 = this.f6275k;
        if (!z2) {
            return z2;
        }
        c(new FinishComposingTextCommand());
        return true;
    }

    public final void g(TextFieldValue textFieldValue) {
        this.f6271g = textFieldValue;
    }

    public int getCursorCapsMode(int i2) {
        return TextUtils.getCapsMode(this.f6271g.i(), TextRange.l(this.f6271g.h()), i2);
    }

    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i2) {
        boolean z2 = true;
        int i3 = 0;
        if ((i2 & 1) == 0) {
            z2 = false;
        }
        this.f6273i = z2;
        if (z2) {
            if (extractedTextRequest != null) {
                i3 = extractedTextRequest.token;
            }
            this.f6272h = i3;
        }
        return RecordingInputConnection_androidKt.b(this.f6271g);
    }

    public Handler getHandler() {
        return null;
    }

    public CharSequence getSelectedText(int i2) {
        if (TextRange.h(this.f6271g.h())) {
            return null;
        }
        return TextFieldValueKt.a(this.f6271g).toString();
    }

    public CharSequence getTextAfterCursor(int i2, int i3) {
        return TextFieldValueKt.b(this.f6271g, i2).toString();
    }

    public CharSequence getTextBeforeCursor(int i2, int i3) {
        return TextFieldValueKt.c(this.f6271g, i2).toString();
    }

    public final void h(TextFieldValue textFieldValue, InputMethodManager inputMethodManager) {
        if (this.f6275k) {
            g(textFieldValue);
            if (this.f6273i) {
                inputMethodManager.e(this.f6272h, RecordingInputConnection_androidKt.b(textFieldValue));
            }
            TextRange g2 = textFieldValue.g();
            int i2 = -1;
            int l2 = g2 != null ? TextRange.l(g2.r()) : -1;
            TextRange g3 = textFieldValue.g();
            if (g3 != null) {
                i2 = TextRange.k(g3.r());
            }
            inputMethodManager.a(TextRange.l(textFieldValue.h()), TextRange.k(textFieldValue.h()), l2, i2);
        }
    }

    public boolean performContextMenuAction(int i2) {
        boolean z2 = this.f6275k;
        if (z2) {
            z2 = false;
            switch (i2) {
                case 16908319:
                    c(new SetSelectionCommand(0, this.f6271g.i().length()));
                    break;
                case 16908320:
                    f(277);
                    break;
                case 16908321:
                    f(278);
                    break;
                case 16908322:
                    f(279);
                    break;
            }
        }
        return z2;
    }

    public boolean performEditorAction(int i2) {
        int i3;
        boolean z2 = this.f6275k;
        if (!z2) {
            return z2;
        }
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
                    Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i2);
                    i3 = ImeAction.f18821b.a();
                    break;
            }
        } else {
            i3 = ImeAction.f18821b.a();
        }
        this.f6265a.a(i3);
        return true;
    }

    public void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            Api34LegacyPerformHandwritingGestureImpl.f6124a.b(this.f6267c, this.f6268d, handwritingGesture, this.f6269e, executor, intConsumer, new RecordingInputConnection$performHandwritingGesture$1(this));
        }
    }

    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z2 = this.f6275k;
        if (z2) {
            return true;
        }
        return z2;
    }

    public boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34LegacyPerformHandwritingGestureImpl.f6124a.d(this.f6267c, this.f6268d, previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }

    public boolean reportFullscreenMode(boolean z2) {
        return false;
    }

    public boolean requestCursorUpdates(int i2) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = this.f6275k;
        if (!z6) {
            return z6;
        }
        boolean z7 = false;
        boolean z8 = (i2 & 1) != 0;
        boolean z9 = (i2 & 2) != 0;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            boolean z10 = (i2 & 16) != 0;
            boolean z11 = (i2 & 8) != 0;
            boolean z12 = (i2 & 4) != 0;
            if (i3 >= 34 && (i2 & 32) != 0) {
                z7 = true;
            }
            if (z10 || z11 || z12 || z7) {
                z2 = z7;
                z3 = z12;
                z4 = z11;
                z5 = z10;
            } else if (i3 >= 34) {
                z5 = true;
                z4 = true;
                z3 = true;
                z2 = true;
            } else {
                z2 = z7;
                z5 = true;
                z4 = true;
                z3 = true;
            }
        } else {
            z3 = false;
            z2 = false;
            z5 = true;
            z4 = true;
        }
        this.f6265a.c(z8, z9, z5, z4, z3, z2);
        return true;
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f6275k;
        if (!z2) {
            return z2;
        }
        this.f6265a.b(keyEvent);
        return true;
    }

    public boolean setComposingRegion(int i2, int i3) {
        boolean z2 = this.f6275k;
        if (z2) {
            c(new SetComposingRegionCommand(i2, i3));
        }
        return z2;
    }

    public boolean setComposingText(CharSequence charSequence, int i2) {
        boolean z2 = this.f6275k;
        if (z2) {
            c(new SetComposingTextCommand(String.valueOf(charSequence), i2));
        }
        return z2;
    }

    public boolean setSelection(int i2, int i3) {
        boolean z2 = this.f6275k;
        if (!z2) {
            return z2;
        }
        c(new SetSelectionCommand(i2, i3));
        return true;
    }
}

package androidx.compose.ui.text.input;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.compose.ui.text.TextRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata
@Deprecated
public final class RecordingInputConnection implements InputConnection {

    /* renamed from: a  reason: collision with root package name */
    public final InputEventCallback2 f18878a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f18879b;

    /* renamed from: c  reason: collision with root package name */
    public int f18880c;

    /* renamed from: d  reason: collision with root package name */
    public TextFieldValue f18881d;

    /* renamed from: e  reason: collision with root package name */
    public int f18882e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f18883f;

    /* renamed from: g  reason: collision with root package name */
    public final List f18884g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public boolean f18885h = true;

    public RecordingInputConnection(TextFieldValue textFieldValue, InputEventCallback2 inputEventCallback2, boolean z2) {
        this.f18878a = inputEventCallback2;
        this.f18879b = z2;
        this.f18881d = textFieldValue;
    }

    public final void b(EditCommand editCommand) {
        c();
        try {
            this.f18884g.add(editCommand);
        } finally {
            d();
        }
    }

    public boolean beginBatchEdit() {
        boolean z2 = this.f18885h;
        return z2 ? c() : z2;
    }

    public final boolean c() {
        this.f18880c++;
        return true;
    }

    public boolean clearMetaKeyStates(int i2) {
        boolean z2 = this.f18885h;
        if (z2) {
            return false;
        }
        return z2;
    }

    public void closeConnection() {
        this.f18884g.clear();
        this.f18880c = 0;
        this.f18885h = false;
        this.f18878a.e(this);
    }

    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z2 = this.f18885h;
        if (z2) {
            return false;
        }
        return z2;
    }

    public boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        boolean z2 = this.f18885h;
        if (z2) {
            return false;
        }
        return z2;
    }

    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z2 = this.f18885h;
        return z2 ? this.f18879b : z2;
    }

    public boolean commitText(CharSequence charSequence, int i2) {
        boolean z2 = this.f18885h;
        if (z2) {
            b(new CommitTextCommand(String.valueOf(charSequence), i2));
        }
        return z2;
    }

    public final boolean d() {
        int i2 = this.f18880c - 1;
        this.f18880c = i2;
        if (i2 == 0 && !this.f18884g.isEmpty()) {
            this.f18878a.d(CollectionsKt.P0(this.f18884g));
            this.f18884g.clear();
        }
        return this.f18880c > 0;
    }

    public boolean deleteSurroundingText(int i2, int i3) {
        boolean z2 = this.f18885h;
        if (!z2) {
            return z2;
        }
        b(new DeleteSurroundingTextCommand(i2, i3));
        return true;
    }

    public boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        boolean z2 = this.f18885h;
        if (!z2) {
            return z2;
        }
        b(new DeleteSurroundingTextInCodePointsCommand(i2, i3));
        return true;
    }

    public final void e(int i2) {
        sendKeyEvent(new KeyEvent(0, i2));
        sendKeyEvent(new KeyEvent(1, i2));
    }

    public boolean endBatchEdit() {
        return d();
    }

    public final void f(TextFieldValue textFieldValue) {
        this.f18881d = textFieldValue;
    }

    public boolean finishComposingText() {
        boolean z2 = this.f18885h;
        if (!z2) {
            return z2;
        }
        b(new FinishComposingTextCommand());
        return true;
    }

    public final void g(TextFieldValue textFieldValue, InputMethodManager inputMethodManager) {
        if (this.f18885h) {
            f(textFieldValue);
            if (this.f18883f) {
                inputMethodManager.e(this.f18882e, InputState_androidKt.a(textFieldValue));
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

    public int getCursorCapsMode(int i2) {
        return TextUtils.getCapsMode(this.f18881d.i(), TextRange.l(this.f18881d.h()), i2);
    }

    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i2) {
        boolean z2 = true;
        int i3 = 0;
        if ((i2 & 1) == 0) {
            z2 = false;
        }
        this.f18883f = z2;
        if (z2) {
            if (extractedTextRequest != null) {
                i3 = extractedTextRequest.token;
            }
            this.f18882e = i3;
        }
        return InputState_androidKt.a(this.f18881d);
    }

    public Handler getHandler() {
        return null;
    }

    public CharSequence getSelectedText(int i2) {
        if (TextRange.h(this.f18881d.h())) {
            return null;
        }
        return TextFieldValueKt.a(this.f18881d).toString();
    }

    public CharSequence getTextAfterCursor(int i2, int i3) {
        return TextFieldValueKt.b(this.f18881d, i2).toString();
    }

    public CharSequence getTextBeforeCursor(int i2, int i3) {
        return TextFieldValueKt.c(this.f18881d, i2).toString();
    }

    public boolean performContextMenuAction(int i2) {
        boolean z2 = this.f18885h;
        if (z2) {
            z2 = false;
            switch (i2) {
                case 16908319:
                    b(new SetSelectionCommand(0, this.f18881d.i().length()));
                    break;
                case 16908320:
                    e(277);
                    break;
                case 16908321:
                    e(278);
                    break;
                case 16908322:
                    e(279);
                    break;
            }
        }
        return z2;
    }

    public boolean performEditorAction(int i2) {
        int i3;
        boolean z2 = this.f18885h;
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
        this.f18878a.a(i3);
        return true;
    }

    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z2 = this.f18885h;
        if (z2) {
            return true;
        }
        return z2;
    }

    public boolean reportFullscreenMode(boolean z2) {
        return false;
    }

    public boolean requestCursorUpdates(int i2) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = this.f18885h;
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
        this.f18878a.c(z8, z9, z5, z4, z3, z2);
        return true;
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f18885h;
        if (!z2) {
            return z2;
        }
        this.f18878a.b(keyEvent);
        return true;
    }

    public boolean setComposingRegion(int i2, int i3) {
        boolean z2 = this.f18885h;
        if (z2) {
            b(new SetComposingRegionCommand(i2, i3));
        }
        return z2;
    }

    public boolean setComposingText(CharSequence charSequence, int i2) {
        boolean z2 = this.f18885h;
        if (z2) {
            b(new SetComposingTextCommand(String.valueOf(charSequence), i2));
        }
        return z2;
    }

    public boolean setSelection(int i2, int i3) {
        boolean z2 = this.f18885h;
        if (!z2) {
            return z2;
        }
        b(new SetSelectionCommand(i2, i3));
        return true;
    }
}

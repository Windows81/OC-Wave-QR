package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.os.CancellationSignal;
import android.view.KeyEvent;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.input.ImeAction;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
public final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1 implements TextInputSession, ImeEditCommandScope {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DefaultImeEditCommandScope f6114a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TransformedTextFieldState f6115b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ComposeInputMethodManager f6116c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Function1 f6117d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ReceiveContentConfiguration f6118e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ CursorAnchorInfoController f6119f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ TextLayoutState f6120g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Function0 f6121h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ ViewConfiguration f6122i;

    public AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1(DefaultImeEditCommandScope defaultImeEditCommandScope, TransformedTextFieldState transformedTextFieldState, ComposeInputMethodManager composeInputMethodManager, Function1 function1, ReceiveContentConfiguration receiveContentConfiguration, CursorAnchorInfoController cursorAnchorInfoController, TextLayoutState textLayoutState, Function0 function0, ViewConfiguration viewConfiguration) {
        this.f6115b = transformedTextFieldState;
        this.f6116c = composeInputMethodManager;
        this.f6117d = function1;
        this.f6118e = receiveContentConfiguration;
        this.f6119f = cursorAnchorInfoController;
        this.f6120g = textLayoutState;
        this.f6121h = function0;
        this.f6122i = viewConfiguration;
        this.f6114a = defaultImeEditCommandScope;
    }

    public void a(int i2) {
        Function1 function1 = this.f6117d;
        if (function1 != null) {
            function1.invoke(ImeAction.j(i2));
        }
    }

    public TextFieldCharSequence b() {
        return this.f6115b.o();
    }

    public boolean beginBatchEdit() {
        return this.f6114a.beginBatchEdit();
    }

    public long c(long j2) {
        return this.f6114a.c(j2);
    }

    public boolean d(TransferableContent transferableContent) {
        ReceiveContentConfiguration receiveContentConfiguration = this.f6118e;
        if (receiveContentConfiguration != null) {
            return receiveContentConfiguration.b(transferableContent);
        }
        return false;
    }

    public void e(Function1 function1) {
        this.f6114a.e(function1);
    }

    public boolean endBatchEdit() {
        return this.f6114a.endBatchEdit();
    }

    public int f(HandwritingGesture handwritingGesture) {
        if (Build.VERSION.SDK_INT < 34) {
            return 2;
        }
        return HandwritingGestureApi34.f6190a.m(this.f6115b, handwritingGesture, this.f6120g, this.f6121h, this.f6122i);
    }

    public long g(long j2) {
        return this.f6114a.g(j2);
    }

    public boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return HandwritingGestureApi34.f6190a.E(this.f6115b, previewableHandwritingGesture, this.f6120g, cancellationSignal);
        }
        return false;
    }

    public void requestCursorUpdates(int i2) {
        this.f6119f.d(i2);
    }

    public void sendKeyEvent(KeyEvent keyEvent) {
        this.f6116c.sendKeyEvent(keyEvent);
    }
}

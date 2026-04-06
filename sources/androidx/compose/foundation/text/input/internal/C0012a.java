package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.ui.platform.PlatformTextInputMethodRequest;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.input.ImeOptions;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.foundation.text.input.internal.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0012a implements PlatformTextInputMethodRequest {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TransformedTextFieldState f6416a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ImeOptions f6417b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ReceiveContentConfiguration f6418c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ComposeInputMethodManager f6419d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Function1 f6420e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ CursorAnchorInfoController f6421f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ TextLayoutState f6422g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Function0 f6423h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ ViewConfiguration f6424i;

    public /* synthetic */ C0012a(TransformedTextFieldState transformedTextFieldState, ImeOptions imeOptions, ReceiveContentConfiguration receiveContentConfiguration, ComposeInputMethodManager composeInputMethodManager, Function1 function1, CursorAnchorInfoController cursorAnchorInfoController, TextLayoutState textLayoutState, Function0 function0, ViewConfiguration viewConfiguration) {
        this.f6416a = transformedTextFieldState;
        this.f6417b = imeOptions;
        this.f6418c = receiveContentConfiguration;
        this.f6419d = composeInputMethodManager;
        this.f6420e = function1;
        this.f6421f = cursorAnchorInfoController;
        this.f6422g = textLayoutState;
        this.f6423h = function0;
        this.f6424i = viewConfiguration;
    }

    public final InputConnection a(EditorInfo editorInfo) {
        return AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3.C(this.f6416a, this.f6417b, this.f6418c, this.f6419d, this.f6420e, this.f6421f, this.f6422g, this.f6423h, this.f6424i, editorInfo);
    }
}

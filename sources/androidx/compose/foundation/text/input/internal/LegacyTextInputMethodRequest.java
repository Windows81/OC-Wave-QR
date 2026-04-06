package androidx.compose.foundation.text.input.internal;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.platform.PlatformTextInputMethodRequest;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata
public final class LegacyTextInputMethodRequest implements PlatformTextInputMethodRequest {

    /* renamed from: a  reason: collision with root package name */
    public final View f6240a;

    /* renamed from: b  reason: collision with root package name */
    public final InputMethodManager f6241b;

    /* renamed from: c  reason: collision with root package name */
    public Function1 f6242c = LegacyTextInputMethodRequest$onEditCommand$1.f6255z;

    /* renamed from: d  reason: collision with root package name */
    public Function1 f6243d = LegacyTextInputMethodRequest$onImeActionPerformed$1.f6256z;

    /* renamed from: e  reason: collision with root package name */
    public LegacyTextFieldState f6244e;

    /* renamed from: f  reason: collision with root package name */
    public TextFieldSelectionManager f6245f;

    /* renamed from: g  reason: collision with root package name */
    public ViewConfiguration f6246g;

    /* renamed from: h  reason: collision with root package name */
    public TextFieldValue f6247h = new TextFieldValue("", TextRange.f18496b.a(), (TextRange) null, 4, (DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    public ImeOptions f6248i = ImeOptions.f18832h.a();

    /* renamed from: j  reason: collision with root package name */
    public List f6249j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public final Lazy f6250k = LazyKt.a(LazyThreadSafetyMode.NONE, new LegacyTextInputMethodRequest$baseInputConnection$2(this));

    /* renamed from: l  reason: collision with root package name */
    public Rect f6251l;

    /* renamed from: m  reason: collision with root package name */
    public final LegacyCursorAnchorInfoController f6252m;

    public LegacyTextInputMethodRequest(View view, Function1 function1, InputMethodManager inputMethodManager) {
        this.f6240a = view;
        this.f6241b = inputMethodManager;
        this.f6252m = new LegacyCursorAnchorInfoController(function1, inputMethodManager);
    }

    /* renamed from: g */
    public RecordingInputConnection a(EditorInfo editorInfo) {
        EditorInfo_androidKt.c(editorInfo, this.f6247h.i(), this.f6247h.h(), this.f6248i, (String[]) null, 8, (Object) null);
        LegacyPlatformTextInputServiceAdapter_androidKt.d(editorInfo);
        RecordingInputConnection recordingInputConnection = new RecordingInputConnection(this.f6247h, new LegacyTextInputMethodRequest$createInputConnection$1(this), this.f6248i.b(), this.f6244e, this.f6245f, this.f6246g);
        this.f6249j.add(new WeakReference(recordingInputConnection));
        return recordingInputConnection;
    }

    public final BaseInputConnection h() {
        return (BaseInputConnection) this.f6250k.getValue();
    }

    public final View i() {
        return this.f6240a;
    }

    public final void j(androidx.compose.ui.geometry.Rect rect) {
        Rect rect2;
        this.f6251l = new Rect(MathKt.d(rect.o()), MathKt.d(rect.r()), MathKt.d(rect.p()), MathKt.d(rect.i()));
        if (this.f6249j.isEmpty() && (rect2 = this.f6251l) != null) {
            this.f6240a.requestRectangleOnScreen(new Rect(rect2));
        }
    }

    public final void k() {
        this.f6241b.c();
    }

    public final void l(TextFieldValue textFieldValue, LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode, ImeOptions imeOptions, Function1 function1, Function1 function12) {
        this.f6247h = textFieldValue;
        this.f6248i = imeOptions;
        this.f6242c = function1;
        this.f6243d = function12;
        ViewConfiguration viewConfiguration = null;
        this.f6244e = legacyPlatformTextInputNode != null ? legacyPlatformTextInputNode.h2() : null;
        this.f6245f = legacyPlatformTextInputNode != null ? legacyPlatformTextInputNode.W0() : null;
        if (legacyPlatformTextInputNode != null) {
            viewConfiguration = legacyPlatformTextInputNode.getViewConfiguration();
        }
        this.f6246g = viewConfiguration;
    }

    public final void m(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        boolean z2 = !TextRange.g(this.f6247h.h(), textFieldValue2.h()) || !Intrinsics.d(this.f6247h.g(), textFieldValue2.g());
        this.f6247h = textFieldValue2;
        int size = this.f6249j.size();
        for (int i2 = 0; i2 < size; i2++) {
            RecordingInputConnection recordingInputConnection = (RecordingInputConnection) ((WeakReference) this.f6249j.get(i2)).get();
            if (recordingInputConnection != null) {
                recordingInputConnection.g(textFieldValue2);
            }
        }
        this.f6252m.a();
        if (Intrinsics.d(textFieldValue, textFieldValue2)) {
            if (z2) {
                InputMethodManager inputMethodManager = this.f6241b;
                int l2 = TextRange.l(textFieldValue2.h());
                int k2 = TextRange.k(textFieldValue2.h());
                TextRange g2 = this.f6247h.g();
                int i3 = -1;
                int l3 = g2 != null ? TextRange.l(g2.r()) : -1;
                TextRange g3 = this.f6247h.g();
                if (g3 != null) {
                    i3 = TextRange.k(g3.r());
                }
                inputMethodManager.a(l2, k2, l3, i3);
            }
        } else if (textFieldValue == null || (Intrinsics.d(textFieldValue.i(), textFieldValue2.i()) && (!TextRange.g(textFieldValue.h(), textFieldValue2.h()) || Intrinsics.d(textFieldValue.g(), textFieldValue2.g())))) {
            int size2 = this.f6249j.size();
            for (int i4 = 0; i4 < size2; i4++) {
                RecordingInputConnection recordingInputConnection2 = (RecordingInputConnection) ((WeakReference) this.f6249j.get(i4)).get();
                if (recordingInputConnection2 != null) {
                    recordingInputConnection2.h(this.f6247h, this.f6241b);
                }
            }
        } else {
            k();
        }
    }

    public final void n(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.geometry.Rect rect2) {
        this.f6252m.d(textFieldValue, offsetMapping, textLayoutResult, rect, rect2);
    }
}

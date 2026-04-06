package androidx.compose.ui.text.input;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;

@Metadata
@Deprecated
public final class TextInputServiceAndroid implements PlatformTextInputService {

    /* renamed from: a  reason: collision with root package name */
    public final View f18901a;

    /* renamed from: b  reason: collision with root package name */
    public final InputMethodManager f18902b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f18903c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f18904d;

    /* renamed from: e  reason: collision with root package name */
    public Function1 f18905e;

    /* renamed from: f  reason: collision with root package name */
    public Function1 f18906f;

    /* renamed from: g  reason: collision with root package name */
    public TextFieldValue f18907g;

    /* renamed from: h  reason: collision with root package name */
    public ImeOptions f18908h;

    /* renamed from: i  reason: collision with root package name */
    public List f18909i;

    /* renamed from: j  reason: collision with root package name */
    public final Lazy f18910j;

    /* renamed from: k  reason: collision with root package name */
    public Rect f18911k;

    /* renamed from: l  reason: collision with root package name */
    public final CursorAnchorInfoController f18912l;

    /* renamed from: m  reason: collision with root package name */
    public final MutableVector f18913m;

    /* renamed from: n  reason: collision with root package name */
    public Runnable f18914n;

    @Metadata
    public enum TextInputCommand {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard;

        static {
            TextInputCommand[] d2;
            E = EnumEntriesKt.a(d2);
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18918a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand[] r0 = androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand r1 = androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand.StartInput     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand r1 = androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand.StopInput     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand r1 = androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand.ShowKeyboard     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand r1 = androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand.HideKeyboard     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f18918a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.input.TextInputServiceAndroid.WhenMappings.<clinit>():void");
        }
    }

    public TextInputServiceAndroid(View view, MatrixPositionCalculator matrixPositionCalculator, InputMethodManager inputMethodManager, Executor executor) {
        this.f18901a = view;
        this.f18902b = inputMethodManager;
        this.f18903c = executor;
        this.f18905e = TextInputServiceAndroid$onEditCommand$1.f18921z;
        this.f18906f = TextInputServiceAndroid$onImeActionPerformed$1.f18922z;
        this.f18907g = new TextFieldValue("", TextRange.f18496b.a(), (TextRange) null, 4, (DefaultConstructorMarker) null);
        this.f18908h = ImeOptions.f18832h.a();
        this.f18909i = new ArrayList();
        this.f18910j = LazyKt.a(LazyThreadSafetyMode.NONE, new TextInputServiceAndroid$baseInputConnection$2(this));
        this.f18912l = new CursorAnchorInfoController(matrixPositionCalculator, inputMethodManager);
        this.f18913m = new MutableVector(new TextInputCommand[16], 0);
    }

    public static final void t(TextInputCommand textInputCommand, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
        int i2 = WhenMappings.f18918a[textInputCommand.ordinal()];
        boolean z2 = true;
        if (i2 == 1) {
            Boolean bool = Boolean.TRUE;
            objectRef.f40908z = bool;
            objectRef2.f40908z = bool;
        } else if (i2 == 2) {
            Boolean bool2 = Boolean.FALSE;
            objectRef.f40908z = bool2;
            objectRef2.f40908z = bool2;
        } else if ((i2 == 3 || i2 == 4) && !Intrinsics.d(objectRef.f40908z, Boolean.FALSE)) {
            if (textInputCommand != TextInputCommand.ShowKeyboard) {
                z2 = false;
            }
            objectRef2.f40908z = Boolean.valueOf(z2);
        }
    }

    public static final void w(TextInputServiceAndroid textInputServiceAndroid) {
        textInputServiceAndroid.f18914n = null;
        textInputServiceAndroid.s();
    }

    public void a() {
        v(TextInputCommand.StartInput);
    }

    public void b() {
        v(TextInputCommand.ShowKeyboard);
    }

    public void c() {
        this.f18904d = false;
        this.f18905e = TextInputServiceAndroid$stopInput$1.f18923z;
        this.f18906f = TextInputServiceAndroid$stopInput$2.f18924z;
        this.f18911k = null;
        v(TextInputCommand.StopInput);
    }

    public void d() {
        v(TextInputCommand.HideKeyboard);
    }

    public void e(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        boolean z2 = !TextRange.g(this.f18907g.h(), textFieldValue2.h()) || !Intrinsics.d(this.f18907g.g(), textFieldValue2.g());
        this.f18907g = textFieldValue2;
        int size = this.f18909i.size();
        for (int i2 = 0; i2 < size; i2++) {
            RecordingInputConnection recordingInputConnection = (RecordingInputConnection) ((WeakReference) this.f18909i.get(i2)).get();
            if (recordingInputConnection != null) {
                recordingInputConnection.f(textFieldValue2);
            }
        }
        this.f18912l.a();
        if (Intrinsics.d(textFieldValue, textFieldValue2)) {
            if (z2) {
                InputMethodManager inputMethodManager = this.f18902b;
                int l2 = TextRange.l(textFieldValue2.h());
                int k2 = TextRange.k(textFieldValue2.h());
                TextRange g2 = this.f18907g.g();
                int i3 = -1;
                int l3 = g2 != null ? TextRange.l(g2.r()) : -1;
                TextRange g3 = this.f18907g.g();
                if (g3 != null) {
                    i3 = TextRange.k(g3.r());
                }
                inputMethodManager.a(l2, k2, l3, i3);
            }
        } else if (textFieldValue == null || (Intrinsics.d(textFieldValue.i(), textFieldValue2.i()) && (!TextRange.g(textFieldValue.h(), textFieldValue2.h()) || Intrinsics.d(textFieldValue.g(), textFieldValue2.g())))) {
            int size2 = this.f18909i.size();
            for (int i4 = 0; i4 < size2; i4++) {
                RecordingInputConnection recordingInputConnection2 = (RecordingInputConnection) ((WeakReference) this.f18909i.get(i4)).get();
                if (recordingInputConnection2 != null) {
                    recordingInputConnection2.g(this.f18907g, this.f18902b);
                }
            }
        } else {
            u();
        }
    }

    public void f(TextFieldValue textFieldValue, ImeOptions imeOptions, Function1 function1, Function1 function12) {
        this.f18904d = true;
        this.f18907g = textFieldValue;
        this.f18908h = imeOptions;
        this.f18905e = function1;
        this.f18906f = function12;
        v(TextInputCommand.StartInput);
    }

    public void g(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Function1 function1, androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.geometry.Rect rect2) {
        this.f18912l.d(textFieldValue, offsetMapping, textLayoutResult, function1, rect, rect2);
    }

    public void h(androidx.compose.ui.geometry.Rect rect) {
        Rect rect2;
        this.f18911k = new Rect(MathKt.d(rect.o()), MathKt.d(rect.r()), MathKt.d(rect.p()), MathKt.d(rect.i()));
        if (this.f18909i.isEmpty() && (rect2 = this.f18911k) != null) {
            this.f18901a.requestRectangleOnScreen(new Rect(rect2));
        }
    }

    public final InputConnection o(EditorInfo editorInfo) {
        if (!this.f18904d) {
            return null;
        }
        TextInputServiceAndroid_androidKt.h(editorInfo, this.f18908h, this.f18907g);
        TextInputServiceAndroid_androidKt.i(editorInfo);
        RecordingInputConnection recordingInputConnection = new RecordingInputConnection(this.f18907g, new TextInputServiceAndroid$createInputConnection$1(this), this.f18908h.b());
        this.f18909i.add(new WeakReference(recordingInputConnection));
        return recordingInputConnection;
    }

    public final BaseInputConnection p() {
        return (BaseInputConnection) this.f18910j.getValue();
    }

    public final View q() {
        return this.f18901a;
    }

    public final boolean r() {
        return this.f18904d;
    }

    public final void s() {
        View findFocus;
        if (this.f18901a.isFocused() || (findFocus = this.f18901a.getRootView().findFocus()) == null || !findFocus.onCheckIsTextEditor()) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            MutableVector mutableVector = this.f18913m;
            Object[] objArr = mutableVector.f15005z;
            int p2 = mutableVector.p();
            for (int i2 = 0; i2 < p2; i2++) {
                t((TextInputCommand) objArr[i2], objectRef, objectRef2);
            }
            this.f18913m.l();
            if (Intrinsics.d(objectRef.f40908z, Boolean.TRUE)) {
                u();
            }
            Boolean bool = (Boolean) objectRef2.f40908z;
            if (bool != null) {
                x(bool.booleanValue());
            }
            if (Intrinsics.d(objectRef.f40908z, Boolean.FALSE)) {
                u();
                return;
            }
            return;
        }
        this.f18913m.l();
    }

    public final void u() {
        this.f18902b.c();
    }

    public final void v(TextInputCommand textInputCommand) {
        this.f18913m.d(textInputCommand);
        if (this.f18914n == null) {
            c cVar = new c(this);
            this.f18903c.execute(cVar);
            this.f18914n = cVar;
        }
    }

    public final void x(boolean z2) {
        if (z2) {
            this.f18902b.g();
        } else {
            this.f18902b.f();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextInputServiceAndroid(View view, MatrixPositionCalculator matrixPositionCalculator, InputMethodManager inputMethodManager, Executor executor, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, matrixPositionCalculator, inputMethodManager, (i2 & 8) != 0 ? TextInputServiceAndroid_androidKt.d(Choreographer.getInstance()) : executor);
    }

    public TextInputServiceAndroid(View view, MatrixPositionCalculator matrixPositionCalculator) {
        this(view, matrixPositionCalculator, new InputMethodManagerImpl(view), (Executor) null, 8, (DefaultConstructorMarker) null);
    }
}

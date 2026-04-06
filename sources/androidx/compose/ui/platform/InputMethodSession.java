package androidx.compose.ui.platform;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.WeakReference;
import androidx.compose.ui.text.input.NullableInputConnectionWrapper;
import androidx.compose.ui.text.input.NullableInputConnectionWrapper_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata
final class InputMethodSession {

    /* renamed from: a  reason: collision with root package name */
    public final PlatformTextInputMethodRequest f17789a;

    /* renamed from: b  reason: collision with root package name */
    public final Function0 f17790b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f17791c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public MutableVector f17792d = new MutableVector(new WeakReference[16], 0);

    /* renamed from: e  reason: collision with root package name */
    public boolean f17793e;

    public InputMethodSession(PlatformTextInputMethodRequest platformTextInputMethodRequest, Function0 function0) {
        this.f17789a = platformTextInputMethodRequest;
        this.f17790b = function0;
    }

    public final InputConnection c(EditorInfo editorInfo) {
        synchronized (this.f17791c) {
            if (this.f17793e) {
                return null;
            }
            NullableInputConnectionWrapper a2 = NullableInputConnectionWrapper_androidKt.a(this.f17789a.a(editorInfo), new InputMethodSession$createInputConnection$1$1(this));
            this.f17792d.d(new WeakReference(a2));
            return a2;
        }
    }

    public final void d() {
        synchronized (this.f17791c) {
            try {
                this.f17793e = true;
                MutableVector mutableVector = this.f17792d;
                Object[] objArr = mutableVector.f15005z;
                int p2 = mutableVector.p();
                for (int i2 = 0; i2 < p2; i2++) {
                    NullableInputConnectionWrapper nullableInputConnectionWrapper = (NullableInputConnectionWrapper) ((WeakReference) objArr[i2]).get();
                    if (nullableInputConnectionWrapper != null) {
                        nullableInputConnectionWrapper.a();
                    }
                }
                this.f17792d.l();
                Unit unit = Unit.f40552a;
            } finally {
            }
        }
    }

    public final boolean e() {
        return !this.f17793e;
    }
}

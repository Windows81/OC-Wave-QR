package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

@Metadata
public final class AndroidLegacyPlatformTextInputServiceAdapter extends LegacyPlatformTextInputServiceAdapter {

    /* renamed from: b  reason: collision with root package name */
    public Job f6102b;

    /* renamed from: c  reason: collision with root package name */
    public LegacyTextInputMethodRequest f6103c;

    /* renamed from: d  reason: collision with root package name */
    public MutableSharedFlow f6104d;

    public static final void r(LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode, float[] fArr) {
        LayoutCoordinates N = legacyPlatformTextInputNode.N();
        if (N != null) {
            if (!N.b()) {
                N = null;
            }
            if (N != null) {
                N.W(fArr);
            }
        }
    }

    public void a() {
        q((Function1) null);
    }

    public void c() {
        Job job = this.f6102b;
        if (job != null) {
            Job.DefaultImpls.a(job, (CancellationException) null, 1, (Object) null);
        }
        this.f6102b = null;
        MutableSharedFlow p2 = p();
        if (p2 != null) {
            p2.h();
        }
    }

    public void e(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        LegacyTextInputMethodRequest legacyTextInputMethodRequest = this.f6103c;
        if (legacyTextInputMethodRequest != null) {
            legacyTextInputMethodRequest.m(textFieldValue, textFieldValue2);
        }
    }

    public void f(TextFieldValue textFieldValue, ImeOptions imeOptions, Function1 function1, Function1 function12) {
        q(new AndroidLegacyPlatformTextInputServiceAdapter$startInput$1(textFieldValue, this, imeOptions, function1, function12));
    }

    public void g(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Function1 function1, Rect rect, Rect rect2) {
        LegacyTextInputMethodRequest legacyTextInputMethodRequest = this.f6103c;
        if (legacyTextInputMethodRequest != null) {
            legacyTextInputMethodRequest.n(textFieldValue, offsetMapping, textLayoutResult, rect, rect2);
        }
    }

    public void h(Rect rect) {
        LegacyTextInputMethodRequest legacyTextInputMethodRequest = this.f6103c;
        if (legacyTextInputMethodRequest != null) {
            legacyTextInputMethodRequest.j(rect);
        }
    }

    public void k() {
        MutableSharedFlow p2 = p();
        if (p2 != null) {
            p2.i(Unit.f40552a);
        }
    }

    public final MutableSharedFlow p() {
        MutableSharedFlow mutableSharedFlow = this.f6104d;
        if (mutableSharedFlow != null) {
            return mutableSharedFlow;
        }
        if (!StylusHandwriting_androidKt.a()) {
            return null;
        }
        MutableSharedFlow b2 = SharedFlowKt.b(1, 0, BufferOverflow.DROP_LATEST, 2, (Object) null);
        this.f6104d = b2;
        return b2;
    }

    public final void q(Function1 function1) {
        LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode i2 = i();
        if (i2 != null) {
            this.f6102b = i2.C0(new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(function1, this, i2, (Continuation) null));
        }
    }
}

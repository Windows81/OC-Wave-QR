package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class CursorAnchorInfoController {

    /* renamed from: a  reason: collision with root package name */
    public final TransformedTextFieldState f6160a;

    /* renamed from: b  reason: collision with root package name */
    public final TextLayoutState f6161b;

    /* renamed from: c  reason: collision with root package name */
    public final ComposeInputMethodManager f6162c;

    /* renamed from: d  reason: collision with root package name */
    public final CoroutineScope f6163d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6164e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6165f;

    /* renamed from: g  reason: collision with root package name */
    public Job f6166g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6167h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6168i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f6169j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6170k;

    /* renamed from: l  reason: collision with root package name */
    public final CursorAnchorInfo.Builder f6171l = new CursorAnchorInfo.Builder();

    /* renamed from: m  reason: collision with root package name */
    public final float[] f6172m = Matrix.c((float[]) null, 1, (DefaultConstructorMarker) null);

    /* renamed from: n  reason: collision with root package name */
    public final android.graphics.Matrix f6173n = new android.graphics.Matrix();

    public CursorAnchorInfoController(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, ComposeInputMethodManager composeInputMethodManager, CoroutineScope coroutineScope) {
        this.f6160a = transformedTextFieldState;
        this.f6161b = textLayoutState;
        this.f6162c = composeInputMethodManager;
        this.f6163d = coroutineScope;
    }

    public final CursorAnchorInfo c() {
        LayoutCoordinates d2;
        LayoutCoordinates e2;
        TextLayoutResult f2;
        LayoutCoordinates j2 = this.f6161b.j();
        if (j2 != null) {
            if (!j2.b()) {
                j2 = null;
            }
            if (!(j2 == null || (d2 = this.f6161b.d()) == null)) {
                if (!d2.b()) {
                    d2 = null;
                }
                if (!(d2 == null || (e2 = this.f6161b.e()) == null)) {
                    if (!e2.b()) {
                        e2 = null;
                    }
                    if (e2 == null || (f2 = this.f6161b.f()) == null) {
                        return null;
                    }
                    TextFieldCharSequence o2 = this.f6160a.o();
                    Matrix.h(this.f6172m);
                    j2.W(this.f6172m);
                    AndroidMatrixConversions_androidKt.a(this.f6173n, this.f6172m);
                    Rect i2 = SelectionManagerKt.i(d2);
                    Offset.Companion companion = Offset.f15855b;
                    return CursorAnchorInfoBuilder_androidKt.b(this.f6171l, o2, o2.g(), o2.d(), f2, this.f6173n, i2.B(j2.N(d2, companion.c())), SelectionManagerKt.i(e2).B(j2.N(e2, companion.c())), this.f6167h, this.f6168i, this.f6169j, this.f6170k);
                }
            }
        }
        return null;
    }

    public final void d(int i2) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        boolean z7 = (i2 & 1) != 0;
        boolean z8 = (i2 & 2) != 0;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            boolean z9 = (i2 & 16) != 0;
            boolean z10 = (i2 & 8) != 0;
            boolean z11 = (i2 & 4) != 0;
            if (i3 >= 34 && (i2 & 32) != 0) {
                z6 = true;
            }
            if (z9 || z10 || z11 || z6) {
                z2 = z6;
                z3 = z11;
                z4 = z10;
                z5 = z9;
            } else if (i3 >= 34) {
                z5 = true;
                z4 = true;
                z3 = true;
                z2 = true;
            } else {
                z2 = z6;
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
        e(z7, z8, z5, z4, z3, z2);
    }

    public final void e(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f6167h = z4;
        this.f6168i = z5;
        this.f6169j = z6;
        this.f6170k = z7;
        if (z2) {
            this.f6165f = true;
            CursorAnchorInfo c2 = c();
            if (c2 != null) {
                this.f6162c.d(c2);
            }
        }
        this.f6164e = z3;
        f();
    }

    public final void f() {
        if (this.f6164e) {
            Job job = this.f6166g;
            if (job == null || !job.b()) {
                this.f6166g = BuildersKt__Builders_commonKt.d(this.f6163d, (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new CursorAnchorInfoController$startOrStopMonitoring$1(this, (Continuation) null), 1, (Object) null);
                return;
            }
            return;
        }
        Job job2 = this.f6166g;
        if (job2 != null) {
            Job.DefaultImpls.a(job2, (CancellationException) null, 1, (Object) null);
        }
        this.f6166g = null;
    }
}

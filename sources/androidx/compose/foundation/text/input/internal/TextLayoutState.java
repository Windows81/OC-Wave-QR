package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata
public final class TextLayoutState {

    /* renamed from: a  reason: collision with root package name */
    public TextFieldLayoutStateCache f6387a;

    /* renamed from: b  reason: collision with root package name */
    public Function2 f6388b;

    /* renamed from: c  reason: collision with root package name */
    public final TextFieldLayoutStateCache f6389c;

    /* renamed from: d  reason: collision with root package name */
    public final MutableState f6390d = SnapshotStateKt.i((Object) null, SnapshotStateKt.k());

    /* renamed from: e  reason: collision with root package name */
    public final MutableState f6391e = SnapshotStateKt.i((Object) null, SnapshotStateKt.k());

    /* renamed from: f  reason: collision with root package name */
    public final MutableState f6392f = SnapshotStateKt.i((Object) null, SnapshotStateKt.k());

    /* renamed from: g  reason: collision with root package name */
    public final MutableState f6393g = SnapshotStateKt__SnapshotStateKt.e(Dp.j(Dp.m((float) 0)), (SnapshotMutationPolicy) null, 2, (Object) null);

    /* renamed from: h  reason: collision with root package name */
    public final BringIntoViewRequester f6394h = BringIntoViewRequesterKt.a();

    public TextLayoutState() {
        TextFieldLayoutStateCache textFieldLayoutStateCache = new TextFieldLayoutStateCache();
        this.f6387a = textFieldLayoutStateCache;
        this.f6389c = textFieldLayoutStateCache;
    }

    public static /* synthetic */ int i(TextLayoutState textLayoutState, long j2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return textLayoutState.h(j2, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r2 == null) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long b(long r6) {
        /*
            r5 = this;
            androidx.compose.ui.layout.LayoutCoordinates r0 = r5.j()
            if (r0 == 0) goto L_0x0022
            boolean r1 = r0.b()
            if (r1 == 0) goto L_0x001a
            androidx.compose.ui.layout.LayoutCoordinates r1 = r5.e()
            r2 = 0
            if (r1 == 0) goto L_0x0020
            r3 = 0
            r4 = 2
            androidx.compose.ui.geometry.Rect r2 = androidx.compose.ui.layout.LayoutCoordinates.J(r1, r0, r3, r4, r2)
            goto L_0x0020
        L_0x001a:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.f15860e
            androidx.compose.ui.geometry.Rect r2 = r0.a()
        L_0x0020:
            if (r2 != 0) goto L_0x0028
        L_0x0022:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.f15860e
            androidx.compose.ui.geometry.Rect r2 = r0.a()
        L_0x0028:
            long r6 = androidx.compose.foundation.text.input.internal.TextLayoutStateKt.a(r6, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextLayoutState.b(long):long");
    }

    public final BringIntoViewRequester c() {
        return this.f6394h;
    }

    public final LayoutCoordinates d() {
        return (LayoutCoordinates) this.f6391e.getValue();
    }

    public final LayoutCoordinates e() {
        return (LayoutCoordinates) this.f6392f.getValue();
    }

    public final TextLayoutResult f() {
        return (TextLayoutResult) this.f6389c.getValue();
    }

    public final float g() {
        return ((Dp) this.f6393g.getValue()).t();
    }

    public final int h(long j2, boolean z2) {
        TextLayoutResult f2 = f();
        if (f2 == null) {
            return -1;
        }
        if (z2) {
            j2 = b(j2);
        }
        return f2.x(TextLayoutStateKt.b(this, j2));
    }

    public final LayoutCoordinates j() {
        return (LayoutCoordinates) this.f6390d.getValue();
    }

    public final boolean k(long j2) {
        TextLayoutResult f2 = f();
        if (f2 == null) {
            return false;
        }
        long b2 = TextLayoutStateKt.b(this, b(j2));
        int r2 = f2.r(Float.intBitsToFloat((int) (4294967295L & b2)));
        int i2 = (int) (b2 >> 32);
        return Float.intBitsToFloat(i2) >= f2.s(r2) && Float.intBitsToFloat(i2) <= f2.t(r2);
    }

    public final TextLayoutResult l(Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j2) {
        TextLayoutResult x2 = this.f6387a.x(density, layoutDirection, resolver, j2);
        Function2 function2 = this.f6388b;
        if (function2 != null) {
            function2.m(density, new TextLayoutState$layoutWithNewMeasureInputs$1$textLayoutProvider$1(this));
        }
        return x2;
    }

    public final void m(LayoutCoordinates layoutCoordinates) {
        this.f6391e.setValue(layoutCoordinates);
    }

    public final void n(LayoutCoordinates layoutCoordinates) {
        this.f6392f.setValue(layoutCoordinates);
    }

    public final void o(float f2) {
        this.f6393g.setValue(Dp.j(f2));
    }

    public final void p(Function2 function2) {
        this.f6388b = function2;
    }

    public final void q(LayoutCoordinates layoutCoordinates) {
        this.f6390d.setValue(layoutCoordinates);
    }

    public final void r(TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z2, boolean z3, KeyboardOptions keyboardOptions) {
        this.f6387a.B(transformedTextFieldState, textStyle, z2, z3, keyboardOptions);
    }
}

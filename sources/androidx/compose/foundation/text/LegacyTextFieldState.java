package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

@Metadata
public final class LegacyTextFieldState {

    /* renamed from: A  reason: collision with root package name */
    public final MutableState f5781A;

    /* renamed from: a  reason: collision with root package name */
    public TextDelegate f5782a;

    /* renamed from: b  reason: collision with root package name */
    public final RecomposeScope f5783b;

    /* renamed from: c  reason: collision with root package name */
    public final SoftwareKeyboardController f5784c;

    /* renamed from: d  reason: collision with root package name */
    public final EditProcessor f5785d = new EditProcessor();

    /* renamed from: e  reason: collision with root package name */
    public TextInputSession f5786e;

    /* renamed from: f  reason: collision with root package name */
    public final MutableState f5787f;

    /* renamed from: g  reason: collision with root package name */
    public final MutableState f5788g;

    /* renamed from: h  reason: collision with root package name */
    public LayoutCoordinates f5789h;

    /* renamed from: i  reason: collision with root package name */
    public final MutableState f5790i;

    /* renamed from: j  reason: collision with root package name */
    public AnnotatedString f5791j;

    /* renamed from: k  reason: collision with root package name */
    public final MutableState f5792k;

    /* renamed from: l  reason: collision with root package name */
    public final MutableState f5793l;

    /* renamed from: m  reason: collision with root package name */
    public final MutableState f5794m;

    /* renamed from: n  reason: collision with root package name */
    public final MutableState f5795n;

    /* renamed from: o  reason: collision with root package name */
    public final MutableState f5796o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5797p;

    /* renamed from: q  reason: collision with root package name */
    public final MutableState f5798q;

    /* renamed from: r  reason: collision with root package name */
    public final KeyboardActionRunner f5799r;

    /* renamed from: s  reason: collision with root package name */
    public final MutableState f5800s;

    /* renamed from: t  reason: collision with root package name */
    public final MutableState f5801t;

    /* renamed from: u  reason: collision with root package name */
    public Function1 f5802u;

    /* renamed from: v  reason: collision with root package name */
    public final Function1 f5803v;

    /* renamed from: w  reason: collision with root package name */
    public final Function1 f5804w;

    /* renamed from: x  reason: collision with root package name */
    public final Paint f5805x;

    /* renamed from: y  reason: collision with root package name */
    public long f5806y;

    /* renamed from: z  reason: collision with root package name */
    public final MutableState f5807z;

    public LegacyTextFieldState(TextDelegate textDelegate, RecomposeScope recomposeScope, SoftwareKeyboardController softwareKeyboardController) {
        this.f5782a = textDelegate;
        this.f5783b = recomposeScope;
        this.f5784c = softwareKeyboardController;
        Boolean bool = Boolean.FALSE;
        this.f5787f = SnapshotStateKt__SnapshotStateKt.e(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f5788g = SnapshotStateKt__SnapshotStateKt.e(Dp.j(Dp.m((float) 0)), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f5790i = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f5792k = SnapshotStateKt__SnapshotStateKt.e(HandleState.None, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f5793l = SnapshotStateKt__SnapshotStateKt.e(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f5794m = SnapshotStateKt__SnapshotStateKt.e(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f5795n = SnapshotStateKt__SnapshotStateKt.e(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f5796o = SnapshotStateKt__SnapshotStateKt.e(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f5797p = true;
        this.f5798q = SnapshotStateKt__SnapshotStateKt.e(Boolean.TRUE, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f5799r = new KeyboardActionRunner(softwareKeyboardController);
        this.f5800s = SnapshotStateKt__SnapshotStateKt.e(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f5801t = SnapshotStateKt__SnapshotStateKt.e(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f5802u = LegacyTextFieldState$onValueChangeOriginal$1.f5810z;
        this.f5803v = new LegacyTextFieldState$onValueChange$1(this);
        this.f5804w = new LegacyTextFieldState$onImeActionPerformed$1(this);
        this.f5805x = AndroidPaint_androidKt.a();
        this.f5806y = Color.f15975b.f();
        TextRange.Companion companion = TextRange.f18496b;
        this.f5807z = SnapshotStateKt__SnapshotStateKt.e(TextRange.b(companion.a()), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f5781A = SnapshotStateKt__SnapshotStateKt.e(TextRange.b(companion.a()), (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    public final boolean A() {
        return ((Boolean) this.f5798q.getValue()).booleanValue();
    }

    public final boolean B() {
        return this.f5797p;
    }

    public final void C(boolean z2) {
        this.f5800s.setValue(Boolean.valueOf(z2));
    }

    public final void D(long j2) {
        this.f5781A.setValue(TextRange.b(j2));
    }

    public final void E(HandleState handleState) {
        this.f5792k.setValue(handleState);
    }

    public final void F(boolean z2) {
        this.f5787f.setValue(Boolean.valueOf(z2));
    }

    public final void G(boolean z2) {
        this.f5798q.setValue(Boolean.valueOf(z2));
    }

    public final void H(TextInputSession textInputSession) {
        this.f5786e = textInputSession;
    }

    public final void I(boolean z2) {
        this.f5801t.setValue(Boolean.valueOf(z2));
    }

    public final void J(LayoutCoordinates layoutCoordinates) {
        this.f5789h = layoutCoordinates;
    }

    public final void K(TextLayoutResultProxy textLayoutResultProxy) {
        this.f5790i.setValue(textLayoutResultProxy);
        this.f5797p = false;
    }

    public final void L(float f2) {
        this.f5788g.setValue(Dp.j(f2));
    }

    public final void M(long j2) {
        this.f5807z.setValue(TextRange.b(j2));
    }

    public final void N(boolean z2) {
        this.f5796o.setValue(Boolean.valueOf(z2));
    }

    public final void O(boolean z2) {
        this.f5793l.setValue(Boolean.valueOf(z2));
    }

    public final void P(boolean z2) {
        this.f5795n.setValue(Boolean.valueOf(z2));
    }

    public final void Q(boolean z2) {
        this.f5794m.setValue(Boolean.valueOf(z2));
    }

    public final void R(AnnotatedString annotatedString, AnnotatedString annotatedString2, TextStyle textStyle, boolean z2, Density density, FontFamily.Resolver resolver, Function1 function1, KeyboardActions keyboardActions, FocusManager focusManager, long j2) {
        this.f5802u = function1;
        this.f5806y = j2;
        KeyboardActionRunner keyboardActionRunner = this.f5799r;
        keyboardActionRunner.f(keyboardActions);
        keyboardActionRunner.e(focusManager);
        this.f5791j = annotatedString;
        TextDelegate c2 = TextDelegateKt.c(this.f5782a, annotatedString2, textStyle, density, resolver, z2, 0, 0, 0, CollectionsKt.m(), 448, (Object) null);
        if (this.f5782a != c2) {
            this.f5797p = true;
        }
        this.f5782a = c2;
    }

    public final boolean c() {
        return ((Boolean) this.f5800s.getValue()).booleanValue();
    }

    public final long d() {
        return ((TextRange) this.f5781A.getValue()).r();
    }

    public final HandleState e() {
        return (HandleState) this.f5792k.getValue();
    }

    public final boolean f() {
        return ((Boolean) this.f5787f.getValue()).booleanValue();
    }

    public final Paint g() {
        return this.f5805x;
    }

    public final TextInputSession h() {
        return this.f5786e;
    }

    public final boolean i() {
        return ((Boolean) this.f5801t.getValue()).booleanValue();
    }

    public final SoftwareKeyboardController j() {
        return this.f5784c;
    }

    public final LayoutCoordinates k() {
        LayoutCoordinates layoutCoordinates = this.f5789h;
        if (layoutCoordinates == null || !layoutCoordinates.b()) {
            return null;
        }
        return layoutCoordinates;
    }

    public final TextLayoutResultProxy l() {
        return (TextLayoutResultProxy) this.f5790i.getValue();
    }

    public final float m() {
        return ((Dp) this.f5788g.getValue()).t();
    }

    public final Function1 n() {
        return this.f5804w;
    }

    public final Function1 o() {
        return this.f5803v;
    }

    public final EditProcessor p() {
        return this.f5785d;
    }

    public final RecomposeScope q() {
        return this.f5783b;
    }

    public final long r() {
        return this.f5806y;
    }

    public final long s() {
        return ((TextRange) this.f5807z.getValue()).r();
    }

    public final boolean t() {
        return ((Boolean) this.f5796o.getValue()).booleanValue();
    }

    public final boolean u() {
        return ((Boolean) this.f5793l.getValue()).booleanValue();
    }

    public final boolean v() {
        return ((Boolean) this.f5795n.getValue()).booleanValue();
    }

    public final boolean w() {
        return ((Boolean) this.f5794m.getValue()).booleanValue();
    }

    public final TextDelegate x() {
        return this.f5782a;
    }

    public final AnnotatedString y() {
        return this.f5791j;
    }

    public final boolean z() {
        return !TextRange.h(s()) || !TextRange.h(d());
    }
}

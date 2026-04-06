package androidx.compose.ui.focus;

import androidx.compose.ui.focus.FocusRequester;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class FocusPropertiesImpl implements FocusProperties {

    /* renamed from: a  reason: collision with root package name */
    public boolean f15787a = true;

    /* renamed from: b  reason: collision with root package name */
    public FocusRequester f15788b;

    /* renamed from: c  reason: collision with root package name */
    public FocusRequester f15789c;

    /* renamed from: d  reason: collision with root package name */
    public FocusRequester f15790d;

    /* renamed from: e  reason: collision with root package name */
    public FocusRequester f15791e;

    /* renamed from: f  reason: collision with root package name */
    public FocusRequester f15792f;

    /* renamed from: g  reason: collision with root package name */
    public FocusRequester f15793g;

    /* renamed from: h  reason: collision with root package name */
    public FocusRequester f15794h;

    /* renamed from: i  reason: collision with root package name */
    public FocusRequester f15795i;

    /* renamed from: j  reason: collision with root package name */
    public Function1 f15796j;

    /* renamed from: k  reason: collision with root package name */
    public Function1 f15797k;

    public FocusPropertiesImpl() {
        FocusRequester.Companion companion = FocusRequester.f15802b;
        this.f15788b = companion.b();
        this.f15789c = companion.b();
        this.f15790d = companion.b();
        this.f15791e = companion.b();
        this.f15792f = companion.b();
        this.f15793g = companion.b();
        this.f15794h = companion.b();
        this.f15795i = companion.b();
        this.f15796j = FocusPropertiesImpl$onEnter$1.f15798z;
        this.f15797k = FocusPropertiesImpl$onExit$1.f15799z;
    }

    public FocusRequester A() {
        return this.f15791e;
    }

    public void B(boolean z2) {
        this.f15787a = z2;
    }

    public void C(Function1 function1) {
        this.f15796j = function1;
    }

    public FocusRequester e() {
        return this.f15794h;
    }

    public FocusRequester f() {
        return this.f15788b;
    }

    public FocusRequester o() {
        return this.f15792f;
    }

    public FocusRequester s() {
        return this.f15793g;
    }

    public boolean t() {
        return this.f15787a;
    }

    public FocusRequester u() {
        return this.f15789c;
    }

    public Function1 v() {
        return this.f15796j;
    }

    public FocusRequester w() {
        return this.f15790d;
    }

    public Function1 x() {
        return this.f15797k;
    }

    public FocusRequester y() {
        return this.f15795i;
    }

    public void z(Function1 function1) {
        this.f15797k = function1;
    }
}

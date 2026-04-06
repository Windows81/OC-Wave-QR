package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
public final class SecureTextFieldController {

    /* renamed from: a  reason: collision with root package name */
    public final State f5862a;

    /* renamed from: b  reason: collision with root package name */
    public final PasswordInputTransformation f5863b = new PasswordInputTransformation(new SecureTextFieldController$passwordInputTransformation$1(this));

    /* renamed from: c  reason: collision with root package name */
    public final CodepointTransformation f5864c = new b(this);

    /* renamed from: d  reason: collision with root package name */
    public final Modifier f5865d = FocusChangedModifierKt.a(Modifier.f15489d, new SecureTextFieldController$focusChangeModifier$1(this));

    /* renamed from: e  reason: collision with root package name */
    public final Channel f5866e = ChannelKt.b(Integer.MAX_VALUE, (BufferOverflow) null, (Function1) null, 6, (Object) null);

    public SecureTextFieldController(State state) {
        this.f5862a = state;
    }

    public static final int c(SecureTextFieldController secureTextFieldController, int i2, int i3) {
        return i2 == secureTextFieldController.f5863b.a() ? i3 : ((Character) secureTextFieldController.f5862a.getValue()).charValue();
    }

    public final CodepointTransformation d() {
        return this.f5864c;
    }

    public final Modifier e() {
        return this.f5865d;
    }

    public final PasswordInputTransformation f() {
        return this.f5863b;
    }

    public final Object g(Continuation continuation) {
        Object l2 = FlowKt.l(FlowKt.q(this.f5866e), new SecureTextFieldController$observeHideEvents$2(this, (Continuation) null), continuation);
        return l2 == IntrinsicsKt.f() ? l2 : Unit.f40552a;
    }

    public final void h() {
        if (ChannelResult.i(this.f5866e.L(Unit.f40552a))) {
            this.f5863b.b();
        }
    }
}

package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.runtime.State;

public final /* synthetic */ class a implements CodepointTransformation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ State f6038a;

    public /* synthetic */ a(State state) {
        this.f6038a = state;
    }

    public final int a(int i2, int i3) {
        return BasicSecureTextFieldKt.d(this.f6038a, i2, i3);
    }
}

package androidx.compose.ui.text.platform;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.State;
import androidx.emoji2.text.EmojiCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class DefaultImpl implements EmojiCompatStatusDelegate {

    /* renamed from: a  reason: collision with root package name */
    public State f18983a;

    public DefaultImpl() {
        this.f18983a = EmojiCompat.k() ? c() : null;
    }

    public State a() {
        State state = this.f18983a;
        if (state != null) {
            Intrinsics.f(state);
            return state;
        } else if (!EmojiCompat.k()) {
            return EmojiCompatStatus_androidKt.f18990a;
        } else {
            State c2 = c();
            this.f18983a = c2;
            Intrinsics.f(c2);
            return c2;
        }
    }

    public final State c() {
        EmojiCompat c2 = EmojiCompat.c();
        if (c2.g() == 1) {
            return new ImmutableBool(true);
        }
        MutableState j2 = SnapshotStateKt__SnapshotStateKt.e(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
        c2.v(new DefaultImpl$getFontLoadState$initCallback$1(j2, this));
        return j2;
    }
}

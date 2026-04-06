package androidx.compose.foundation.text.input;

import kotlin.Metadata;

@Metadata
public final class UndoState {

    /* renamed from: a  reason: collision with root package name */
    public final TextFieldState f6101a;

    public UndoState(TextFieldState textFieldState) {
        this.f6101a = textFieldState;
    }

    public final void a() {
        this.f6101a.j().i(this.f6101a);
    }

    public final void b() {
        this.f6101a.j().k(this.f6101a);
    }
}

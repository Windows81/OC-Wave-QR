package androidx.compose.foundation.text.input.internal;

import android.view.View;
import kotlin.Metadata;

@Metadata
class ComposeInputMethodManagerImplApi34 extends ComposeInputMethodManagerImplApi24 {
    public ComposeInputMethodManagerImplApi34(View view) {
        super(view);
    }

    public void f() {
        i().startStylusHandwriting(e());
    }

    public void g() {
        i().prepareStylusHandwritingDelegation(e());
    }

    public void h() {
        boolean unused = i().acceptStylusHandwritingDelegation(e());
    }
}

package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class FilterChain implements InputTransformation {

    /* renamed from: b  reason: collision with root package name */
    public final InputTransformation f6055b;

    /* renamed from: c  reason: collision with root package name */
    public final InputTransformation f6056c;

    public FilterChain(InputTransformation inputTransformation, InputTransformation inputTransformation2) {
        this.f6055b = inputTransformation;
        this.f6056c = inputTransformation2;
    }

    public void W(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.f6055b.W(semanticsPropertyReceiver);
        this.f6056c.W(semanticsPropertyReceiver);
    }

    public void X(TextFieldBuffer textFieldBuffer) {
        this.f6055b.X(textFieldBuffer);
        this.f6056c.X(textFieldBuffer);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.e(r2.f6055b.Y());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.foundation.text.KeyboardOptions Y() {
        /*
            r2 = this;
            androidx.compose.foundation.text.input.InputTransformation r0 = r2.f6056c
            androidx.compose.foundation.text.KeyboardOptions r0 = r0.Y()
            if (r0 == 0) goto L_0x0014
            androidx.compose.foundation.text.input.InputTransformation r1 = r2.f6055b
            androidx.compose.foundation.text.KeyboardOptions r1 = r1.Y()
            androidx.compose.foundation.text.KeyboardOptions r0 = r0.e(r1)
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            androidx.compose.foundation.text.input.InputTransformation r0 = r2.f6055b
            androidx.compose.foundation.text.KeyboardOptions r0 = r0.Y()
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.FilterChain.Y():androidx.compose.foundation.text.KeyboardOptions");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FilterChain.class != obj.getClass()) {
            return false;
        }
        FilterChain filterChain = (FilterChain) obj;
        return Intrinsics.d(this.f6055b, filterChain.f6055b) && Intrinsics.d(this.f6056c, filterChain.f6056c) && Intrinsics.d(Y(), filterChain.Y());
    }

    public int hashCode() {
        int hashCode = ((this.f6055b.hashCode() * 31) + this.f6056c.hashCode()) * 32;
        KeyboardOptions Y = Y();
        return hashCode + (Y != null ? Y.hashCode() : 0);
    }

    public String toString() {
        return this.f6055b + ".then(" + this.f6056c + ')';
    }
}

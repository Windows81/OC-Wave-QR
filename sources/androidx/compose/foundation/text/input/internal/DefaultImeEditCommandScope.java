package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class DefaultImeEditCommandScope implements ImeEditCommandScope {

    /* renamed from: a  reason: collision with root package name */
    public final TransformedTextFieldState f6179a;

    /* renamed from: b  reason: collision with root package name */
    public int f6180b;

    /* renamed from: c  reason: collision with root package name */
    public final MutableVector f6181c = new MutableVector(new Function1[16], 0);

    public DefaultImeEditCommandScope(TransformedTextFieldState transformedTextFieldState) {
        this.f6179a = transformedTextFieldState;
    }

    public boolean beginBatchEdit() {
        this.f6180b++;
        return true;
    }

    public long c(long j2) {
        return this.f6179a.r(j2);
    }

    public void e(Function1 function1) {
        beginBatchEdit();
        this.f6181c.d(function1);
        endBatchEdit();
    }

    public boolean endBatchEdit() {
        int i2 = this.f6180b - 1;
        this.f6180b = i2;
        if (i2 == 0 && this.f6181c.p() != 0) {
            TransformedTextFieldState transformedTextFieldState = this.f6179a;
            TextFieldState e2 = transformedTextFieldState.f6397a;
            InputTransformation c2 = transformedTextFieldState.f6398b;
            TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
            e2.g().e().e();
            TextFieldBuffer g2 = e2.g();
            MutableVector mutableVector = this.f6181c;
            Object[] objArr = mutableVector.f15005z;
            int p2 = mutableVector.p();
            for (int i3 = 0; i3 < p2; i3++) {
                ((Function1) objArr[i3]).invoke(g2);
            }
            transformedTextFieldState.G(g2);
            e2.e(c2, false, textFieldEditUndoBehavior);
            this.f6181c.l();
        }
        return this.f6180b > 0;
    }

    public long g(long j2) {
        return this.f6179a.s(j2);
    }
}

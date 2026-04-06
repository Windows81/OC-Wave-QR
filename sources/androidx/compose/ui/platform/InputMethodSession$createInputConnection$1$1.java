package androidx.compose.ui.platform;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.WeakReference;
import androidx.compose.ui.text.input.NullableInputConnectionWrapper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class InputMethodSession$createInputConnection$1$1 extends Lambda implements Function1<NullableInputConnectionWrapper, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ InputMethodSession f17794z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InputMethodSession$createInputConnection$1$1(InputMethodSession inputMethodSession) {
        super(1);
        this.f17794z = inputMethodSession;
    }

    public final void b(NullableInputConnectionWrapper nullableInputConnectionWrapper) {
        nullableInputConnectionWrapper.a();
        MutableVector a2 = this.f17794z.f17792d;
        Object[] objArr = a2.f15005z;
        int p2 = a2.p();
        int i2 = 0;
        while (true) {
            if (i2 >= p2) {
                i2 = -1;
                break;
            } else if (Intrinsics.d((WeakReference) objArr[i2], nullableInputConnectionWrapper)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            this.f17794z.f17792d.y(i2);
        }
        if (this.f17794z.f17792d.p() == 0) {
            this.f17794z.f17790b.invoke();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((NullableInputConnectionWrapper) obj);
        return Unit.f40552a;
    }
}

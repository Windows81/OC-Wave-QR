package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.MutableSharedFlow;

@Metadata
public final class BasicTextFieldKt$BasicTextField$decorationModifiers$1$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableSharedFlow f5561A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f5562z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$decorationModifiers$1$1(boolean z2, MutableSharedFlow mutableSharedFlow) {
        super(0);
        this.f5562z = z2;
        this.f5561A = mutableSharedFlow;
    }

    public final void invoke() {
        if (this.f5562z) {
            this.f5561A.i(Unit.f40552a);
        }
    }
}

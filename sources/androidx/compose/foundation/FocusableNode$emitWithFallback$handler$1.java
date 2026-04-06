package androidx.compose.foundation;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class FocusableNode$emitWithFallback$handler$1 extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Interaction f3072A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f3073z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusableNode$emitWithFallback$handler$1(MutableInteractionSource mutableInteractionSource, Interaction interaction) {
        super(1);
        this.f3073z = mutableInteractionSource;
        this.f3072A = interaction;
    }

    public final void b(Throwable th) {
        this.f3073z.b(this.f3072A);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Throwable) obj);
        return Unit.f40552a;
    }
}

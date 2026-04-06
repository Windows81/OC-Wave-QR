package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SharedElement$updateMatch$1 extends Lambda implements Function1<SharedElement, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SharedElement f2327z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharedElement$updateMatch$1(SharedElement sharedElement) {
        super(1);
        this.f2327z = sharedElement;
    }

    public final void b(SharedElement sharedElement) {
        this.f2327z.s();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((SharedElement) obj);
        return Unit.f40552a;
    }
}

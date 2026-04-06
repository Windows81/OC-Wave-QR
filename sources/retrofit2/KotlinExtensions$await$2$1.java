package retrofit2;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class KotlinExtensions$await$2$1 extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Call f44155z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KotlinExtensions$await$2$1(Call call) {
        super(1);
        this.f44155z = call;
    }

    public final void b(Throwable th) {
        this.f44155z.cancel();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Throwable) obj);
        return Unit.f40552a;
    }
}

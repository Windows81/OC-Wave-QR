package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DataStoreImpl$writeActor$1 extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DataStoreImpl f20572z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$writeActor$1(DataStoreImpl dataStoreImpl) {
        super(1);
        this.f20572z = dataStoreImpl;
    }

    public final void b(Throwable th) {
        if (th != null) {
            this.f20572z.f20556h.c(new Final(th));
        }
        if (this.f20572z.f20558j.b()) {
            this.f20572z.s().close();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Throwable) obj);
        return Unit.f40552a;
    }
}

package androidx.datastore.core;

import androidx.datastore.core.Message;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CompletableDeferred;

@Metadata
public final class DataStoreImpl$writeActor$2 extends Lambda implements Function2<Message.Update<T>, Throwable, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final DataStoreImpl$writeActor$2 f20573z = new DataStoreImpl$writeActor$2();

    public DataStoreImpl$writeActor$2() {
        super(2);
    }

    public final void b(Message.Update update, Throwable th) {
        Intrinsics.i(update, "msg");
        CompletableDeferred a2 = update.a();
        if (th == null) {
            th = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        a2.j(th);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Message.Update) obj, (Throwable) obj2);
        return Unit.f40552a;
    }
}

package androidx.datastore.core.handlers;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.CorruptionHandler;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ReplaceFileCorruptionHandler<T> implements CorruptionHandler<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Function1 f20649a;

    public ReplaceFileCorruptionHandler(Function1 function1) {
        Intrinsics.i(function1, "produceNewData");
        this.f20649a = function1;
    }

    public Object a(CorruptionException corruptionException, Continuation continuation) {
        return this.f20649a.invoke(corruptionException);
    }
}

package androidx.datastore;

import androidx.datastore.core.Serializer;
import androidx.datastore.core.okio.OkioSerializer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import okio.BufferedSink;
import okio.BufferedSource;

@Metadata
public final class OkioSerializerWrapper<T> implements OkioSerializer<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Serializer f20541a;

    public Object a() {
        return this.f20541a.a();
    }

    public Object b(BufferedSource bufferedSource, Continuation continuation) {
        return this.f20541a.c(bufferedSource.B1(), continuation);
    }

    public Object c(Object obj, BufferedSink bufferedSink, Continuation continuation) {
        Object b2 = this.f20541a.b(obj, bufferedSink.y1(), continuation);
        return b2 == IntrinsicsKt.f() ? b2 : Unit.f40552a;
    }
}

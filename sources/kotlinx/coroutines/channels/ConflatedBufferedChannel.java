package kotlinx.coroutines.channels;

import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectInstance;

@Metadata
public class ConflatedBufferedChannel<E> extends BufferedChannel<E> {
    public final int L;
    public final BufferOverflow M;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ConflatedBufferedChannel(int i2, BufferOverflow bufferOverflow, Function1 function1, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, bufferOverflow, (i3 & 4) != 0 ? null : function1);
    }

    public static /* synthetic */ Object I1(ConflatedBufferedChannel conflatedBufferedChannel, Object obj, Continuation continuation) {
        UndeliveredElementException c2;
        Object L1 = conflatedBufferedChannel.L1(obj, true);
        if (!(L1 instanceof ChannelResult.Closed)) {
            return Unit.f40552a;
        }
        ChannelResult.e(L1);
        Function1 function1 = conflatedBufferedChannel.f41461A;
        if (function1 == null || (c2 = OnUndeliveredElementKt.c(function1, obj, (UndeliveredElementException) null, 2, (Object) null)) == null) {
            throw conflatedBufferedChannel.s0();
        }
        ExceptionsKt.a(c2, conflatedBufferedChannel.s0());
        throw c2;
    }

    public static /* synthetic */ Object J1(ConflatedBufferedChannel conflatedBufferedChannel, Object obj, Continuation continuation) {
        Object L1 = conflatedBufferedChannel.L1(obj, true);
        if (L1 instanceof ChannelResult.Failed) {
            return Boxing.a(false);
        }
        Unit unit = (Unit) L1;
        return Boxing.a(true);
    }

    public boolean G0() {
        return this.M == BufferOverflow.DROP_OLDEST;
    }

    public final Object K1(Object obj, boolean z2) {
        Function1 function1;
        UndeliveredElementException c2;
        Object L2 = super.L(obj);
        if (ChannelResult.j(L2) || ChannelResult.h(L2)) {
            return L2;
        }
        if (!z2 || (function1 = this.f41461A) == null || (c2 = OnUndeliveredElementKt.c(function1, obj, (UndeliveredElementException) null, 2, (Object) null)) == null) {
            return ChannelResult.f41493b.c(Unit.f40552a);
        }
        throw c2;
    }

    public Object L(Object obj) {
        return L1(obj, false);
    }

    public final Object L1(Object obj, boolean z2) {
        return this.M == BufferOverflow.DROP_LATEST ? K1(obj, z2) : y1(obj);
    }

    public Object O(Object obj, Continuation continuation) {
        return I1(this, obj, continuation);
    }

    public void l1(SelectInstance selectInstance, Object obj) {
        Object L2 = L(obj);
        if (!(L2 instanceof ChannelResult.Failed)) {
            Unit unit = (Unit) L2;
            selectInstance.h(Unit.f40552a);
        } else if (L2 instanceof ChannelResult.Closed) {
            ChannelResult.e(L2);
            selectInstance.h(BufferedChannelKt.z());
        } else {
            throw new IllegalStateException("unreachable");
        }
    }

    public Object r1(Object obj, Continuation continuation) {
        return J1(this, obj, continuation);
    }

    public boolean v1() {
        return false;
    }

    public ConflatedBufferedChannel(int i2, BufferOverflow bufferOverflow, Function1 function1) {
        super(i2, function1);
        this.L = i2;
        this.M = bufferOverflow;
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + Reflection.b(BufferedChannel.class).e() + " instead").toString());
        } else if (i2 < 1) {
            throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i2 + " was specified").toString());
        }
    }
}

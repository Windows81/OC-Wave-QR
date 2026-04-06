package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;

@Metadata
public abstract class Message<T> {

    @Metadata
    public static final class Read<T> extends Message<T> {
    }

    @Metadata
    public static final class Update<T> extends Message<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Function2 f20593a;

        /* renamed from: b  reason: collision with root package name */
        public final CompletableDeferred f20594b;

        /* renamed from: c  reason: collision with root package name */
        public final State f20595c;

        /* renamed from: d  reason: collision with root package name */
        public final CoroutineContext f20596d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Update(Function2 function2, CompletableDeferred completableDeferred, State state, CoroutineContext coroutineContext) {
            super((DefaultConstructorMarker) null);
            Intrinsics.i(function2, "transform");
            Intrinsics.i(completableDeferred, "ack");
            Intrinsics.i(coroutineContext, "callerContext");
            this.f20593a = function2;
            this.f20594b = completableDeferred;
            this.f20595c = state;
            this.f20596d = coroutineContext;
        }

        public final CompletableDeferred a() {
            return this.f20594b;
        }

        public final CoroutineContext b() {
            return this.f20596d;
        }

        public State c() {
            return this.f20595c;
        }

        public final Function2 d() {
            return this.f20593a;
        }
    }

    public /* synthetic */ Message(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public Message() {
    }
}

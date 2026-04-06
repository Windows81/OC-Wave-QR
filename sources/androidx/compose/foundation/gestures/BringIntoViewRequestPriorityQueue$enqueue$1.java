package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.ContentInViewNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BringIntoViewRequestPriorityQueue$enqueue$1 extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ContentInViewNode.Request f3400A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BringIntoViewRequestPriorityQueue f3401z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BringIntoViewRequestPriorityQueue$enqueue$1(BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue, ContentInViewNode.Request request) {
        super(1);
        this.f3401z = bringIntoViewRequestPriorityQueue;
        this.f3400A = request;
    }

    public final void b(Throwable th) {
        this.f3401z.f3399a.v(this.f3400A);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Throwable) obj);
        return Unit.f40552a;
    }
}

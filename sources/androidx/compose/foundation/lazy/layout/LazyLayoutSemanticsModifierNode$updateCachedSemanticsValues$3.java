package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3 extends Lambda implements Function1<Integer, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazyLayoutSemanticsModifierNode f4933z;

    @Metadata
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2", f = "LazyLayoutSemantics.kt", l = {213}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2  reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass2) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass2(lazyLayoutSemanticsModifierNode, i2, continuation);
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                LazyLayoutSemanticState a3 = lazyLayoutSemanticsModifierNode.O;
                int i3 = i2;
                this.D = 1;
                if (a3.e(i3, this) == f2) {
                    return f2;
                }
            } else if (i2 == 1) {
                ResultKt.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.f40552a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3(LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode) {
        super(1);
        this.f4933z = lazyLayoutSemanticsModifierNode;
    }

    public final Boolean b(final int i2) {
        LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) this.f4933z.N.invoke();
        if (!(i2 >= 0 && i2 < lazyLayoutItemProvider.b())) {
            InlineClassHelperKt.a("Can't scroll to index " + i2 + ", it is out of bounds [0, " + lazyLayoutItemProvider.b() + ')');
        }
        CoroutineScope y2 = this.f4933z.y2();
        final LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode = this.f4933z;
        Job unused = BuildersKt__Builders_commonKt.d(y2, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2((Continuation) null), 3, (Object) null);
        return Boolean.TRUE;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}

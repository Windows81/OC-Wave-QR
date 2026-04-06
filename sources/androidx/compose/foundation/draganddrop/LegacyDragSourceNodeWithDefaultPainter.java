package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DelegatingNode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
final class LegacyDragSourceNodeWithDefaultPainter extends DelegatingNode {
    public Function2 P;

    @Metadata
    @DebugMetadata(c = "androidx.compose.foundation.draganddrop.LegacyDragSourceNodeWithDefaultPainter$2", f = "LegacyDragAndDropSourceWithDefaultPainter.android.kt", l = {101}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.draganddrop.LegacyDragSourceNodeWithDefaultPainter$2  reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<DragAndDropSourceScope, Continuation<? super Unit>, Object> {
        public int D;
        public /* synthetic */ Object E;
        public final /* synthetic */ LegacyDragSourceNodeWithDefaultPainter F;

        {
            this.F = r1;
        }

        /* renamed from: A */
        public final Object m(DragAndDropSourceScope dragAndDropSourceScope, Continuation continuation) {
            return ((AnonymousClass2) s(dragAndDropSourceScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass2 r0 = new AnonymousClass2(this.F, continuation);
            r0.E = obj;
            return r0;
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                Function2 f3 = this.F.f3();
                this.D = 1;
                if (f3.m((DragAndDropSourceScope) this.E, this) == f2) {
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

    public LegacyDragSourceNodeWithDefaultPainter(Function2 function2) {
        this.P = function2;
        final CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback = new CacheDrawScopeDragShadowCallback();
        Z2(DrawModifierKt.a(new LegacyDragSourceNodeWithDefaultPainter$cacheDrawScopeDragShadowCallback$1$1(cacheDrawScopeDragShadowCallback)));
        Z2(new LegacyDragAndDropSourceNode(new Function1<DrawScope, Unit>() {
            public final void b(DrawScope drawScope) {
                cacheDrawScopeDragShadowCallback.c(drawScope);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((DrawScope) obj);
                return Unit.f40552a;
            }
        }, new AnonymousClass2(this, (Continuation) null)));
    }

    public final Function2 f3() {
        return this.P;
    }

    public final void g3(Function2 function2) {
        this.P = function2;
    }
}

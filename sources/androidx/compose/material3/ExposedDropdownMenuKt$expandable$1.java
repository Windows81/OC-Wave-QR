package androidx.compose.material3;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata
public final class ExposedDropdownMenuKt$expandable$1 implements PointerInputEventHandler {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f9959A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f9960z;

    @Metadata
    @DebugMetadata(c = "androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1", f = "ExposedDropdownMenu.kt", l = {1426, 1430}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

        /* renamed from: B  reason: collision with root package name */
        public int f9961B;
        public /* synthetic */ Object C;

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(str, function0, continuation);
            r0.C = obj;
            return r0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: androidx.compose.ui.input.pointer.AwaitPointerEventScope} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0061  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object x(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r10.f9961B
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                kotlin.ResultKt.b(r11)
                goto L_0x005d
            L_0x0012:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x001a:
                java.lang.Object r1 = r10.C
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.ResultKt.b(r11)
                goto L_0x003c
            L_0x0022:
                kotlin.ResultKt.b(r11)
                java.lang.Object r11 = r10.C
                r1 = r11
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                r10.C = r1
                r10.f9961B = r3
                r5 = 0
                r8 = 1
                r9 = 0
                r4 = r1
                r7 = r10
                java.lang.Object r11 = androidx.compose.foundation.gestures.TapGestureDetectorKt.f(r4, r5, r6, r7, r8, r9)
                if (r11 != r0) goto L_0x003c
                return r0
            L_0x003c:
                androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
                java.lang.String r3 = r1
                androidx.compose.material3.ExposedDropdownMenuAnchorType$Companion r4 = androidx.compose.material3.ExposedDropdownMenuAnchorType.f9935b
                java.lang.String r4 = r4.c()
                boolean r3 = androidx.compose.material3.ExposedDropdownMenuAnchorType.g(r3, r4)
                if (r3 == 0) goto L_0x004f
                r11.a()
            L_0x004f:
                androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                r3 = 0
                r10.C = r3
                r10.f9961B = r2
                java.lang.Object r11 = androidx.compose.foundation.gestures.TapGestureDetectorKt.u(r1, r11, r10)
                if (r11 != r0) goto L_0x005d
                return r0
            L_0x005d:
                androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
                if (r11 == 0) goto L_0x0066
                kotlin.jvm.functions.Function0 r11 = r2
                r11.invoke()
            L_0x0066:
                kotlin.Unit r11 = kotlin.Unit.f40552a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenuKt$expandable$1.AnonymousClass1.x(java.lang.Object):java.lang.Object");
        }

        /* renamed from: z */
        public final Object m(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
            return ((AnonymousClass1) s(awaitPointerEventScope, continuation)).x(Unit.f40552a);
        }
    }

    public ExposedDropdownMenuKt$expandable$1(String str, Function0 function0) {
        this.f9960z = str;
        this.f9959A = function0;
    }

    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        final String str = this.f9960z;
        final Function0 function0 = this.f9959A;
        Object e2 = ForEachGestureKt.e(pointerInputScope, new AnonymousClass1((Continuation) null), continuation);
        return e2 == IntrinsicsKt.f() ? e2 : Unit.f40552a;
    }
}

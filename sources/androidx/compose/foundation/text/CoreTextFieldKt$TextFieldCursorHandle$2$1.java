package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class CoreTextFieldKt$TextFieldCursorHandle$2$1 implements PointerInputEventHandler {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f5721A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextDragObserver f5722z;

    @Metadata
    @DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1", f = "CoreTextField.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;
        public /* synthetic */ Object E;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(pointerInputScope, textDragObserver, textFieldSelectionManager, continuation);
            r0.E = obj;
            return r0;
        }

        public final Object x(Object obj) {
            IntrinsicsKt.f();
            if (this.D == 0) {
                ResultKt.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.E;
                CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
                final PointerInputScope pointerInputScope = pointerInputScope;
                final TextDragObserver textDragObserver = textDragObserver;
                CoroutineStart coroutineStart2 = coroutineStart;
                Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, coroutineStart2, new Function2<CoroutineScope, Continuation<? super Unit>, Object>((Continuation) null) {
                    public int D;

                    /* renamed from: A */
                    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
                        return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
                    }

                    public final Continuation s(Object obj, Continuation continuation) {
                        return 

                        public CoreTextFieldKt$TextFieldCursorHandle$2$1(TextDragObserver textDragObserver, TextFieldSelectionManager textFieldSelectionManager) {
                            this.f5722z = textDragObserver;
                            this.f5721A = textFieldSelectionManager;
                        }

                        public final Object invoke(final PointerInputScope pointerInputScope, Continuation continuation) {
                            final TextDragObserver textDragObserver = this.f5722z;
                            final TextFieldSelectionManager textFieldSelectionManager = this.f5721A;
                            Object f2 = CoroutineScopeKt.f(new AnonymousClass1((Continuation) null), continuation);
                            return f2 == IntrinsicsKt.f() ? f2 : Unit.f40552a;
                        }
                    }

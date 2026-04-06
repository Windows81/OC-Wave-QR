package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1 extends Lambda implements Function2<TextFieldSelectionState, TextContextMenuItems, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f5660z;

    @Metadata
    @DebugMetadata(c = "androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1$1", f = "ContextMenu.android.kt", l = {79, 80, 81}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;

        @Metadata
        /* renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1$1$WhenMappings */
        public /* synthetic */ class WhenMappings {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f5661a;

            static {
                /*
                    androidx.compose.foundation.text.TextContextMenuItems[] r0 = androidx.compose.foundation.text.TextContextMenuItems.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.compose.foundation.text.TextContextMenuItems r1 = androidx.compose.foundation.text.TextContextMenuItems.Cut     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    androidx.compose.foundation.text.TextContextMenuItems r1 = androidx.compose.foundation.text.TextContextMenuItems.Copy     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    androidx.compose.foundation.text.TextContextMenuItems r1 = androidx.compose.foundation.text.TextContextMenuItems.Paste     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    androidx.compose.foundation.text.TextContextMenuItems r1 = androidx.compose.foundation.text.TextContextMenuItems.SelectAll     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    androidx.compose.foundation.text.TextContextMenuItems r1 = androidx.compose.foundation.text.TextContextMenuItems.E     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    f5661a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1.AnonymousClass1.WhenMappings.<clinit>():void");
            }
        }

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass1(textContextMenuItems, textFieldSelectionState, continuation);
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                int i3 = WhenMappings.f5661a[textContextMenuItems.ordinal()];
                if (i3 == 1) {
                    TextFieldSelectionState textFieldSelectionState = textFieldSelectionState;
                    this.D = 1;
                    if (textFieldSelectionState.K(this) == f2) {
                        return f2;
                    }
                } else if (i3 == 2) {
                    TextFieldSelectionState textFieldSelectionState2 = textFieldSelectionState;
                    this.D = 2;
                    if (textFieldSelectionState2.H(false, this) == f2) {
                        return f2;
                    }
                } else if (i3 == 3) {
                    TextFieldSelectionState textFieldSelectionState3 = textFieldSelectionState;
                    this.D = 3;
                    if (textFieldSelectionState3.q0(this) == f2) {
                        return f2;
                    }
                } else if (i3 == 4) {
                    textFieldSelectionState.t0();
                } else if (i3 == 5) {
                    textFieldSelectionState.A();
                }
            } else if (i2 == 1 || i2 == 2 || i2 == 3) {
                ResultKt.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.f40552a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1(CoroutineScope coroutineScope) {
        super(2);
        this.f5660z = coroutineScope;
    }

    public final void b(final TextFieldSelectionState textFieldSelectionState, final TextContextMenuItems textContextMenuItems) {
        Job unused = BuildersKt__Builders_commonKt.d(this.f5660z, (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new AnonymousClass1((Continuation) null), 1, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((TextFieldSelectionState) obj, (TextContextMenuItems) obj2);
        return Unit.f40552a;
    }
}

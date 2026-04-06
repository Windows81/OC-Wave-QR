package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.ui.platform.PlatformTextInputSession;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeOptions;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3", f = "AndroidTextInputSession.android.kt", l = {124}, m = "invokeSuspend")
public final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ MutableSharedFlow F;
    public final /* synthetic */ TransformedTextFieldState G;
    public final /* synthetic */ TextLayoutState H;
    public final /* synthetic */ ComposeInputMethodManager I;
    public final /* synthetic */ PlatformTextInputSession J;
    public final /* synthetic */ ImeOptions K;
    public final /* synthetic */ ReceiveContentConfiguration L;
    public final /* synthetic */ Function1 M;
    public final /* synthetic */ Function0 N;
    public final /* synthetic */ ViewConfiguration O;

    @Metadata
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1", f = "AndroidTextInputSession.android.kt", l = {86}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;

        public static final void C(ComposeInputMethodManager composeInputMethodManager, TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z2) {
            long g2 = textFieldCharSequence.g();
            TextRange d2 = textFieldCharSequence.d();
            long g3 = textFieldCharSequence2.g();
            TextRange d3 = textFieldCharSequence2.d();
            if (z2) {
                composeInputMethodManager.c();
            } else if (!TextRange.g(g2, g3) || !Intrinsics.d(d2, d3)) {
                int l2 = TextRange.l(g3);
                int k2 = TextRange.k(g3);
                int i2 = -1;
                int l3 = d3 != null ? TextRange.l(d3.r()) : -1;
                if (d3 != null) {
                    i2 = TextRange.k(d3.r());
                }
                composeInputMethodManager.a(l2, k2, l3, i2);
            }
        }

        /* renamed from: B */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass1(transformedTextFieldState, composeInputMethodManager, continuation);
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                TransformedTextFieldState transformedTextFieldState = transformedTextFieldState;
                C0013b bVar = new C0013b(composeInputMethodManager);
                this.D = 1;
                if (transformedTextFieldState.i(bVar, this) == f2) {
                    return f2;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3(MutableSharedFlow mutableSharedFlow, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, ComposeInputMethodManager composeInputMethodManager, PlatformTextInputSession platformTextInputSession, ImeOptions imeOptions, ReceiveContentConfiguration receiveContentConfiguration, Function1 function1, Function0 function0, ViewConfiguration viewConfiguration, Continuation continuation) {
        super(2, continuation);
        this.F = mutableSharedFlow;
        this.G = transformedTextFieldState;
        this.H = textLayoutState;
        this.I = composeInputMethodManager;
        this.J = platformTextInputSession;
        this.K = imeOptions;
        this.L = receiveContentConfiguration;
        this.M = function1;
        this.N = function0;
        this.O = viewConfiguration;
    }

    public static final InputConnection C(TransformedTextFieldState transformedTextFieldState, ImeOptions imeOptions, ReceiveContentConfiguration receiveContentConfiguration, ComposeInputMethodManager composeInputMethodManager, Function1 function1, CursorAnchorInfoController cursorAnchorInfoController, TextLayoutState textLayoutState, Function0 function0, ViewConfiguration viewConfiguration, EditorInfo editorInfo) {
        TransformedTextFieldState transformedTextFieldState2 = transformedTextFieldState;
        String[] strArr = null;
        AndroidTextInputSession_androidKt.c((String) null, new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$1(transformedTextFieldState), 1, (Object) null);
        AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1 androidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1 = new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1(new DefaultImeEditCommandScope(transformedTextFieldState), transformedTextFieldState, composeInputMethodManager, function1, receiveContentConfiguration, cursorAnchorInfoController, textLayoutState, function0, viewConfiguration);
        TextFieldCharSequence o2 = transformedTextFieldState.o();
        long g2 = transformedTextFieldState.o().g();
        if (receiveContentConfiguration != null) {
            strArr = AndroidTextInputSession_androidKt.f6110a;
        }
        EditorInfo_androidKt.b(editorInfo, o2, g2, imeOptions, strArr);
        return new StatelessInputConnection(androidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1, editorInfo);
    }

    /* renamed from: B */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 androidTextInputSession_androidKt$platformSpecificTextInputSession$3 = new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3(this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, continuation);
        androidTextInputSession_androidKt$platformSpecificTextInputSession$3.E = obj;
        return androidTextInputSession_androidKt$platformSpecificTextInputSession$3;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.E;
            CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
            final TransformedTextFieldState transformedTextFieldState = this.G;
            final ComposeInputMethodManager composeInputMethodManager = this.I;
            Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, coroutineStart, new AnonymousClass1((Continuation) null), 1, (Object) null);
            MutableSharedFlow mutableSharedFlow = this.F;
            if (mutableSharedFlow != null) {
                Job unused2 = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1(mutableSharedFlow, this.I, (Continuation) null), 3, (Object) null);
            }
            CursorAnchorInfoController cursorAnchorInfoController = new CursorAnchorInfoController(this.G, this.H, this.I, coroutineScope);
            PlatformTextInputSession platformTextInputSession = this.J;
            C0012a aVar = new C0012a(this.G, this.K, this.L, this.I, this.M, cursorAnchorInfoController, this.H, this.N, this.O);
            this.D = 1;
            if (platformTextInputSession.s(aVar, this) == f2) {
                return f2;
            }
        } else if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}

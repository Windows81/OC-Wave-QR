package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.ui.platform.PlatformTextInputSession;
import kotlin.KotlinNothingValueException;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {125}, m = "invokeSuspend")
public final class AndroidLegacyPlatformTextInputServiceAdapter$startInput$2 extends SuspendLambda implements Function2<PlatformTextInputSession, Continuation<?>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Function1 F;
    public final /* synthetic */ AndroidLegacyPlatformTextInputServiceAdapter G;
    public final /* synthetic */ LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode H;

    @Metadata
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {149}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
        public int D;
        public /* synthetic */ Object E;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(platformTextInputSession, function1, androidLegacyPlatformTextInputServiceAdapter, legacyPlatformTextInputNode, continuation);
            r0.E = obj;
            return r0;
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.E;
                final InputMethodManager inputMethodManager = (InputMethodManager) LegacyPlatformTextInputServiceAdapter_androidKt.c().invoke(platformTextInputSession.r());
                LegacyTextInputMethodRequest legacyTextInputMethodRequest = new LegacyTextInputMethodRequest(platformTextInputSession.r(), new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1(legacyPlatformTextInputNode), inputMethodManager);
                if (StylusHandwriting_androidKt.a()) {
                    final AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter = androidLegacyPlatformTextInputServiceAdapter;
                    Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>((Continuation) null) {
                        public int D;

                        /* renamed from: A */
                        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
                            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
                        }

                        public final Continuation s(Object obj, Continuation continuation) {
                            return 

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            public AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(Function1 function1, AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode, Continuation continuation) {
                                super(2, continuation);
                                this.F = function1;
                                this.G = androidLegacyPlatformTextInputServiceAdapter;
                                this.H = legacyPlatformTextInputNode;
                            }

                            /* renamed from: A */
                            public final Object m(PlatformTextInputSession platformTextInputSession, Continuation continuation) {
                                return ((AndroidLegacyPlatformTextInputServiceAdapter$startInput$2) s(platformTextInputSession, continuation)).x(Unit.f40552a);
                            }

                            public final Continuation s(Object obj, Continuation continuation) {
                                AndroidLegacyPlatformTextInputServiceAdapter$startInput$2 androidLegacyPlatformTextInputServiceAdapter$startInput$2 = new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(this.F, this.G, this.H, continuation);
                                androidLegacyPlatformTextInputServiceAdapter$startInput$2.E = obj;
                                return androidLegacyPlatformTextInputServiceAdapter$startInput$2;
                            }

                            public final Object x(Object obj) {
                                Object f2 = IntrinsicsKt.f();
                                int i2 = this.D;
                                if (i2 == 0) {
                                    ResultKt.b(obj);
                                    final PlatformTextInputSession platformTextInputSession = (PlatformTextInputSession) this.E;
                                    final Function1 function1 = this.F;
                                    final AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter = this.G;
                                    final LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode = this.H;
                                    AnonymousClass1 r3 = new AnonymousClass1((Continuation) null);
                                    this.D = 1;
                                    if (CoroutineScopeKt.f(r3, this) == f2) {
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

package androidx.compose.material3;

import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.SearchBarDefaults$InputField$9$1", f = "SearchBar.kt", l = {1442}, m = "invokeSuspend")
final class SearchBarDefaults$InputField$9$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ SearchBarState E;
    public final /* synthetic */ TextFieldState F;
    public final /* synthetic */ CoroutineScope G;
    public final /* synthetic */ State H;

    @Metadata
    @DebugMetadata(c = "androidx.compose.material3.SearchBarDefaults$InputField$9$1$2", f = "SearchBar.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.SearchBarDefaults$InputField$9$1$2  reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CharSequence, Continuation<? super Unit>, Object> {
        public int D;
        public /* synthetic */ Object E;

        /* renamed from: A */
        public final Object m(CharSequence charSequence, Continuation continuation) {
            return ((AnonymousClass2) s(charSequence, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass2 r0 = new AnonymousClass2(intRef, searchBarState, coroutineScope, state, continuation);
            r0.E = obj;
            return r0;
        }

        public final Object x(Object obj) {
            IntrinsicsKt.f();
            if (this.D == 0) {
                ResultKt.b(obj);
                int length = ((CharSequence) this.E).length();
                if (length > intRef.f40906z && SearchBarDefaults.j(state) && !SearchBarKt.N(searchBarState)) {
                    CoroutineScope coroutineScope = coroutineScope;
                    final SearchBarState searchBarState = searchBarState;
                    Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>((Continuation) null) {
                        public int D;

                        /* renamed from: A */
                        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
                            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
                        }

                        public final Continuation s(Object obj, Continuation continuation) {
                            return 

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            public SearchBarDefaults$InputField$9$1(SearchBarState searchBarState, TextFieldState textFieldState, CoroutineScope coroutineScope, State state, Continuation continuation) {
                                super(2, continuation);
                                this.E = searchBarState;
                                this.F = textFieldState;
                                this.G = coroutineScope;
                                this.H = state;
                            }

                            public static final CharSequence C(TextFieldState textFieldState) {
                                return textFieldState.i();
                            }

                            /* renamed from: B */
                            public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
                                return ((SearchBarDefaults$InputField$9$1) s(coroutineScope, continuation)).x(Unit.f40552a);
                            }

                            public final Continuation s(Object obj, Continuation continuation) {
                                return new SearchBarDefaults$InputField$9$1(this.E, this.F, this.G, this.H, continuation);
                            }

                            public final Object x(Object obj) {
                                Object f2 = IntrinsicsKt.f();
                                int i2 = this.D;
                                if (i2 == 0) {
                                    ResultKt.b(obj);
                                    if (!SearchBarKt.N(this.E)) {
                                        final Ref.IntRef intRef = new Ref.IntRef();
                                        intRef.f40906z = this.F.i().length();
                                        Flow q2 = SnapshotStateKt.q(new C0276w5(this.F));
                                        final SearchBarState searchBarState = this.E;
                                        final CoroutineScope coroutineScope = this.G;
                                        final State state = this.H;
                                        Flow V = FlowKt.V(q2, new AnonymousClass2((Continuation) null));
                                        AnonymousClass3 r1 = AnonymousClass3.f10812z;
                                        this.D = 1;
                                        if (V.a(r1, this) == f2) {
                                            return f2;
                                        }
                                    }
                                } else if (i2 == 1) {
                                    ResultKt.b(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                return Unit.f40552a;
                            }
                        }

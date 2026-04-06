package com.hansecom.abt.data.repositories.base;

import java.time.LocalDateTime;
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
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.repositories.base.MultipleValueRepository$getFlowWithAutoRefresh$1", f = "MultipleValueRepository.kt", l = {60}, m = "invokeSuspend")
public final class MultipleValueRepository$getFlowWithAutoRefresh$1 extends SuspendLambda implements Function2<ProducerScope<? super T>, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ MultipleValueRepository F;
    public final /* synthetic */ Object G;

    @Metadata
    @DebugMetadata(c = "com.hansecom.abt.data.repositories.base.MultipleValueRepository$getFlowWithAutoRefresh$1$1", f = "MultipleValueRepository.kt", l = {50}, m = "invokeSuspend")
    /* renamed from: com.hansecom.abt.data.repositories.base.MultipleValueRepository$getFlowWithAutoRefresh$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass1(multipleValueRepository, obj2, continuation);
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                Flow i3 = multipleValueRepository.i(obj2);
                final MultipleValueRepository multipleValueRepository = multipleValueRepository;
                final Object obj2 = obj2;
                AnonymousClass1 r1 = new Function2<LocalDateTime, Continuation<? super Unit>, Object>((Continuation) null) {
                    public int D;
                    public /* synthetic */ Object E;

                    /* renamed from: A */
                    public final Object m(LocalDateTime localDateTime, Continuation continuation) {
                        return ((AnonymousClass1) s(localDateTime, continuation)).x(Unit.f40552a);
                    }

                    public final Continuation s(Object obj, Continuation continuation) {
                        AnonymousClass1 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public MultipleValueRepository$getFlowWithAutoRefresh$1(MultipleValueRepository multipleValueRepository, Object obj, Continuation continuation) {
                            super(2, continuation);
                            this.F = multipleValueRepository;
                            this.G = obj;
                        }

                        /* renamed from: A */
                        public final Object m(ProducerScope producerScope, Continuation continuation) {
                            return ((MultipleValueRepository$getFlowWithAutoRefresh$1) s(producerScope, continuation)).x(Unit.f40552a);
                        }

                        public final Continuation s(Object obj, Continuation continuation) {
                            MultipleValueRepository$getFlowWithAutoRefresh$1 multipleValueRepository$getFlowWithAutoRefresh$1 = new MultipleValueRepository$getFlowWithAutoRefresh$1(this.F, this.G, continuation);
                            multipleValueRepository$getFlowWithAutoRefresh$1.E = obj;
                            return multipleValueRepository$getFlowWithAutoRefresh$1;
                        }

                        public final Object x(Object obj) {
                            Object f2 = IntrinsicsKt.f();
                            int i2 = this.D;
                            if (i2 == 0) {
                                ResultKt.b(obj);
                                final ProducerScope producerScope = (ProducerScope) this.E;
                                final MultipleValueRepository multipleValueRepository = this.F;
                                final Object obj2 = this.G;
                                Job unused = BuildersKt__Builders_commonKt.d(producerScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1((Continuation) null), 3, (Object) null);
                                Flow f3 = this.F.f(this.G);
                                AnonymousClass2 r3 = new FlowCollector() {
                                    public final Object c(Object obj, Continuation continuation) {
                                        Object O = producerScope.O(obj, continuation);
                                        return O == IntrinsicsKt.f() ? O : Unit.f40552a;
                                    }
                                };
                                this.D = 1;
                                if (f3.a(r3, this) == f2) {
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

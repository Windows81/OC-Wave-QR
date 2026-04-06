package com.hansecom.abt.presentation.screens.home.faremedia.addValue;

import com.hansecom.abt.api.ApiExceptionsKt;
import com.hansecom.abt.data.repositories.FareMediaConfigRepository;
import com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue;
import com.hansecom.mapi.models.FareMediumConfigurations;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValueViewModel$1$configJob$1", f = "FareMediaAddValueViewModel.kt", l = {129}, m = "invokeSuspend")
public final class FareMediaAddValueViewModel$1$configJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ FareMediaAddValueViewModel E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaAddValueViewModel$1$configJob$1(FareMediaAddValueViewModel fareMediaAddValueViewModel, Continuation continuation) {
        super(2, continuation);
        this.E = fareMediaAddValueViewModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        if (r0 == null) goto L_0x0084;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue.State C(com.hansecom.mapi.models.FareMediumConfigurations r23, com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue.State r24) {
        /*
            java.lang.Integer r0 = r23.h()
            if (r0 == 0) goto L_0x0013
            int r0 = r0.intValue()
            java.math.BigDecimal r0 = com.hansecom.abt.util.BigDecimalExtKt.a(r0)
            if (r0 != 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r5 = r0
            goto L_0x0018
        L_0x0013:
            java.math.BigDecimal r0 = com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValueViewModel.f36084u
            goto L_0x0011
        L_0x0018:
            java.lang.Integer r0 = r23.f()
            if (r0 == 0) goto L_0x002b
            int r0 = r0.intValue()
            java.math.BigDecimal r0 = com.hansecom.abt.util.BigDecimalExtKt.a(r0)
            if (r0 != 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r6 = r0
            goto L_0x0030
        L_0x002b:
            java.math.BigDecimal r0 = com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValueViewModel.f36085v
            goto L_0x0029
        L_0x0030:
            java.lang.Integer r0 = r23.d()
            if (r0 == 0) goto L_0x0043
            int r0 = r0.intValue()
            java.math.BigDecimal r0 = com.hansecom.abt.util.BigDecimalExtKt.a(r0)
            if (r0 != 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r7 = r0
            goto L_0x0048
        L_0x0043:
            java.math.BigDecimal r0 = com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValueViewModel.f36086w
            goto L_0x0041
        L_0x0048:
            java.util.List r0 = r23.i()
            if (r0 == 0) goto L_0x0084
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.CollectionsKt.x(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x005f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x007b
            java.lang.Object r2 = r0.next()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.math.BigDecimal r2 = com.hansecom.abt.util.BigDecimalExtKt.a(r2)
            java.lang.String r2 = r2.toString()
            r1.add(r2)
            goto L_0x005f
        L_0x007b:
            kotlinx.collections.immutable.PersistentList r0 = kotlinx.collections.immutable.ExtensionsKt.e(r1)
            if (r0 != 0) goto L_0x0082
            goto L_0x0084
        L_0x0082:
            r8 = r0
            goto L_0x0089
        L_0x0084:
            kotlinx.collections.immutable.PersistentList r0 = kotlinx.collections.immutable.ExtensionsKt.a()
            goto L_0x0082
        L_0x0089:
            r21 = 524167(0x7ff87, float:7.34514E-40)
            r22 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r1 = r24
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue$State r0 = com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue.State.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValueViewModel$1$configJob$1.C(com.hansecom.mapi.models.FareMediumConfigurations, com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue$State):com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue$State");
    }

    /* renamed from: B */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((FareMediaAddValueViewModel$1$configJob$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new FareMediaAddValueViewModel$1$configJob$1(this.E, continuation);
    }

    public final Object x(Object obj) {
        Object obj2;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            FareMediaConfigRepository J = this.E.f36091m;
            String K = this.E.f36095q;
            this.D = 1;
            obj2 = J.d(K, this);
            if (obj2 == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
            obj2 = ((Result) obj).j();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        FareMediaAddValueViewModel fareMediaAddValueViewModel = this.E;
        Throwable e2 = Result.e(obj2);
        if (e2 == null) {
            fareMediaAddValueViewModel.r(new I((FareMediumConfigurations) obj2));
        } else {
            fareMediaAddValueViewModel.p(new FareMediaAddValue.Effect.Error(ApiExceptionsKt.a(e2), (List) null, 2, (DefaultConstructorMarker) null));
        }
        return Unit.f40552a;
    }
}

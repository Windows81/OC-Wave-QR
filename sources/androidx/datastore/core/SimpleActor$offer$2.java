package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {121, 121}, m = "invokeSuspend")
public final class SimpleActor$offer$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Object D;
    public int E;
    public final /* synthetic */ SimpleActor F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SimpleActor$offer$2(SimpleActor simpleActor, Continuation continuation) {
        super(2, continuation);
        this.F = simpleActor;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SimpleActor$offer$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new SimpleActor$offer$2(this.F, continuation);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0050 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0069  */
    public final java.lang.Object x(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r5.E
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0022
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            kotlin.ResultKt.b(r6)
            goto L_0x005d
        L_0x0012:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x001a:
            java.lang.Object r1 = r5.D
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            kotlin.ResultKt.b(r6)
            goto L_0x0051
        L_0x0022:
            kotlin.ResultKt.b(r6)
            androidx.datastore.core.SimpleActor r6 = r5.F
            androidx.datastore.core.AtomicInt r6 = r6.f20632d
            int r6 = r6.b()
            if (r6 <= 0) goto L_0x006c
        L_0x0031:
            androidx.datastore.core.SimpleActor r6 = r5.F
            kotlinx.coroutines.CoroutineScope r6 = r6.f20629a
            kotlinx.coroutines.CoroutineScopeKt.g(r6)
            androidx.datastore.core.SimpleActor r6 = r5.F
            kotlin.jvm.functions.Function2 r1 = r6.f20630b
            androidx.datastore.core.SimpleActor r6 = r5.F
            kotlinx.coroutines.channels.Channel r6 = r6.f20631c
            r5.D = r1
            r5.E = r3
            java.lang.Object r6 = r6.v(r5)
            if (r6 != r0) goto L_0x0051
            return r0
        L_0x0051:
            r4 = 0
            r5.D = r4
            r5.E = r2
            java.lang.Object r6 = r1.m(r6, r5)
            if (r6 != r0) goto L_0x005d
            return r0
        L_0x005d:
            androidx.datastore.core.SimpleActor r6 = r5.F
            androidx.datastore.core.AtomicInt r6 = r6.f20632d
            int r6 = r6.a()
            if (r6 != 0) goto L_0x0031
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        L_0x006c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SimpleActor$offer$2.x(java.lang.Object):java.lang.Object");
    }
}

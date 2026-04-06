package androidx.datastore.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {44, 46}, m = "invokeSuspend")
public final class DataMigrationInitializer$Companion$runMigrations$2 extends SuspendLambda implements Function2<Object, Continuation<Object>, Object> {
    public Object D;
    public Object E;
    public Object F;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ List I;
    public final /* synthetic */ List J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataMigrationInitializer$Companion$runMigrations$2(List list, List list2, Continuation continuation) {
        super(2, continuation);
        this.I = list;
        this.J = list2;
    }

    /* renamed from: A */
    public final Object m(Object obj, Continuation continuation) {
        return ((DataMigrationInitializer$Companion$runMigrations$2) s(obj, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(this.I, this.J, continuation);
        dataMigrationInitializer$Companion$runMigrations$2.H = obj;
        return dataMigrationInitializer$Companion$runMigrations$2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r9.G
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0037
            if (r1 == r3) goto L_0x0022
            if (r1 != r2) goto L_0x001a
            java.lang.Object r1 = r9.D
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r4 = r9.H
            java.util.List r4 = (java.util.List) r4
            kotlin.ResultKt.b(r10)
            goto L_0x0046
        L_0x001a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0022:
            java.lang.Object r1 = r9.F
            java.lang.Object r4 = r9.E
            androidx.datastore.core.DataMigration r4 = (androidx.datastore.core.DataMigration) r4
            java.lang.Object r5 = r9.D
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r9.H
            java.util.List r6 = (java.util.List) r6
            kotlin.ResultKt.b(r10)
            r8 = r6
            r6 = r4
            r4 = r8
            goto L_0x0068
        L_0x0037:
            kotlin.ResultKt.b(r10)
            java.lang.Object r10 = r9.H
            java.util.List r1 = r9.I
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r4 = r9.J
            java.util.Iterator r1 = r1.iterator()
        L_0x0046:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x008e
            java.lang.Object r5 = r1.next()
            androidx.datastore.core.DataMigration r5 = (androidx.datastore.core.DataMigration) r5
            r9.H = r4
            r9.D = r1
            r9.E = r5
            r9.F = r10
            r9.G = r3
            java.lang.Object r6 = r5.b(r10, r9)
            if (r6 != r0) goto L_0x0063
            return r0
        L_0x0063:
            r8 = r1
            r1 = r10
            r10 = r6
            r6 = r5
            r5 = r8
        L_0x0068:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x008c
            androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1 r10 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1
            r7 = 0
            r10.<init>(r6, r7)
            r4.add(r10)
            r9.H = r4
            r9.D = r5
            r9.E = r7
            r9.F = r7
            r9.G = r2
            java.lang.Object r10 = r6.c(r1, r9)
            if (r10 != r0) goto L_0x008a
            return r0
        L_0x008a:
            r1 = r5
            goto L_0x0046
        L_0x008c:
            r10 = r1
            goto L_0x008a
        L_0x008e:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2.x(java.lang.Object):java.lang.Object");
    }
}

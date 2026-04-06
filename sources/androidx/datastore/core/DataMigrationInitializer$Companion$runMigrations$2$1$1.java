package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

@Metadata
@DebugMetadata(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {45}, m = "invokeSuspend")
public final class DataMigrationInitializer$Companion$runMigrations$2$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ DataMigration E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataMigrationInitializer$Companion$runMigrations$2$1$1(DataMigration dataMigration, Continuation continuation) {
        super(1, continuation);
        this.E = dataMigration;
    }

    public final Continuation A(Continuation continuation) {
        return new DataMigrationInitializer$Companion$runMigrations$2$1$1(this.E, continuation);
    }

    /* renamed from: B */
    public final Object invoke(Continuation continuation) {
        return ((DataMigrationInitializer$Companion$runMigrations$2$1$1) A(continuation)).x(Unit.f40552a);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            DataMigration dataMigration = this.E;
            this.D = 1;
            if (dataMigration.a(this) == f2) {
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

package com.hansecom.abt.data.managers;

import com.hansecom.mapi.models.FareMediumUsagePermission;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.managers.FareMediaManager", f = "FareMediaManager.kt", l = {174}, m = "getAnonymousCardDetails-0E7RQCE")
public final class FareMediaManager$getAnonymousCardDetails$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ FareMediaManager D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaManager$getAnonymousCardDetails$1(FareMediaManager fareMediaManager, Continuation continuation) {
        super(continuation);
        this.D = fareMediaManager;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object g2 = this.D.g((String) null, (FareMediumUsagePermission) null, this);
        return g2 == IntrinsicsKt.f() ? g2 : Result.a(g2);
    }
}

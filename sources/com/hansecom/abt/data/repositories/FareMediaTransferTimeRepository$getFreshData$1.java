package com.hansecom.abt.data.repositories;

import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.api.JsonParser;
import com.hansecom.mapi.models.TransferTimeResponse;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.json.Json;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.repositories.FareMediaTransferTimeRepository$getFreshData$1", f = "FareMediaTransferTimeRepository.kt", l = {37}, m = "invokeSuspend")
public final class FareMediaTransferTimeRepository$getFreshData$1 extends SuspendLambda implements Function2<String, Continuation<? super Result<? extends String>>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ AppFeatures F;
    public final /* synthetic */ FareMediaTransferTimeRepository G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaTransferTimeRepository$getFreshData$1(AppFeatures appFeatures, FareMediaTransferTimeRepository fareMediaTransferTimeRepository, Continuation continuation) {
        super(2, continuation);
        this.F = appFeatures;
        this.G = fareMediaTransferTimeRepository;
    }

    /* renamed from: A */
    public final Object m(String str, Continuation continuation) {
        return ((FareMediaTransferTimeRepository$getFreshData$1) s(str, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        FareMediaTransferTimeRepository$getFreshData$1 fareMediaTransferTimeRepository$getFreshData$1 = new FareMediaTransferTimeRepository$getFreshData$1(this.F, this.G, continuation);
        fareMediaTransferTimeRepository$getFreshData$1.E = obj;
        return fareMediaTransferTimeRepository$getFreshData$1;
    }

    public final Object x(Object obj) {
        Object obj2;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        String str = "";
        if (i2 == 0) {
            ResultKt.b(obj);
            String str2 = (String) this.E;
            if (this.F.C()) {
                FareMediaTransferTimeRepository fareMediaTransferTimeRepository = this.G;
                Json c2 = JsonParser.f33114a.c();
                CoroutineDispatcher b2 = Dispatchers.b();
                FareMediaTransferTimeRepository$getFreshData$1$invokeSuspend$$inlined$retrofit$default$1 fareMediaTransferTimeRepository$getFreshData$1$invokeSuspend$$inlined$retrofit$default$1 = new FareMediaTransferTimeRepository$getFreshData$1$invokeSuspend$$inlined$retrofit$default$1(c2, (Continuation) null, fareMediaTransferTimeRepository, str2);
                this.D = 1;
                obj = BuildersKt.g(b2, fareMediaTransferTimeRepository$getFreshData$1$invokeSuspend$$inlined$retrofit$default$1, this);
                if (obj == f2) {
                    return f2;
                }
            } else {
                obj2 = Result.b(str);
                return Result.a(obj2);
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Object j2 = ((Result) obj).j();
        if (Result.h(j2)) {
            String a2 = ((TransferTimeResponse) j2).a();
            if (a2 != null) {
                str = a2;
            }
            obj2 = Result.b(str);
        } else {
            obj2 = Result.b(j2);
        }
        return Result.a(obj2);
    }
}

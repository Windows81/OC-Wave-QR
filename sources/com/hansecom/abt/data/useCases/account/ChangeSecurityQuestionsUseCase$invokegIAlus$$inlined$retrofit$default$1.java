package com.hansecom.abt.data.useCases.account;

import com.hansecom.mapi.models.SecurityQuestionResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.account.ChangeSecurityQuestionsUseCase$invoke-gIAlu-s$$inlined$retrofit$default$1", f = "ChangeSecurityQuestionsUseCase.kt", l = {86}, m = "invokeSuspend")
/* renamed from: com.hansecom.abt.data.useCases.account.ChangeSecurityQuestionsUseCase$invoke-gIAlu-s$$inlined$retrofit$default$1  reason: invalid class name */
public final class ChangeSecurityQuestionsUseCase$invokegIAlus$$inlined$retrofit$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends SecurityQuestionResponse>>>, Object> {
    public int D;
    public final /* synthetic */ Json E;
    public final /* synthetic */ ChangeSecurityQuestionsUseCase F;
    public final /* synthetic */ List G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChangeSecurityQuestionsUseCase$invokegIAlus$$inlined$retrofit$default$1(Json json, Continuation continuation, ChangeSecurityQuestionsUseCase changeSecurityQuestionsUseCase, List list) {
        super(2, continuation);
        this.E = json;
        this.F = changeSecurityQuestionsUseCase;
        this.G = list;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ChangeSecurityQuestionsUseCase$invokegIAlus$$inlined$retrofit$default$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new ChangeSecurityQuestionsUseCase$invokegIAlus$$inlined$retrofit$default$1(this.E, continuation, this.F, this.G);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.hansecom.mapi.models.ErrorResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:47|48|(2:50|51)|52|53|54) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x00e4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b8 A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bd A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c0 A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:38:0x00b4=Splitter:B:38:0x00b4, B:52:0x00e4=Splitter:B:52:0x00e4} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r4.D
            r2 = 1
            if (r1 == 0) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            kotlin.ResultKt.b(r5)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x0031
        L_0x000f:
            r5 = move-exception
            goto L_0x00f0
        L_0x0012:
            r5 = move-exception
            goto L_0x00fb
        L_0x0015:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x001d:
            kotlin.ResultKt.b(r5)
            com.hansecom.abt.data.useCases.account.ChangeSecurityQuestionsUseCase r5 = r4.F     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.mapi.apis.UserDataApi r5 = r5.f33769a     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.util.List r1 = r4.G     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r4.D = r2     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.Object r5 = r5.f(r1, r4)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r5 != r0) goto L_0x0031
            return r0
        L_0x0031:
            retrofit2.Response r5 = (retrofit2.Response) r5     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            boolean r0 = r5.e()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r0 == 0) goto L_0x008c
            int r0 = r5.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 != r1) goto L_0x0069
            kotlin.Unit r5 = kotlin.Unit.f40552a     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            boolean r0 = r5 instanceof java.util.List     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r0 == 0) goto L_0x0048
            goto L_0x0070
        L_0x0048:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.Class<java.util.List> r0 = java.util.List.class
            kotlin.reflect.KClass r0 = kotlin.jvm.internal.Reflection.b(r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1.<init>()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r2 = "No content was expected with 204 but app expected "
            r1.append(r2)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1.append(r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r5.<init>(r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r5     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x0069:
            java.lang.Object r0 = r5.a()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r0 == 0) goto L_0x0079
            r5 = r0
        L_0x0070:
            kotlin.jvm.internal.Intrinsics.f(r5)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.Object r5 = kotlin.Result.b(r5)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x010f
        L_0x0079:
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.h(r5, r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r0.<init>(r5)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r0     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x008c:
            kotlinx.serialization.json.Json r0 = r4.E     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            int r1 = r5.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r2 = 401(0x191, float:5.62E-43)
            r3 = 0
            if (r1 != r2) goto L_0x00c8
            okhttp3.ResponseBody r5 = r5.d()     // Catch:{ all -> 0x00b3 }
            if (r5 == 0) goto L_0x00b3
            java.lang.String r5 = r5.k()     // Catch:{ all -> 0x00b3 }
            r0.a()     // Catch:{ all -> 0x00b3 }
            com.hansecom.abt.api.oauth.OAuthErrorResponse$Companion r1 = com.hansecom.abt.api.oauth.OAuthErrorResponse.Companion     // Catch:{ all -> 0x00b3 }
            kotlinx.serialization.KSerializer r1 = r1.serializer()     // Catch:{ all -> 0x00b3 }
            kotlinx.serialization.DeserializationStrategy r1 = (kotlinx.serialization.DeserializationStrategy) r1     // Catch:{ all -> 0x00b3 }
            java.lang.Object r5 = r0.b(r1, r5)     // Catch:{ all -> 0x00b3 }
            com.hansecom.abt.api.oauth.OAuthErrorResponse r5 = (com.hansecom.abt.api.oauth.OAuthErrorResponse) r5     // Catch:{ all -> 0x00b3 }
            goto L_0x00b4
        L_0x00b3:
            r5 = r3
        L_0x00b4:
            com.hansecom.abt.api.NotAuthorizedException r0 = new com.hansecom.abt.api.NotAuthorizedException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r5 == 0) goto L_0x00bd
            java.lang.String r1 = r5.a()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x00be
        L_0x00bd:
            r1 = r3
        L_0x00be:
            if (r5 == 0) goto L_0x00c4
            java.lang.String r3 = r5.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x00c4:
            r0.<init>(r1, r3)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r0     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x00c8:
            okhttp3.ResponseBody r1 = r5.d()     // Catch:{ all -> 0x00e4 }
            if (r1 == 0) goto L_0x00e4
            java.lang.String r1 = r1.k()     // Catch:{ all -> 0x00e4 }
            r0.a()     // Catch:{ all -> 0x00e4 }
            com.hansecom.mapi.models.ErrorResponse$Companion r2 = com.hansecom.mapi.models.ErrorResponse.Companion     // Catch:{ all -> 0x00e4 }
            kotlinx.serialization.KSerializer r2 = r2.serializer()     // Catch:{ all -> 0x00e4 }
            kotlinx.serialization.DeserializationStrategy r2 = (kotlinx.serialization.DeserializationStrategy) r2     // Catch:{ all -> 0x00e4 }
            java.lang.Object r0 = r0.b(r2, r1)     // Catch:{ all -> 0x00e4 }
            com.hansecom.mapi.models.ErrorResponse r0 = (com.hansecom.mapi.models.ErrorResponse) r0     // Catch:{ all -> 0x00e4 }
            r3 = r0
        L_0x00e4:
            com.hansecom.abt.api.ApiExceptionFactory r0 = com.hansecom.abt.api.ApiExceptionFactory.f33083a     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            retrofit2.HttpException r1 = new retrofit2.HttpException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1.<init>(r5)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.abt.api.ApiException r5 = r0.a(r3, r1)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r5     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x00f0:
            kotlin.Result$Companion r0 = kotlin.Result.f40519A
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
            goto L_0x010f
        L_0x00fb:
            timber.log.Timber$Forest r0 = timber.log.Timber.f44337a
            r0.c(r5)
            kotlin.Result$Companion r5 = kotlin.Result.f40519A
            com.hansecom.abt.api.NoConnectionException r5 = new com.hansecom.abt.api.NoConnectionException
            r5.<init>()
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
        L_0x010f:
            kotlin.Result r5 = kotlin.Result.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.account.ChangeSecurityQuestionsUseCase$invokegIAlus$$inlined$retrofit$default$1.x(java.lang.Object):java.lang.Object");
    }
}

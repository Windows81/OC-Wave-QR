package com.hansecom.abt.data.useCases;

import com.hansecom.mapi.models.HelpRequestResponse;
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
@DebugMetadata(c = "com.hansecom.abt.data.useCases.SendHelpRequestUseCase$invoke-LiYkppA$$inlined$retrofit$default$1", f = "SendHelpRequestUseCase.kt", l = {86}, m = "invokeSuspend")
/* renamed from: com.hansecom.abt.data.useCases.SendHelpRequestUseCase$invoke-LiYkppA$$inlined$retrofit$default$1  reason: invalid class name */
public final class SendHelpRequestUseCase$invokeLiYkppA$$inlined$retrofit$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends HelpRequestResponse>>, Object> {
    public int D;
    public final /* synthetic */ Json E;
    public final /* synthetic */ SendHelpRequestUseCase F;
    public final /* synthetic */ String G;
    public final /* synthetic */ String H;
    public final /* synthetic */ String I;
    public final /* synthetic */ String J;
    public final /* synthetic */ String K;
    public final /* synthetic */ String L;
    public final /* synthetic */ String M;
    public final /* synthetic */ String N;
    public final /* synthetic */ String O;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendHelpRequestUseCase$invokeLiYkppA$$inlined$retrofit$default$1(Json json, Continuation continuation, SendHelpRequestUseCase sendHelpRequestUseCase, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        super(2, continuation);
        this.E = json;
        this.F = sendHelpRequestUseCase;
        this.G = str;
        this.H = str2;
        this.I = str3;
        this.J = str4;
        this.K = str5;
        this.L = str6;
        this.M = str7;
        this.N = str8;
        this.O = str9;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SendHelpRequestUseCase$invokeLiYkppA$$inlined$retrofit$default$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new SendHelpRequestUseCase$invokeLiYkppA$$inlined$retrofit$default$1(this.E, continuation, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.hansecom.mapi.models.ErrorResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:59|60|(2:62|63)|64|65|66) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x0110 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e0 A[Catch:{ IOException -> 0x00e7, all -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e9 A[Catch:{ IOException -> 0x00e7, all -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ec A[Catch:{ IOException -> 0x00e7, all -> 0x00e5 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:64:0x0110=Splitter:B:64:0x0110, B:46:0x00dc=Splitter:B:46:0x00dc} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r19) {
        /*
            r18 = this;
            r15 = r18
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r15.D
            r2 = 1
            if (r1 == 0) goto L_0x0023
            if (r1 != r2) goto L_0x001b
            kotlin.ResultKt.b(r19)     // Catch:{ IOException -> 0x0017, all -> 0x0013 }
            r1 = r19
            goto L_0x0051
        L_0x0013:
            r0 = move-exception
            r2 = r15
            goto L_0x011c
        L_0x0017:
            r0 = move-exception
            r2 = r15
            goto L_0x0127
        L_0x001b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0023:
            kotlin.ResultKt.b(r19)
            com.hansecom.abt.data.useCases.SendHelpRequestUseCase r1 = r15.F     // Catch:{ IOException -> 0x0017, all -> 0x0013 }
            com.hansecom.mapi.apis.FeedbackApi r1 = r1.f33755a     // Catch:{ IOException -> 0x0017, all -> 0x0013 }
            java.lang.String r3 = r15.G     // Catch:{ IOException -> 0x0017, all -> 0x0013 }
            java.lang.String r4 = r15.H     // Catch:{ IOException -> 0x0017, all -> 0x0013 }
            java.lang.String r5 = r15.I     // Catch:{ IOException -> 0x0017, all -> 0x0013 }
            java.lang.String r6 = r15.J     // Catch:{ IOException -> 0x0017, all -> 0x0013 }
            java.lang.String r7 = r15.K     // Catch:{ IOException -> 0x0017, all -> 0x0013 }
            java.lang.String r8 = r15.L     // Catch:{ IOException -> 0x0017, all -> 0x0013 }
            java.lang.String r9 = r15.M     // Catch:{ IOException -> 0x0017, all -> 0x0013 }
            java.lang.String r10 = r15.N     // Catch:{ IOException -> 0x0017, all -> 0x0013 }
            java.lang.String r11 = r15.O     // Catch:{ IOException -> 0x0017, all -> 0x0013 }
            r15.D = r2     // Catch:{ IOException -> 0x0017, all -> 0x0013 }
            r2 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 7169(0x1c01, float:1.0046E-41)
            r17 = 0
            r15 = r18
            java.lang.Object r1 = com.hansecom.mapi.apis.FeedbackApi.DefaultImpls.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ IOException -> 0x00ad, all -> 0x00a8 }
            if (r1 != r0) goto L_0x0051
            return r0
        L_0x0051:
            retrofit2.Response r1 = (retrofit2.Response) r1     // Catch:{ IOException -> 0x00ad, all -> 0x00a8 }
            boolean r0 = r1.e()     // Catch:{ IOException -> 0x00ad, all -> 0x00a8 }
            if (r0 == 0) goto L_0x00b2
            int r0 = r1.b()     // Catch:{ IOException -> 0x00ad, all -> 0x00a8 }
            r2 = 204(0xcc, float:2.86E-43)
            if (r0 == r2) goto L_0x0085
            java.lang.Object r0 = r1.a()     // Catch:{ IOException -> 0x00ad, all -> 0x00a8 }
            if (r0 == 0) goto L_0x0072
            kotlin.jvm.internal.Intrinsics.f(r0)     // Catch:{ IOException -> 0x00ad, all -> 0x00a8 }
            java.lang.Object r0 = kotlin.Result.b(r0)     // Catch:{ IOException -> 0x00ad, all -> 0x00a8 }
            r2 = r18
            goto L_0x013b
        L_0x0072:
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x00ad, all -> 0x00a8 }
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.h(r0, r1)     // Catch:{ IOException -> 0x00ad, all -> 0x00a8 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x00ad, all -> 0x00a8 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x00ad, all -> 0x00a8 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x00ad, all -> 0x00a8 }
            throw r1     // Catch:{ IOException -> 0x00ad, all -> 0x00a8 }
        L_0x0085:
            kotlin.Unit r0 = kotlin.Unit.f40552a     // Catch:{ IOException -> 0x00ad, all -> 0x00a8 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x00ad, all -> 0x00a8 }
            java.lang.Class<com.hansecom.mapi.models.HelpRequestResponse> r1 = com.hansecom.mapi.models.HelpRequestResponse.class
            kotlin.reflect.KClass r1 = kotlin.jvm.internal.Reflection.b(r1)     // Catch:{ IOException -> 0x00ad, all -> 0x00a8 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00ad, all -> 0x00a8 }
            r2.<init>()     // Catch:{ IOException -> 0x00ad, all -> 0x00a8 }
            java.lang.String r3 = "No content was expected with 204 but app expected "
            r2.append(r3)     // Catch:{ IOException -> 0x00ad, all -> 0x00a8 }
            r2.append(r1)     // Catch:{ IOException -> 0x00ad, all -> 0x00a8 }
            java.lang.String r1 = r2.toString()     // Catch:{ IOException -> 0x00ad, all -> 0x00a8 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x00ad, all -> 0x00a8 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00ad, all -> 0x00a8 }
            throw r0     // Catch:{ IOException -> 0x00ad, all -> 0x00a8 }
        L_0x00a8:
            r0 = move-exception
            r2 = r18
            goto L_0x011c
        L_0x00ad:
            r0 = move-exception
            r2 = r18
            goto L_0x0127
        L_0x00b2:
            r2 = r18
            kotlinx.serialization.json.Json r0 = r2.E     // Catch:{ IOException -> 0x00e7, all -> 0x00e5 }
            int r3 = r1.b()     // Catch:{ IOException -> 0x00e7, all -> 0x00e5 }
            r4 = 401(0x191, float:5.62E-43)
            r5 = 0
            if (r3 != r4) goto L_0x00f4
            okhttp3.ResponseBody r1 = r1.d()     // Catch:{ all -> 0x00db }
            if (r1 == 0) goto L_0x00db
            java.lang.String r1 = r1.k()     // Catch:{ all -> 0x00db }
            r0.a()     // Catch:{ all -> 0x00db }
            com.hansecom.abt.api.oauth.OAuthErrorResponse$Companion r3 = com.hansecom.abt.api.oauth.OAuthErrorResponse.Companion     // Catch:{ all -> 0x00db }
            kotlinx.serialization.KSerializer r3 = r3.serializer()     // Catch:{ all -> 0x00db }
            kotlinx.serialization.DeserializationStrategy r3 = (kotlinx.serialization.DeserializationStrategy) r3     // Catch:{ all -> 0x00db }
            java.lang.Object r0 = r0.b(r3, r1)     // Catch:{ all -> 0x00db }
            com.hansecom.abt.api.oauth.OAuthErrorResponse r0 = (com.hansecom.abt.api.oauth.OAuthErrorResponse) r0     // Catch:{ all -> 0x00db }
            goto L_0x00dc
        L_0x00db:
            r0 = r5
        L_0x00dc:
            com.hansecom.abt.api.NotAuthorizedException r1 = new com.hansecom.abt.api.NotAuthorizedException     // Catch:{ IOException -> 0x00e7, all -> 0x00e5 }
            if (r0 == 0) goto L_0x00e9
            java.lang.String r3 = r0.a()     // Catch:{ IOException -> 0x00e7, all -> 0x00e5 }
            goto L_0x00ea
        L_0x00e5:
            r0 = move-exception
            goto L_0x011c
        L_0x00e7:
            r0 = move-exception
            goto L_0x0127
        L_0x00e9:
            r3 = r5
        L_0x00ea:
            if (r0 == 0) goto L_0x00f0
            java.lang.String r5 = r0.b()     // Catch:{ IOException -> 0x00e7, all -> 0x00e5 }
        L_0x00f0:
            r1.<init>(r3, r5)     // Catch:{ IOException -> 0x00e7, all -> 0x00e5 }
            throw r1     // Catch:{ IOException -> 0x00e7, all -> 0x00e5 }
        L_0x00f4:
            okhttp3.ResponseBody r3 = r1.d()     // Catch:{ all -> 0x0110 }
            if (r3 == 0) goto L_0x0110
            java.lang.String r3 = r3.k()     // Catch:{ all -> 0x0110 }
            r0.a()     // Catch:{ all -> 0x0110 }
            com.hansecom.mapi.models.ErrorResponse$Companion r4 = com.hansecom.mapi.models.ErrorResponse.Companion     // Catch:{ all -> 0x0110 }
            kotlinx.serialization.KSerializer r4 = r4.serializer()     // Catch:{ all -> 0x0110 }
            kotlinx.serialization.DeserializationStrategy r4 = (kotlinx.serialization.DeserializationStrategy) r4     // Catch:{ all -> 0x0110 }
            java.lang.Object r0 = r0.b(r4, r3)     // Catch:{ all -> 0x0110 }
            com.hansecom.mapi.models.ErrorResponse r0 = (com.hansecom.mapi.models.ErrorResponse) r0     // Catch:{ all -> 0x0110 }
            r5 = r0
        L_0x0110:
            com.hansecom.abt.api.ApiExceptionFactory r0 = com.hansecom.abt.api.ApiExceptionFactory.f33083a     // Catch:{ IOException -> 0x00e7, all -> 0x00e5 }
            retrofit2.HttpException r3 = new retrofit2.HttpException     // Catch:{ IOException -> 0x00e7, all -> 0x00e5 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x00e7, all -> 0x00e5 }
            com.hansecom.abt.api.ApiException r0 = r0.a(r5, r3)     // Catch:{ IOException -> 0x00e7, all -> 0x00e5 }
            throw r0     // Catch:{ IOException -> 0x00e7, all -> 0x00e5 }
        L_0x011c:
            kotlin.Result$Companion r1 = kotlin.Result.f40519A
            java.lang.Object r0 = kotlin.ResultKt.a(r0)
            java.lang.Object r0 = kotlin.Result.b(r0)
            goto L_0x013b
        L_0x0127:
            timber.log.Timber$Forest r1 = timber.log.Timber.f44337a
            r1.c(r0)
            kotlin.Result$Companion r0 = kotlin.Result.f40519A
            com.hansecom.abt.api.NoConnectionException r0 = new com.hansecom.abt.api.NoConnectionException
            r0.<init>()
            java.lang.Object r0 = kotlin.ResultKt.a(r0)
            java.lang.Object r0 = kotlin.Result.b(r0)
        L_0x013b:
            kotlin.Result r0 = kotlin.Result.a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.SendHelpRequestUseCase$invokeLiYkppA$$inlined$retrofit$default$1.x(java.lang.Object):java.lang.Object");
    }
}

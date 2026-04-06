package com.hansecom.abt.data.repositories;

import com.hansecom.mapi.models.TransactionSearchResult;
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
@DebugMetadata(c = "com.hansecom.abt.data.repositories.CardHistoryRepository$getMore$2$1$invokeSuspend$$inlined$retrofit$default$1", f = "CardHistoryRepository.kt", l = {86}, m = "invokeSuspend")
public final class CardHistoryRepository$getMore$2$1$invokeSuspend$$inlined$retrofit$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends TransactionSearchResult>>, Object> {
    public int D;
    public final /* synthetic */ Json E;
    public final /* synthetic */ CardHistoryRepository F;
    public final /* synthetic */ String G;
    public final /* synthetic */ TransactionSearchResult H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardHistoryRepository$getMore$2$1$invokeSuspend$$inlined$retrofit$default$1(Json json, Continuation continuation, CardHistoryRepository cardHistoryRepository, String str, TransactionSearchResult transactionSearchResult) {
        super(2, continuation);
        this.E = json;
        this.F = cardHistoryRepository;
        this.G = str;
        this.H = transactionSearchResult;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((CardHistoryRepository$getMore$2$1$invokeSuspend$$inlined$retrofit$default$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new CardHistoryRepository$getMore$2$1$invokeSuspend$$inlined$retrofit$default$1(this.E, continuation, this.F, this.G, this.H);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.hansecom.mapi.models.ErrorResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:43|44|(2:46|47)|48|49|50) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00fb */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cf A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d4 A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d7 A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x00cb=Splitter:B:34:0x00cb, B:48:0x00fb=Splitter:B:48:0x00fb} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r12.D
            r2 = 1
            if (r1 == 0) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            kotlin.ResultKt.b(r13)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x004e
        L_0x000f:
            r13 = move-exception
            goto L_0x0107
        L_0x0012:
            r13 = move-exception
            goto L_0x0112
        L_0x0015:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x001d:
            kotlin.ResultKt.b(r13)
            com.hansecom.abt.data.repositories.CardHistoryRepository r13 = r12.F     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.mapi.apis.UserFareMediaApi r3 = r13.f33406f     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r4 = r12.G     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.mapi.models.TransactionSearchResult r13 = r12.H     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.util.List r13 = r13.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            kotlin.jvm.internal.Intrinsics.f(r13)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            int r13 = r13.size()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.Boxing.c(r13)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r13 = 10
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.c(r13)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r12.D = r2     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r7 = 0
            r8 = 0
            r10 = 24
            r11 = 0
            r9 = r12
            java.lang.Object r13 = com.hansecom.mapi.apis.UserFareMediaApi.DefaultImpls.e(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r13 != r0) goto L_0x004e
            return r0
        L_0x004e:
            retrofit2.Response r13 = (retrofit2.Response) r13     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            boolean r0 = r13.e()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r0 == 0) goto L_0x00a3
            int r0 = r13.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L_0x0080
            java.lang.Object r0 = r13.a()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r0 == 0) goto L_0x006d
            kotlin.jvm.internal.Intrinsics.f(r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.Object r13 = kotlin.Result.b(r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x0126
        L_0x006d:
            java.lang.String r13 = r13.toString()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.h(r13, r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r13 = r13.toString()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r0.<init>(r13)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r0     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x0080:
            kotlin.Unit r13 = kotlin.Unit.f40552a     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.Class<com.hansecom.mapi.models.TransactionSearchResult> r0 = com.hansecom.mapi.models.TransactionSearchResult.class
            kotlin.reflect.KClass r0 = kotlin.jvm.internal.Reflection.b(r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1.<init>()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r2 = "No content was expected with 204 but app expected "
            r1.append(r2)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1.append(r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r13.<init>(r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r13     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x00a3:
            kotlinx.serialization.json.Json r0 = r12.E     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            int r1 = r13.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r2 = 401(0x191, float:5.62E-43)
            r3 = 0
            if (r1 != r2) goto L_0x00df
            okhttp3.ResponseBody r13 = r13.d()     // Catch:{ all -> 0x00ca }
            if (r13 == 0) goto L_0x00ca
            java.lang.String r13 = r13.k()     // Catch:{ all -> 0x00ca }
            r0.a()     // Catch:{ all -> 0x00ca }
            com.hansecom.abt.api.oauth.OAuthErrorResponse$Companion r1 = com.hansecom.abt.api.oauth.OAuthErrorResponse.Companion     // Catch:{ all -> 0x00ca }
            kotlinx.serialization.KSerializer r1 = r1.serializer()     // Catch:{ all -> 0x00ca }
            kotlinx.serialization.DeserializationStrategy r1 = (kotlinx.serialization.DeserializationStrategy) r1     // Catch:{ all -> 0x00ca }
            java.lang.Object r13 = r0.b(r1, r13)     // Catch:{ all -> 0x00ca }
            com.hansecom.abt.api.oauth.OAuthErrorResponse r13 = (com.hansecom.abt.api.oauth.OAuthErrorResponse) r13     // Catch:{ all -> 0x00ca }
            goto L_0x00cb
        L_0x00ca:
            r13 = r3
        L_0x00cb:
            com.hansecom.abt.api.NotAuthorizedException r0 = new com.hansecom.abt.api.NotAuthorizedException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r13 == 0) goto L_0x00d4
            java.lang.String r1 = r13.a()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x00d5
        L_0x00d4:
            r1 = r3
        L_0x00d5:
            if (r13 == 0) goto L_0x00db
            java.lang.String r3 = r13.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x00db:
            r0.<init>(r1, r3)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r0     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x00df:
            okhttp3.ResponseBody r1 = r13.d()     // Catch:{ all -> 0x00fb }
            if (r1 == 0) goto L_0x00fb
            java.lang.String r1 = r1.k()     // Catch:{ all -> 0x00fb }
            r0.a()     // Catch:{ all -> 0x00fb }
            com.hansecom.mapi.models.ErrorResponse$Companion r2 = com.hansecom.mapi.models.ErrorResponse.Companion     // Catch:{ all -> 0x00fb }
            kotlinx.serialization.KSerializer r2 = r2.serializer()     // Catch:{ all -> 0x00fb }
            kotlinx.serialization.DeserializationStrategy r2 = (kotlinx.serialization.DeserializationStrategy) r2     // Catch:{ all -> 0x00fb }
            java.lang.Object r0 = r0.b(r2, r1)     // Catch:{ all -> 0x00fb }
            com.hansecom.mapi.models.ErrorResponse r0 = (com.hansecom.mapi.models.ErrorResponse) r0     // Catch:{ all -> 0x00fb }
            r3 = r0
        L_0x00fb:
            com.hansecom.abt.api.ApiExceptionFactory r0 = com.hansecom.abt.api.ApiExceptionFactory.f33083a     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            retrofit2.HttpException r1 = new retrofit2.HttpException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1.<init>(r13)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.abt.api.ApiException r13 = r0.a(r3, r1)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r13     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x0107:
            kotlin.Result$Companion r0 = kotlin.Result.f40519A
            java.lang.Object r13 = kotlin.ResultKt.a(r13)
            java.lang.Object r13 = kotlin.Result.b(r13)
            goto L_0x0126
        L_0x0112:
            timber.log.Timber$Forest r0 = timber.log.Timber.f44337a
            r0.c(r13)
            kotlin.Result$Companion r13 = kotlin.Result.f40519A
            com.hansecom.abt.api.NoConnectionException r13 = new com.hansecom.abt.api.NoConnectionException
            r13.<init>()
            java.lang.Object r13 = kotlin.ResultKt.a(r13)
            java.lang.Object r13 = kotlin.Result.b(r13)
        L_0x0126:
            kotlin.Result r13 = kotlin.Result.a(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.CardHistoryRepository$getMore$2$1$invokeSuspend$$inlined$retrofit$default$1.x(java.lang.Object):java.lang.Object");
    }
}

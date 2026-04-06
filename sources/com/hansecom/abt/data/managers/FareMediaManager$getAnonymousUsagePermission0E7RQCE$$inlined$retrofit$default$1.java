package com.hansecom.abt.data.managers;

import com.hansecom.mapi.models.FareMediumUsagePermission;
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
@DebugMetadata(c = "com.hansecom.abt.data.managers.FareMediaManager$getAnonymousUsagePermission-0E7RQCE$$inlined$retrofit$default$1", f = "FareMediaManager.kt", l = {86}, m = "invokeSuspend")
/* renamed from: com.hansecom.abt.data.managers.FareMediaManager$getAnonymousUsagePermission-0E7RQCE$$inlined$retrofit$default$1  reason: invalid class name */
public final class FareMediaManager$getAnonymousUsagePermission0E7RQCE$$inlined$retrofit$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends FareMediumUsagePermission>>, Object> {
    public int D;
    public final /* synthetic */ Json E;
    public final /* synthetic */ FareMediaManager F;
    public final /* synthetic */ String G;
    public final /* synthetic */ String H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaManager$getAnonymousUsagePermission0E7RQCE$$inlined$retrofit$default$1(Json json, Continuation continuation, FareMediaManager fareMediaManager, String str, String str2) {
        super(2, continuation);
        this.E = json;
        this.F = fareMediaManager;
        this.G = str;
        this.H = str2;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((FareMediaManager$getAnonymousUsagePermission0E7RQCE$$inlined$retrofit$default$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new FareMediaManager$getAnonymousUsagePermission0E7RQCE$$inlined$retrofit$default$1(this.E, continuation, this.F, this.G, this.H);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.hansecom.mapi.models.ErrorResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:43|44|(2:46|47)|48|49|50) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00f0 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c4 A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c9 A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cc A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x00c0=Splitter:B:34:0x00c0, B:48:0x00f0=Splitter:B:48:0x00f0} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r11.D
            r2 = 1
            if (r1 == 0) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            kotlin.ResultKt.b(r12)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x0043
        L_0x000f:
            r12 = move-exception
            goto L_0x00fc
        L_0x0012:
            r12 = move-exception
            goto L_0x0107
        L_0x0015:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x001d:
            kotlin.ResultKt.b(r12)
            com.hansecom.abt.data.managers.FareMediaManager r12 = r11.F     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.mapi.apis.AnonymousFareMediaApi r3 = r12.f33294c     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.mapi.models.FareMediaCredentialsWithValidityExtention r12 = new com.hansecom.mapi.models.FareMediaCredentialsWithValidityExtention     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r5 = r11.G     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r7 = r11.H     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r9 = 10
            r10 = 0
            r6 = 0
            r8 = 0
            r4 = r12
            r4.<init>((java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.Boolean) r8, (int) r9, (kotlin.jvm.internal.DefaultConstructorMarker) r10)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r11.D = r2     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r4 = 0
            r7 = 1
            r8 = 0
            r5 = r12
            r6 = r11
            java.lang.Object r12 = com.hansecom.mapi.apis.AnonymousFareMediaApi.DefaultImpls.a(r3, r4, r5, r6, r7, r8)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r12 != r0) goto L_0x0043
            return r0
        L_0x0043:
            retrofit2.Response r12 = (retrofit2.Response) r12     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            boolean r0 = r12.e()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r0 == 0) goto L_0x0098
            int r0 = r12.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L_0x0075
            java.lang.Object r0 = r12.a()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r0 == 0) goto L_0x0062
            kotlin.jvm.internal.Intrinsics.f(r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.Object r12 = kotlin.Result.b(r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x011b
        L_0x0062:
            java.lang.String r12 = r12.toString()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.h(r12, r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r12 = r12.toString()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r0.<init>(r12)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r0     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x0075:
            kotlin.Unit r12 = kotlin.Unit.f40552a     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.Class<com.hansecom.mapi.models.FareMediumUsagePermission> r0 = com.hansecom.mapi.models.FareMediumUsagePermission.class
            kotlin.reflect.KClass r0 = kotlin.jvm.internal.Reflection.b(r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1.<init>()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r2 = "No content was expected with 204 but app expected "
            r1.append(r2)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1.append(r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r12.<init>(r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r12     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x0098:
            kotlinx.serialization.json.Json r0 = r11.E     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            int r1 = r12.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r2 = 401(0x191, float:5.62E-43)
            r3 = 0
            if (r1 != r2) goto L_0x00d4
            okhttp3.ResponseBody r12 = r12.d()     // Catch:{ all -> 0x00bf }
            if (r12 == 0) goto L_0x00bf
            java.lang.String r12 = r12.k()     // Catch:{ all -> 0x00bf }
            r0.a()     // Catch:{ all -> 0x00bf }
            com.hansecom.abt.api.oauth.OAuthErrorResponse$Companion r1 = com.hansecom.abt.api.oauth.OAuthErrorResponse.Companion     // Catch:{ all -> 0x00bf }
            kotlinx.serialization.KSerializer r1 = r1.serializer()     // Catch:{ all -> 0x00bf }
            kotlinx.serialization.DeserializationStrategy r1 = (kotlinx.serialization.DeserializationStrategy) r1     // Catch:{ all -> 0x00bf }
            java.lang.Object r12 = r0.b(r1, r12)     // Catch:{ all -> 0x00bf }
            com.hansecom.abt.api.oauth.OAuthErrorResponse r12 = (com.hansecom.abt.api.oauth.OAuthErrorResponse) r12     // Catch:{ all -> 0x00bf }
            goto L_0x00c0
        L_0x00bf:
            r12 = r3
        L_0x00c0:
            com.hansecom.abt.api.NotAuthorizedException r0 = new com.hansecom.abt.api.NotAuthorizedException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r12 == 0) goto L_0x00c9
            java.lang.String r1 = r12.a()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x00ca
        L_0x00c9:
            r1 = r3
        L_0x00ca:
            if (r12 == 0) goto L_0x00d0
            java.lang.String r3 = r12.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x00d0:
            r0.<init>(r1, r3)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r0     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x00d4:
            okhttp3.ResponseBody r1 = r12.d()     // Catch:{ all -> 0x00f0 }
            if (r1 == 0) goto L_0x00f0
            java.lang.String r1 = r1.k()     // Catch:{ all -> 0x00f0 }
            r0.a()     // Catch:{ all -> 0x00f0 }
            com.hansecom.mapi.models.ErrorResponse$Companion r2 = com.hansecom.mapi.models.ErrorResponse.Companion     // Catch:{ all -> 0x00f0 }
            kotlinx.serialization.KSerializer r2 = r2.serializer()     // Catch:{ all -> 0x00f0 }
            kotlinx.serialization.DeserializationStrategy r2 = (kotlinx.serialization.DeserializationStrategy) r2     // Catch:{ all -> 0x00f0 }
            java.lang.Object r0 = r0.b(r2, r1)     // Catch:{ all -> 0x00f0 }
            com.hansecom.mapi.models.ErrorResponse r0 = (com.hansecom.mapi.models.ErrorResponse) r0     // Catch:{ all -> 0x00f0 }
            r3 = r0
        L_0x00f0:
            com.hansecom.abt.api.ApiExceptionFactory r0 = com.hansecom.abt.api.ApiExceptionFactory.f33083a     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            retrofit2.HttpException r1 = new retrofit2.HttpException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1.<init>(r12)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.abt.api.ApiException r12 = r0.a(r3, r1)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r12     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x00fc:
            kotlin.Result$Companion r0 = kotlin.Result.f40519A
            java.lang.Object r12 = kotlin.ResultKt.a(r12)
            java.lang.Object r12 = kotlin.Result.b(r12)
            goto L_0x011b
        L_0x0107:
            timber.log.Timber$Forest r0 = timber.log.Timber.f44337a
            r0.c(r12)
            kotlin.Result$Companion r12 = kotlin.Result.f40519A
            com.hansecom.abt.api.NoConnectionException r12 = new com.hansecom.abt.api.NoConnectionException
            r12.<init>()
            java.lang.Object r12 = kotlin.ResultKt.a(r12)
            java.lang.Object r12 = kotlin.Result.b(r12)
        L_0x011b:
            kotlin.Result r12 = kotlin.Result.a(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.FareMediaManager$getAnonymousUsagePermission0E7RQCE$$inlined$retrofit$default$1.x(java.lang.Object):java.lang.Object");
    }
}

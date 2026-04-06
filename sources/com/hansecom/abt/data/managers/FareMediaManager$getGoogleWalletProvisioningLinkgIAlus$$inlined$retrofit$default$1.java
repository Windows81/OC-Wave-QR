package com.hansecom.abt.data.managers;

import com.hansecom.mapi.models.GoogleWalletProvisioningResponse;
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
@DebugMetadata(c = "com.hansecom.abt.data.managers.FareMediaManager$getGoogleWalletProvisioningLink-gIAlu-s$$inlined$retrofit$default$1", f = "FareMediaManager.kt", l = {86}, m = "invokeSuspend")
/* renamed from: com.hansecom.abt.data.managers.FareMediaManager$getGoogleWalletProvisioningLink-gIAlu-s$$inlined$retrofit$default$1  reason: invalid class name */
public final class FareMediaManager$getGoogleWalletProvisioningLinkgIAlus$$inlined$retrofit$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends GoogleWalletProvisioningResponse>>, Object> {
    public int D;
    public final /* synthetic */ Json E;
    public final /* synthetic */ FareMediaManager F;
    public final /* synthetic */ String G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaManager$getGoogleWalletProvisioningLinkgIAlus$$inlined$retrofit$default$1(Json json, Continuation continuation, FareMediaManager fareMediaManager, String str) {
        super(2, continuation);
        this.E = json;
        this.F = fareMediaManager;
        this.G = str;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((FareMediaManager$getGoogleWalletProvisioningLinkgIAlus$$inlined$retrofit$default$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new FareMediaManager$getGoogleWalletProvisioningLinkgIAlus$$inlined$retrofit$default$1(this.E, continuation, this.F, this.G);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.hansecom.mapi.models.ErrorResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:43|44|(2:46|47)|48|49|50) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00e3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b7 A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bc A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bf A[Catch:{ IOException -> 0x0012, all -> 0x000f }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x00b3=Splitter:B:34:0x00b3, B:48:0x00e3=Splitter:B:48:0x00e3} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r10.D
            r2 = 1
            if (r1 == 0) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            kotlin.ResultKt.b(r11)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x0036
        L_0x000f:
            r11 = move-exception
            goto L_0x00ef
        L_0x0012:
            r11 = move-exception
            goto L_0x00fa
        L_0x0015:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x001d:
            kotlin.ResultKt.b(r11)
            com.hansecom.abt.data.managers.FareMediaManager r11 = r10.F     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.mapi.apis.UserFareMediaApi r3 = r11.f33293b     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r4 = r10.G     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r10.D = r2     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r5 = 0
            r6 = 0
            r8 = 6
            r9 = 0
            r7 = r10
            java.lang.Object r11 = com.hansecom.mapi.apis.UserFareMediaApi.DefaultImpls.d(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r11 != r0) goto L_0x0036
            return r0
        L_0x0036:
            retrofit2.Response r11 = (retrofit2.Response) r11     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            boolean r0 = r11.e()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r0 == 0) goto L_0x008b
            int r0 = r11.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L_0x0068
            java.lang.Object r0 = r11.a()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r0 == 0) goto L_0x0055
            kotlin.jvm.internal.Intrinsics.f(r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.Object r11 = kotlin.Result.b(r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x010e
        L_0x0055:
            java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.h(r11, r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r0.<init>(r11)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r0     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x0068:
            kotlin.Unit r11 = kotlin.Unit.f40552a     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.Class<com.hansecom.mapi.models.GoogleWalletProvisioningResponse> r0 = com.hansecom.mapi.models.GoogleWalletProvisioningResponse.class
            kotlin.reflect.KClass r0 = kotlin.jvm.internal.Reflection.b(r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1.<init>()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r2 = "No content was expected with 204 but app expected "
            r1.append(r2)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1.append(r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r11.<init>(r0)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r11     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x008b:
            kotlinx.serialization.json.Json r0 = r10.E     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            int r1 = r11.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r2 = 401(0x191, float:5.62E-43)
            r3 = 0
            if (r1 != r2) goto L_0x00c7
            okhttp3.ResponseBody r11 = r11.d()     // Catch:{ all -> 0x00b2 }
            if (r11 == 0) goto L_0x00b2
            java.lang.String r11 = r11.k()     // Catch:{ all -> 0x00b2 }
            r0.a()     // Catch:{ all -> 0x00b2 }
            com.hansecom.abt.api.oauth.OAuthErrorResponse$Companion r1 = com.hansecom.abt.api.oauth.OAuthErrorResponse.Companion     // Catch:{ all -> 0x00b2 }
            kotlinx.serialization.KSerializer r1 = r1.serializer()     // Catch:{ all -> 0x00b2 }
            kotlinx.serialization.DeserializationStrategy r1 = (kotlinx.serialization.DeserializationStrategy) r1     // Catch:{ all -> 0x00b2 }
            java.lang.Object r11 = r0.b(r1, r11)     // Catch:{ all -> 0x00b2 }
            com.hansecom.abt.api.oauth.OAuthErrorResponse r11 = (com.hansecom.abt.api.oauth.OAuthErrorResponse) r11     // Catch:{ all -> 0x00b2 }
            goto L_0x00b3
        L_0x00b2:
            r11 = r3
        L_0x00b3:
            com.hansecom.abt.api.NotAuthorizedException r0 = new com.hansecom.abt.api.NotAuthorizedException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            if (r11 == 0) goto L_0x00bc
            java.lang.String r1 = r11.a()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            goto L_0x00bd
        L_0x00bc:
            r1 = r3
        L_0x00bd:
            if (r11 == 0) goto L_0x00c3
            java.lang.String r3 = r11.b()     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x00c3:
            r0.<init>(r1, r3)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r0     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x00c7:
            okhttp3.ResponseBody r1 = r11.d()     // Catch:{ all -> 0x00e3 }
            if (r1 == 0) goto L_0x00e3
            java.lang.String r1 = r1.k()     // Catch:{ all -> 0x00e3 }
            r0.a()     // Catch:{ all -> 0x00e3 }
            com.hansecom.mapi.models.ErrorResponse$Companion r2 = com.hansecom.mapi.models.ErrorResponse.Companion     // Catch:{ all -> 0x00e3 }
            kotlinx.serialization.KSerializer r2 = r2.serializer()     // Catch:{ all -> 0x00e3 }
            kotlinx.serialization.DeserializationStrategy r2 = (kotlinx.serialization.DeserializationStrategy) r2     // Catch:{ all -> 0x00e3 }
            java.lang.Object r0 = r0.b(r2, r1)     // Catch:{ all -> 0x00e3 }
            com.hansecom.mapi.models.ErrorResponse r0 = (com.hansecom.mapi.models.ErrorResponse) r0     // Catch:{ all -> 0x00e3 }
            r3 = r0
        L_0x00e3:
            com.hansecom.abt.api.ApiExceptionFactory r0 = com.hansecom.abt.api.ApiExceptionFactory.f33083a     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            retrofit2.HttpException r1 = new retrofit2.HttpException     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1.<init>(r11)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            com.hansecom.abt.api.ApiException r11 = r0.a(r3, r1)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            throw r11     // Catch:{ IOException -> 0x0012, all -> 0x000f }
        L_0x00ef:
            kotlin.Result$Companion r0 = kotlin.Result.f40519A
            java.lang.Object r11 = kotlin.ResultKt.a(r11)
            java.lang.Object r11 = kotlin.Result.b(r11)
            goto L_0x010e
        L_0x00fa:
            timber.log.Timber$Forest r0 = timber.log.Timber.f44337a
            r0.c(r11)
            kotlin.Result$Companion r11 = kotlin.Result.f40519A
            com.hansecom.abt.api.NoConnectionException r11 = new com.hansecom.abt.api.NoConnectionException
            r11.<init>()
            java.lang.Object r11 = kotlin.ResultKt.a(r11)
            java.lang.Object r11 = kotlin.Result.b(r11)
        L_0x010e:
            kotlin.Result r11 = kotlin.Result.a(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.FareMediaManager$getGoogleWalletProvisioningLinkgIAlus$$inlined$retrofit$default$1.x(java.lang.Object):java.lang.Object");
    }
}

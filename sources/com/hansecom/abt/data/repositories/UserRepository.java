package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.repositories.base.ValueRepository;
import com.hansecom.mapi.apis.UserDataApi;
import com.hansecom.mapi.models.User;
import javax.inject.Singleton;
import kotlin.Metadata;

@Singleton
@Metadata
public final class UserRepository extends ValueRepository<User> {

    /* renamed from: k  reason: collision with root package name */
    public final UserDataApi f33538k;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public UserRepository(com.hansecom.mapi.apis.UserDataApi r5, com.hansecom.abt.data.preferences.base.DataStoreFileProducer r6, kotlinx.serialization.json.Json r7) {
        /*
            r4 = this;
            java.lang.String r0 = "api"
            kotlin.jvm.internal.Intrinsics.i(r5, r0)
            java.lang.String r0 = "dataStoreFileProducer"
            kotlin.jvm.internal.Intrinsics.i(r6, r0)
            java.lang.String r0 = "json"
            kotlin.jvm.internal.Intrinsics.i(r7, r0)
            com.hansecom.abt.data.preferences.base.Seconds$Companion r0 = com.hansecom.abt.data.preferences.base.Seconds.f33366b
            r1 = 15
            com.hansecom.abt.data.preferences.base.Seconds r3 = r0.c(r1)
            com.hansecom.abt.data.preferences.base.Seconds r0 = r0.a(r1)
            com.hansecom.abt.data.preferences.base.ValueLocalDataProvider$Companion r1 = com.hansecom.abt.data.preferences.base.ValueLocalDataProvider.f33368d
            r7.a()
            com.hansecom.abt.data.preferences.base.CacheValue$Companion r1 = com.hansecom.abt.data.preferences.base.CacheValue.Companion
            com.hansecom.mapi.models.User$Companion r2 = com.hansecom.mapi.models.User.Companion
            kotlinx.serialization.KSerializer r2 = r2.serializer()
            kotlinx.serialization.KSerializer r1 = r1.serializer(r2)
            com.hansecom.abt.data.repositories.UserRepository$special$$inlined$create$1 r2 = new com.hansecom.abt.data.repositories.UserRepository$special$$inlined$create$1
            r2.<init>(r7, r1)
            com.hansecom.abt.data.repositories.UserRepository$special$$inlined$create$2 r7 = new com.hansecom.abt.data.repositories.UserRepository$special$$inlined$create$2
            java.lang.String r1 = "User"
            r7.<init>(r1, r6, r2)
            r4.<init>(r3, r0, r7)
            r4.f33538k = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.UserRepository.<init>(com.hansecom.mapi.apis.UserDataApi, com.hansecom.abt.data.preferences.base.DataStoreFileProducer, kotlinx.serialization.json.Json):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005e A[SYNTHETIC, Splitter:B:17:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object M(java.lang.String r11, java.lang.String r12, kotlin.coroutines.Continuation r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.hansecom.abt.data.repositories.UserRepository$changePin$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.hansecom.abt.data.repositories.UserRepository$changePin$1 r0 = (com.hansecom.abt.data.repositories.UserRepository$changePin$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.repositories.UserRepository$changePin$1 r0 = new com.hansecom.abt.data.repositories.UserRepository$changePin$1
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.b(r13)
            goto L_0x0051
        L_0x0029:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0031:
            kotlin.ResultKt.b(r13)
            com.hansecom.abt.api.JsonParser r13 = com.hansecom.abt.api.JsonParser.f33114a
            kotlinx.serialization.json.Json r5 = r13.c()
            kotlinx.coroutines.CoroutineDispatcher r13 = kotlinx.coroutines.Dispatchers.b()
            com.hansecom.abt.data.repositories.UserRepository$changePin-0E7RQCE$$inlined$retrofit$default$1 r2 = new com.hansecom.abt.data.repositories.UserRepository$changePin-0E7RQCE$$inlined$retrofit$default$1
            r6 = 0
            r4 = r2
            r7 = r10
            r8 = r11
            r9 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.E = r3
            java.lang.Object r13 = kotlinx.coroutines.BuildersKt.g(r13, r2, r0)
            if (r13 != r1) goto L_0x0051
            return r1
        L_0x0051:
            kotlin.Result r13 = (kotlin.Result) r13
            java.lang.Object r11 = r13.j()
            java.lang.Throwable r12 = kotlin.Result.e(r11)
            if (r12 != 0) goto L_0x005e
            goto L_0x0077
        L_0x005e:
            boolean r11 = r12 instanceof com.hansecom.abt.api.ApiValidationException     // Catch:{ all -> 0x006a }
            if (r11 == 0) goto L_0x006c
            com.hansecom.abt.data.exceptions.FieldErrorsException r11 = new com.hansecom.abt.data.exceptions.FieldErrorsException     // Catch:{ all -> 0x006a }
            com.hansecom.abt.api.ApiValidationException r12 = (com.hansecom.abt.api.ApiValidationException) r12     // Catch:{ all -> 0x006a }
            r11.<init>(r12)     // Catch:{ all -> 0x006a }
            throw r11     // Catch:{ all -> 0x006a }
        L_0x006a:
            r11 = move-exception
            goto L_0x006d
        L_0x006c:
            throw r12     // Catch:{ all -> 0x006a }
        L_0x006d:
            kotlin.Result$Companion r12 = kotlin.Result.f40519A
            java.lang.Object r11 = kotlin.ResultKt.a(r11)
            java.lang.Object r11 = kotlin.Result.b(r11)
        L_0x0077:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.UserRepository.M(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059 A[SYNTHETIC, Splitter:B:17:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a0 A[SYNTHETIC, Splitter:B:33:0x00a0] */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object N(java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.hansecom.abt.data.repositories.UserRepository$delete$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.hansecom.abt.data.repositories.UserRepository$delete$1 r0 = (com.hansecom.abt.data.repositories.UserRepository$delete$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.repositories.UserRepository$delete$1 r0 = new com.hansecom.abt.data.repositories.UserRepository$delete$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.b(r8)
            goto L_0x004d
        L_0x0029:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0031:
            kotlin.ResultKt.b(r8)
            com.hansecom.abt.api.JsonParser r8 = com.hansecom.abt.api.JsonParser.f33114a
            kotlinx.serialization.json.Json r8 = r8.c()
            kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.b()
            com.hansecom.abt.data.repositories.UserRepository$delete-gIAlu-s$$inlined$retrofitRaw$default$1 r4 = new com.hansecom.abt.data.repositories.UserRepository$delete-gIAlu-s$$inlined$retrofitRaw$default$1
            r5 = 0
            r4.<init>(r8, r5, r6, r7)
            r0.E = r3
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.g(r2, r4, r0)
            if (r8 != r1) goto L_0x004d
            return r1
        L_0x004d:
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r7 = r8.j()
            boolean r8 = kotlin.Result.h(r7)
            if (r8 == 0) goto L_0x0095
            retrofit2.Response r7 = (retrofit2.Response) r7     // Catch:{ all -> 0x0083 }
            int r7 = r7.b()     // Catch:{ all -> 0x0083 }
            r8 = 202(0xca, float:2.83E-43)
            if (r7 == r8) goto L_0x0085
            r8 = 204(0xcc, float:2.86E-43)
            if (r7 != r8) goto L_0x0068
            goto L_0x0086
        L_0x0068:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0083 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0083 }
            r0.<init>()     // Catch:{ all -> 0x0083 }
            java.lang.String r1 = "Unexpected response "
            r0.append(r1)     // Catch:{ all -> 0x0083 }
            r0.append(r7)     // Catch:{ all -> 0x0083 }
            java.lang.String r7 = r0.toString()     // Catch:{ all -> 0x0083 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0083 }
            r8.<init>(r7)     // Catch:{ all -> 0x0083 }
            throw r8     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r7 = move-exception
            goto L_0x008f
        L_0x0085:
            r3 = 0
        L_0x0086:
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.a(r3)     // Catch:{ all -> 0x0083 }
            java.lang.Object r7 = kotlin.Result.b(r7)     // Catch:{ all -> 0x0083 }
            goto L_0x0099
        L_0x008f:
            kotlin.Result$Companion r8 = kotlin.Result.f40519A
            java.lang.Object r7 = kotlin.ResultKt.a(r7)
        L_0x0095:
            java.lang.Object r7 = kotlin.Result.b(r7)
        L_0x0099:
            java.lang.Throwable r8 = kotlin.Result.e(r7)
            if (r8 != 0) goto L_0x00a0
            goto L_0x00b9
        L_0x00a0:
            boolean r7 = r8 instanceof com.hansecom.abt.api.ApiValidationException     // Catch:{ all -> 0x00ac }
            if (r7 == 0) goto L_0x00ae
            com.hansecom.abt.data.exceptions.FieldErrorsException r7 = new com.hansecom.abt.data.exceptions.FieldErrorsException     // Catch:{ all -> 0x00ac }
            com.hansecom.abt.api.ApiValidationException r8 = (com.hansecom.abt.api.ApiValidationException) r8     // Catch:{ all -> 0x00ac }
            r7.<init>(r8)     // Catch:{ all -> 0x00ac }
            throw r7     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r7 = move-exception
            goto L_0x00af
        L_0x00ae:
            throw r8     // Catch:{ all -> 0x00ac }
        L_0x00af:
            kotlin.Result$Companion r8 = kotlin.Result.f40519A
            java.lang.Object r7 = kotlin.ResultKt.a(r7)
            java.lang.Object r7 = kotlin.Result.b(r7)
        L_0x00b9:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.UserRepository.N(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.hansecom.abt.data.repositories.UserRepository$resetPassword$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.hansecom.abt.data.repositories.UserRepository$resetPassword$1 r0 = (com.hansecom.abt.data.repositories.UserRepository$resetPassword$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.repositories.UserRepository$resetPassword$1 r0 = new com.hansecom.abt.data.repositories.UserRepository$resetPassword$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.b(r8)
            goto L_0x004d
        L_0x0029:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0031:
            kotlin.ResultKt.b(r8)
            com.hansecom.abt.api.JsonParser r8 = com.hansecom.abt.api.JsonParser.f33114a
            kotlinx.serialization.json.Json r8 = r8.c()
            kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.b()
            com.hansecom.abt.data.repositories.UserRepository$resetPassword-gIAlu-s$$inlined$retrofit$default$1 r4 = new com.hansecom.abt.data.repositories.UserRepository$resetPassword-gIAlu-s$$inlined$retrofit$default$1
            r5 = 0
            r4.<init>(r8, r5, r6, r7)
            r0.E = r3
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.g(r2, r4, r0)
            if (r8 != r1) goto L_0x004d
            return r1
        L_0x004d:
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r7 = r8.j()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.UserRepository.O(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object P(com.hansecom.mapi.models.User r13, kotlin.coroutines.Continuation r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.hansecom.abt.data.repositories.UserRepository$saveChanges$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.hansecom.abt.data.repositories.UserRepository$saveChanges$1 r0 = (com.hansecom.abt.data.repositories.UserRepository$saveChanges$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.repositories.UserRepository$saveChanges$1 r0 = new com.hansecom.abt.data.repositories.UserRepository$saveChanges$1
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r14 = r0.E
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r0.G
            r9 = 0
            r10 = 4
            r11 = 3
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0061
            if (r1 == r3) goto L_0x0053
            if (r1 == r2) goto L_0x0049
            if (r1 == r11) goto L_0x003e
            if (r1 != r10) goto L_0x0036
            java.lang.Object r13 = r0.C
            kotlin.ResultKt.b(r14)
            goto L_0x00cb
        L_0x0036:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003e:
            java.lang.Object r13 = r0.D
            java.lang.Object r1 = r0.C
            com.hansecom.abt.data.repositories.UserRepository r1 = (com.hansecom.abt.data.repositories.UserRepository) r1
            kotlin.ResultKt.b(r14)
            goto L_0x00b8
        L_0x0049:
            java.lang.Object r13 = r0.D
            java.lang.Object r1 = r0.C
            com.hansecom.abt.data.repositories.UserRepository r1 = (com.hansecom.abt.data.repositories.UserRepository) r1
            kotlin.ResultKt.b(r14)
            goto L_0x00a9
        L_0x0053:
            java.lang.Object r13 = r0.D
            com.hansecom.mapi.models.User r13 = (com.hansecom.mapi.models.User) r13
            java.lang.Object r1 = r0.C
            com.hansecom.abt.data.repositories.UserRepository r1 = (com.hansecom.abt.data.repositories.UserRepository) r1
            kotlin.ResultKt.b(r14)
            r3 = r13
            r13 = r1
            goto L_0x0082
        L_0x0061:
            kotlin.ResultKt.b(r14)
            com.hansecom.abt.api.JsonParser r14 = com.hansecom.abt.api.JsonParser.f33114a
            kotlinx.serialization.json.Json r14 = r14.c()
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.b()
            com.hansecom.abt.data.repositories.UserRepository$saveChanges-gIAlu-s$$inlined$retrofit$default$1 r4 = new com.hansecom.abt.data.repositories.UserRepository$saveChanges-gIAlu-s$$inlined$retrofit$default$1
            r4.<init>(r14, r9, r12, r13)
            r0.C = r12
            r0.D = r13
            r0.G = r3
            java.lang.Object r14 = kotlinx.coroutines.BuildersKt.g(r1, r4, r0)
            if (r14 != r8) goto L_0x0080
            return r8
        L_0x0080:
            r3 = r13
            r13 = r12
        L_0x0082:
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.j()
            boolean r1 = kotlin.Result.h(r14)
            if (r1 == 0) goto L_0x00b6
            r1 = r14
            com.hansecom.mapi.models.User r1 = (com.hansecom.mapi.models.User) r1
            r0.C = r13
            r0.D = r14
            r0.G = r2
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r1 = r13
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r0
            java.lang.Object r1 = com.hansecom.abt.data.repositories.base.BaseRepository.K(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != r8) goto L_0x00a7
            return r8
        L_0x00a7:
            r1 = r13
            r13 = r14
        L_0x00a9:
            r0.C = r1
            r0.D = r13
            r0.G = r11
            java.lang.Object r14 = r1.D(r0)
            if (r14 != r8) goto L_0x00b8
            return r8
        L_0x00b6:
            r1 = r13
            r13 = r14
        L_0x00b8:
            java.lang.Throwable r14 = kotlin.Result.e(r13)
            if (r14 == 0) goto L_0x00cb
            r0.C = r13
            r0.D = r9
            r0.G = r10
            java.lang.Object r14 = r1.D(r0)
            if (r14 != r8) goto L_0x00cb
            return r8
        L_0x00cb:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.UserRepository.P(com.hansecom.mapi.models.User, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00db A[SYNTHETIC, Splitter:B:36:0x00db] */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object Q(com.hansecom.mapi.models.UserAddress r22, kotlin.coroutines.Continuation r23) {
        /*
            r21 = this;
            r1 = r21
            r0 = r23
            boolean r2 = r0 instanceof com.hansecom.abt.data.repositories.UserRepository$updateAddress$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.hansecom.abt.data.repositories.UserRepository$updateAddress$1 r2 = (com.hansecom.abt.data.repositories.UserRepository$updateAddress$1) r2
            int r3 = r2.H
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.H = r3
            goto L_0x001c
        L_0x0017:
            com.hansecom.abt.data.repositories.UserRepository$updateAddress$1 r2 = new com.hansecom.abt.data.repositories.UserRepository$updateAddress$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.F
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r4 = r2.H
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x0062
            if (r4 == r7) goto L_0x005a
            if (r4 == r6) goto L_0x0044
            if (r4 != r5) goto L_0x003c
            java.lang.Object r2 = r2.C
            kotlin.ResultKt.b(r0)
            kotlin.Result r0 = (kotlin.Result) r0
            r0.j()
            goto L_0x00d3
        L_0x003c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0044:
            java.lang.Object r4 = r2.E
            com.hansecom.abt.data.repositories.UserRepository r4 = (com.hansecom.abt.data.repositories.UserRepository) r4
            java.lang.Object r6 = r2.D
            com.hansecom.mapi.models.UserAddress r6 = (com.hansecom.mapi.models.UserAddress) r6
            java.lang.Object r7 = r2.C
            kotlin.ResultKt.b(r0)
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.j()
            r18 = r6
            goto L_0x00a4
        L_0x005a:
            java.lang.Object r4 = r2.C
            com.hansecom.abt.data.repositories.UserRepository r4 = (com.hansecom.abt.data.repositories.UserRepository) r4
            kotlin.ResultKt.b(r0)
            goto L_0x0082
        L_0x0062:
            kotlin.ResultKt.b(r0)
            com.hansecom.abt.api.JsonParser r0 = com.hansecom.abt.api.JsonParser.f33114a
            kotlinx.serialization.json.Json r0 = r0.c()
            kotlinx.coroutines.CoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.b()
            com.hansecom.abt.data.repositories.UserRepository$updateAddress-gIAlu-s$$inlined$retrofit$default$1 r9 = new com.hansecom.abt.data.repositories.UserRepository$updateAddress-gIAlu-s$$inlined$retrofit$default$1
            r10 = r22
            r9.<init>(r0, r8, r1, r10)
            r2.C = r1
            r2.H = r7
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.g(r4, r9, r2)
            if (r0 != r3) goto L_0x0081
            return r3
        L_0x0081:
            r4 = r1
        L_0x0082:
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.j()
            boolean r7 = kotlin.Result.h(r0)
            if (r7 == 0) goto L_0x00d4
            r7 = r0
            com.hansecom.mapi.models.UserAddress r7 = (com.hansecom.mapi.models.UserAddress) r7
            r2.C = r0
            r2.D = r7
            r2.E = r4
            r2.H = r6
            java.lang.Object r6 = r4.i(r2)
            if (r6 != r3) goto L_0x00a0
            return r3
        L_0x00a0:
            r18 = r7
            r7 = r0
            r0 = r6
        L_0x00a4:
            boolean r6 = kotlin.Result.g(r0)
            if (r6 == 0) goto L_0x00ab
            r0 = r8
        L_0x00ab:
            kotlin.jvm.internal.Intrinsics.f(r0)
            r9 = r0
            com.hansecom.mapi.models.User r9 = (com.hansecom.mapi.models.User) r9
            r19 = 255(0xff, float:3.57E-43)
            r20 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            com.hansecom.mapi.models.User r0 = com.hansecom.mapi.models.User.c(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r2.C = r7
            r2.D = r8
            r2.E = r8
            r2.H = r5
            java.lang.Object r0 = r4.P(r0, r2)
            if (r0 != r3) goto L_0x00d2
            return r3
        L_0x00d2:
            r2 = r7
        L_0x00d3:
            r0 = r2
        L_0x00d4:
            java.lang.Throwable r2 = kotlin.Result.e(r0)
            if (r2 != 0) goto L_0x00db
            goto L_0x00f4
        L_0x00db:
            boolean r0 = r2 instanceof com.hansecom.abt.api.ApiValidationException     // Catch:{ all -> 0x00e7 }
            if (r0 == 0) goto L_0x00e9
            com.hansecom.abt.data.exceptions.FieldErrorsException r0 = new com.hansecom.abt.data.exceptions.FieldErrorsException     // Catch:{ all -> 0x00e7 }
            com.hansecom.abt.api.ApiValidationException r2 = (com.hansecom.abt.api.ApiValidationException) r2     // Catch:{ all -> 0x00e7 }
            r0.<init>(r2)     // Catch:{ all -> 0x00e7 }
            throw r0     // Catch:{ all -> 0x00e7 }
        L_0x00e7:
            r0 = move-exception
            goto L_0x00ea
        L_0x00e9:
            throw r2     // Catch:{ all -> 0x00e7 }
        L_0x00ea:
            kotlin.Result$Companion r2 = kotlin.Result.f40519A
            java.lang.Object r0 = kotlin.ResultKt.a(r0)
            java.lang.Object r0 = kotlin.Result.b(r0)
        L_0x00f4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.UserRepository.Q(com.hansecom.mapi.models.UserAddress, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object q(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.hansecom.abt.data.repositories.UserRepository$getFreshData$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.hansecom.abt.data.repositories.UserRepository$getFreshData$1 r0 = (com.hansecom.abt.data.repositories.UserRepository$getFreshData$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.repositories.UserRepository$getFreshData$1 r0 = new com.hansecom.abt.data.repositories.UserRepository$getFreshData$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.b(r7)
            goto L_0x004d
        L_0x0029:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0031:
            kotlin.ResultKt.b(r7)
            com.hansecom.abt.api.JsonParser r7 = com.hansecom.abt.api.JsonParser.f33114a
            kotlinx.serialization.json.Json r7 = r7.c()
            kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.b()
            com.hansecom.abt.data.repositories.UserRepository$getFreshData-IoAF18A$$inlined$retrofit$default$1 r4 = new com.hansecom.abt.data.repositories.UserRepository$getFreshData-IoAF18A$$inlined$retrofit$default$1
            r5 = 0
            r4.<init>(r7, r5, r6)
            r0.E = r3
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.g(r2, r4, r0)
            if (r7 != r1) goto L_0x004d
            return r1
        L_0x004d:
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.j()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.UserRepository.q(kotlin.coroutines.Continuation):java.lang.Object");
    }
}

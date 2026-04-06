package com.hansecom.abt.data.useCases.auth;

import com.hansecom.mapi.apis.UserDataApi;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class RegisterUseCase {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f33812b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f33813c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final UserDataApi f33814a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public enum RegisterResult {
        ACTIVE,
        NEEDS_EMAIL_ACTIVATION,
        EXISTING_ACCOUNT_NEEDS_EMAIL_ACTIVATION,
        EXISTING_ACCOUNT;

        static {
            RegisterResult[] d2;
            E = EnumEntriesKt.a(d2);
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f33818a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                com.hansecom.mapi.models.User$State[] r0 = com.hansecom.mapi.models.User.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.hansecom.mapi.models.User$State r1 = com.hansecom.mapi.models.User.State._0     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.hansecom.mapi.models.User$State r1 = com.hansecom.mapi.models.User.State._1     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.hansecom.mapi.models.User$State r1 = com.hansecom.mapi.models.User.State._2     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.hansecom.mapi.models.User$State r1 = com.hansecom.mapi.models.User.State._3     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f33818a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.auth.RegisterUseCase.WhenMappings.<clinit>():void");
        }
    }

    public RegisterUseCase(UserDataApi userDataApi) {
        Intrinsics.i(userDataApi, "api");
        this.f33814a = userDataApi;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b5 A[SYNTHETIC, Splitter:B:38:0x00b5] */
    /* JADX WARNING: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.util.List r23, java.lang.String r24, kotlin.coroutines.Continuation r25) {
        /*
            r17 = this;
            r1 = r17
            r0 = r25
            boolean r2 = r0 instanceof com.hansecom.abt.data.useCases.auth.RegisterUseCase$invoke$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.hansecom.abt.data.useCases.auth.RegisterUseCase$invoke$1 r2 = (com.hansecom.abt.data.useCases.auth.RegisterUseCase$invoke$1) r2
            int r3 = r2.E
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.E = r3
            goto L_0x001c
        L_0x0017:
            com.hansecom.abt.data.useCases.auth.RegisterUseCase$invoke$1 r2 = new com.hansecom.abt.data.useCases.auth.RegisterUseCase$invoke$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.C
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r4 = r2.E
            r5 = 1
            if (r4 == 0) goto L_0x0035
            if (r4 != r5) goto L_0x002d
            kotlin.ResultKt.b(r0)
            goto L_0x006a
        L_0x002d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0035:
            kotlin.ResultKt.b(r0)
            com.hansecom.mapi.models.UserCreateRequest r0 = new com.hansecom.mapi.models.UserCreateRequest
            r15 = 16
            r16 = 0
            r11 = 0
            r6 = r0
            r7 = r20
            r8 = r18
            r9 = r19
            r10 = r22
            r12 = r23
            r13 = r21
            r14 = r24
            r6.<init>((java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.Boolean) r11, (java.util.List) r12, (java.lang.String) r13, (java.lang.String) r14, (int) r15, (kotlin.jvm.internal.DefaultConstructorMarker) r16)
            com.hansecom.abt.api.JsonParser r4 = com.hansecom.abt.api.JsonParser.f33114a
            kotlinx.serialization.json.Json r4 = r4.c()
            kotlinx.coroutines.CoroutineDispatcher r6 = kotlinx.coroutines.Dispatchers.b()
            com.hansecom.abt.data.useCases.auth.RegisterUseCase$invoke-eH_QyT8$$inlined$retrofit$default$1 r7 = new com.hansecom.abt.data.useCases.auth.RegisterUseCase$invoke-eH_QyT8$$inlined$retrofit$default$1
            r8 = 0
            r7.<init>(r4, r8, r1, r0)
            r2.E = r5
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.g(r6, r7, r2)
            if (r0 != r3) goto L_0x006a
            return r3
        L_0x006a:
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.j()
            boolean r2 = kotlin.Result.h(r0)
            if (r2 == 0) goto L_0x00aa
            com.hansecom.mapi.models.User r0 = (com.hansecom.mapi.models.User) r0
            com.hansecom.mapi.models.User$State r0 = r0.h()
            r2 = -1
            if (r0 != 0) goto L_0x0081
            r0 = r2
            goto L_0x0089
        L_0x0081:
            int[] r3 = com.hansecom.abt.data.useCases.auth.RegisterUseCase.WhenMappings.f33818a
            int r0 = r0.ordinal()
            r0 = r3[r0]
        L_0x0089:
            if (r0 == r2) goto L_0x00a8
            if (r0 == r5) goto L_0x00a5
            r2 = 2
            if (r0 == r2) goto L_0x00a2
            r2 = 3
            if (r0 == r2) goto L_0x009f
            r2 = 4
            if (r0 != r2) goto L_0x0099
            com.hansecom.abt.data.useCases.auth.RegisterUseCase$RegisterResult r0 = com.hansecom.abt.data.useCases.auth.RegisterUseCase.RegisterResult.EXISTING_ACCOUNT
            goto L_0x00aa
        L_0x0099:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x009f:
            com.hansecom.abt.data.useCases.auth.RegisterUseCase$RegisterResult r0 = com.hansecom.abt.data.useCases.auth.RegisterUseCase.RegisterResult.EXISTING_ACCOUNT
            goto L_0x00aa
        L_0x00a2:
            com.hansecom.abt.data.useCases.auth.RegisterUseCase$RegisterResult r0 = com.hansecom.abt.data.useCases.auth.RegisterUseCase.RegisterResult.ACTIVE
            goto L_0x00aa
        L_0x00a5:
            com.hansecom.abt.data.useCases.auth.RegisterUseCase$RegisterResult r0 = com.hansecom.abt.data.useCases.auth.RegisterUseCase.RegisterResult.NEEDS_EMAIL_ACTIVATION
            goto L_0x00aa
        L_0x00a8:
            com.hansecom.abt.data.useCases.auth.RegisterUseCase$RegisterResult r0 = com.hansecom.abt.data.useCases.auth.RegisterUseCase.RegisterResult.ACTIVE
        L_0x00aa:
            java.lang.Object r0 = kotlin.Result.b(r0)
            java.lang.Throwable r2 = kotlin.Result.e(r0)
            if (r2 != 0) goto L_0x00b5
            goto L_0x011c
        L_0x00b5:
            boolean r0 = r2 instanceof com.hansecom.abt.api.ApiException     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x00dc
            r0 = r2
            com.hansecom.abt.api.ApiException r0 = (com.hansecom.abt.api.ApiException) r0     // Catch:{ all -> 0x00da }
            com.hansecom.mapi.models.ErrorResponse r0 = r0.a()     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x00dc
            java.lang.String r0 = r0.b()     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x00dc
            java.lang.Integer r0 = kotlin.text.StringsKt.q(r0)     // Catch:{ all -> 0x00da }
            if (r0 != 0) goto L_0x00cf
            goto L_0x00dc
        L_0x00cf:
            int r0 = r0.intValue()     // Catch:{ all -> 0x00da }
            r3 = 30001(0x7531, float:4.204E-41)
            if (r0 != r3) goto L_0x00dc
            com.hansecom.abt.data.useCases.auth.RegisterUseCase$RegisterResult r0 = com.hansecom.abt.data.useCases.auth.RegisterUseCase.RegisterResult.EXISTING_ACCOUNT_NEEDS_EMAIL_ACTIVATION     // Catch:{ all -> 0x00da }
            goto L_0x0100
        L_0x00da:
            r0 = move-exception
            goto L_0x0112
        L_0x00dc:
            boolean r0 = r2 instanceof com.hansecom.abt.api.ApiException     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x0105
            r0 = r2
            com.hansecom.abt.api.ApiException r0 = (com.hansecom.abt.api.ApiException) r0     // Catch:{ all -> 0x00da }
            com.hansecom.mapi.models.ErrorResponse r0 = r0.a()     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x0105
            java.lang.String r0 = r0.b()     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x0105
            java.lang.Integer r0 = kotlin.text.StringsKt.q(r0)     // Catch:{ all -> 0x00da }
            if (r0 != 0) goto L_0x00f6
            goto L_0x0105
        L_0x00f6:
            int r0 = r0.intValue()     // Catch:{ all -> 0x00da }
            r3 = 30000(0x7530, float:4.2039E-41)
            if (r0 != r3) goto L_0x0105
            com.hansecom.abt.data.useCases.auth.RegisterUseCase$RegisterResult r0 = com.hansecom.abt.data.useCases.auth.RegisterUseCase.RegisterResult.EXISTING_ACCOUNT     // Catch:{ all -> 0x00da }
        L_0x0100:
            java.lang.Object r0 = kotlin.Result.b(r0)     // Catch:{ all -> 0x00da }
            goto L_0x011c
        L_0x0105:
            boolean r0 = r2 instanceof com.hansecom.abt.api.ApiValidationException     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x0111
            com.hansecom.abt.data.exceptions.FieldErrorsException r0 = new com.hansecom.abt.data.exceptions.FieldErrorsException     // Catch:{ all -> 0x00da }
            com.hansecom.abt.api.ApiValidationException r2 = (com.hansecom.abt.api.ApiValidationException) r2     // Catch:{ all -> 0x00da }
            r0.<init>(r2)     // Catch:{ all -> 0x00da }
            throw r0     // Catch:{ all -> 0x00da }
        L_0x0111:
            throw r2     // Catch:{ all -> 0x00da }
        L_0x0112:
            kotlin.Result$Companion r2 = kotlin.Result.f40519A
            java.lang.Object r0 = kotlin.ResultKt.a(r0)
            java.lang.Object r0 = kotlin.Result.b(r0)
        L_0x011c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.auth.RegisterUseCase.b(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

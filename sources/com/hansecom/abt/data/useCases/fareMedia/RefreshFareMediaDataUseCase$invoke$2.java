package com.hansecom.abt.data.useCases.fareMedia;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.fareMedia.RefreshFareMediaDataUseCase$invoke$2", f = "RefreshFareMediaDataUseCase.kt", l = {17, 24, 25, 27}, m = "invokeSuspend")
public final class RefreshFareMediaDataUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    public Object D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ String G;
    public final /* synthetic */ RefreshFareMediaDataUseCase H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RefreshFareMediaDataUseCase$invoke$2(String str, RefreshFareMediaDataUseCase refreshFareMediaDataUseCase, Continuation continuation) {
        super(2, continuation);
        this.G = str;
        this.H = refreshFareMediaDataUseCase;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((RefreshFareMediaDataUseCase$invoke$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        RefreshFareMediaDataUseCase$invoke$2 refreshFareMediaDataUseCase$invoke$2 = new RefreshFareMediaDataUseCase$invoke$2(this.G, this.H, continuation);
        refreshFareMediaDataUseCase$invoke$2.F = obj;
        return refreshFareMediaDataUseCase$invoke$2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: kotlinx.coroutines.CoroutineScope} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00af A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r13.E
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L_0x0040
            if (r1 == r5) goto L_0x0038
            if (r1 == r4) goto L_0x002b
            if (r1 == r3) goto L_0x0022
            if (r1 != r2) goto L_0x001a
            kotlin.ResultKt.b(r14)
            goto L_0x00b0
        L_0x001a:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0022:
            java.lang.Object r1 = r13.F
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            kotlin.ResultKt.b(r14)
            goto L_0x00a4
        L_0x002b:
            java.lang.Object r1 = r13.D
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            java.lang.Object r4 = r13.F
            kotlinx.coroutines.Job r4 = (kotlinx.coroutines.Job) r4
            kotlin.ResultKt.b(r14)
            r14 = r4
            goto L_0x0096
        L_0x0038:
            java.lang.Object r1 = r13.F
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.b(r14)
            goto L_0x005a
        L_0x0040:
            kotlin.ResultKt.b(r14)
            java.lang.Object r14 = r13.F
            r1 = r14
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            com.hansecom.abt.data.useCases.fareMedia.RefreshFareMediaDataUseCase$invoke$2$fareMediaRefreshJob$1 r14 = new com.hansecom.abt.data.useCases.fareMedia.RefreshFareMediaDataUseCase$invoke$2$fareMediaRefreshJob$1
            com.hansecom.abt.data.useCases.fareMedia.RefreshFareMediaDataUseCase r7 = r13.H
            r14.<init>(r7, r6)
            r13.F = r1
            r13.E = r5
            java.lang.Object r14 = kotlinx.coroutines.CoroutineScopeKt.f(r14, r13)
            if (r14 != r0) goto L_0x005a
            return r0
        L_0x005a:
            kotlinx.coroutines.Job r14 = (kotlinx.coroutines.Job) r14
            java.lang.String r5 = r13.G
            if (r5 == 0) goto L_0x00a5
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0067
            goto L_0x00a5
        L_0x0067:
            com.hansecom.abt.data.useCases.fareMedia.RefreshFareMediaDataUseCase$invoke$2$transferTimeRefreshJob$1 r10 = new com.hansecom.abt.data.useCases.fareMedia.RefreshFareMediaDataUseCase$invoke$2$transferTimeRefreshJob$1
            com.hansecom.abt.data.useCases.fareMedia.RefreshFareMediaDataUseCase r5 = r13.H
            java.lang.String r7 = r13.G
            r10.<init>(r5, r7, r6)
            r11 = 3
            r12 = 0
            r8 = 0
            r9 = 0
            r7 = r1
            kotlinx.coroutines.Job r5 = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r7, r8, r9, r10, r11, r12)
            com.hansecom.abt.data.useCases.fareMedia.RefreshFareMediaDataUseCase$invoke$2$fareCappingRefreshJob$1 r10 = new com.hansecom.abt.data.useCases.fareMedia.RefreshFareMediaDataUseCase$invoke$2$fareCappingRefreshJob$1
            com.hansecom.abt.data.useCases.fareMedia.RefreshFareMediaDataUseCase r7 = r13.H
            java.lang.String r8 = r13.G
            r10.<init>(r7, r8, r6)
            r8 = 0
            r7 = r1
            kotlinx.coroutines.Job r1 = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r7, r8, r9, r10, r11, r12)
            r13.F = r14
            r13.D = r5
            r13.E = r4
            java.lang.Object r1 = r1.D(r13)
            if (r1 != r0) goto L_0x0095
            return r0
        L_0x0095:
            r1 = r5
        L_0x0096:
            r13.F = r14
            r13.D = r6
            r13.E = r3
            java.lang.Object r1 = r1.D(r13)
            if (r1 != r0) goto L_0x00a3
            return r0
        L_0x00a3:
            r1 = r14
        L_0x00a4:
            r14 = r1
        L_0x00a5:
            r13.F = r6
            r13.E = r2
            java.lang.Object r14 = r14.D(r13)
            if (r14 != r0) goto L_0x00b0
            return r0
        L_0x00b0:
            kotlin.Result$Companion r14 = kotlin.Result.f40519A
            kotlin.Unit r14 = kotlin.Unit.f40552a
            java.lang.Object r14 = kotlin.Result.b(r14)
            kotlin.Result r14 = kotlin.Result.a(r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.fareMedia.RefreshFareMediaDataUseCase$invoke$2.x(java.lang.Object):java.lang.Object");
    }
}

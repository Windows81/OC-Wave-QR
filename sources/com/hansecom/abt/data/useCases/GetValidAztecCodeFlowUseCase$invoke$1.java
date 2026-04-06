package com.hansecom.abt.data.useCases;

import android.graphics.Bitmap;
import com.hansecom.mapi.models.FareMedium;
import com.hansecom.mapi.models.PrivKey;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.GetValidAztecCodeFlowUseCase$invoke$1", f = "GetValidAztecCodeFlowUseCase.kt", l = {56, 65, 66, 70}, m = "invokeSuspend")
public final class GetValidAztecCodeFlowUseCase$invoke$1 extends SuspendLambda implements Function4<FlowCollector<? super Result<? extends Bitmap>>, FareMedium, PrivKey, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public /* synthetic */ Object F;
    public /* synthetic */ Object G;
    public final /* synthetic */ GetValidAztecCodeFlowUseCase H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;
    public final /* synthetic */ Bitmap.Config L;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetValidAztecCodeFlowUseCase$invoke$1(GetValidAztecCodeFlowUseCase getValidAztecCodeFlowUseCase, int i2, int i3, int i4, Bitmap.Config config, Continuation continuation) {
        super(4, continuation);
        this.H = getValidAztecCodeFlowUseCase;
        this.I = i2;
        this.J = i3;
        this.K = i4;
        this.L = config;
    }

    /* renamed from: A */
    public final Object j(FlowCollector flowCollector, FareMedium fareMedium, PrivKey privKey, Continuation continuation) {
        GetValidAztecCodeFlowUseCase$invoke$1 getValidAztecCodeFlowUseCase$invoke$1 = new GetValidAztecCodeFlowUseCase$invoke$1(this.H, this.I, this.J, this.K, this.L, continuation);
        getValidAztecCodeFlowUseCase$invoke$1.E = flowCollector;
        getValidAztecCodeFlowUseCase$invoke$1.F = fareMedium;
        getValidAztecCodeFlowUseCase$invoke$1.G = privKey;
        return getValidAztecCodeFlowUseCase$invoke$1.x(Unit.f40552a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a7 A[Catch:{ Exception -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c0 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r18) {
        /*
            r17 = this;
            r9 = r17
            java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r0 = r9.D
            r11 = 4
            r12 = 3
            r13 = 2
            r14 = 1
            if (r0 == 0) goto L_0x005b
            if (r0 == r14) goto L_0x0048
            if (r0 == r13) goto L_0x0038
            if (r0 == r12) goto L_0x0023
            if (r0 != r11) goto L_0x001b
            kotlin.ResultKt.b(r18)
            goto L_0x00fa
        L_0x001b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0023:
            java.lang.Object r0 = r9.G
            com.hansecom.mapi.models.PrivKey r0 = (com.hansecom.mapi.models.PrivKey) r0
            java.lang.Object r1 = r9.F
            com.hansecom.mapi.models.FareMedium r1 = (com.hansecom.mapi.models.FareMedium) r1
            java.lang.Object r2 = r9.E
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            kotlin.ResultKt.b(r18)     // Catch:{ Exception -> 0x0035 }
        L_0x0032:
            r15 = r1
            r8 = r2
            goto L_0x006d
        L_0x0035:
            r0 = move-exception
            goto L_0x00c9
        L_0x0038:
            java.lang.Object r0 = r9.G
            com.hansecom.mapi.models.PrivKey r0 = (com.hansecom.mapi.models.PrivKey) r0
            java.lang.Object r1 = r9.F
            com.hansecom.mapi.models.FareMedium r1 = (com.hansecom.mapi.models.FareMedium) r1
            java.lang.Object r2 = r9.E
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            kotlin.ResultKt.b(r18)     // Catch:{ Exception -> 0x0035 }
            goto L_0x00a8
        L_0x0048:
            java.lang.Object r0 = r9.G
            com.hansecom.mapi.models.PrivKey r0 = (com.hansecom.mapi.models.PrivKey) r0
            java.lang.Object r1 = r9.F
            com.hansecom.mapi.models.FareMedium r1 = (com.hansecom.mapi.models.FareMedium) r1
            java.lang.Object r2 = r9.E
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            kotlin.ResultKt.b(r18)     // Catch:{ Exception -> 0x0035 }
            r15 = r1
            r1 = r18
            goto L_0x008e
        L_0x005b:
            kotlin.ResultKt.b(r18)
            java.lang.Object r0 = r9.E
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            java.lang.Object r1 = r9.F
            com.hansecom.mapi.models.FareMedium r1 = (com.hansecom.mapi.models.FareMedium) r1
            java.lang.Object r2 = r9.G
            com.hansecom.mapi.models.PrivKey r2 = (com.hansecom.mapi.models.PrivKey) r2
            r8 = r0
            r15 = r1
            r0 = r2
        L_0x006d:
            com.hansecom.abt.data.useCases.GetValidAztecCodeFlowUseCase r1 = r9.H     // Catch:{ Exception -> 0x00c5 }
            int r4 = r9.I     // Catch:{ Exception -> 0x00c5 }
            int r5 = r9.J     // Catch:{ Exception -> 0x00c5 }
            int r6 = r9.K     // Catch:{ Exception -> 0x00c5 }
            android.graphics.Bitmap$Config r7 = r9.L     // Catch:{ Exception -> 0x00c5 }
            r9.E = r8     // Catch:{ Exception -> 0x00c5 }
            r9.F = r15     // Catch:{ Exception -> 0x00c5 }
            r9.G = r0     // Catch:{ Exception -> 0x00c5 }
            r9.D = r14     // Catch:{ Exception -> 0x00c5 }
            r2 = r15
            r3 = r0
            r16 = r8
            r8 = r17
            java.lang.Object r1 = r1.c(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00c1 }
            if (r1 != r10) goto L_0x008c
            return r10
        L_0x008c:
            r2 = r16
        L_0x008e:
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch:{ Exception -> 0x0035 }
            java.lang.Object r1 = kotlin.Result.b(r1)     // Catch:{ Exception -> 0x0035 }
            kotlin.Result r1 = kotlin.Result.a(r1)     // Catch:{ Exception -> 0x0035 }
            r9.E = r2     // Catch:{ Exception -> 0x0035 }
            r9.F = r15     // Catch:{ Exception -> 0x0035 }
            r9.G = r0     // Catch:{ Exception -> 0x0035 }
            r9.D = r13     // Catch:{ Exception -> 0x0035 }
            java.lang.Object r1 = r2.c(r1, r9)     // Catch:{ Exception -> 0x0035 }
            if (r1 != r10) goto L_0x00a7
            return r10
        L_0x00a7:
            r1 = r15
        L_0x00a8:
            com.hansecom.abt.data.useCases.GetValidAztecCodeFlowUseCase r3 = r9.H     // Catch:{ Exception -> 0x0035 }
            com.hansecom.abt.AppFeatures r3 = r3.f33741c     // Catch:{ Exception -> 0x0035 }
            long r3 = r3.H()     // Catch:{ Exception -> 0x0035 }
            r9.E = r2     // Catch:{ Exception -> 0x0035 }
            r9.F = r1     // Catch:{ Exception -> 0x0035 }
            r9.G = r0     // Catch:{ Exception -> 0x0035 }
            r9.D = r12     // Catch:{ Exception -> 0x0035 }
            java.lang.Object r3 = kotlinx.coroutines.DelayKt.b(r3, r9)     // Catch:{ Exception -> 0x0035 }
            if (r3 != r10) goto L_0x0032
            return r10
        L_0x00c1:
            r0 = move-exception
        L_0x00c2:
            r2 = r16
            goto L_0x00c9
        L_0x00c5:
            r0 = move-exception
            r16 = r8
            goto L_0x00c2
        L_0x00c9:
            timber.log.Timber$Forest r1 = timber.log.Timber.f44337a
            r1.c(r0)
            com.google.firebase.ktx.Firebase r1 = com.google.firebase.ktx.Firebase.f30878a
            com.google.firebase.crashlytics.FirebaseCrashlytics r1 = com.google.firebase.crashlytics.ktx.FirebaseCrashlyticsKt.a(r1)
            r1.c(r0)
            kotlin.Result$Companion r1 = kotlin.Result.f40519A
            com.hansecom.abt.data.useCases.BarcodeGenerationException r1 = new com.hansecom.abt.data.useCases.BarcodeGenerationException
            r1.<init>(r0)
            java.lang.Object r0 = kotlin.ResultKt.a(r1)
            java.lang.Object r0 = kotlin.Result.b(r0)
            kotlin.Result r0 = kotlin.Result.a(r0)
            r1 = 0
            r9.E = r1
            r9.F = r1
            r9.G = r1
            r9.D = r11
            java.lang.Object r0 = r2.c(r0, r9)
            if (r0 != r10) goto L_0x00fa
            return r10
        L_0x00fa:
            kotlin.Unit r0 = kotlin.Unit.f40552a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.GetValidAztecCodeFlowUseCase$invoke$1.x(java.lang.Object):java.lang.Object");
    }
}

package com.hansecom.abt.data.useCases;

import android.graphics.Bitmap;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.data.repositories.FareMediaKeysRepository;
import com.hansecom.mapi.models.FareMedium;
import com.hansecom.mapi.models.PrivKey;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
public final class GetValidAztecCodeFlowUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final GetVirtualCardFlowUseCase f33739a;

    /* renamed from: b  reason: collision with root package name */
    public final FareMediaKeysRepository f33740b;

    /* renamed from: c  reason: collision with root package name */
    public final AppFeatures f33741c;

    public GetValidAztecCodeFlowUseCase(GetVirtualCardFlowUseCase getVirtualCardFlowUseCase, FareMediaKeysRepository fareMediaKeysRepository, AppFeatures appFeatures) {
        Intrinsics.i(getVirtualCardFlowUseCase, "getVirtualCardFlowUseCase");
        Intrinsics.i(fareMediaKeysRepository, "fareMediaKeysRepository");
        Intrinsics.i(appFeatures, "appFeatures");
        this.f33739a = getVirtualCardFlowUseCase;
        this.f33740b = fareMediaKeysRepository;
        this.f33741c = appFeatures;
    }

    public static /* synthetic */ Flow e(GetValidAztecCodeFlowUseCase getValidAztecCodeFlowUseCase, int i2, int i3, int i4, Bitmap.Config config, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i3 = -16777216;
        }
        if ((i5 & 4) != 0) {
            i4 = 0;
        }
        if ((i5 & 8) != 0) {
            config = Bitmap.Config.ALPHA_8;
        }
        return getValidAztecCodeFlowUseCase.d(i2, i3, i4, config);
    }

    public final Object c(FareMedium fareMedium, PrivKey privKey, int i2, int i3, int i4, Bitmap.Config config, Continuation continuation) {
        return BuildersKt.g(Dispatchers.a(), new GetValidAztecCodeFlowUseCase$generateAztecCode$2(fareMedium, this, privKey, i2, i3, i4, config, (Continuation) null), continuation);
    }

    public final Flow d(int i2, int i3, int i4, Bitmap.Config config) {
        Intrinsics.i(config, "config");
        return FlowKt.M(FlowKt.o(FlowKt.u(new GetValidAztecCodeFlowUseCase$invoke$$inlined$filter$1(FlowKt.C(this.f33739a.a()))), FlowKt.u(new GetValidAztecCodeFlowUseCase$invoke$$inlined$mapNotNull$1(this.f33740b.o())), new GetValidAztecCodeFlowUseCase$invoke$1(this, i2, i3, i4, config, (Continuation) null)), Dispatchers.b());
    }
}

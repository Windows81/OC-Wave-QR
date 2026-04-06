package com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class g implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f36670A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f36671B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ConvertToVirtualCardViewModel f36672z;

    public /* synthetic */ g(ConvertToVirtualCardViewModel convertToVirtualCardViewModel, Function0 function0, Function0 function02, int i2, int i3) {
        this.f36672z = convertToVirtualCardViewModel;
        this.f36670A = function0;
        this.f36671B = function02;
        this.C = i2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return ConvertToVirtualCardDialogKt.g(this.f36672z, this.f36670A, this.f36671B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}

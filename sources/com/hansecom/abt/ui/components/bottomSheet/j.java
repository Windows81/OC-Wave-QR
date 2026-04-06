package com.hansecom.abt.ui.components.bottomSheet;

import androidx.compose.foundation.lazy.LazyListScope;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.collections.immutable.ImmutableList;

public final /* synthetic */ class j implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f38068A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f38069B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ Function0 D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ImmutableList f38070z;

    public /* synthetic */ j(ImmutableList immutableList, Function1 function1, Function1 function12, Function1 function13, Function0 function0) {
        this.f38070z = immutableList;
        this.f38068A = function1;
        this.f38069B = function12;
        this.C = function13;
        this.D = function0;
    }

    public final Object invoke(Object obj) {
        return OptionsBottomSheetKt$BottomSheet$2.f(this.f38070z, this.f38068A, this.f38069B, this.C, this.D, (LazyListScope) obj);
    }
}

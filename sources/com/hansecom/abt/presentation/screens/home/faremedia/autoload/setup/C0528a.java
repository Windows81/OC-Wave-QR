package com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* renamed from: com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0528a implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36338A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f36339B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AutoloadSetup.State f36340z;

    public /* synthetic */ C0528a(AutoloadSetup.State state, Function1 function1, Flow flow, Function0 function0, int i2) {
        this.f36340z = state;
        this.f36338A = function1;
        this.f36339B = flow;
        this.C = function0;
        this.D = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return AutoloadSetupScreenKt.j(this.f36340z, this.f36338A, this.f36339B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}

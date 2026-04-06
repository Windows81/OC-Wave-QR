package com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.AddInstitution;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class a implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36811A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f36812B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AddInstitution.State f36813z;

    public /* synthetic */ a(AddInstitution.State state, Function1 function1, Flow flow, Function0 function0, int i2, int i3) {
        this.f36813z = state;
        this.f36811A = function1;
        this.f36812B = flow;
        this.C = function0;
        this.D = i2;
        this.E = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return AddInstitutionScreenKt.g(this.f36813z, this.f36811A, this.f36812B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}

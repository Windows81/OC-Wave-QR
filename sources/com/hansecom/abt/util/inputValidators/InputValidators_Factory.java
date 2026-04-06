package com.hansecom.abt.util.inputValidators;

import com.hansecom.abt.data.useCases.configurations.GetRegularExpressionUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class InputValidators_Factory implements Factory<InputValidators> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f39067a;

    public static InputValidators b(GetRegularExpressionUseCase getRegularExpressionUseCase) {
        return new InputValidators(getRegularExpressionUseCase);
    }

    /* renamed from: a */
    public InputValidators get() {
        return b((GetRegularExpressionUseCase) this.f39067a.get());
    }
}

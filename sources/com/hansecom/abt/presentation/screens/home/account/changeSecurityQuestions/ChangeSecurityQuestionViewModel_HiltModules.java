package com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions;

import dagger.Module;

public final class ChangeSecurityQuestionViewModel_HiltModules {

    @Module
    public static abstract class BindsModule {
    }

    @Module
    public static final class KeyModule {
        public static boolean a() {
            return true;
        }
    }
}

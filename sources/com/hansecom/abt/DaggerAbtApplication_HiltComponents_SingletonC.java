package com.hansecom.abt;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import com.chuckerteam.chucker.api.ChuckerInterceptor;
import com.google.common.collect.ImmutableMap;
import com.google.protobuf.DescriptorProtos;
import com.hansecom.abt.AbtApplication_HiltComponents;
import com.hansecom.abt.api.ApiModule_ApiClientFactory;
import com.hansecom.abt.api.ApiModule_ChuckerInterceptorFactory;
import com.hansecom.abt.api.ApiModule_OAuthServiceFactory;
import com.hansecom.abt.api.ApiModule_OkHttpLoggingFactory;
import com.hansecom.abt.api.ApiModule_ServiceAnonymousFareMediaApiFactory;
import com.hansecom.abt.api.ApiModule_ServiceAutoloadsApiFactory;
import com.hansecom.abt.api.ApiModule_ServiceConfigurationApiFactory;
import com.hansecom.abt.api.ApiModule_ServiceFeedbackApiFactory;
import com.hansecom.abt.api.ApiModule_ServiceGeneralDataApiFactory;
import com.hansecom.abt.api.ApiModule_ServiceInstitutionsApiFactory;
import com.hansecom.abt.api.ApiModule_ServicePurchaseOperationsApiFactory;
import com.hansecom.abt.api.ApiModule_ServiceSigningApiFactory;
import com.hansecom.abt.api.ApiModule_ServiceUserDataApiFactory;
import com.hansecom.abt.api.ApiModule_ServiceUserFareMediaApiFactory;
import com.hansecom.abt.api.AppPropertiesHeaderInterceptor;
import com.hansecom.abt.api.RealmPreferences;
import com.hansecom.abt.api.oauth.OAuthAuthenticator;
import com.hansecom.abt.api.oauth.OAuthInterceptor;
import com.hansecom.abt.api.oauth.OAuthService;
import com.hansecom.abt.data.DataModule_DataStoreFileProducerProviderFactory;
import com.hansecom.abt.data.DataModule_JsonFactory;
import com.hansecom.abt.data.config.menu.AccountMenuConfigConverter;
import com.hansecom.abt.data.config.menu.FareMediaMenuConfigConverter;
import com.hansecom.abt.data.config.menu.MenuConfigConverter;
import com.hansecom.abt.data.deviceInfo.DeviceInfo;
import com.hansecom.abt.data.managers.AutoloadManager;
import com.hansecom.abt.data.managers.FareMediaManager;
import com.hansecom.abt.data.managers.InstitutionManager;
import com.hansecom.abt.data.managers.PaymentMethodsManager;
import com.hansecom.abt.data.managers.PurchaseManager;
import com.hansecom.abt.data.preferences.AppPreferences;
import com.hansecom.abt.data.preferences.AuthenticationPreferences;
import com.hansecom.abt.data.preferences.LockPreferences;
import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.abt.data.repositories.AutoloadRepository;
import com.hansecom.abt.data.repositories.CardHistoryRepository;
import com.hansecom.abt.data.repositories.FareCappingRepository;
import com.hansecom.abt.data.repositories.FareMediaConfigRepository;
import com.hansecom.abt.data.repositories.FareMediaInstitutionsRepository;
import com.hansecom.abt.data.repositories.FareMediaKeysRepository;
import com.hansecom.abt.data.repositories.FareMediaPassesRepository;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import com.hansecom.abt.data.repositories.FareMediaTransferTimeRepository;
import com.hansecom.abt.data.repositories.InstitutionsRepository;
import com.hansecom.abt.data.repositories.PaymentMethodsRepository;
import com.hansecom.abt.data.repositories.UserRepository;
import com.hansecom.abt.data.repositories.UserSecurityQuestionsRepository;
import com.hansecom.abt.data.repositories.generalData.CountriesRepository;
import com.hansecom.abt.data.repositories.generalData.EnvironmentConfigurationRepository;
import com.hansecom.abt.data.repositories.generalData.FareMediaPassesToOfferRepository;
import com.hansecom.abt.data.repositories.generalData.SecurityQuestionsRepository;
import com.hansecom.abt.data.repositories.generalData.StatesRepository;
import com.hansecom.abt.data.repositories.generalData.VirtualFareMediaRepository;
import com.hansecom.abt.data.useCases.AddBalanceUseCase;
import com.hansecom.abt.data.useCases.AddBalanceWithGooglePayUseCase;
import com.hansecom.abt.data.useCases.ClearUserCacheUseCase;
import com.hansecom.abt.data.useCases.CloseAccountUseCase;
import com.hansecom.abt.data.useCases.GetAllVirtualFareMediaUseCase;
import com.hansecom.abt.data.useCases.GetCashPaymentBarcodeUseCase;
import com.hansecom.abt.data.useCases.GetEnvironmentConfigurationUseCase;
import com.hansecom.abt.data.useCases.GetMostRelevantFareCappingFlowUseCase;
import com.hansecom.abt.data.useCases.GetValidAztecCodeFlowUseCase;
import com.hansecom.abt.data.useCases.GetVirtualCardFlowUseCase;
import com.hansecom.abt.data.useCases.LogOutUseCase;
import com.hansecom.abt.data.useCases.SendHelpRequestUseCase;
import com.hansecom.abt.data.useCases.TransferBalanceUseCase;
import com.hansecom.abt.data.useCases.account.ChangeAccountInfoUseCase;
import com.hansecom.abt.data.useCases.account.ChangeAddressUseCase;
import com.hansecom.abt.data.useCases.account.ChangePasswordUseCase;
import com.hansecom.abt.data.useCases.account.ChangeSecurityQuestionsUseCase;
import com.hansecom.abt.data.useCases.account.GetUserEmailUseCase;
import com.hansecom.abt.data.useCases.account.GetUserUseCase;
import com.hansecom.abt.data.useCases.appUpdate.GetAppUpdateUseCase;
import com.hansecom.abt.data.useCases.appUpdate.IgnoreAppUpdateUseCase;
import com.hansecom.abt.data.useCases.auth.IsAccountLoggedInUseCase;
import com.hansecom.abt.data.useCases.auth.LogInUseCase;
import com.hansecom.abt.data.useCases.auth.RefreshAccessTokenUseCase;
import com.hansecom.abt.data.useCases.auth.RegisterUseCase;
import com.hansecom.abt.data.useCases.auth.ResendActivationEmailUseCase;
import com.hansecom.abt.data.useCases.autoload.ChangeAutoloadUseCase;
import com.hansecom.abt.data.useCases.autoload.CreateAutoloadUseCase;
import com.hansecom.abt.data.useCases.autoload.DeleteAutoloadUseCase;
import com.hansecom.abt.data.useCases.autoload.GetAutoloadConfigurationsUseCase;
import com.hansecom.abt.data.useCases.configurations.GetAccountMenuConfigurationUseCase;
import com.hansecom.abt.data.useCases.configurations.GetAppUpdateConfigurationUseCase;
import com.hansecom.abt.data.useCases.configurations.GetCardOptionsMenuConfigurationUseCase;
import com.hansecom.abt.data.useCases.configurations.GetFareCategoryColorsUseCase;
import com.hansecom.abt.data.useCases.configurations.GetGuestMenuConfigurationUseCase;
import com.hansecom.abt.data.useCases.configurations.GetLinksConfigurationUseCase;
import com.hansecom.abt.data.useCases.configurations.GetMoreInfoFareMediaLinkUseCase;
import com.hansecom.abt.data.useCases.configurations.GetMoreMenuConfigurationUseCase;
import com.hansecom.abt.data.useCases.configurations.GetRegularExpressionUseCase;
import com.hansecom.abt.data.useCases.configurations.GetRemoteFeatureConfigUseCase;
import com.hansecom.abt.data.useCases.configurations.GetSignUpConfigurationUseCase;
import com.hansecom.abt.data.useCases.fareMedia.CheckFareMediaCardBalanceUseCase;
import com.hansecom.abt.data.useCases.fareMedia.ConvertToVirtualUseCase;
import com.hansecom.abt.data.useCases.fareMedia.CreateFareMediaCardUseCase;
import com.hansecom.abt.data.useCases.fareMedia.FareMediaTransferValidUntilFlowUseCase;
import com.hansecom.abt.data.useCases.fareMedia.GetFareMediaUseCase;
import com.hansecom.abt.data.useCases.fareMedia.GetGoogleWalletProvisioningLinkUseCase;
import com.hansecom.abt.data.useCases.fareMedia.LinkFareMediaCardUseCase;
import com.hansecom.abt.data.useCases.fareMedia.LockFareMediaCardUseCase;
import com.hansecom.abt.data.useCases.fareMedia.PurchaseVirtualCardUseCase;
import com.hansecom.abt.data.useCases.fareMedia.RefreshFareMediaDataUseCase;
import com.hansecom.abt.data.useCases.fareMedia.TransferFareMediaCardUseCase;
import com.hansecom.abt.data.useCases.fareMedia.UnlinkFareMediaCardUseCase;
import com.hansecom.abt.data.useCases.fareMedia.UnlockFareMediaCardUseCase;
import com.hansecom.abt.data.useCases.fareMedia.UpdateNicknameUseCase;
import com.hansecom.abt.data.useCases.institution.GetInstitutionsUseCase;
import com.hansecom.abt.data.useCases.institution.LinkInstitutionUseCase;
import com.hansecom.abt.data.useCases.institution.UnlinkInstitutionUseCase;
import com.hansecom.abt.data.useCases.lock.AutoLockAfterInactivityUseCase;
import com.hansecom.abt.data.useCases.lock.GetShowUserBiometricDialogUseCase;
import com.hansecom.abt.data.useCases.lock.IsLockedFlowUseCase;
import com.hansecom.abt.data.useCases.lock.ResetUnlockEndDateTimeUseCase;
import com.hansecom.abt.data.useCases.lock.SetIsBiometricLockedUseCase;
import com.hansecom.abt.data.useCases.lock.SetIsBiometricsAvailableUseCase;
import com.hansecom.abt.data.useCases.lock.SetIsLockedFlowUseCase;
import com.hansecom.abt.data.useCases.lock.SetShownUserBiometricDialogUseCase;
import com.hansecom.abt.data.useCases.lock.ToggleBiometricsLockActivatedUseCase;
import com.hansecom.abt.data.useCases.passes.PurchasePassUseCase;
import com.hansecom.abt.data.useCases.passes.PurchasePassWithFareMediaUseCase;
import com.hansecom.abt.data.useCases.passes.PurchasePassWithGooglePayUseCase;
import com.hansecom.abt.data.useCases.paymentMethods.AddPaymentMethodNmiUseCase;
import com.hansecom.abt.data.useCases.paymentMethods.FetchPaymentMethodsUntilNewOneAppearsUseCase;
import com.hansecom.abt.data.useCases.paymentMethods.GetAddPaymentMethodPageCyberSourceUseCase;
import com.hansecom.abt.data.useCases.paymentMethods.GetCreditCardPaymentMethodsUseCase;
import com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase;
import com.hansecom.abt.data.useCases.paymentMethods.GetMaxNumberOfCardPaymentMethodsUseCase;
import com.hansecom.abt.data.useCases.paymentMethods.SaveCreditCardAsDefaultPaymentMethodUseCase;
import com.hansecom.abt.impl.OctaAppFeatures;
import com.hansecom.abt.presentation.appUpdate.AppUpdateHelper;
import com.hansecom.abt.presentation.biometric.BiometricHelper;
import com.hansecom.abt.presentation.main.MainActivity;
import com.hansecom.abt.presentation.main.MainActivity_MembersInjector;
import com.hansecom.abt.presentation.nfc.NfcHelper;
import com.hansecom.abt.presentation.screens.auth.login.LoginViewModel;
import com.hansecom.abt.presentation.screens.auth.login.LoginViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.auth.login.LoginViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.auth.login.LoginViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.auth.register.RegisterViewModel;
import com.hansecom.abt.presentation.screens.auth.register.RegisterViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.auth.register.RegisterViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.auth.register.RegisterViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.RegisterResultExitingAccountViewModel;
import com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.RegisterResultExitingAccountViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.RegisterResultExitingAccountViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.RegisterResultExitingAccountViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.auth.register.result.exitingAccountNeedsActivation.RegisterResultExitingAccountNeedsActivationViewModel;
import com.hansecom.abt.presentation.screens.auth.register.result.exitingAccountNeedsActivation.RegisterResultExitingAccountNeedsActivationViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.auth.register.result.exitingAccountNeedsActivation.RegisterResultExitingAccountNeedsActivationViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.auth.register.result.exitingAccountNeedsActivation.RegisterResultExitingAccountNeedsActivationViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivationViewModel;
import com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivationViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivationViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivationViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.auth.reset.ResetPasswordViewModel;
import com.hansecom.abt.presentation.screens.auth.reset.ResetPasswordViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.auth.reset.ResetPasswordViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.auth.reset.ResetPasswordViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.auth.reset.success.ResetPasswordSuccessViewModel;
import com.hansecom.abt.presentation.screens.auth.reset.success.ResetPasswordSuccessViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.auth.reset.success.ResetPasswordSuccessViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.auth.reset.success.ResetPasswordSuccessViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.auth.welcome.WelcomeViewModel;
import com.hansecom.abt.presentation.screens.auth.welcome.WelcomeViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.auth.welcome.WelcomeViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.auth.welcome.WelcomeViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.guest.GuestViewModel;
import com.hansecom.abt.presentation.screens.guest.GuestViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.guest.GuestViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.guest.GuestViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceViewModel;
import com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.helpRequest.HelpRequestViewModel;
import com.hansecom.abt.presentation.screens.helpRequest.HelpRequestViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.helpRequest.HelpRequestViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.helpRequest.HelpRequestViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.HomeViewModel;
import com.hansecom.abt.presentation.screens.home.HomeViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.HomeViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.HomeViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.account.AccountViewModel;
import com.hansecom.abt.presentation.screens.home.account.AccountViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.account.AccountViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.account.AccountViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel;
import com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPinViewModel;
import com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPinViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPinViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPinViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePasswordViewModel;
import com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePasswordViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePasswordViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePasswordViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel;
import com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.account.information.AccountInformationViewModel;
import com.hansecom.abt.presentation.screens.home.account.information.AccountInformationViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.account.information.AccountInformationViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.account.information.AccountInformationViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsViewModel;
import com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceViewModel;
import com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel;
import com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel;
import com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplayViewModel;
import com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplayViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplayViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplayViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValueViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValueViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValueViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValueViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.FareMediaAddValueCashPaymentBarcodeViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.FareMediaAddValueCashPaymentBarcodeViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.FareMediaAddValueCashPaymentBarcodeViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.FareMediaAddValueCashPaymentBarcodeViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions.FareMediaAddValueCashPaymentInstructionsViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions.FareMediaAddValueCashPaymentInstructionsViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions.FareMediaAddValueCashPaymentInstructionsViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions.FareMediaAddValueCashPaymentInstructionsViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformationViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformationViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformationViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformationViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual.ConvertToVirtualCardViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual.ConvertToVirtualCardViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual.ConvertToVirtualCardViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual.ConvertToVirtualCardViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCardViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCardViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCardViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCardViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCappingViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCappingViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCappingViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCappingViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.InstitutionsViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.InstitutionsViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.InstitutionsViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.InstitutionsViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.AddInstitutionViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.AddInstitutionViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.AddInstitutionViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.AddInstitutionViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details.InstitutionDetailsViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details.InstitutionDetailsViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details.InstitutionDetailsViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details.InstitutionDetailsViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearchViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearchViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearchViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearchViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.linkCard.FareMediaLinkCardViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.linkCard.FareMediaLinkCardViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.faremedia.linkCard.FareMediaLinkCardViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.linkCard.FareMediaLinkCardViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.lockCard.FareMediaLockCardViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.lockCard.FareMediaLockCardViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.faremedia.lockCard.FareMediaLockCardViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.lockCard.FareMediaLockCardViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.FareMediaPassesViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.FareMediaPassesViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.FareMediaPassesViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.FareMediaPassesViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPassesViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPassesViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPassesViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPassesViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCardViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCardViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCardViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCardViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.removeCard.FareMediaRemoveCardViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.removeCard.FareMediaRemoveCardViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.faremedia.removeCard.FareMediaRemoveCardViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.removeCard.FareMediaRemoveCardViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalanceViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalanceViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalanceViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalanceViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.unlockCard.FareMediaUnlockCardViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.unlockCard.FareMediaUnlockCardViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.faremedia.unlockCard.FareMediaUnlockCardViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.faremedia.unlockCard.FareMediaUnlockCardViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.more.MoreViewModel;
import com.hansecom.abt.presentation.screens.home.more.MoreViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.more.MoreViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.more.MoreViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.more.guidedTour.GuidedTourViewModel;
import com.hansecom.abt.presentation.screens.home.more.guidedTour.GuidedTourViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.more.guidedTour.GuidedTourViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.more.guidedTour.GuidedTourViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.trip.TripPlannerViewModel;
import com.hansecom.abt.presentation.screens.home.trip.TripPlannerViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.home.trip.TripPlannerViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.home.trip.TripPlannerViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.main.MainViewModel;
import com.hansecom.abt.presentation.screens.main.MainViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.main.MainViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.main.MainViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuViewModel;
import com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.main.lock.LockViewModel;
import com.hansecom.abt.presentation.screens.main.lock.LockViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.main.lock.LockViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.main.lock.LockViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel;
import com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel_HiltModules;
import com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.hansecom.abt.presentation.wallet.GoogleWalletHelper;
import com.hansecom.abt.util.GooglePayClient;
import com.hansecom.abt.util.inputValidators.InputValidators;
import com.hansecom.abt.util.resourcesResolvers.IconResolver;
import com.hansecom.mapi.apis.AnonymousFareMediaApi;
import com.hansecom.mapi.apis.AutoloadsApi;
import com.hansecom.mapi.apis.ConfigurationApi;
import com.hansecom.mapi.apis.FeedbackApi;
import com.hansecom.mapi.apis.GeneralDataApi;
import com.hansecom.mapi.apis.InstitutionsApi;
import com.hansecom.mapi.apis.PurchaseOperationsApi;
import com.hansecom.mapi.apis.SigningApi;
import com.hansecom.mapi.apis.UserDataApi;
import com.hansecom.mapi.apis.UserFareMediaApi;
import com.hansecom.mapi.infrastructure.ApiClient;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.LazyClassKeyMap;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Map;
import kotlinx.serialization.json.Json;

public final class DaggerAbtApplication_HiltComponents_SingletonC {

    public static final class ActivityCBuilder implements AbtApplication_HiltComponents.ActivityC.Builder {

        /* renamed from: a  reason: collision with root package name */
        public final SingletonCImpl f32876a;

        /* renamed from: b  reason: collision with root package name */
        public final ActivityRetainedCImpl f32877b;

        /* renamed from: c  reason: collision with root package name */
        public Activity f32878c;

        /* renamed from: b */
        public ActivityCBuilder a(Activity activity) {
            this.f32878c = (Activity) Preconditions.b(activity);
            return this;
        }

        /* renamed from: c */
        public AbtApplication_HiltComponents.ActivityC d() {
            Preconditions.a(this.f32878c, Activity.class);
            return new ActivityCImpl(this.f32876a, this.f32877b, this.f32878c);
        }

        public ActivityCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl) {
            this.f32876a = singletonCImpl;
            this.f32877b = activityRetainedCImpl;
        }
    }

    public static final class ActivityCImpl extends AbtApplication_HiltComponents.ActivityC {

        /* renamed from: a  reason: collision with root package name */
        public final Activity f32879a;

        /* renamed from: b  reason: collision with root package name */
        public final SingletonCImpl f32880b;

        /* renamed from: c  reason: collision with root package name */
        public final ActivityRetainedCImpl f32881c;

        /* renamed from: d  reason: collision with root package name */
        public final ActivityCImpl f32882d = this;

        /* renamed from: e  reason: collision with root package name */
        public Provider f32883e;

        /* renamed from: f  reason: collision with root package name */
        public Provider f32884f;

        public static final class SwitchingProvider<T> implements Provider<T> {

            /* renamed from: a  reason: collision with root package name */
            public final SingletonCImpl f32885a;

            /* renamed from: b  reason: collision with root package name */
            public final ActivityRetainedCImpl f32886b;

            /* renamed from: c  reason: collision with root package name */
            public final ActivityCImpl f32887c;

            /* renamed from: d  reason: collision with root package name */
            public final int f32888d;

            public SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, int i2) {
                this.f32885a = singletonCImpl;
                this.f32886b = activityRetainedCImpl;
                this.f32887c = activityCImpl;
                this.f32888d = i2;
            }

            public Object get() {
                int i2 = this.f32888d;
                if (i2 == 0) {
                    return new AppUpdateHelper(this.f32887c.f32879a);
                }
                if (i2 == 1) {
                    return new NfcHelper(this.f32887c.f32879a);
                }
                throw new AssertionError(this.f32888d);
            }
        }

        public ActivityCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, Activity activity) {
            this.f32880b = singletonCImpl;
            this.f32881c = activityRetainedCImpl;
            this.f32879a = activity;
            h(activity);
        }

        public DefaultViewModelFactories.InternalFactoryFactory a() {
            return DefaultViewModelFactories_InternalFactoryFactory_Factory.b(c(), new ViewModelCBuilder(this.f32880b, this.f32881c));
        }

        public void b(MainActivity mainActivity) {
            i(mainActivity);
        }

        public Map c() {
            return LazyClassKeyMap.a(ImmutableMap.b(55).g(AccountInformationViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f35461a, Boolean.valueOf(AccountInformationViewModel_HiltModules.KeyModule.a())).g(AccountViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f35075a, Boolean.valueOf(AccountViewModel_HiltModules.KeyModule.a())).g(AddInstitutionViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f36810a, Boolean.valueOf(AddInstitutionViewModel_HiltModules.KeyModule.a())).g(AddPassesViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f37053a, Boolean.valueOf(AddPassesViewModel_HiltModules.KeyModule.a())).g(AddPaymentMethodCyberSourceViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f35571a, Boolean.valueOf(AddPaymentMethodCyberSourceViewModel_HiltModules.KeyModule.a())).g(AddPaymentMethodNmiViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f35654a, Boolean.valueOf(AddPaymentMethodNmiViewModel_HiltModules.KeyModule.a())).g(AutoloadSetupViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f36330a, Boolean.valueOf(AutoloadSetupViewModel_HiltModules.KeyModule.a())).g(AutoloadViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f36257a, Boolean.valueOf(AutoloadViewModel_HiltModules.KeyModule.a())).g(BarcodeDisplayViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f35854a, Boolean.valueOf(BarcodeDisplayViewModel_HiltModules.KeyModule.a())).g(CardHistoryViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f36404a, Boolean.valueOf(CardHistoryViewModel_HiltModules.KeyModule.a())).g(CardInformationViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f36444a, Boolean.valueOf(CardInformationViewModel_HiltModules.KeyModule.a())).g(CardOptionsViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f36581a, Boolean.valueOf(CardOptionsViewModel_HiltModules.KeyModule.a())).g(ChangeAccountPinViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f35256a, Boolean.valueOf(ChangeAccountPinViewModel_HiltModules.KeyModule.a())).g(ChangeAddressViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f35150a, Boolean.valueOf(ChangeAddressViewModel_HiltModules.KeyModule.a())).g(ChangePasswordViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f35310a, Boolean.valueOf(ChangePasswordViewModel_HiltModules.KeyModule.a())).g(ChangeSecurityQuestionViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f35362a, Boolean.valueOf(ChangeSecurityQuestionViewModel_HiltModules.KeyModule.a())).g(CheckFareMediaBalanceViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f34731a, Boolean.valueOf(CheckFareMediaBalanceViewModel_HiltModules.KeyModule.a())).g(ChoosePaymentMethodViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f37781a, Boolean.valueOf(ChoosePaymentMethodViewModel_HiltModules.KeyModule.a())).g(ConvertToVirtualCardViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f36663a, Boolean.valueOf(ConvertToVirtualCardViewModel_HiltModules.KeyModule.a())).g(DebugMenuViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f37636a, Boolean.valueOf(DebugMenuViewModel_HiltModules.KeyModule.a())).g(FareCappingViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f36746a, Boolean.valueOf(FareCappingViewModel_HiltModules.KeyModule.a())).g(FareMediaAddValueCashPaymentBarcodeViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f36145a, Boolean.valueOf(FareMediaAddValueCashPaymentBarcodeViewModel_HiltModules.KeyModule.a())).g(FareMediaAddValueCashPaymentInstructionsViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f36182a, Boolean.valueOf(FareMediaAddValueCashPaymentInstructionsViewModel_HiltModules.KeyModule.a())).g(FareMediaAddValueViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f36109a, Boolean.valueOf(FareMediaAddValueViewModel_HiltModules.KeyModule.a())).g(FareMediaCreateCardViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f36693a, Boolean.valueOf(FareMediaCreateCardViewModel_HiltModules.KeyModule.a())).g(FareMediaLinkCardViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f36932a, Boolean.valueOf(FareMediaLinkCardViewModel_HiltModules.KeyModule.a())).g(FareMediaLockCardViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f36965a, Boolean.valueOf(FareMediaLockCardViewModel_HiltModules.KeyModule.a())).g(FareMediaPassesViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f37013a, Boolean.valueOf(FareMediaPassesViewModel_HiltModules.KeyModule.a())).g(FareMediaPurchaseCardViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f37200a, Boolean.valueOf(FareMediaPurchaseCardViewModel_HiltModules.KeyModule.a())).g(FareMediaRemoveCardViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f37248a, Boolean.valueOf(FareMediaRemoveCardViewModel_HiltModules.KeyModule.a())).g(FareMediaUnlockCardViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f37382a, Boolean.valueOf(FareMediaUnlockCardViewModel_HiltModules.KeyModule.a())).g(FareMediaViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f36004a, Boolean.valueOf(FareMediaViewModel_HiltModules.KeyModule.a())).g(GuestViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f34709a, Boolean.valueOf(GuestViewModel_HiltModules.KeyModule.a())).g(GuidedTourViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f37456a, Boolean.valueOf(GuidedTourViewModel_HiltModules.KeyModule.a())).g(HelpRequestViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f34883a, Boolean.valueOf(HelpRequestViewModel_HiltModules.KeyModule.a())).g(HomeViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f35007a, Boolean.valueOf(HomeViewModel_HiltModules.KeyModule.a())).g(InstitutionDetailsViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f36843a, Boolean.valueOf(InstitutionDetailsViewModel_HiltModules.KeyModule.a())).g(InstitutionsSearchViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f36889a, Boolean.valueOf(InstitutionsSearchViewModel_HiltModules.KeyModule.a())).g(InstitutionsViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f36789a, Boolean.valueOf(InstitutionsViewModel_HiltModules.KeyModule.a())).g(LockViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f37680a, Boolean.valueOf(LockViewModel_HiltModules.KeyModule.a())).g(LoginViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f34314a, Boolean.valueOf(LoginViewModel_HiltModules.KeyModule.a())).g(MainViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f37594a, Boolean.valueOf(MainViewModel_HiltModules.KeyModule.a())).g(MoreViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f37441a, Boolean.valueOf(MoreViewModel_HiltModules.KeyModule.a())).g(PassCheckoutViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f37132a, Boolean.valueOf(PassCheckoutViewModel_HiltModules.KeyModule.a())).g(PaymentMethodDetailsViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f35786a, Boolean.valueOf(PaymentMethodDetailsViewModel_HiltModules.KeyModule.a())).g(PaymentMethodsViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f35532a, Boolean.valueOf(PaymentMethodsViewModel_HiltModules.KeyModule.a())).g(RegisterResultExitingAccountNeedsActivationViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f34536a, Boolean.valueOf(RegisterResultExitingAccountNeedsActivationViewModel_HiltModules.KeyModule.a())).g(RegisterResultExitingAccountViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f34510a, Boolean.valueOf(RegisterResultExitingAccountViewModel_HiltModules.KeyModule.a())).g(RegisterResultNeedsActivationViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f34563a, Boolean.valueOf(RegisterResultNeedsActivationViewModel_HiltModules.KeyModule.a())).g(RegisterViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f34427a, Boolean.valueOf(RegisterViewModel_HiltModules.KeyModule.a())).g(ResetPasswordSuccessViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f34646a, Boolean.valueOf(ResetPasswordSuccessViewModel_HiltModules.KeyModule.a())).g(ResetPasswordViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f34616a, Boolean.valueOf(ResetPasswordViewModel_HiltModules.KeyModule.a())).g(TransferBalanceViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f37333a, Boolean.valueOf(TransferBalanceViewModel_HiltModules.KeyModule.a())).g(TripPlannerViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f37507a, Boolean.valueOf(TripPlannerViewModel_HiltModules.KeyModule.a())).g(WelcomeViewModel_HiltModules_KeyModule_Provide_LazyMapKey.f34672a, Boolean.valueOf(WelcomeViewModel_HiltModules.KeyModule.a())).a());
        }

        public ViewComponentBuilder d() {
            return new ViewCBuilder(this.f32880b, this.f32881c, this.f32882d);
        }

        public ViewModelComponentBuilder e() {
            return new ViewModelCBuilder(this.f32880b, this.f32881c);
        }

        public FragmentComponentBuilder f() {
            return new FragmentCBuilder(this.f32880b, this.f32881c, this.f32882d);
        }

        public final void h(Activity activity) {
            this.f32883e = DoubleCheck.c(new SwitchingProvider(this.f32880b, this.f32881c, this.f32882d, 0));
            this.f32884f = DoubleCheck.c(new SwitchingProvider(this.f32880b, this.f32881c, this.f32882d, 1));
        }

        public final MainActivity i(MainActivity mainActivity) {
            MainActivity_MembersInjector.d(mainActivity, (BiometricHelper) this.f32880b.f32914c.get());
            MainActivity_MembersInjector.c(mainActivity, (AppUpdateHelper) this.f32883e.get());
            MainActivity_MembersInjector.g(mainActivity, (NfcHelper) this.f32884f.get());
            MainActivity_MembersInjector.f(mainActivity, (IconResolver) this.f32880b.f32915d.get());
            MainActivity_MembersInjector.a(mainActivity, new OctaAppFeatures());
            MainActivity_MembersInjector.b(mainActivity, (AppInfo) this.f32880b.f32916e.get());
            MainActivity_MembersInjector.e(mainActivity, (GoogleWalletHelper) this.f32880b.f32917f.get());
            return mainActivity;
        }
    }

    public static final class ActivityRetainedCBuilder implements AbtApplication_HiltComponents.ActivityRetainedC.Builder {

        /* renamed from: a  reason: collision with root package name */
        public final SingletonCImpl f32889a;

        /* renamed from: b  reason: collision with root package name */
        public SavedStateHandleHolder f32890b;

        /* renamed from: b */
        public AbtApplication_HiltComponents.ActivityRetainedC d() {
            Preconditions.a(this.f32890b, SavedStateHandleHolder.class);
            return new ActivityRetainedCImpl(this.f32889a, this.f32890b);
        }

        /* renamed from: c */
        public ActivityRetainedCBuilder a(SavedStateHandleHolder savedStateHandleHolder) {
            this.f32890b = (SavedStateHandleHolder) Preconditions.b(savedStateHandleHolder);
            return this;
        }

        public ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
            this.f32889a = singletonCImpl;
        }
    }

    public static final class ActivityRetainedCImpl extends AbtApplication_HiltComponents.ActivityRetainedC {

        /* renamed from: a  reason: collision with root package name */
        public final SingletonCImpl f32891a;

        /* renamed from: b  reason: collision with root package name */
        public final ActivityRetainedCImpl f32892b = this;

        /* renamed from: c  reason: collision with root package name */
        public Provider f32893c;

        public static final class SwitchingProvider<T> implements Provider<T> {

            /* renamed from: a  reason: collision with root package name */
            public final SingletonCImpl f32894a;

            /* renamed from: b  reason: collision with root package name */
            public final ActivityRetainedCImpl f32895b;

            /* renamed from: c  reason: collision with root package name */
            public final int f32896c;

            public SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, int i2) {
                this.f32894a = singletonCImpl;
                this.f32895b = activityRetainedCImpl;
                this.f32896c = i2;
            }

            public Object get() {
                if (this.f32896c == 0) {
                    return ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.b();
                }
                throw new AssertionError(this.f32896c);
            }
        }

        public ActivityRetainedCImpl(SingletonCImpl singletonCImpl, SavedStateHandleHolder savedStateHandleHolder) {
            this.f32891a = singletonCImpl;
            c(savedStateHandleHolder);
        }

        public ActivityRetainedLifecycle a() {
            return (ActivityRetainedLifecycle) this.f32893c.get();
        }

        public ActivityComponentBuilder b() {
            return new ActivityCBuilder(this.f32891a, this.f32892b);
        }

        public final void c(SavedStateHandleHolder savedStateHandleHolder) {
            this.f32893c = DoubleCheck.c(new SwitchingProvider(this.f32891a, this.f32892b, 0));
        }
    }

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public ApplicationContextModule f32897a;

        public Builder a(ApplicationContextModule applicationContextModule) {
            this.f32897a = (ApplicationContextModule) Preconditions.b(applicationContextModule);
            return this;
        }

        public AbtApplication_HiltComponents.SingletonC b() {
            Preconditions.a(this.f32897a, ApplicationContextModule.class);
            return new SingletonCImpl(this.f32897a);
        }

        public Builder() {
        }
    }

    public static final class FragmentCBuilder implements AbtApplication_HiltComponents.FragmentC.Builder {

        /* renamed from: a  reason: collision with root package name */
        public final SingletonCImpl f32898a;

        /* renamed from: b  reason: collision with root package name */
        public final ActivityRetainedCImpl f32899b;

        /* renamed from: c  reason: collision with root package name */
        public final ActivityCImpl f32900c;

        /* renamed from: d  reason: collision with root package name */
        public Fragment f32901d;

        /* renamed from: b */
        public AbtApplication_HiltComponents.FragmentC d() {
            Preconditions.a(this.f32901d, Fragment.class);
            return new FragmentCImpl(this.f32898a, this.f32899b, this.f32900c, this.f32901d);
        }

        /* renamed from: c */
        public FragmentCBuilder a(Fragment fragment) {
            this.f32901d = (Fragment) Preconditions.b(fragment);
            return this;
        }

        public FragmentCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
            this.f32898a = singletonCImpl;
            this.f32899b = activityRetainedCImpl;
            this.f32900c = activityCImpl;
        }
    }

    public static final class FragmentCImpl extends AbtApplication_HiltComponents.FragmentC {

        /* renamed from: a  reason: collision with root package name */
        public final SingletonCImpl f32902a;

        /* renamed from: b  reason: collision with root package name */
        public final ActivityRetainedCImpl f32903b;

        /* renamed from: c  reason: collision with root package name */
        public final ActivityCImpl f32904c;

        /* renamed from: d  reason: collision with root package name */
        public final FragmentCImpl f32905d = this;

        public FragmentCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, Fragment fragment) {
            this.f32902a = singletonCImpl;
            this.f32903b = activityRetainedCImpl;
            this.f32904c = activityCImpl;
        }

        public ViewWithFragmentComponentBuilder a() {
            return new ViewWithFragmentCBuilder(this.f32902a, this.f32903b, this.f32904c, this.f32905d);
        }
    }

    public static final class ServiceCBuilder implements AbtApplication_HiltComponents.ServiceC.Builder {

        /* renamed from: a  reason: collision with root package name */
        public final SingletonCImpl f32906a;

        /* renamed from: b  reason: collision with root package name */
        public Service f32907b;

        /* renamed from: b */
        public AbtApplication_HiltComponents.ServiceC d() {
            Preconditions.a(this.f32907b, Service.class);
            return new ServiceCImpl(this.f32906a, this.f32907b);
        }

        /* renamed from: c */
        public ServiceCBuilder a(Service service) {
            this.f32907b = (Service) Preconditions.b(service);
            return this;
        }

        public ServiceCBuilder(SingletonCImpl singletonCImpl) {
            this.f32906a = singletonCImpl;
        }
    }

    public static final class ServiceCImpl extends AbtApplication_HiltComponents.ServiceC {

        /* renamed from: a  reason: collision with root package name */
        public final SingletonCImpl f32908a;

        /* renamed from: b  reason: collision with root package name */
        public final ServiceCImpl f32909b = this;

        public ServiceCImpl(SingletonCImpl singletonCImpl, Service service) {
            this.f32908a = singletonCImpl;
        }
    }

    public static final class SingletonCImpl extends AbtApplication_HiltComponents.SingletonC {

        /* renamed from: A  reason: collision with root package name */
        public Provider f32910A;

        /* renamed from: B  reason: collision with root package name */
        public Provider f32911B;
        public Provider C;
        public Provider D;
        public Provider E;
        public Provider F;
        public Provider G;
        public Provider H;
        public Provider I;
        public Provider J;
        public Provider K;
        public Provider L;
        public Provider M;
        public Provider N;
        public Provider O;
        public Provider P;
        public Provider Q;
        public Provider R;
        public Provider S;
        public Provider T;
        public Provider U;
        public Provider V;
        public Provider W;
        public Provider X;
        public Provider Y;
        public Provider Z;

        /* renamed from: a  reason: collision with root package name */
        public final ApplicationContextModule f32912a;
        public Provider a0;

        /* renamed from: b  reason: collision with root package name */
        public final SingletonCImpl f32913b = this;
        public Provider b0;

        /* renamed from: c  reason: collision with root package name */
        public Provider f32914c;
        public Provider c0;

        /* renamed from: d  reason: collision with root package name */
        public Provider f32915d;
        public Provider d0;

        /* renamed from: e  reason: collision with root package name */
        public Provider f32916e;

        /* renamed from: f  reason: collision with root package name */
        public Provider f32917f;

        /* renamed from: g  reason: collision with root package name */
        public Provider f32918g;

        /* renamed from: h  reason: collision with root package name */
        public Provider f32919h;

        /* renamed from: i  reason: collision with root package name */
        public Provider f32920i;

        /* renamed from: j  reason: collision with root package name */
        public Provider f32921j;

        /* renamed from: k  reason: collision with root package name */
        public Provider f32922k;

        /* renamed from: l  reason: collision with root package name */
        public Provider f32923l;

        /* renamed from: m  reason: collision with root package name */
        public Provider f32924m;

        /* renamed from: n  reason: collision with root package name */
        public Provider f32925n;

        /* renamed from: o  reason: collision with root package name */
        public Provider f32926o;

        /* renamed from: p  reason: collision with root package name */
        public Provider f32927p;

        /* renamed from: q  reason: collision with root package name */
        public Provider f32928q;

        /* renamed from: r  reason: collision with root package name */
        public Provider f32929r;

        /* renamed from: s  reason: collision with root package name */
        public Provider f32930s;

        /* renamed from: t  reason: collision with root package name */
        public Provider f32931t;

        /* renamed from: u  reason: collision with root package name */
        public Provider f32932u;

        /* renamed from: v  reason: collision with root package name */
        public Provider f32933v;

        /* renamed from: w  reason: collision with root package name */
        public Provider f32934w;

        /* renamed from: x  reason: collision with root package name */
        public Provider f32935x;

        /* renamed from: y  reason: collision with root package name */
        public Provider f32936y;

        /* renamed from: z  reason: collision with root package name */
        public Provider f32937z;

        public static final class SwitchingProvider<T> implements Provider<T> {

            /* renamed from: a  reason: collision with root package name */
            public final SingletonCImpl f32938a;

            /* renamed from: b  reason: collision with root package name */
            public final int f32939b;

            public SwitchingProvider(SingletonCImpl singletonCImpl, int i2) {
                this.f32938a = singletonCImpl;
                this.f32939b = i2;
            }

            public Object get() {
                switch (this.f32939b) {
                    case 0:
                        return new BiometricHelper(ApplicationContextModule_ProvideContextFactory.b(this.f32938a.f32912a));
                    case 1:
                        return new IconResolver(ApplicationContextModule_ProvideContextFactory.b(this.f32938a.f32912a));
                    case 2:
                        return new AppInfo();
                    case 3:
                        return new GoogleWalletHelper(ApplicationContextModule_ProvideContextFactory.b(this.f32938a.f32912a));
                    case 4:
                        return new GetRegularExpressionUseCase((Json) this.f32938a.f32918g.get());
                    case 5:
                        return DataModule_JsonFactory.b();
                    case 6:
                        return new UserRepository((UserDataApi) this.f32938a.f32928q.get(), (DataStoreFileProducer) this.f32938a.f32929r.get(), (Json) this.f32938a.f32918g.get());
                    case 7:
                        return ApiModule_ServiceUserDataApiFactory.b((ApiClient) this.f32938a.f32927p.get());
                    case 8:
                        return ApiModule_ApiClientFactory.a((AppPropertiesHeaderInterceptor) this.f32938a.f32921j.get(), ApiModule_OkHttpLoggingFactory.b(), (OAuthInterceptor) this.f32938a.f32923l.get(), (OAuthAuthenticator) this.f32938a.f32926o.get(), (ChuckerInterceptor) this.f32938a.f32924m.get(), (RealmPreferences) this.f32938a.f32920i.get());
                    case 9:
                        return new AppPropertiesHeaderInterceptor((RealmPreferences) this.f32938a.f32920i.get(), (AppInfo) this.f32938a.f32916e.get());
                    case 10:
                        return new RealmPreferences(ApplicationContextModule_ProvideContextFactory.b(this.f32938a.f32912a), (AppInfo) this.f32938a.f32916e.get());
                    case 11:
                        return new OAuthInterceptor((AuthenticationPreferences) this.f32938a.f32922k.get());
                    case 12:
                        return new AuthenticationPreferences(ApplicationContextModule_ProvideContextFactory.b(this.f32938a.f32912a));
                    case 13:
                        return new OAuthAuthenticator((AuthenticationPreferences) this.f32938a.f32922k.get(), this.f32938a.i(), this.f32938a.h());
                    case 14:
                        return ApiModule_OAuthServiceFactory.b((AppPropertiesHeaderInterceptor) this.f32938a.f32921j.get(), ApiModule_OkHttpLoggingFactory.b(), (ChuckerInterceptor) this.f32938a.f32924m.get(), (Json) this.f32938a.f32918g.get(), (RealmPreferences) this.f32938a.f32920i.get());
                    case 15:
                        return ApiModule_ChuckerInterceptorFactory.a(ApplicationContextModule_ProvideContextFactory.b(this.f32938a.f32912a));
                    case 16:
                        return DataModule_DataStoreFileProducerProviderFactory.a(ApplicationContextModule_ProvideContextFactory.b(this.f32938a.f32912a));
                    case 17:
                        return new InstitutionsRepository((InstitutionsApi) this.f32938a.f32931t.get(), (DataStoreFileProducer) this.f32938a.f32929r.get(), (Json) this.f32938a.f32918g.get());
                    case 18:
                        return ApiModule_ServiceInstitutionsApiFactory.b((ApiClient) this.f32938a.f32927p.get());
                    case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER:
                        return new InstitutionManager((InstitutionsApi) this.f32938a.f32931t.get());
                    case 20:
                        return new FareMediaInstitutionsRepository((InstitutionsApi) this.f32938a.f32931t.get(), (Json) this.f32938a.f32918g.get(), (DataStoreFileProducer) this.f32938a.f32929r.get());
                    case 21:
                        return new FareMediaPassesRepository((UserFareMediaApi) this.f32938a.f32935x.get(), (Json) this.f32938a.f32918g.get(), (DataStoreFileProducer) this.f32938a.f32929r.get());
                    case 22:
                        return ApiModule_ServiceUserFareMediaApiFactory.b((ApiClient) this.f32938a.f32927p.get());
                    case 23:
                        return new FareMediaPassesToOfferRepository((GeneralDataApi) this.f32938a.f32937z.get(), (Json) this.f32938a.f32918g.get(), (DataStoreFileProducer) this.f32938a.f32929r.get());
                    case com.google.api.Service.METRICS_FIELD_NUMBER:
                        return ApiModule_ServiceGeneralDataApiFactory.b((ApiClient) this.f32938a.f32927p.get());
                    case com.google.api.Service.MONITORED_RESOURCES_FIELD_NUMBER:
                        return new PaymentMethodsRepository((UserDataApi) this.f32938a.f32928q.get(), (Json) this.f32938a.f32918g.get(), (DataStoreFileProducer) this.f32938a.f32929r.get());
                    case com.google.api.Service.BILLING_FIELD_NUMBER:
                        return new PaymentMethodsManager((UserDataApi) this.f32938a.f32928q.get());
                    case 27:
                        return new CountriesRepository((GeneralDataApi) this.f32938a.f32937z.get(), (Json) this.f32938a.f32918g.get(), (DataStoreFileProducer) this.f32938a.f32929r.get());
                    case com.google.api.Service.MONITORING_FIELD_NUMBER:
                        return new StatesRepository((GeneralDataApi) this.f32938a.f32937z.get(), (Json) this.f32938a.f32918g.get(), (DataStoreFileProducer) this.f32938a.f32929r.get());
                    case com.google.api.Service.SYSTEM_PARAMETERS_FIELD_NUMBER:
                        return new FareMediaRepository((DeviceInfo) this.f32938a.F.get(), (UserFareMediaApi) this.f32938a.f32935x.get(), (Json) this.f32938a.f32918g.get(), (DataStoreFileProducer) this.f32938a.f32929r.get());
                    case 30:
                        return new DeviceInfo(ApplicationContextModule_ProvideContextFactory.b(this.f32938a.f32912a));
                    case 31:
                        return new AutoloadRepository((AutoloadsApi) this.f32938a.H.get(), (Json) this.f32938a.f32918g.get(), (DataStoreFileProducer) this.f32938a.f32929r.get());
                    case 32:
                        return ApiModule_ServiceAutoloadsApiFactory.b((ApiClient) this.f32938a.f32927p.get());
                    case 33:
                        return new FareMediaConfigRepository((UserFareMediaApi) this.f32938a.f32935x.get(), (Json) this.f32938a.f32918g.get(), (DataStoreFileProducer) this.f32938a.f32929r.get());
                    case 34:
                        return new AutoloadManager((AutoloadsApi) this.f32938a.H.get());
                    case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER:
                        return new FareMediaKeysRepository((SigningApi) this.f32938a.L.get(), (Json) this.f32938a.f32918g.get(), (DataStoreFileProducer) this.f32938a.f32929r.get());
                    case 36:
                        return ApiModule_ServiceSigningApiFactory.b((ApiClient) this.f32938a.f32927p.get());
                    case 37:
                        return new CardHistoryRepository((UserFareMediaApi) this.f32938a.f32935x.get(), (Json) this.f32938a.f32918g.get(), (DataStoreFileProducer) this.f32938a.f32929r.get());
                    case 38:
                        return ApiModule_ServiceAnonymousFareMediaApiFactory.b((ApiClient) this.f32938a.f32927p.get());
                    case 39:
                        return new SecurityQuestionsRepository((GeneralDataApi) this.f32938a.f32937z.get(), (Json) this.f32938a.f32918g.get(), (DataStoreFileProducer) this.f32938a.f32929r.get());
                    case 40:
                        return new UserSecurityQuestionsRepository((UserDataApi) this.f32938a.f32928q.get(), (DataStoreFileProducer) this.f32938a.f32929r.get(), (Json) this.f32938a.f32918g.get());
                    case 41:
                        return new EnvironmentConfigurationRepository((ConfigurationApi) this.f32938a.R.get(), (Json) this.f32938a.f32918g.get(), (DataStoreFileProducer) this.f32938a.f32929r.get());
                    case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER:
                        return ApiModule_ServiceConfigurationApiFactory.b((ApiClient) this.f32938a.f32927p.get());
                    case 43:
                        return new FareCappingRepository((UserFareMediaApi) this.f32938a.f32935x.get(), (Json) this.f32938a.f32918g.get(), (DataStoreFileProducer) this.f32938a.f32929r.get());
                    case 44:
                        return new GetLinksConfigurationUseCase((Json) this.f32938a.f32918g.get());
                    case 45:
                        return new AppPreferences(ApplicationContextModule_ProvideContextFactory.b(this.f32938a.f32912a));
                    case 46:
                        return ApiModule_ServicePurchaseOperationsApiFactory.b((ApiClient) this.f32938a.f32927p.get());
                    case 47:
                        return new VirtualFareMediaRepository((GeneralDataApi) this.f32938a.f32937z.get(), (Json) this.f32938a.f32918g.get(), (DataStoreFileProducer) this.f32938a.f32929r.get());
                    case 48:
                        return new FareMediaTransferTimeRepository((UserFareMediaApi) this.f32938a.f32935x.get(), new OctaAppFeatures(), (Json) this.f32938a.f32918g.get(), (DataStoreFileProducer) this.f32938a.f32929r.get());
                    case 49:
                        return new GetRemoteFeatureConfigUseCase((Json) this.f32938a.f32918g.get());
                    case 50:
                        return new GetMoreInfoFareMediaLinkUseCase((GetLinksConfigurationUseCase) this.f32938a.U.get());
                    case 51:
                        return new GetFareCategoryColorsUseCase((Json) this.f32938a.f32918g.get());
                    case 52:
                        return ApiModule_ServiceFeedbackApiFactory.b((ApiClient) this.f32938a.f32927p.get());
                    case 53:
                        return RemoteConfigModule_RemoteConfigSetupFactory.b();
                    default:
                        throw new AssertionError(this.f32939b);
                }
            }
        }

        public SingletonCImpl(ApplicationContextModule applicationContextModule) {
            this.f32912a = applicationContextModule;
            e(applicationContextModule);
            f(applicationContextModule);
            g(applicationContextModule);
        }

        public ServiceComponentBuilder a() {
            return new ServiceCBuilder(this.f32913b);
        }

        public void b(AbtApplication abtApplication) {
        }

        public ActivityRetainedComponentBuilder c() {
            return new ActivityRetainedCBuilder(this.f32913b);
        }

        public final void e(ApplicationContextModule applicationContextModule) {
            this.f32914c = DoubleCheck.c(new SwitchingProvider(this.f32913b, 0));
            this.f32915d = DoubleCheck.c(new SwitchingProvider(this.f32913b, 1));
            this.f32916e = DoubleCheck.c(new SwitchingProvider(this.f32913b, 2));
            this.f32917f = DoubleCheck.c(new SwitchingProvider(this.f32913b, 3));
            this.f32918g = DoubleCheck.c(new SwitchingProvider(this.f32913b, 5));
            this.f32919h = DoubleCheck.c(new SwitchingProvider(this.f32913b, 4));
            this.f32920i = DoubleCheck.c(new SwitchingProvider(this.f32913b, 10));
            this.f32921j = DoubleCheck.c(new SwitchingProvider(this.f32913b, 9));
            this.f32922k = DoubleCheck.c(new SwitchingProvider(this.f32913b, 12));
            this.f32923l = DoubleCheck.c(new SwitchingProvider(this.f32913b, 11));
            this.f32924m = DoubleCheck.c(new SwitchingProvider(this.f32913b, 15));
            this.f32925n = DoubleCheck.c(new SwitchingProvider(this.f32913b, 14));
            this.f32926o = DoubleCheck.c(new SwitchingProvider(this.f32913b, 13));
            this.f32927p = DoubleCheck.c(new SwitchingProvider(this.f32913b, 8));
            this.f32928q = DoubleCheck.c(new SwitchingProvider(this.f32913b, 7));
            this.f32929r = DoubleCheck.c(new SwitchingProvider(this.f32913b, 16));
            this.f32930s = DoubleCheck.c(new SwitchingProvider(this.f32913b, 6));
            this.f32931t = DoubleCheck.c(new SwitchingProvider(this.f32913b, 18));
            this.f32932u = DoubleCheck.c(new SwitchingProvider(this.f32913b, 17));
            this.f32933v = DoubleCheck.c(new SwitchingProvider(this.f32913b, 19));
            this.f32934w = DoubleCheck.c(new SwitchingProvider(this.f32913b, 20));
            this.f32935x = DoubleCheck.c(new SwitchingProvider(this.f32913b, 22));
            this.f32936y = DoubleCheck.c(new SwitchingProvider(this.f32913b, 21));
            this.f32937z = DoubleCheck.c(new SwitchingProvider(this.f32913b, 24));
            this.f32910A = DoubleCheck.c(new SwitchingProvider(this.f32913b, 23));
        }

        public final void f(ApplicationContextModule applicationContextModule) {
            this.f32911B = DoubleCheck.c(new SwitchingProvider(this.f32913b, 25));
            this.C = DoubleCheck.c(new SwitchingProvider(this.f32913b, 26));
            this.D = DoubleCheck.c(new SwitchingProvider(this.f32913b, 27));
            this.E = DoubleCheck.c(new SwitchingProvider(this.f32913b, 28));
            this.F = DoubleCheck.c(new SwitchingProvider(this.f32913b, 30));
            this.G = DoubleCheck.c(new SwitchingProvider(this.f32913b, 29));
            this.H = DoubleCheck.c(new SwitchingProvider(this.f32913b, 32));
            this.I = DoubleCheck.c(new SwitchingProvider(this.f32913b, 31));
            this.J = DoubleCheck.c(new SwitchingProvider(this.f32913b, 33));
            this.K = DoubleCheck.c(new SwitchingProvider(this.f32913b, 34));
            this.L = DoubleCheck.c(new SwitchingProvider(this.f32913b, 36));
            this.M = DoubleCheck.c(new SwitchingProvider(this.f32913b, 35));
            this.N = DoubleCheck.c(new SwitchingProvider(this.f32913b, 37));
            this.O = DoubleCheck.c(new SwitchingProvider(this.f32913b, 38));
            this.P = DoubleCheck.c(new SwitchingProvider(this.f32913b, 39));
            this.Q = DoubleCheck.c(new SwitchingProvider(this.f32913b, 40));
            this.R = DoubleCheck.c(new SwitchingProvider(this.f32913b, 42));
            this.S = DoubleCheck.c(new SwitchingProvider(this.f32913b, 41));
            this.T = DoubleCheck.c(new SwitchingProvider(this.f32913b, 43));
            this.U = DoubleCheck.c(new SwitchingProvider(this.f32913b, 44));
            this.V = DoubleCheck.c(new SwitchingProvider(this.f32913b, 45));
            this.W = DoubleCheck.c(new SwitchingProvider(this.f32913b, 46));
            this.X = DoubleCheck.c(new SwitchingProvider(this.f32913b, 47));
            this.Y = DoubleCheck.c(new SwitchingProvider(this.f32913b, 48));
            this.Z = DoubleCheck.c(new SwitchingProvider(this.f32913b, 49));
        }

        public final void g(ApplicationContextModule applicationContextModule) {
            this.a0 = DoubleCheck.c(new SwitchingProvider(this.f32913b, 50));
            this.b0 = DoubleCheck.c(new SwitchingProvider(this.f32913b, 51));
            this.c0 = DoubleCheck.c(new SwitchingProvider(this.f32913b, 52));
            this.d0 = DoubleCheck.c(new SwitchingProvider(this.f32913b, 53));
        }

        public LogOutUseCase h() {
            return new LogOutUseCase((AuthenticationPreferences) this.f32922k.get());
        }

        public RefreshAccessTokenUseCase i() {
            return new RefreshAccessTokenUseCase((OAuthService) this.f32925n.get(), (AuthenticationPreferences) this.f32922k.get(), (RealmPreferences) this.f32920i.get());
        }
    }

    public static final class ViewCBuilder implements AbtApplication_HiltComponents.ViewC.Builder {

        /* renamed from: a  reason: collision with root package name */
        public final SingletonCImpl f32940a;

        /* renamed from: b  reason: collision with root package name */
        public final ActivityRetainedCImpl f32941b;

        /* renamed from: c  reason: collision with root package name */
        public final ActivityCImpl f32942c;

        /* renamed from: d  reason: collision with root package name */
        public View f32943d;

        /* renamed from: b */
        public AbtApplication_HiltComponents.ViewC d() {
            Preconditions.a(this.f32943d, View.class);
            return new ViewCImpl(this.f32940a, this.f32941b, this.f32942c, this.f32943d);
        }

        /* renamed from: c */
        public ViewCBuilder a(View view) {
            this.f32943d = (View) Preconditions.b(view);
            return this;
        }

        public ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
            this.f32940a = singletonCImpl;
            this.f32941b = activityRetainedCImpl;
            this.f32942c = activityCImpl;
        }
    }

    public static final class ViewCImpl extends AbtApplication_HiltComponents.ViewC {

        /* renamed from: a  reason: collision with root package name */
        public final SingletonCImpl f32944a;

        /* renamed from: b  reason: collision with root package name */
        public final ActivityRetainedCImpl f32945b;

        /* renamed from: c  reason: collision with root package name */
        public final ActivityCImpl f32946c;

        /* renamed from: d  reason: collision with root package name */
        public final ViewCImpl f32947d = this;

        public ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, View view) {
            this.f32944a = singletonCImpl;
            this.f32945b = activityRetainedCImpl;
            this.f32946c = activityCImpl;
        }
    }

    public static final class ViewModelCBuilder implements AbtApplication_HiltComponents.ViewModelC.Builder {

        /* renamed from: a  reason: collision with root package name */
        public final SingletonCImpl f32948a;

        /* renamed from: b  reason: collision with root package name */
        public final ActivityRetainedCImpl f32949b;

        /* renamed from: c  reason: collision with root package name */
        public SavedStateHandle f32950c;

        /* renamed from: d  reason: collision with root package name */
        public ViewModelLifecycle f32951d;

        /* renamed from: c */
        public AbtApplication_HiltComponents.ViewModelC d() {
            Preconditions.a(this.f32950c, SavedStateHandle.class);
            Preconditions.a(this.f32951d, ViewModelLifecycle.class);
            return new ViewModelCImpl(this.f32948a, this.f32949b, this.f32950c, this.f32951d);
        }

        /* renamed from: e */
        public ViewModelCBuilder b(SavedStateHandle savedStateHandle) {
            this.f32950c = (SavedStateHandle) Preconditions.b(savedStateHandle);
            return this;
        }

        /* renamed from: f */
        public ViewModelCBuilder a(ViewModelLifecycle viewModelLifecycle) {
            this.f32951d = (ViewModelLifecycle) Preconditions.b(viewModelLifecycle);
            return this;
        }

        public ViewModelCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl) {
            this.f32948a = singletonCImpl;
            this.f32949b = activityRetainedCImpl;
        }
    }

    public static final class ViewModelCImpl extends AbtApplication_HiltComponents.ViewModelC {

        /* renamed from: A  reason: collision with root package name */
        public Provider f32952A;

        /* renamed from: B  reason: collision with root package name */
        public Provider f32953B;
        public Provider C;
        public Provider D;
        public Provider E;
        public Provider F;
        public Provider G;
        public Provider H;
        public Provider I;
        public Provider J;
        public Provider K;
        public Provider L;
        public Provider M;
        public Provider N;
        public Provider O;
        public Provider P;
        public Provider Q;
        public Provider R;
        public Provider S;
        public Provider T;
        public Provider U;
        public Provider V;
        public Provider W;
        public Provider X;
        public Provider Y;
        public Provider Z;

        /* renamed from: a  reason: collision with root package name */
        public final SavedStateHandle f32954a;
        public Provider a0;

        /* renamed from: b  reason: collision with root package name */
        public final SingletonCImpl f32955b;
        public Provider b0;

        /* renamed from: c  reason: collision with root package name */
        public final ActivityRetainedCImpl f32956c;
        public Provider c0;

        /* renamed from: d  reason: collision with root package name */
        public final ViewModelCImpl f32957d = this;
        public Provider d0;

        /* renamed from: e  reason: collision with root package name */
        public Provider f32958e;
        public Provider e0;

        /* renamed from: f  reason: collision with root package name */
        public Provider f32959f;
        public Provider f0;

        /* renamed from: g  reason: collision with root package name */
        public Provider f32960g;
        public Provider g0;

        /* renamed from: h  reason: collision with root package name */
        public Provider f32961h;
        public Provider h0;

        /* renamed from: i  reason: collision with root package name */
        public Provider f32962i;

        /* renamed from: j  reason: collision with root package name */
        public Provider f32963j;

        /* renamed from: k  reason: collision with root package name */
        public Provider f32964k;

        /* renamed from: l  reason: collision with root package name */
        public Provider f32965l;

        /* renamed from: m  reason: collision with root package name */
        public Provider f32966m;

        /* renamed from: n  reason: collision with root package name */
        public Provider f32967n;

        /* renamed from: o  reason: collision with root package name */
        public Provider f32968o;

        /* renamed from: p  reason: collision with root package name */
        public Provider f32969p;

        /* renamed from: q  reason: collision with root package name */
        public Provider f32970q;

        /* renamed from: r  reason: collision with root package name */
        public Provider f32971r;

        /* renamed from: s  reason: collision with root package name */
        public Provider f32972s;

        /* renamed from: t  reason: collision with root package name */
        public Provider f32973t;

        /* renamed from: u  reason: collision with root package name */
        public Provider f32974u;

        /* renamed from: v  reason: collision with root package name */
        public Provider f32975v;

        /* renamed from: w  reason: collision with root package name */
        public Provider f32976w;

        /* renamed from: x  reason: collision with root package name */
        public Provider f32977x;

        /* renamed from: y  reason: collision with root package name */
        public Provider f32978y;

        /* renamed from: z  reason: collision with root package name */
        public Provider f32979z;

        public static final class SwitchingProvider<T> implements Provider<T> {

            /* renamed from: a  reason: collision with root package name */
            public final SingletonCImpl f32980a;

            /* renamed from: b  reason: collision with root package name */
            public final ActivityRetainedCImpl f32981b;

            /* renamed from: c  reason: collision with root package name */
            public final ViewModelCImpl f32982c;

            /* renamed from: d  reason: collision with root package name */
            public final int f32983d;

            public SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ViewModelCImpl viewModelCImpl, int i2) {
                this.f32980a = singletonCImpl;
                this.f32981b = activityRetainedCImpl;
                this.f32982c = viewModelCImpl;
                this.f32983d = i2;
            }

            public Object get() {
                switch (this.f32983d) {
                    case 0:
                        return new AccountInformationViewModel(this.f32982c.f32954a, (InputValidators) this.f32982c.f32958e.get(), (UserRepository) this.f32980a.f32930s.get(), this.f32982c.i(), this.f32982c.R());
                    case 1:
                        return new InputValidators((GetRegularExpressionUseCase) this.f32980a.f32919h.get());
                    case 2:
                        return new AccountViewModel(this.f32982c.f32954a, (BiometricHelper) this.f32980a.f32914c.get(), this.f32982c.y(), this.f32980a.h(), this.f32982c.p(), this.f32982c.y0());
                    case 3:
                        return new AddInstitutionViewModel(this.f32982c.f32954a, new OctaAppFeatures(), (InstitutionsRepository) this.f32980a.f32932u.get(), this.f32982c.e0());
                    case 4:
                        return new AddPassesViewModel(this.f32982c.f32954a, (FareMediaPassesToOfferRepository) this.f32980a.f32910A.get());
                    case 5:
                        return new AddPaymentMethodCyberSourceViewModel(this.f32982c.f32954a, this.f32982c.x(), this.f32982c.z(), new OctaAppFeatures());
                    case 6:
                        return new AddPaymentMethodNmiViewModel(this.f32982c.f32954a, (InputValidators) this.f32982c.f32958e.get(), this.f32982c.g(), (UserRepository) this.f32980a.f32930s.get(), (CountriesRepository) this.f32980a.D.get(), (StatesRepository) this.f32980a.E.get(), (RealmPreferences) this.f32980a.f32920i.get());
                    case 7:
                        return new AutoloadSetupViewModel(this.f32982c.f32954a, (FareMediaRepository) this.f32980a.G.get(), (AutoloadRepository) this.f32980a.I.get(), (PaymentMethodsRepository) this.f32980a.f32911B.get(), this.f32982c.D(), this.f32982c.r(), this.f32982c.k(), new OctaAppFeatures());
                    case 8:
                        return new AutoloadViewModel(this.f32982c.f32954a, (FareMediaRepository) this.f32980a.G.get(), (FareMediaConfigRepository) this.f32980a.J.get(), (AutoloadRepository) this.f32980a.I.get(), (PaymentMethodsRepository) this.f32980a.f32911B.get(), this.f32982c.k(), this.f32982c.t());
                    case 9:
                        return new BarcodeDisplayViewModel(this.f32982c.f32954a, this.f32982c.V(), this.f32982c.U());
                    case 10:
                        return new CardHistoryViewModel(this.f32982c.f32954a, (CardHistoryRepository) this.f32980a.N.get(), (FareMediaRepository) this.f32980a.G.get());
                    case 11:
                        return new CardInformationViewModel(this.f32982c.f32954a, this.f32982c.J(), this.f32982c.M(), this.f32982c.E0());
                    case 12:
                        return new CardOptionsViewModel(this.f32982c.f32954a, this.f32982c.E());
                    case 13:
                        return new ChangeAccountPinViewModel(this.f32982c.f32954a, (InputValidators) this.f32982c.f32958e.get(), (UserRepository) this.f32980a.f32930s.get(), new OctaAppFeatures());
                    case 14:
                        return new ChangeAddressViewModel(this.f32982c.f32954a, (UserRepository) this.f32980a.f32930s.get(), this.f32982c.j(), (CountriesRepository) this.f32980a.D.get());
                    case 15:
                        return new ChangePasswordViewModel(this.f32982c.f32954a, (InputValidators) this.f32982c.f32958e.get(), this.f32982c.l(), this.f32982c.S());
                    case 16:
                        return new ChangeSecurityQuestionViewModel(this.f32982c.f32954a, (InputValidators) this.f32982c.f32958e.get(), (SecurityQuestionsRepository) this.f32980a.P.get(), (UserSecurityQuestionsRepository) this.f32980a.Q.get(), this.f32982c.m(), this.f32982c.R());
                    case 17:
                        return new CheckFareMediaBalanceViewModel(this.f32982c.f32954a, new OctaAppFeatures(), this.f32982c.n());
                    case 18:
                        return new ChoosePaymentMethodViewModel(this.f32982c.f32954a, this.f32982c.G(), this.f32982c.N(), this.f32982c.J(), (UserRepository) this.f32980a.f32930s.get(), this.f32982c.W());
                    case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER:
                        return new ConvertToVirtualCardViewModel(this.f32982c.f32954a, this.f32982c.q());
                    case 20:
                        return new DebugMenuViewModel(ApplicationContextModule_ProvideContextFactory.b(this.f32980a.f32912a), this.f32982c.f32954a, (RealmPreferences) this.f32980a.f32920i.get(), (AuthenticationPreferences) this.f32980a.f32922k.get(), this.f32980a.h());
                    case 21:
                        return new FareCappingViewModel(this.f32982c.f32954a, (FareCappingRepository) this.f32980a.T.get());
                    case 22:
                        return new FareMediaAddValueCashPaymentBarcodeViewModel(this.f32982c.f32954a, this.f32982c.F(), (EnvironmentConfigurationRepository) this.f32980a.S.get(), (GetLinksConfigurationUseCase) this.f32980a.U.get());
                    case 23:
                        return new FareMediaAddValueCashPaymentInstructionsViewModel(this.f32982c.f32954a, (AppPreferences) this.f32980a.V.get());
                    case com.google.api.Service.METRICS_FIELD_NUMBER:
                        return new FareMediaAddValueViewModel(this.f32982c.f32954a, new OctaAppFeatures(), (FareMediaRepository) this.f32980a.G.get(), this.f32982c.e(), this.f32982c.f(), this.f32982c.H(), (FareMediaConfigRepository) this.f32980a.J.get(), this.f32982c.j0(), this.f32982c.W(), (AppPreferences) this.f32980a.V.get());
                    case com.google.api.Service.MONITORED_RESOURCES_FIELD_NUMBER:
                        return new FareMediaCreateCardViewModel(this.f32982c.f32954a, this.f32982c.s());
                    case com.google.api.Service.BILLING_FIELD_NUMBER:
                        return new FareMediaLinkCardViewModel(this.f32982c.f32954a, this.f32982c.d0(), new OctaAppFeatures());
                    case 27:
                        return new FareMediaLockCardViewModel(this.f32982c.f32954a, this.f32982c.f0());
                    case com.google.api.Service.MONITORING_FIELD_NUMBER:
                        return new FareMediaPassesViewModel(this.f32982c.f32954a, (FareMediaPassesRepository) this.f32980a.f32936y.get(), new OctaAppFeatures());
                    case com.google.api.Service.SYSTEM_PARAMETERS_FIELD_NUMBER:
                        return new FareMediaPurchaseCardViewModel(this.f32982c.f32954a, new OctaAppFeatures(), (GoogleWalletHelper) this.f32980a.f32917f.get(), this.f32982c.n0(), this.f32982c.A(), this.f32982c.I());
                    case 30:
                        return new FareMediaRemoveCardViewModel(this.f32982c.f32954a, this.f32982c.B0());
                    case 31:
                        return new FareMediaUnlockCardViewModel(this.f32982c.f32954a, this.f32982c.D0());
                    case 32:
                        return new FareMediaViewModel(this.f32982c.f32954a, (FareMediaRepository) this.f32980a.G.get(), this.f32982c.o0(), this.f32982c.w(), this.f32982c.A0(), (GetRemoteFeatureConfigUseCase) this.f32980a.Z.get(), this.f32982c.P(), (GetMoreInfoFareMediaLinkUseCase) this.f32980a.a0.get(), (GetFareCategoryColorsUseCase) this.f32980a.b0.get(), this.f32982c.K(), new OctaAppFeatures(), (GoogleWalletHelper) this.f32980a.f32917f.get());
                    case 33:
                        return new GuestViewModel(this.f32982c.f32954a, this.f32982c.L(), (AppInfo) this.f32980a.f32916e.get());
                    case 34:
                        return new GuidedTourViewModel(this.f32982c.f32954a, (Json) this.f32980a.f32918g.get());
                    case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER:
                        return new HelpRequestViewModel(this.f32982c.f32954a, new OctaAppFeatures(), (InputValidators) this.f32982c.f32958e.get(), this.f32982c.t0(), this.f32982c.b0(), this.f32982c.T(), (FareMediaRepository) this.f32980a.G.get());
                    case 36:
                        return new HomeViewModel(this.f32982c.f32954a, this.f32982c.V(), new OctaAppFeatures(), this.f32982c.Q(), this.f32982c.x0(), this.f32982c.u0());
                    case 37:
                        return new InstitutionDetailsViewModel(this.f32982c.f32954a, new OctaAppFeatures(), (InstitutionsRepository) this.f32980a.f32932u.get(), this.f32982c.C0());
                    case 38:
                        return new InstitutionsSearchViewModel(this.f32982c.f32954a, (FareMediaInstitutionsRepository) this.f32980a.f32934w.get(), (InstitutionsRepository) this.f32980a.f32932u.get());
                    case 39:
                        return new InstitutionsViewModel(this.f32982c.f32954a, (FareMediaInstitutionsRepository) this.f32980a.f32934w.get(), (FareMediaConfigRepository) this.f32980a.J.get(), new OctaAppFeatures());
                    case 40:
                        return new LockViewModel(this.f32982c.f32954a, this.f32982c.w0());
                    case 41:
                        return new LoginViewModel(this.f32982c.f32954a, (InputValidators) this.f32982c.f32958e.get(), new OctaAppFeatures(), this.f32982c.h0());
                    case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER:
                        return new MainViewModel(this.f32982c.f32954a, (RemoteConfigSetup) this.f32980a.d0.get(), this.f32982c.b0(), new OctaAppFeatures(), this.f32982c.o(), this.f32982c.C(), this.f32982c.X(), this.f32982c.c0(), this.f32982c.r0(), this.f32982c.h(), this.f32982c.v0());
                    case 43:
                        return new MoreViewModel(this.f32982c.f32954a, this.f32982c.O(), (AppInfo) this.f32980a.f32916e.get());
                    case 44:
                        return new PassCheckoutViewModel(this.f32982c.f32954a, (FareMediaPassesToOfferRepository) this.f32980a.f32910A.get(), new OctaAppFeatures(), this.f32982c.J(), this.f32982c.H(), this.f32982c.k0(), this.f32982c.m0(), this.f32982c.l0(), this.f32982c.j0(), this.f32982c.W());
                    case 45:
                        return new PaymentMethodDetailsViewModel(this.f32982c.f32954a, (PaymentMethodsRepository) this.f32980a.f32911B.get(), new OctaAppFeatures());
                    case 46:
                        return new PaymentMethodsViewModel(this.f32982c.f32954a, (PaymentMethodsRepository) this.f32980a.f32911B.get(), (EnvironmentConfigurationRepository) this.f32980a.S.get(), (UserRepository) this.f32980a.f32930s.get());
                    case 47:
                        return new RegisterResultExitingAccountNeedsActivationViewModel(this.f32982c.f32954a, this.f32982c.q0());
                    case 48:
                        return new RegisterResultExitingAccountViewModel(this.f32982c.f32954a);
                    case 49:
                        return new RegisterResultNeedsActivationViewModel(this.f32982c.f32954a, this.f32982c.q0());
                    case 50:
                        return new RegisterViewModel(this.f32982c.f32954a, (InputValidators) this.f32982c.f32958e.get(), (SecurityQuestionsRepository) this.f32980a.P.get(), this.f32982c.R(), (GetLinksConfigurationUseCase) this.f32980a.U.get(), this.f32982c.p0(), this.f32982c.h0(), new OctaAppFeatures());
                    case 51:
                        return new ResetPasswordSuccessViewModel(this.f32982c.f32954a, (UserRepository) this.f32980a.f32930s.get());
                    case 52:
                        return new ResetPasswordViewModel(this.f32982c.f32954a, (UserRepository) this.f32980a.f32930s.get());
                    case 53:
                        return new TransferBalanceViewModel(this.f32982c.f32954a, (FareMediaRepository) this.f32980a.G.get(), this.f32982c.z0(), (FareMediaConfigRepository) this.f32980a.J.get());
                    case 54:
                        return new TripPlannerViewModel(this.f32982c.f32954a, (GetLinksConfigurationUseCase) this.f32980a.U.get());
                    case 55:
                        return new WelcomeViewModel(this.f32982c.f32954a, new OctaAppFeatures());
                    default:
                        throw new AssertionError(this.f32983d);
                }
            }
        }

        public ViewModelCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandle, ViewModelLifecycle viewModelLifecycle) {
            this.f32955b = singletonCImpl;
            this.f32956c = activityRetainedCImpl;
            this.f32954a = savedStateHandle;
            Y(savedStateHandle, viewModelLifecycle);
            Z(savedStateHandle, viewModelLifecycle);
            a0(savedStateHandle, viewModelLifecycle);
        }

        public GetAllVirtualFareMediaUseCase A() {
            return new GetAllVirtualFareMediaUseCase((VirtualFareMediaRepository) this.f32955b.X.get());
        }

        public TransferFareMediaCardUseCase A0() {
            return new TransferFareMediaCardUseCase(u(), (FareMediaRepository) this.f32955b.G.get());
        }

        public GetAppUpdateConfigurationUseCase B() {
            return new GetAppUpdateConfigurationUseCase((Json) this.f32955b.f32918g.get());
        }

        public UnlinkFareMediaCardUseCase B0() {
            return new UnlinkFareMediaCardUseCase(u(), (FareMediaRepository) this.f32955b.G.get());
        }

        public GetAppUpdateUseCase C() {
            return new GetAppUpdateUseCase((AppInfo) this.f32955b.f32916e.get(), B(), (AppPreferences) this.f32955b.V.get());
        }

        public UnlinkInstitutionUseCase C0() {
            return new UnlinkInstitutionUseCase((InstitutionManager) this.f32955b.f32933v.get(), (FareMediaInstitutionsRepository) this.f32955b.f32934w.get(), (FareMediaPassesRepository) this.f32955b.f32936y.get(), (FareMediaPassesToOfferRepository) this.f32955b.f32910A.get());
        }

        public GetAutoloadConfigurationsUseCase D() {
            return new GetAutoloadConfigurationsUseCase((FareMediaConfigRepository) this.f32955b.J.get(), new OctaAppFeatures());
        }

        public UnlockFareMediaCardUseCase D0() {
            return new UnlockFareMediaCardUseCase(u(), (FareMediaRepository) this.f32955b.G.get());
        }

        public GetCardOptionsMenuConfigurationUseCase E() {
            return new GetCardOptionsMenuConfigurationUseCase((FareMediaRepository) this.f32955b.G.get(), new OctaAppFeatures(), v());
        }

        public UpdateNicknameUseCase E0() {
            return new UpdateNicknameUseCase(u(), (FareMediaRepository) this.f32955b.G.get());
        }

        public GetCashPaymentBarcodeUseCase F() {
            return new GetCashPaymentBarcodeUseCase(u());
        }

        public GetCreditCardPaymentMethodsUseCase G() {
            return new GetCreditCardPaymentMethodsUseCase((PaymentMethodsRepository) this.f32955b.f32911B.get());
        }

        public GetDefaultPaymentMethodUseCase H() {
            return new GetDefaultPaymentMethodUseCase((AppPreferences) this.f32955b.V.get(), (PaymentMethodsRepository) this.f32955b.f32911B.get(), W());
        }

        public GetEnvironmentConfigurationUseCase I() {
            return new GetEnvironmentConfigurationUseCase((EnvironmentConfigurationRepository) this.f32955b.S.get());
        }

        public GetFareMediaUseCase J() {
            return new GetFareMediaUseCase((FareMediaRepository) this.f32955b.G.get());
        }

        public GetGoogleWalletProvisioningLinkUseCase K() {
            return new GetGoogleWalletProvisioningLinkUseCase(u());
        }

        public GetGuestMenuConfigurationUseCase L() {
            return new GetGuestMenuConfigurationUseCase(i0());
        }

        public GetInstitutionsUseCase M() {
            return new GetInstitutionsUseCase((FareMediaInstitutionsRepository) this.f32955b.f32934w.get());
        }

        public GetMaxNumberOfCardPaymentMethodsUseCase N() {
            return new GetMaxNumberOfCardPaymentMethodsUseCase((EnvironmentConfigurationRepository) this.f32955b.S.get());
        }

        public GetMoreMenuConfigurationUseCase O() {
            return new GetMoreMenuConfigurationUseCase(i0());
        }

        public GetMostRelevantFareCappingFlowUseCase P() {
            return new GetMostRelevantFareCappingFlowUseCase((FareCappingRepository) this.f32955b.T.get());
        }

        public GetShowUserBiometricDialogUseCase Q() {
            return new GetShowUserBiometricDialogUseCase(g0());
        }

        public GetSignUpConfigurationUseCase R() {
            return new GetSignUpConfigurationUseCase((Json) this.f32955b.f32918g.get());
        }

        public GetUserEmailUseCase S() {
            return new GetUserEmailUseCase((UserRepository) this.f32955b.f32930s.get());
        }

        public GetUserUseCase T() {
            return new GetUserUseCase((UserRepository) this.f32955b.f32930s.get());
        }

        public GetValidAztecCodeFlowUseCase U() {
            return new GetValidAztecCodeFlowUseCase(V(), (FareMediaKeysRepository) this.f32955b.M.get(), new OctaAppFeatures());
        }

        public GetVirtualCardFlowUseCase V() {
            return new GetVirtualCardFlowUseCase((FareMediaRepository) this.f32955b.G.get());
        }

        public GooglePayClient W() {
            return new GooglePayClient(ApplicationContextModule_ProvideContextFactory.b(this.f32955b.f32912a), (RealmPreferences) this.f32955b.f32920i.get());
        }

        public IgnoreAppUpdateUseCase X() {
            return new IgnoreAppUpdateUseCase(B(), (AppPreferences) this.f32955b.V.get());
        }

        public final void Y(SavedStateHandle savedStateHandle, ViewModelLifecycle viewModelLifecycle) {
            this.f32958e = DoubleCheck.c(new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 1));
            this.f32959f = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 0);
            this.f32960g = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 2);
            this.f32961h = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 3);
            this.f32962i = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 4);
            this.f32963j = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 5);
            this.f32964k = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 6);
            this.f32965l = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 7);
            this.f32966m = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 8);
            this.f32967n = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 9);
            this.f32968o = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 10);
            this.f32969p = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 11);
            this.f32970q = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 12);
            this.f32971r = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 13);
            this.f32972s = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 14);
            this.f32973t = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 15);
            this.f32974u = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 16);
            this.f32975v = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 17);
            this.f32976w = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 18);
            this.f32977x = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 19);
            this.f32978y = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 20);
            this.f32979z = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 21);
            this.f32952A = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 22);
            this.f32953B = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 23);
            this.C = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 24);
        }

        public final void Z(SavedStateHandle savedStateHandle, ViewModelLifecycle viewModelLifecycle) {
            this.D = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 25);
            this.E = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 26);
            this.F = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 27);
            this.G = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 28);
            this.H = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 29);
            this.I = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 30);
            this.J = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 31);
            this.K = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 32);
            this.L = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 33);
            this.M = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 34);
            this.N = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 35);
            this.O = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 36);
            this.P = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 37);
            this.Q = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 38);
            this.R = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 39);
            this.S = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 40);
            this.T = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 41);
            this.U = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 42);
            this.V = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 43);
            this.W = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 44);
            this.X = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 45);
            this.Y = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 46);
            this.Z = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 47);
            this.a0 = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 48);
            this.b0 = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 49);
        }

        public Map a() {
            return LazyClassKeyMap.a(ImmutableMap.b(55).g(AccountInformationViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f35459a, this.f32959f).g(AccountViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f35073a, this.f32960g).g(AddInstitutionViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f36808a, this.f32961h).g(AddPassesViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f37051a, this.f32962i).g(AddPaymentMethodCyberSourceViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f35569a, this.f32963j).g(AddPaymentMethodNmiViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f35652a, this.f32964k).g(AutoloadSetupViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f36328a, this.f32965l).g(AutoloadViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f36255a, this.f32966m).g(BarcodeDisplayViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f35852a, this.f32967n).g(CardHistoryViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f36402a, this.f32968o).g(CardInformationViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f36442a, this.f32969p).g(CardOptionsViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f36579a, this.f32970q).g(ChangeAccountPinViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f35254a, this.f32971r).g(ChangeAddressViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f35148a, this.f32972s).g(ChangePasswordViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f35308a, this.f32973t).g(ChangeSecurityQuestionViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f35360a, this.f32974u).g(CheckFareMediaBalanceViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f34729a, this.f32975v).g(ChoosePaymentMethodViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f37779a, this.f32976w).g(ConvertToVirtualCardViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f36661a, this.f32977x).g(DebugMenuViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f37634a, this.f32978y).g(FareCappingViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f36744a, this.f32979z).g(FareMediaAddValueCashPaymentBarcodeViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f36143a, this.f32952A).g(FareMediaAddValueCashPaymentInstructionsViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f36180a, this.f32953B).g(FareMediaAddValueViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f36107a, this.C).g(FareMediaCreateCardViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f36691a, this.D).g(FareMediaLinkCardViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f36930a, this.E).g(FareMediaLockCardViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f36963a, this.F).g(FareMediaPassesViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f37011a, this.G).g(FareMediaPurchaseCardViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f37198a, this.H).g(FareMediaRemoveCardViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f37246a, this.I).g(FareMediaUnlockCardViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f37380a, this.J).g(FareMediaViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f36002a, this.K).g(GuestViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f34707a, this.L).g(GuidedTourViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f37454a, this.M).g(HelpRequestViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f34881a, this.N).g(HomeViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f35005a, this.O).g(InstitutionDetailsViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f36841a, this.P).g(InstitutionsSearchViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f36887a, this.Q).g(InstitutionsViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f36787a, this.R).g(LockViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f37678a, this.S).g(LoginViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f34312a, this.T).g(MainViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f37592a, this.U).g(MoreViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f37439a, this.V).g(PassCheckoutViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f37130a, this.W).g(PaymentMethodDetailsViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f35784a, this.X).g(PaymentMethodsViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f35530a, this.Y).g(RegisterResultExitingAccountNeedsActivationViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f34534a, this.Z).g(RegisterResultExitingAccountViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f34508a, this.a0).g(RegisterResultNeedsActivationViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f34561a, this.b0).g(RegisterViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f34425a, this.c0).g(ResetPasswordSuccessViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f34644a, this.d0).g(ResetPasswordViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f34614a, this.e0).g(TransferBalanceViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f37331a, this.f0).g(TripPlannerViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f37505a, this.g0).g(WelcomeViewModel_HiltModules_BindsModule_Binds_LazyMapKey.f34670a, this.h0).a());
        }

        public final void a0(SavedStateHandle savedStateHandle, ViewModelLifecycle viewModelLifecycle) {
            this.c0 = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 50);
            this.d0 = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 51);
            this.e0 = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 52);
            this.f0 = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 53);
            this.g0 = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 54);
            this.h0 = new SwitchingProvider(this.f32955b, this.f32956c, this.f32957d, 55);
        }

        public Map b() {
            return ImmutableMap.o();
        }

        public IsAccountLoggedInUseCase b0() {
            return new IsAccountLoggedInUseCase((AuthenticationPreferences) this.f32955b.f32922k.get());
        }

        public IsLockedFlowUseCase c0() {
            return new IsLockedFlowUseCase(new OctaAppFeatures(), g0());
        }

        public AccountMenuConfigConverter d() {
            return new AccountMenuConfigConverter((Json) this.f32955b.f32918g.get(), new OctaAppFeatures());
        }

        public LinkFareMediaCardUseCase d0() {
            return new LinkFareMediaCardUseCase(u(), (FareMediaRepository) this.f32955b.G.get());
        }

        public AddBalanceUseCase e() {
            return new AddBalanceUseCase(j0(), (CardHistoryRepository) this.f32955b.N.get(), (FareMediaRepository) this.f32955b.G.get(), s0());
        }

        public LinkInstitutionUseCase e0() {
            return new LinkInstitutionUseCase((InstitutionManager) this.f32955b.f32933v.get(), (FareMediaInstitutionsRepository) this.f32955b.f32934w.get(), (FareMediaPassesRepository) this.f32955b.f32936y.get(), (FareMediaPassesToOfferRepository) this.f32955b.f32910A.get());
        }

        public AddBalanceWithGooglePayUseCase f() {
            return new AddBalanceWithGooglePayUseCase(j0(), (CardHistoryRepository) this.f32955b.N.get(), (FareMediaRepository) this.f32955b.G.get(), (AppPreferences) this.f32955b.V.get());
        }

        public LockFareMediaCardUseCase f0() {
            return new LockFareMediaCardUseCase(u(), (FareMediaRepository) this.f32955b.G.get());
        }

        public AddPaymentMethodNmiUseCase g() {
            return new AddPaymentMethodNmiUseCase((PaymentMethodsRepository) this.f32955b.f32911B.get(), (UserRepository) this.f32955b.f32930s.get(), (PaymentMethodsManager) this.f32955b.C.get());
        }

        public LockPreferences g0() {
            return new LockPreferences(ApplicationContextModule_ProvideContextFactory.b(this.f32955b.f32912a));
        }

        public AutoLockAfterInactivityUseCase h() {
            return new AutoLockAfterInactivityUseCase(g0(), r0(), w0());
        }

        public LogInUseCase h0() {
            return new LogInUseCase((OAuthService) this.f32955b.f32925n.get(), (AuthenticationPreferences) this.f32955b.f32922k.get(), x0(), (RealmPreferences) this.f32955b.f32920i.get());
        }

        public ChangeAccountInfoUseCase i() {
            return new ChangeAccountInfoUseCase((UserRepository) this.f32955b.f32930s.get());
        }

        public MenuConfigConverter i0() {
            return new MenuConfigConverter((Json) this.f32955b.f32918g.get());
        }

        public ChangeAddressUseCase j() {
            return new ChangeAddressUseCase((UserRepository) this.f32955b.f32930s.get());
        }

        public PurchaseManager j0() {
            return new PurchaseManager((PurchaseOperationsApi) this.f32955b.W.get());
        }

        public ChangeAutoloadUseCase k() {
            return new ChangeAutoloadUseCase((AutoloadRepository) this.f32955b.I.get(), (FareMediaRepository) this.f32955b.G.get(), (AutoloadManager) this.f32955b.K.get());
        }

        public PurchasePassUseCase k0() {
            return new PurchasePassUseCase(j0(), (CardHistoryRepository) this.f32955b.N.get(), (FareMediaPassesRepository) this.f32955b.f32936y.get(), (FareMediaPassesToOfferRepository) this.f32955b.f32910A.get(), s0());
        }

        public ChangePasswordUseCase l() {
            return new ChangePasswordUseCase((UserDataApi) this.f32955b.f32928q.get());
        }

        public PurchasePassWithFareMediaUseCase l0() {
            return new PurchasePassWithFareMediaUseCase(j0(), (CardHistoryRepository) this.f32955b.N.get(), (FareMediaPassesRepository) this.f32955b.f32936y.get(), (FareMediaPassesToOfferRepository) this.f32955b.f32910A.get());
        }

        public ChangeSecurityQuestionsUseCase m() {
            return new ChangeSecurityQuestionsUseCase((UserDataApi) this.f32955b.f32928q.get(), (UserSecurityQuestionsRepository) this.f32955b.Q.get());
        }

        public PurchasePassWithGooglePayUseCase m0() {
            return new PurchasePassWithGooglePayUseCase(j0(), (CardHistoryRepository) this.f32955b.N.get(), (FareMediaPassesRepository) this.f32955b.f32936y.get(), (FareMediaPassesToOfferRepository) this.f32955b.f32910A.get(), (AppPreferences) this.f32955b.V.get());
        }

        public CheckFareMediaCardBalanceUseCase n() {
            return new CheckFareMediaCardBalanceUseCase(u());
        }

        public PurchaseVirtualCardUseCase n0() {
            return new PurchaseVirtualCardUseCase(u(), (FareMediaRepository) this.f32955b.G.get());
        }

        public ClearUserCacheUseCase o() {
            return new ClearUserCacheUseCase((FareMediaPassesToOfferRepository) this.f32955b.f32910A.get(), (CardHistoryRepository) this.f32955b.N.get(), (FareMediaPassesRepository) this.f32955b.f32936y.get(), (FareMediaRepository) this.f32955b.G.get(), (FareCappingRepository) this.f32955b.T.get(), (FareMediaConfigRepository) this.f32955b.J.get(), (FareMediaTransferTimeRepository) this.f32955b.Y.get(), (InstitutionsRepository) this.f32955b.f32932u.get(), (PaymentMethodsRepository) this.f32955b.f32911B.get(), (UserRepository) this.f32955b.f32930s.get(), g0());
        }

        public RefreshFareMediaDataUseCase o0() {
            return new RefreshFareMediaDataUseCase((FareMediaTransferTimeRepository) this.f32955b.Y.get(), (FareMediaRepository) this.f32955b.G.get(), (FareCappingRepository) this.f32955b.T.get());
        }

        public CloseAccountUseCase p() {
            return new CloseAccountUseCase((UserRepository) this.f32955b.f32930s.get());
        }

        public RegisterUseCase p0() {
            return new RegisterUseCase((UserDataApi) this.f32955b.f32928q.get());
        }

        public ConvertToVirtualUseCase q() {
            return new ConvertToVirtualUseCase(u(), (FareMediaRepository) this.f32955b.G.get());
        }

        public ResendActivationEmailUseCase q0() {
            return new ResendActivationEmailUseCase((UserDataApi) this.f32955b.f32928q.get());
        }

        public CreateAutoloadUseCase r() {
            return new CreateAutoloadUseCase((AutoloadRepository) this.f32955b.I.get(), (FareMediaRepository) this.f32955b.G.get(), (AutoloadManager) this.f32955b.K.get());
        }

        public ResetUnlockEndDateTimeUseCase r0() {
            return new ResetUnlockEndDateTimeUseCase(g0());
        }

        public CreateFareMediaCardUseCase s() {
            return new CreateFareMediaCardUseCase(u(), (FareMediaRepository) this.f32955b.G.get());
        }

        public SaveCreditCardAsDefaultPaymentMethodUseCase s0() {
            return new SaveCreditCardAsDefaultPaymentMethodUseCase((PaymentMethodsRepository) this.f32955b.f32911B.get(), (AppPreferences) this.f32955b.V.get());
        }

        public DeleteAutoloadUseCase t() {
            return new DeleteAutoloadUseCase((AutoloadRepository) this.f32955b.I.get(), (FareMediaRepository) this.f32955b.G.get(), (AutoloadManager) this.f32955b.K.get());
        }

        public SendHelpRequestUseCase t0() {
            return new SendHelpRequestUseCase((FeedbackApi) this.f32955b.c0.get());
        }

        public FareMediaManager u() {
            return new FareMediaManager((DeviceInfo) this.f32955b.F.get(), (UserFareMediaApi) this.f32955b.f32935x.get(), (AnonymousFareMediaApi) this.f32955b.O.get());
        }

        public SetIsBiometricLockedUseCase u0() {
            return new SetIsBiometricLockedUseCase(g0(), w0(), r0());
        }

        public FareMediaMenuConfigConverter v() {
            return new FareMediaMenuConfigConverter((Json) this.f32955b.f32918g.get(), new OctaAppFeatures());
        }

        public SetIsBiometricsAvailableUseCase v0() {
            return new SetIsBiometricsAvailableUseCase(g0());
        }

        public FareMediaTransferValidUntilFlowUseCase w() {
            return new FareMediaTransferValidUntilFlowUseCase((FareMediaTransferTimeRepository) this.f32955b.Y.get());
        }

        public SetIsLockedFlowUseCase w0() {
            return new SetIsLockedFlowUseCase(g0());
        }

        public FetchPaymentMethodsUntilNewOneAppearsUseCase x() {
            return new FetchPaymentMethodsUntilNewOneAppearsUseCase((PaymentMethodsRepository) this.f32955b.f32911B.get());
        }

        public SetShownUserBiometricDialogUseCase x0() {
            return new SetShownUserBiometricDialogUseCase(g0());
        }

        public GetAccountMenuConfigurationUseCase y() {
            return new GetAccountMenuConfigurationUseCase(d(), g0());
        }

        public ToggleBiometricsLockActivatedUseCase y0() {
            return new ToggleBiometricsLockActivatedUseCase(g0(), w0(), r0());
        }

        public GetAddPaymentMethodPageCyberSourceUseCase z() {
            return new GetAddPaymentMethodPageCyberSourceUseCase((PaymentMethodsManager) this.f32955b.C.get());
        }

        public TransferBalanceUseCase z0() {
            return new TransferBalanceUseCase(u(), (FareMediaRepository) this.f32955b.G.get(), (CardHistoryRepository) this.f32955b.N.get());
        }
    }

    public static final class ViewWithFragmentCBuilder implements AbtApplication_HiltComponents.ViewWithFragmentC.Builder {

        /* renamed from: a  reason: collision with root package name */
        public final SingletonCImpl f32984a;

        /* renamed from: b  reason: collision with root package name */
        public final ActivityRetainedCImpl f32985b;

        /* renamed from: c  reason: collision with root package name */
        public final ActivityCImpl f32986c;

        /* renamed from: d  reason: collision with root package name */
        public final FragmentCImpl f32987d;

        /* renamed from: e  reason: collision with root package name */
        public View f32988e;

        /* renamed from: b */
        public AbtApplication_HiltComponents.ViewWithFragmentC d() {
            Preconditions.a(this.f32988e, View.class);
            return new ViewWithFragmentCImpl(this.f32984a, this.f32985b, this.f32986c, this.f32987d, this.f32988e);
        }

        /* renamed from: c */
        public ViewWithFragmentCBuilder a(View view) {
            this.f32988e = (View) Preconditions.b(view);
            return this;
        }

        public ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, FragmentCImpl fragmentCImpl) {
            this.f32984a = singletonCImpl;
            this.f32985b = activityRetainedCImpl;
            this.f32986c = activityCImpl;
            this.f32987d = fragmentCImpl;
        }
    }

    public static final class ViewWithFragmentCImpl extends AbtApplication_HiltComponents.ViewWithFragmentC {

        /* renamed from: a  reason: collision with root package name */
        public final SingletonCImpl f32989a;

        /* renamed from: b  reason: collision with root package name */
        public final ActivityRetainedCImpl f32990b;

        /* renamed from: c  reason: collision with root package name */
        public final ActivityCImpl f32991c;

        /* renamed from: d  reason: collision with root package name */
        public final FragmentCImpl f32992d;

        /* renamed from: e  reason: collision with root package name */
        public final ViewWithFragmentCImpl f32993e = this;

        public ViewWithFragmentCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, FragmentCImpl fragmentCImpl, View view) {
            this.f32989a = singletonCImpl;
            this.f32990b = activityRetainedCImpl;
            this.f32991c = activityCImpl;
            this.f32992d = fragmentCImpl;
        }
    }

    public static Builder a() {
        return new Builder();
    }
}

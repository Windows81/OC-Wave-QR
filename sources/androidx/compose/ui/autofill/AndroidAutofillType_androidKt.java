package androidx.compose.ui.autofill;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

@Metadata
public final class AndroidAutofillType_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f15573a = MapsKt.j(TuplesKt.a(AutofillType.EmailAddress, "emailAddress"), TuplesKt.a(AutofillType.Username, "username"), TuplesKt.a(AutofillType.Password, "password"), TuplesKt.a(AutofillType.NewUsername, "newUsername"), TuplesKt.a(AutofillType.NewPassword, "newPassword"), TuplesKt.a(AutofillType.PostalAddress, "postalAddress"), TuplesKt.a(AutofillType.PostalCode, "postalCode"), TuplesKt.a(AutofillType.CreditCardNumber, "creditCardNumber"), TuplesKt.a(AutofillType.CreditCardSecurityCode, "creditCardSecurityCode"), TuplesKt.a(AutofillType.CreditCardExpirationDate, "creditCardExpirationDate"), TuplesKt.a(AutofillType.CreditCardExpirationMonth, "creditCardExpirationMonth"), TuplesKt.a(AutofillType.CreditCardExpirationYear, "creditCardExpirationYear"), TuplesKt.a(AutofillType.CreditCardExpirationDay, "creditCardExpirationDay"), TuplesKt.a(AutofillType.AddressCountry, "addressCountry"), TuplesKt.a(AutofillType.AddressRegion, "addressRegion"), TuplesKt.a(AutofillType.AddressLocality, "addressLocality"), TuplesKt.a(AutofillType.AddressStreet, "streetAddress"), TuplesKt.a(AutofillType.AddressAuxiliaryDetails, "extendedAddress"), TuplesKt.a(AutofillType.PostalCodeExtended, "extendedPostalCode"), TuplesKt.a(AutofillType.PersonFullName, "personName"), TuplesKt.a(AutofillType.PersonFirstName, "personGivenName"), TuplesKt.a(AutofillType.PersonLastName, "personFamilyName"), TuplesKt.a(AutofillType.PersonMiddleName, "personMiddleName"), TuplesKt.a(AutofillType.PersonMiddleInitial, "personMiddleInitial"), TuplesKt.a(AutofillType.PersonNamePrefix, "personNamePrefix"), TuplesKt.a(AutofillType.PersonNameSuffix, "personNameSuffix"), TuplesKt.a(AutofillType.PhoneNumber, "phoneNumber"), TuplesKt.a(AutofillType.PhoneNumberDevice, "phoneNumberDevice"), TuplesKt.a(AutofillType.PhoneCountryCode, "phoneCountryCode"), TuplesKt.a(AutofillType.PhoneNumberNational, "phoneNational"), TuplesKt.a(AutofillType.Gender, "gender"), TuplesKt.a(AutofillType.BirthDateFull, "birthDateFull"), TuplesKt.a(AutofillType.BirthDateDay, "birthDateDay"), TuplesKt.a(AutofillType.BirthDateMonth, "birthDateMonth"), TuplesKt.a(AutofillType.BirthDateYear, "birthDateYear"), TuplesKt.a(AutofillType.SmsOtpCode, "smsOTPCode"));

    public static final String a(AutofillType autofillType) {
        String str = (String) f15573a.get(autofillType);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type");
    }
}

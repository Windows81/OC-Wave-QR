package com.google.zxing.client.result;

import java.util.regex.Pattern;

public abstract class ResultParser {

    /* renamed from: a  reason: collision with root package name */
    public static final ResultParser[] f32564a;

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f32565b = Pattern.compile("\\d+");

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f32566c = Pattern.compile("&");

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f32567d = Pattern.compile("=");

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f32568e = new String[0];

    static {
        BookmarkDoCoMoResultParser bookmarkDoCoMoResultParser = new BookmarkDoCoMoResultParser();
        AddressBookDoCoMoResultParser addressBookDoCoMoResultParser = new AddressBookDoCoMoResultParser();
        EmailDoCoMoResultParser emailDoCoMoResultParser = new EmailDoCoMoResultParser();
        AddressBookAUResultParser addressBookAUResultParser = new AddressBookAUResultParser();
        VCardResultParser vCardResultParser = new VCardResultParser();
        BizcardResultParser bizcardResultParser = new BizcardResultParser();
        VEventResultParser vEventResultParser = new VEventResultParser();
        EmailAddressResultParser emailAddressResultParser = new EmailAddressResultParser();
        SMTPResultParser sMTPResultParser = new SMTPResultParser();
        TelResultParser telResultParser = new TelResultParser();
        SMSMMSResultParser sMSMMSResultParser = new SMSMMSResultParser();
        SMSTOMMSTOResultParser sMSTOMMSTOResultParser = new SMSTOMMSTOResultParser();
        GeoResultParser geoResultParser = new GeoResultParser();
        WifiResultParser wifiResultParser = new WifiResultParser();
        URLTOResultParser uRLTOResultParser = new URLTOResultParser();
        URIResultParser uRIResultParser = new URIResultParser();
        URIResultParser uRIResultParser2 = uRIResultParser;
        f32564a = new ResultParser[]{bookmarkDoCoMoResultParser, addressBookDoCoMoResultParser, emailDoCoMoResultParser, addressBookAUResultParser, vCardResultParser, bizcardResultParser, vEventResultParser, emailAddressResultParser, sMTPResultParser, telResultParser, sMSMMSResultParser, sMSTOMMSTOResultParser, geoResultParser, wifiResultParser, uRLTOResultParser, uRIResultParser2, new ISBNResultParser(), new ProductResultParser(), new ExpandedProductResultParser(), new VINResultParser()};
    }
}
